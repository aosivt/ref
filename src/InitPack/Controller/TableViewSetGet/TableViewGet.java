package InitPack.Controller.TableViewSetGet;

import InitPack.DBView.Enitys.Organization;
import InitPack.DBView.Enitys.PivotTableProtocol;
import InitPack.DBView.util.HibernateUtil;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 * Created by alex on 12.11.16.
 */
public class TableViewGet {
    protected ObservableList<PivotTableProtocol> getPivotContainer()
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery("From PivotTableProtocol");
        ObservableList<PivotTableProtocol> itemContainer =  FXCollections.observableArrayList(q.list()) ;
        session.close();
        return itemContainer;
    }

    public ObservableList<Organization> getOrganization()
    {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery("From Organization");
        ObservableList<Organization> itemContainer =  FXCollections.observableArrayList(q.list()) ;
        session.close();
        return itemContainer;
    }
}
