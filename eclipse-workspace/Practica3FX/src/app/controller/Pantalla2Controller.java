package app.controller;

import app.AppController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Pantalla2Controller extends AppController {
	@FXML
	private Button btnContinuar;

	@FXML
	private Label lblTipo;

	@FXML
	private TextField txtfieldTipo;

	@FXML
	void irPantalla3(ActionEvent event) {
		Pantalla3Controller p3c = (Pantalla3Controller) cambiarVista(AppController.FXML_PANTALLA3);
		setUserDataObject("tipo",txtfieldTipo.getText());
		System.out.println(getUserDataObject("tipo"));
	}
	
	
	
	
	
	
	

}
