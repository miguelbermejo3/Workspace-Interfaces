package app.gui.bienvenida;

import app.gui.appController.AppController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import modelo.FXMLPath;

public class BienvenidaController extends AppController {

	@FXML
	private Label lblBienvenida;
	
	@FXML
	private BorderPane borderPane;

    @FXML
    public void cerrarSesion(ActionEvent event) {
    	System.out.println("cerrar sesión");
    	cambiarVista(AppController.FXML_LOGIN);
    }
    
    public void setNombreBienvenida(String nombre) {
    	lblBienvenida.setText("Bienvenido "+nombre);
    }
    
    
    @FXML
    void cargarPantallaComboBox(ActionEvent event) {
    	Parent vista=cargarVista(AppController.FXML_COMBOBOX);
    	borderPane.setCenter(vista);
    }
    
    @FXML
    void cargarPantallaColorPicker(ActionEvent event) {
    	Parent vista=cargarVista(AppController.FXML_COLORPICKER);
    	borderPane.setCenter(vista);
    }
    
    @FXML
    void cargarPantallaDatePicker(ActionEvent event) {
    	Parent vista=cargarVista(AppController.FXML_DATEPICKER);
    	borderPane.setCenter(vista);
    }
    
    @FXML
    void salir(ActionEvent event) {
    	System.out.println("salir");
    	System.exit(0);
    }
    
    @FXML
    void cargarPantallaSlider(ActionEvent event) {
    	Parent vista=cargarVista(AppController.FXML_SLIDER);
    	borderPane.setCenter(vista);
    }
    
    
    
    
    
    

}
