package app;

import java.io.IOException;
import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppController {

	public static Stage primaryStage;
	public static final String FXML_PANTALLA1 = "/app/pantalla1/pantalla1.fxml";
	public static final String FXML_PANTALLA2="/app/pantalla2/pantalla2.fxml";
	public static final String FXML_PANTALLA3="/app/pantalla2/pantalla3.fxml";
	
	
	public AppController() {

	}

	public AppController(Stage stage) {
		primaryStage = stage;
	}
	
	
	
	
	public AppController cambiarVista(String fxml) {
		try {
			// 1. cargar el fxml
			FXMLLoader loader = new FXMLLoader(App.class.getResource(fxml));
			// creamos la escena
			Scene scene;
			scene = new Scene(loader.load());
			// cargar la escena en el escenario
			primaryStage.setScene(scene);
			return loader.getController();
		} catch (IOException e) {
			System.err.println("No se ha podido cambiar de vista");
			System.err.println("Vista destino: " + fxml);
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	public Parent cargarVista(String fxml) {
		try {
			URL url = App.class.getResource(fxml);
			FXMLLoader loader = new FXMLLoader(url);
			return loader.load();
		} catch (IOException e) {
			throw new RuntimeException("No se ha podido cargar fxml");
		}
	}
	
	

}
