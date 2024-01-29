package app.gui.bienvenida;

import java.util.ResourceBundle;

import javax.print.DocFlavor.URL;

import app.gui.appController.AppController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class WebviewerController extends AppController {


    @FXML
    private Label lblWeb;

    @FXML
    private TextField textWeb;

    @FXML
    private WebView viewer;
    

    @FXML
    private Button botonWeb;
    
    private WebEngine engine;
    
 
    public void initialize(URL url,ResourceBundle resource) {
    	engine=viewer.getEngine();
    	loadPage();
    	
    }
    
    public void loadPage() {
    	engine.load("http://"+textWeb.getText());
    }
    

}
