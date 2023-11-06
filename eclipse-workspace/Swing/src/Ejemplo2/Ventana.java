package Ejemplo2;

import javax.swing.JFrame;

public class Ventana extends JFrame{

	private static final long serialVersionUID = 6918473583195548501L;

	public void inicializar() {
		setTitle("Esto es una prueba");
		setSize(600, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
