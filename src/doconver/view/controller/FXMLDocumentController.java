package doconver.view.controller;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import doconver.controller.Convert;
import doconver.controller.Validator;
import doconver.util.Variable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class FXMLDocumentController implements Initializable {

	@FXML
	private AnchorPane containerParent;

	@FXML
	private Button buttonFile;
	@FXML
	private Button buttonConvert;

	@FXML
	private SplitMenuButton menuOne;
	@FXML
	private SplitMenuButton menuTwo;

	private boolean is;
	private File file;

	public FXMLDocumentController() {
	}
	
	public void init() {
		this.is = false;
		this.file = null;	
		this.menuOne.setText("Convertir de: ");
		this.menuTwo.setText("Convertir de: ");
		this.menuTwo.getItems().clear();
		this.menuTwo.setDisable(true);
		this.menuOne.setDisable(true);
		this.buttonConvert.setDisable(true);
		this.buttonFile.setText("Seleccionar archivo");
	}

	/**
	 * Metodo que crea los items del primer menu.
	 */
	public void items() {
		this.menuOne.getItems().clear();
		for (String item : doconver.util.Variable.MENU) {
			MenuItem m = new MenuItem(item);
			m.setOnAction((e) -> {
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
		if (index > -1) {
			this.menuOne.setText(text);
			this.menuTwo.setDisable(false);
			for (String item : Variable.MENU_ITEMS[index]) {
				MenuItem m = new MenuItem(item);
				m.setOnAction((e) -> {
					this.menuTwo.setText(m.getText());
					this.buttonConvert.setDisable(false);
				});
				this.menuTwo.getItems().add(m);
			}
		} else {
			init();
		}
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		init();
		this.items();
	}

	@FXML
	private void handleButtonFileAction(ActionEvent event) {
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Open Resource File");
		Stage stage = (Stage) this.containerParent.getScene().getWindow();
		this.file = fileChooser.showOpenDialog(stage);
		if (file != null) {
			buttonFile.setText(file.getName());
			is = true;
			this.menuOne.setDisable(false);
		} else {
			init();
		}
	}

	@FXML
	private void handleButtonConvertAction(ActionEvent event) {
		/*if (is && file != null) {
			int index = Validator.indexElement(Variable.MENU, this.menuOne.getText());
			if (index != -1) {
				int index_two = Validator.indexElement(Variable.MENU_ITEMS[index], this.menuTwo.getText());
				if (index_two != -1) {
					Convert convert = new Convert();
					try {
						switch (index) {
							case 0:
								if (index_two == 0)
									convert.wordToOdt(file.getAbsolutePath());
								else
									convert.wordToPDF(file.getAbsolutePath());
								break;
							case 1:
								if (index_two == 0)
									convert.excelToOds(file.getAbsolutePath());
								else
									convert.excelToPDF(file.getAbsolutePath());
								break;
							case 2:
								if (index_two == 0)
									convert.powerPointToOdp(file.getAbsolutePath());
								else
									convert.powerPointToPDF(file.getAbsolutePath());
								break;
							case 3:
								if (index_two == 0)
									convert.OdtToWord(file.getAbsolutePath());
								else
									convert.odtToPDF(file.getAbsolutePath());
								break;
							case 4:
								if (index_two == 0)
									convert.odsToExcel(file.getAbsolutePath());
								else
									convert.odsToPDF(file.getAbsolutePath());
								break;
							default:
								if (index_two == 0)
									convert.odpToPowerPoint(file.getAbsolutePath());
								else
									convert.odptToPDF(file.getAbsolutePath());
								break;
						}
					} catch (Exception e) {
						Alert a = new Alert(AlertType.WARNING);
						a.setTitle(Variable.NAME_PROJECT);
						a.setContentText(e.getMessage());
						a.show();
					}
				}
			}
			init();
		}*/
		
	}

}