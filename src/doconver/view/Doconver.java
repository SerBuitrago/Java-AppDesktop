package doconver.view;

import doconver.app.Variable;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Doconver extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("controller/FXMLDocument.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.setResizable(true);
        stage.setTitle(Variable.NAME_PROJECT);
        stage.getIcons().add(new Image(getClass().getResourceAsStream("LOGO.png")));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

