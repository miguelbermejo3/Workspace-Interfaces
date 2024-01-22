package app.gui.bienvenida;


import app.gui.AppController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class BienvenidaController extends AppController{

	@FXML
	private Label lbBienvenida;
	@FXML
	private BorderPane panel;
	
    @FXML
    public void salir(ActionEvent event) {
    	cambiarVista(FXML_LOGIN);
    }

    public void setNombreBienvenida(String nombre) {
    	lbBienvenida.setText("Bienvenido/a " + nombre);
    }
    
    @FXML
    void irPantallaDos(ActionEvent event) {
    	panel.setCenter(cargarVista(FXML_PANTALLA2));
    }

    @FXML
    void irPantallaUno(ActionEvent event) {
       	panel.setCenter(cargarVista(FXML_PANTALLA1));
    }
	
}
