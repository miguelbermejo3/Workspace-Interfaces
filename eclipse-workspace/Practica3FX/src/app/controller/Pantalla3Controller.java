package app.controller;

import app.AppController;
import app.modelo.Animal;
import app.service.AnimalesService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class Pantalla3Controller extends AppController {

	@FXML
	private AnchorPane panel;
	@FXML
	private Button btnGuardar;

	@FXML
	private Label lblEdad;

	@FXML
	private Label lblNombre;

	@FXML
	private TextField textfieldNombre;

	@FXML
	private TextField txtfieldEdad;

	@FXML
	void guardarNuevoAnimal(ActionEvent event) {

		if (txtfieldEdad.getText().isEmpty() || textfieldNombre.getText().isEmpty()) {
			Alert a = new Alert(AlertType.ERROR);
			a.setHeaderText(null);
			a.setContentText("El tipo no puede estar vacido");
			a.setTitle("ERROR");
			a.showAndWait();

		}

		else if (!soloNumero()) {
			Alert a = new Alert(AlertType.ERROR);
			a.setHeaderText(null);
			a.setContentText("La edad  no puede tener letras");
			a.setTitle("ERROR");
			a.showAndWait();
		}

		else {

			Animal a = (Animal) getUserDataObject("animalNuevo");
			a.setEdad(Integer.valueOf(txtfieldEdad.getText()));
			a.setNombre(textfieldNombre.getText());
			setUserDataObject("animalNuevo", a);

			AnimalesService as = new AnimalesService();
			as.addAnimal(a);

			cambiarVista(FXML_PANTALLA1);

		}

	}

//    System.out.println(getUserDataObject("tipo"));
//    System.out.println(getUserDataObject("edad"));
	// System.out.println(getUserDataObject("tipo"));

	public Boolean soloNumero() {

		char[] cantidadPalabras = txtfieldEdad.getText().toCharArray();

		for (char c : cantidadPalabras) {
			if (!Character.isDigit(c)) {
				return false;
			}
		}
		return true;

	}

	public void initialize() {

		Boolean decision = (Boolean) getUserDataObject("oscuro");

		if (decision == true) {

			panel.getStylesheets().add("/css/dark-theme.css"); // añade la hoja de estilos
		} else {
			panel.getStylesheets().clear(); // borramos las hojas de estilos añadidas
		}

	}

}
