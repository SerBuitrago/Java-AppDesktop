package doconver.view.controller;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import doconver.app.Validator;
import doconver.app.Variable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class FXMLDocumentController implements Initializable {

	@FXML
	private AnchorPane containerParent;

	@FXML
	private Button buttonFile;

	@FXML
	private SplitMenuButton menuOne;
	@FXML
	private SplitMenuButton menuTwo;

	public FXMLDocumentController() {
	}
	
	/**
	 * Metodo que crea los items del primer menu.
	 */
	public void items() {
		this.menuOne.getItems().clear();
		for(String item: Variable.MENU) {
			MenuItem m = new MenuItem(item);
			m.setOnAction((e)-> { 
				submenu(m.getText());
			});
			this.menuOne.getItems().add(m);
		}
	}
	
	/**
	 * Metodo que crea los items del segundo menu.
	 */
	public void submenu(String text) {
		int index = Validator.indexElement(Variable.MENU, text);
		this.menuTwo.getItems().clear();
		this.menuTwo.setText("Convertir de: ");
		if(index > -1) {
			this.menuOne.setText(text);
			this.menuTwo.setDisable(false);
			for(String item: Variable.MENU_ITEMS[index]) {
				MenuItem m = new MenuItem(item);
				m.setOnAction((e)-> { 
					this.menuTwo.setText(m.getText());
				});
				this.menuTwo.getItems().add(m);
			}
		}else {
			this.menuOne.setText("Convertir de: ");
			this.menuTwo.setDisable(true);
		}
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		this.menuTwo.setDisable(true);
		this.items();
	}

	@FXML
	private void handleButtonFileAction(ActionEvent event) {
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Open Resource File");
		Stage stage = (Stage) this.containerParent.getScene().getWindow();
		fileChooser.showOpenDialog(stage);
		File file = fileChooser.showSaveDialog(stage);
		if (file != null) {
			buttonFile.setText(file.getName());
		} else {
			buttonFile.setText("Seleccionar archivo");
		}
	}

}