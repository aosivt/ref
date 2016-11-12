package InitPack.Controller.TableViewSetGet;

import InitPack.DBView.Enitys.Organization;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * Created by alex on 12.11.16.
 */
public class PivotTableProtocolView extends TableView {
    public PivotTableProtocolView()
    {
        ObservableList<Organization> itemContainer = new TableViewGet().getOrganization();
        TableColumn firstNameCol = new TableColumn("First Name");
        firstNameCol.setMinWidth(100);
        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<>("name_organization"));
        this.setItems(itemContainer);
    }
}
