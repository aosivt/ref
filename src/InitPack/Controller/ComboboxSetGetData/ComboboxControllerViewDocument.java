package InitPack.Controller.ComboboxSetGetData;

import InitPack.DBView.Enitys.Organization;
import InitPack.DBView.Enitys.ViewProtocol;
import InitPack.DBView.util.HibernateUtil;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 * Created by alex on 12.11.16.
 */
public class ComboboxControllerViewDocument {

    private void onEnterViewDocument(String _name_view_document)
    {
        ViewProtocol viewProtocol = new ViewProtocol();
        viewProtocol.setView_protocol(_name_view_document);
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(viewProtocol);
        transaction.commit();
        session.close();
    }
    protected ObservableList<ViewProtocol> getViewProtocol()
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery("From ViewProtocol");
        ObservableList<ViewProtocol> itemContainer =  FXCollections.observableArrayList(q.list()) ;
        session.close();
        return itemContainer;
    }


}
