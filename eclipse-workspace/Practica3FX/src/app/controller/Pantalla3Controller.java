package app.controller;

import app.AppController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Pantalla3Controller extends AppController {

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

    	Pantalla1Controller p1c = (Pantalla1Controller) cambiarVista(AppController.FXML_PANTALLA1);
    
    	setUserDataObject("nombre",textfieldNombre.getText());
    	setUserDataObject("edad",txtfieldEdad.getText());
//    System.out.println(getUserDataObject("tipo"));
//    System.out.println(getUserDataObject("edad"));
    System.out.println(getUserDataObject("tipo"));	
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
