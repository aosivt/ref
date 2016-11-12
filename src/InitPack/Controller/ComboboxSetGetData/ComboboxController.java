package InitPack.Controller.ComboboxSetGetData;

import InitPack.DBView.Enitys.Organization;
import InitPack.DBView.Enitys.ViewProtocol;
import InitPack.DBView.util.HibernateUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.annotation.Resources;
import java.net.URL;

/**
 * Created by alex on 12.11.16.
 */
public class ComboboxController {



    @FXML private ComboBox name_organization;
    @FXML private TextField number_protocol;

    @FXML private ComboBox view_document;
    @FXML private TextField name_document;

    @FXML
    private void printOrgznization(String _meesage, String _title)

    {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(_title);
        alert.setHeaderText("Information Alert");
        alert.setContentText(_meesage);
        alert.show();

    }

    @FXML
    private void onEnterOrganization(ActionEvent ae)
    {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(name_organization.getEditor().getText());
        alert.setHeaderText("Information Alert");
        String s ="This is an example of JavaFX 8 Dialogs... ";
        alert.setContentText(s);
        alert.show();
    }
    @FXML
    private void onEnterViewDocument(ActionEvent ae)
    {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(view_document.getEditor().getText());
        alert.setHeaderText("Information Alert");
        String s ="This is an example of JavaFX 8 Dialogs... ";
        alert.setContentText(s);
        alert.show();
    }

    @FXML
    private void onLoadOrganozationForm()
    {



    }
    public void initialize() {
        name_organization.setItems(new ComboboxControllerOrganization().getOrganization());
        view_document.setItems(new ComboboxControllerViewDocument().getViewProtocol());
    }
}
