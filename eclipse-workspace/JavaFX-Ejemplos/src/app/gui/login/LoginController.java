package app.gui.login;

import app.gui.AppController;
import app.gui.bienvenida.BienvenidaController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class LoginController extends AppController{

	@FXML
	private TextField tfNombre;
	
	
	@FXML
	public void escribirTexto(ActionEvent event) {
		String nombreUsuario = tfNombre.getText();

		BienvenidaController bienvenidaController = (BienvenidaController) cambiarVista(FXML_BIENVENIDA);
		bienvenidaController.setNombreBienvenida(nombreUsuario);
	}
	
	
	
	
	
}
