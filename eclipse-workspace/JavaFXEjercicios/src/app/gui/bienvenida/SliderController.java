package app.gui.bienvenida;

import app.gui.appController.AppController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

public class SliderController extends AppController{

    @FXML
    private Button botonLeer;

    @FXML
    private Slider menuSlider;

    @FXML
    private TextField textfieldNumero;
    
    
    public void initialize() {
    	menuSlider.setValue(5);
    }

    @FXML
    void imprimirNumero(ActionEvent event) {

  
    	
    	
    	
    	
    	textfieldNumero.setText(String.valueOf(menuSlider.getValue()));
    	
    	
    	
    }

	

}
