package app.gui.login;

import java.text.SimpleDateFormat;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import modelo.Usuario;
import services.LoginDenegadoException;
import services.LoginService;

public class LoginController {

	@FXML
	private TextField nombreUsuario;

	@FXML
	private PasswordField pass;

	@FXML
	private Label valido;
	
	@FXML
	private Label acceso;

	public void log() {

		LoginService lg = new LoginService();
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yy");
		try {

			Usuario u = lg.login(nombreUsuario.getText(), pass.getText());

			
			valido.setText(u.getNombre()+"--"+sdf.format(u.getFechaRegistro()));
			acceso.setText("Acceso correcto");
			
			nombreUsuario.setText("");
			pass.setText("");

		} catch (LoginDenegadoException e) {
			acceso.setText("Acceso Denegado");
			valido.setText("");
			
		}

	}
	
	public void exit() {
	System.exit(0);	
	}
}
