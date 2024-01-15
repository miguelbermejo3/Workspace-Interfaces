package app.gui.appController;

import java.io.IOException;


import app.gui.login.App;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppController {

	public static Stage stage;
	public static final String FXML_LOGIN="/app/gui/login/practica1.fxml";
	public static final String FXML_BIENVENIDA="/app/gui/bienvenida/bienvenida.fxml";
	 
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

}
