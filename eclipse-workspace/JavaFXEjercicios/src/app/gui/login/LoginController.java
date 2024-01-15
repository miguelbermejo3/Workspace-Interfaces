package app.gui.login;

import java.text.SimpleDateFormat;

import app.gui.appController.AppController;
import app.gui.bienvenida.BienvenidaController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import modelo.Usuario;
import services.LoginDenegadoException;
import services.LoginService;

public class LoginController extends AppController {

	@FXML
	private TextField nombreUsuario;

	@FXML
	private PasswordField pass;

	@FXML
	private Label valido;

	@FXML
	private Label acceso;

	@FXML
	private Button boton;

	public void initialize() {
		boton.setDisable(true);

	}

	public void log() {

		LoginService lg = new LoginService();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
		try {

			Usuario u = lg.login(nombreUsuario.getText(), pass.getText());

			valido.setText(u.getNombre() + "--" + sdf.format(u.getFechaRegistro()));
			acceso.setText("Acceso correcto");

			String nombreUser=nombreUsuario.getText();
			BienvenidaController bienvenidaController= (BienvenidaController) cambiarVista(AppController.FXML_BIENVENIDA);
			bienvenidaController.setNombreBienvenida(nombreUser);
			
			vaciarCampos();

			boton.setDisable(true);
			

		} catch (LoginDenegadoException e) {
			acceso.setText("Acceso Denegado");
			valido.setText("");
			vaciarCampos();

		}

	}

	public void exit() {
		System.exit(0);
	}
	
	

	@FXML
	public void handleTextChange() {

		boolean camposNoVacios = !nombreUsuario.getText().isEmpty() && !pass.getText().isEmpty();
		boton.setDisable(camposNoVacios);
	}

	public void actualizarEstadoBoton() {
		boton.setDisable(nombreUsuario.getText().trim().isEmpty() || pass.getText().isEmpty());
	}

	public void vaciarCampos() {
		nombreUsuario.setText("");
		pass.setText("");
	}
}
