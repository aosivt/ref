package InitPack.Controller;

import InitPack.Controller.ComboboxSetGetData.ComboboxControllerOrganization;
import InitPack.Controller.ComboboxSetGetData.ComboboxControllerViewDocument;
import InitPack.Controller.TableViewSetGet.PivotTableProtocolView;
import InitPack.Controller.TableViewSetGet.TableViewGet;
import InitPack.DBView.AppData.GetAppData;
import InitPack.DBView.Enitys.Organization;
import InitPack.DBView.Enitys.PivotTableProtocol;
import InitPack.DBView.util.HibernateUtil;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

/**
 * Created by oshchepkovayu on 10.11.16.
 */
public class MainController {


    @FXML private TableView<Organization> containPivot;

    @FXML
    private TableColumn<Organization, Integer> num_p;

    @FXML
    private TableColumn<Organization, String> name_org;

//    @FXML
//    private TableColumn<User, String> passwordColumn;
//
//    @FXML
//    private TableColumn<User, String> emailColumn;

    @FXML
    private void printOutput()

    {


//        Session session = HibernateUtil.getSessionFactory().openSession();
//        Query q = session.createQuery("From PivotTableProtocol");
//
//        List<PivotTableProtocol> resultlist = (List<PivotTableProtocol>) q.list();
//        GetAppData appData;
//        for (PivotTableProtocol next : resultlist) {
//            appData = new GetAppData();
//            appData.setSum(next.getSum());
//            appData.setDate_in(next.getDate_in()==null?"Не определена":next.getDate_in().toString());
//            appData.setDate_out(next.getDate_out()==null?"Не определена":next.getDate_out().toString());
//            appData.setId_protocol(next.getProtocol_id());
//            appData.setName_organization(next.getOrganization()==null?"Не определена":next.getOrganization().getName_organization());
//            appData.setDocument(next.getDocument());
//            appData.setReason(next.getReason());
//            appData.setReview(next.getReview());
//            appData.setOrganization(next.getOrganization());
//            appData.setViewProtocol(next.getViewProtocol());
//            itemContainer.addBean(appData);
//        }
//        session.close();

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Ghbdtn");
        alert.setHeaderText("Information Alert");
        String s ="This is an example of JavaFX 8 Dialogs... ";
        alert.setContentText(s);
        alert.show();

    }
    public void initialize() {
        ObservableList<Organization> itemContainer = new TableViewGet().getOrganization();
        num_p.setCellValueFactory(new PropertyValueFactory<Organization, Integer>("organization_id"));
        name_org.setCellValueFactory(new PropertyValueFactory<Organization, String>("name_organization"));
        containPivot.setItems(itemContainer);
    }

}
