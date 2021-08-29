package doconver.view.controller;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

<<<<<<< HEAD
import doconver.app.Convert;
=======
>>>>>>> 3c04199ed8677dfa37970141494336cc8932bc0b
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
<<<<<<< HEAD
	@FXML
	private Button buttonConvert;
=======
>>>>>>> 3c04199ed8677dfa37970141494336cc8932bc0b

	@FXML
	private SplitMenuButton menuOne;
	@FXML
	private SplitMenuButton menuTwo;

<<<<<<< HEAD
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

=======
	public FXMLDocumentController() {
	}
	
>>>>>>> 3c04199ed8677dfa37970141494336cc8932bc0b
	/**
	 * Metodo que crea los items del primer menu.
	 */
	public void items() {
		this.menuOne.getItems().clear();
<<<<<<< HEAD
		for (String item : Variable.MENU) {
			MenuItem m = new MenuItem(item);
			m.setOnAction((e) -> {
=======
		for(String item: Variable.MENU) {
			MenuItem m = new MenuItem(item);
			m.setOnAction((e)-> { 
>>>>>>> 3c04199ed8677dfa37970141494336cc8932bc0b
				submenu(m.getText());
			});
			this.menuOne.getItems().add(m);
		}
	}
<<<<<<< HEAD

=======
	
>>>>>>> 3c04199ed8677dfa37970141494336cc8932bc0b
	/**
	 * Metodo que crea los items del segundo menu.
	 */
	public void submenu(String text) {
		int index = Validator.indexElement(Variable.MENU, text);
		this.menuTwo.getItems().clear();
		this.menuTwo.setText("Convertir de: ");
<<<<<<< HEAD
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
=======
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
>>>>>>> 3c04199ed8677dfa37970141494336cc8932bc0b
		}
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
<<<<<<< HEAD
		init();
=======
		this.menuTwo.setDisable(true);
>>>>>>> 3c04199ed8677dfa37970141494336cc8932bc0b
		this.items();
	}

	@FXML
	private void handleButtonFileAction(ActionEvent event) {
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Open Resource File");
		Stage stage = (Stage) this.containerParent.getScene().getWindow();
<<<<<<< HEAD
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
		if (is && file != null) {
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
						/*
						 * AQUI VA LA VENTANA DEL ERROR EL ERROR ESTA EN E.GETMENSAJE
						 * */
						System.out.println(e.getMessage());
					}
				}
			}
			init();
=======
		fileChooser.showOpenDialog(stage);
		File file = fileChooser.showSaveDialog(stage);
		if (file != null) {
			buttonFile.setText(file.getName());
		} else {
			buttonFile.setText("Seleccionar archivo");
>>>>>>> 3c04199ed8677dfa37970141494336cc8932bc0b
		}
	}

}