package InitPack.Controller;

import InitPack.DBView.AppData.GetAppData;
import InitPack.DBView.Enitys.PivotTableProtocol;
import InitPack.DBView.util.HibernateUtil;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

/**
 * Created by oshchepkovayu on 10.11.16.
 */
public class MainController {

    @FXML
    private void printOutput()

    {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery("From PivotTableProtocol");

        List<PivotTableProtocol> resultlist = (List<PivotTableProtocol>) q.list();
        GetAppData appData;
        for (PivotTableProtocol next : resultlist) {
            appData = new GetAppData();
            appData.setSum(next.getSum());
            appData.setDate_in(next.getDate_in()==null?"Не определена":next.getDate_in().toString());
            appData.setDate_out(next.getDate_out()==null?"Не определена":next.getDate_out().toString());
            appData.setId_protocol(next.getProtocol_id());
            appData.setName_organization(next.getOrganization()==null?"Не определена":next.getOrganization().getName_organization());
            appData.setDocument(next.getDocument());
            appData.setReason(next.getReason());
            appData.setReview(next.getReview());
            appData.setOrganization(next.getOrganization());
            appData.setViewProtocol(next.getViewProtocol());
//            itemContainer.addBean(appData);
        }
        session.close();

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Ghbdtn");
        alert.setHeaderText("Information Alert");
        String s ="This is an example of JavaFX 8 Dialogs... ";
        alert.setContentText(s);
        alert.show();

    }
}
