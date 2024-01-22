package app.gui.appController;

import java.io.IOException;
import java.net.URL;

import app.gui.login.App;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppController {

	public static Stage primaryStage;
	public static final String FXML_LOGIN="/app/gui/login/practica1.fxml";
	public static final String FXML_BIENVENIDA="/app/gui/bienvenida/bienvenida.fxml";
	public static final String FXML_COMBOBOX = "/app/gui/bienvenida/combobox.fxml";
	public static final String FXML_SLIDER = "/app/gui/bienvenida/slider.fxml";
	public static final String FXML_DATEPICKER = "/app/gui/bienvenida/datepicker.fxml";
	public static final String FXML_COLORPICKER = "/app/gui/bienvenida/colorpicker.fxml";
	 
	public AppController() {
 
	}
 
	public AppController(Stage stage) {
		primaryStage = stage;
	}
	
	public AppController cambiarVista(String fxml) {
				try {
					//1. cargar el fxml
					FXMLLoader loader= new FXMLLoader(App.class.getResource(fxml));
					//creamos la escena
					Scene scene;
					scene = new Scene(loader.load());
					//cargar la escena en el escenario
					primaryStage.setScene(scene);
					return loader.getController();
				} catch (IOException e) {
					System.err.println("No se ha podido cambiar de vista");
					System.err.println("Vista destino: "+fxml);
					e.printStackTrace();
					throw new RuntimeException(e);
				}
	}
	
	public Parent cargarVista(String fxml) {
		try {
			URL url= App.class.getResource(fxml);
			FXMLLoader loader= new FXMLLoader(url);
			return loader.load();
		}catch(IOException e) {
			throw new RuntimeException("No se ha podido cargar fxml");
		}
	}

}
