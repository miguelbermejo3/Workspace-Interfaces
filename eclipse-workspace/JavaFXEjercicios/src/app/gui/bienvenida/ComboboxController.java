package app.gui.bienvenida;

import app.gui.appController.AppController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class ComboboxController extends AppController {

	@FXML
	private Button botonImprimir;

	@FXML
	private Button botonLimpiar;

	@FXML
	private ComboBox<String> comBox;

	@FXML
	private TextField textFieldNombres;

	public void initialize() {
		comBox.getItems().add("Miguel");
		comBox.getItems().add("Fierro");
	}

	@FXML
	void imprimirTexto(ActionEvent event) {

		textFieldNombres.setText(comBox.getValue());

	}

	@FXML
	void limpiarTextos(ActionEvent event) {

		comBox.setValue("");
		textFieldNombres.setText("");
	}

}
