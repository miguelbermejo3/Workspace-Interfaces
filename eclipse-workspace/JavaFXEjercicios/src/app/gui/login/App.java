package app.gui.login;

import app.gui.appController.AppController;
import javafx.application.Application;

import javafx.stage.Stage;


public class App extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		AppController appController= new AppController(primaryStage);
				appController.cambiarVista("/app/gui/login/practica1.fxml");
				//mostrar escenario
				primaryStage.show();
				
		
	}
	public static void main(String[] args) {
		launch();
	}

	

}
