package app.gui.login;

import app.gui.bienvenida.BienvenidaController;
import app.gui.controller.AppController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class LoginController extends AppController {

	@FXML
	private TextField tfNombre;

	public void escribirTexto(ActionEvent event) {

		String nombreUsuario=tfNombre.getText();
		
		BienvenidaController bienvenidaController=(BienvenidaController) cambiarVista(AppController.FXML_BIENVENIDA);

		bienvenidaController.setNombreBienvenida(nombreUsuario);
	}
	
	
	

}
