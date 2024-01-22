package app.gui.bienvenida;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import app.gui.appController.AppController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class DatePickerController extends AppController {

    @FXML
    private Button btnLeer;

    @FXML
    private DatePicker calendario;

    @FXML
    private TextField textfieldFecha;
    
    
    public void initialize() {
    	calendario.setValue(LocalDate.now());
    }
    
    

    @FXML
    void imprimirFecha(ActionEvent event) {
    	LocalDate fecha=calendario.getValue();

    	 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    	String fechaFormateada= fecha.format(dtf).toString();
    	textfieldFecha.setText(fechaFormateada);
    	
    	
    	
    }

}
