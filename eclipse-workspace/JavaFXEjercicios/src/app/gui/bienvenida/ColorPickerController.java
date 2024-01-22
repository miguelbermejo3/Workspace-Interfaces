package app.gui.bienvenida;

import app.gui.appController.AppController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;

public class ColorPickerController extends AppController {

	@FXML
	private Button btnAplicar;

	@FXML
	private ColorPicker clrPicker;

	@FXML
	private Label txtfColor;

	@FXML
	void cambiarColor(ActionEvent event) {

		txtfColor.setTextFill(clrPicker.getValue());

	}

}
