package InitPack.Controller.ComboboxSetGetData;

import InitPack.DBView.Enitys.Organization;
import InitPack.DBView.Enitys.ViewProtocol;
import InitPack.DBView.util.HibernateUtil;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

/**
 * Created by alex on 12.11.16.
 */
public class ComboboxControllerOrganization {

    private void onEnterOrganization(String _name_organization)
    {
        Organization organization = new Organization();
        organization.setName_organization(_name_organization);
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(organization);
        transaction.commit();
        session.close();
    }
    protected ObservableList<Organization> getOrganization()
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery("From Organization");
        ObservableList<Organization> itemContainer =  FXCollections.observableArrayList(q.list()) ;
        session.close();
        return itemContainer;
    }

}
