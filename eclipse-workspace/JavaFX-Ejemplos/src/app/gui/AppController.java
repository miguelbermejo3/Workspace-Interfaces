package app.gui;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppController {

	public static final String FXML_LOGIN = "/app/gui/login/login.fxml";
	public static final String FXML_BIENVENIDA = "/app/gui/bienvenida/bienvenida.fxml";
	public static final String FXML_PANTALLA1 = "/app/gui/bienvenida/pantalla1.fxml";
	public static final String FXML_PANTALLA2 = "/app/gui/bienvenida/pantalla2.fxml";
	
	private static Stage stage;
	
	public AppController() {
	}
	
	public AppController(Stage primaryStage) {
		stage = primaryStage;
	}
	
	public AppController cambiarVista(String fxml) {
		try {
			// 1. Cargar el FXML que quiero mostrar
			FXMLLoader loader = new FXMLLoader(App.class.getResource(fxml));
			// 2. Creamos la escena
			Scene scene = new Scene(loader.load());
			// 3. Cargar la escena en el escenario
			stage.setScene(scene);
			// 4. Devolvemos el controller
			return loader.getController();
		}
		catch(IOException e) {
			System.err.println("No se ha podido cambiar de vista");
			System.err.println("Vista destino: " + fxml);
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	
	public Parent cargarVista(String fxml) {
		try {
			FXMLLoader loader = new FXMLLoader(App.class.getResource(fxml));
			return loader.load();
		}
		catch(IOException e) {
			System.err.println("No se ha podido cambiar de vista");
			System.err.println("Vista destino: " + fxml);
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	
}
