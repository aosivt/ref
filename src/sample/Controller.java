package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class Controller {

    @FXML
    private void printOutput()

    {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Ghbdtn");
        alert.setHeaderText("Information Alert");
        String s ="This is an example of JavaFX 8 Dialogs... ";
        alert.setContentText(s);
        alert.show();

    }

}
