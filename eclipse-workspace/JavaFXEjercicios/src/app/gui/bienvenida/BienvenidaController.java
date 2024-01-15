package app.gui.bienvenida;

import app.gui.appController.AppController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class BienvenidaController extends AppController {

	@FXML
	private Label lblBienvenida;

    @FXML
    public void salir(ActionEvent event) {
    	System.out.println("salir");
    	cambiarVista(AppController.FXML_LOGIN);
    }
    
    public void setNombreBienvenida(String nombre) {
    	lblBienvenida.setText("Bienvenido "+nombre);
    }

}
