package app.gui.controller;

import java.io.IOException;

import javax.print.DocFlavor.URL;

import app.gui.login.App;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppController {

	public static Stage stage;
	
	public static final String FXML_LOGIN="/app/gui/login/login.fxml";
	public static final String FXML_BIENVENIDA="/app/gui/bienvenida/Bienvenida.fxml";
	 
	public AppController() {
 
	}
 
	public AppController(Stage primaryStage) {
		stage = primaryStage;
	}
	
	public AppController cambiarVista(String fxml) {
				try {
					//1. cargar el fxml
					FXMLLoader loader= new FXMLLoader(App.class.getResource(fxml));
					//creamos la escena
					Scene scene;
					scene = new Scene(loader.load());
					//cargar la escena en el escenario
					stage.setScene(scene);
					return loader.getController();
				} catch (IOException e) {
					System.err.println("No se ha podido cambiar de vista");
					System.err.println("Vista destino: "+fxml);
					e.printStackTrace();
					throw new RuntimeException(e);
				}
	}
	
	/*public Parent cargarVista(String fxml) {
		URL url=App.class.getResource(fxml);
		FXMLLoader loader= new FXMLLoader(url);
		return loader.load();
	}*/
}
