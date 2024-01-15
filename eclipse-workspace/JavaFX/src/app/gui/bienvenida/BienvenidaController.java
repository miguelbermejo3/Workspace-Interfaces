package app.gui.bienvenida;

import app.gui.controller.AppController;
import app.gui.login.LoginController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class BienvenidaController extends AppController{

	@FXML
	private Label lbBienvenida;
	
	
    @FXML
    public void salir(ActionEvent event) {
    	System.out.println("salir");
    	cambiarVista(AppController.FXML_LOGIN);
    }
    
    public void setNombreBienvenida(String nombre) {
    	lbBienvenida.setText("Bienvenido "+nombre);
    }
    

    @FXML
    void irPantallaBienvenida(ActionEvent event) {
    	LoginController lc= new LoginController();
    	lc.escribirTexto(event);
    	cambiarVista(AppController.FXML_BIENVENIDA);
    	
    	
    }

    @FXML
    void irPantallaLogin(ActionEvent event) {
    	cambiarVista(AppController.FXML_LOGIN);
    }

}