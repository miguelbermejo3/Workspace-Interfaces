package app.controller;

import app.AppController;
import app.modelo.Animal;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class Pantalla2Controller extends AppController {
	@FXML
	private Button btnContinuar;

	@FXML
	private Label lblTipo;

	@FXML
	private TextField txtfieldTipo;
	@FXML
	private CheckBox modoOscuro;

	@FXML
	private AnchorPane panel;

	public void initialize() {

		Boolean decision = (Boolean) getUserDataObject("oscuro");

		if (decision == true) {

			panel.getStylesheets().add("/css/dark-theme.css"); // añade la hoja de estilos
		} else {
			panel.getStylesheets().clear(); // borramos las hojas de estilos añadidas
		}

	}

	@FXML
	void irPantalla3(ActionEvent event) {

		if (txtfieldTipo.getText().isEmpty()) {
			Alert a = new Alert(AlertType.ERROR);
			a.setHeaderText(null);
			a.setContentText("El tipo no puede estar vacido");
			a.setTitle("ERROR");
			a.showAndWait();

		} else {

			Pantalla3Controller p3c = (Pantalla3Controller) cambiarVista(AppController.FXML_PANTALLA3);
			Animal a = new Animal();
			a.setTipo(txtfieldTipo.getText());
			setUserDataObject("animalNuevo", a);
		}
	}

}
