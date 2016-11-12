package InitPack;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by oshchepkovayu on 10.11.16.
 */
public class InitCode extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("FormView/ProjectGridLayout.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 1000,500 ));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
