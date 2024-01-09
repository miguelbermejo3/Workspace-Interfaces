package services;

import java.util.Date;


import modelo.Usuario;

public class LoginService {

	
	 
	 
	
	public Usuario login(String username, String password) throws LoginDenegadoException {
		Usuario usuario = new Usuario("Miguel Bermejo Fierro", "miguel", new Date());
		if ("Miguel".equals(username) && "miguel".equals(password)) {
			return usuario;
		}
		throw new LoginDenegadoException("Usuario/Password incorrectos");
	}
}
