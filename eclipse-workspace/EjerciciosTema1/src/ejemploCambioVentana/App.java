package ejemploCambioVentana;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class App {

	private JFrame frame;
	private Pantalla1View pantalla;
	private Pantalla2View pantalla2;
	private Pantalla3View pantalla3;

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

		pantalla = new Pantalla1View(this);
		pantalla2 = new Pantalla2View(this);
		pantalla3 = new Pantalla3View(this);

		
		irAPantalla1();
	}

	public void irAPantalla1() {

		frame.setContentPane(pantalla);
		frame.revalidate();

	}
	
	public void irAPantalla2() {

		frame.setContentPane(pantalla2);
		frame.revalidate();

	}
	
	public void irAPantalla3() {

		frame.setContentPane(pantalla3);
		frame.revalidate();

	}

	public void login(String usuario,String pass) {
		System.out.println(usuario);
		System.out.println(pass);
		//si hubiese error
		
	}
	
	

}
