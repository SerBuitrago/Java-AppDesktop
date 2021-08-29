package doconver.view.controller;


import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 *
 * @author LEYNER ORTEGA
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private AnchorPane containerParent;

    @FXML
    private Button buttonFile;
    @FXML
    private void handleButtonFileAction(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");

        Stage stage = (Stage) this.containerParent.getScene().getWindow();
        fileChooser.showOpenDialog(stage);

        File file = fileChooser.showSaveDialog(stage);

        if (file != null) {
            // Escribe el contenido que se va a escribir en el archivo.
            buttonFile.setText(file.getName());
        }else{
        buttonFile.setText("Seleccionar archivo");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public AnchorPane getContainerParent() {
        return containerParent;
    }

    public void setContainerParent(AnchorPane containerParent) {
        this.containerParent = containerParent;
    }

}