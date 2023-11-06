package ejercicio12;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class App {

	private JFrame frame;
	private Pantalla1 pantalla;
	private Pantalla2 pantalla2;
	private Pantalla3 pantalla3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		pantalla = new Pantalla1(this);
		pantalla2 = new Pantalla2(this);
		pantalla3 = new Pantalla3(this);
		irPantalla1("");
	}

	public void irPantalla1(String textoPrevio) {

		frame.setContentPane(pantalla);
		pantalla.cambiarTexto(textoPrevio);

		frame.revalidate();

	}

	public void irPantalla2(String textoPrevio) {

		frame.setContentPane(pantalla2);
		pantalla2.cambiarTexto(textoPrevio);
		frame.revalidate();
	}

	public void irPantalla3(String textoPrevio) {

		frame.setContentPane(pantalla3);
		pantalla3.cambiarTexto(textoPrevio);
		frame.revalidate();
	}

}
