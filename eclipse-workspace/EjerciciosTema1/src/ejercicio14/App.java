package ejercicio14;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;

public class App {

	private JFrame frame;
	private Pantalla1 pantalla;
	private Pantalla2 pantalla2;
	private Pantalla3 pantalla3;
	private JMenu mnNewMenu;
	private JMenuItem mntmPantalla1;
	private JMenuItem mntmPantalla2;
	private JMenuItem mntmPantalla3;
	private JMenu mnSalir;
	private JMenuItem mntmSalir;
	private PantallaBienvenida pantallaBienvenida;
	private JMenuBar menuBar;

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
		pantallaBienvenida = new PantallaBienvenida(this);
		irPantallaBienvenida();

		 menuBar = new JMenuBar();
		 menuBar.setBounds(0, 0, 434, 22);
		

		mnNewMenu = new JMenu("Navegar");
		menuBar.add(mnNewMenu);

		mntmPantalla1 = new JMenuItem("Ir Pantalla 1");
		mntmPantalla1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, InputEvent.CTRL_DOWN_MASK));
		ActionListener listener1 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				irPantalla1("");

			}
		};
		mntmPantalla1.addActionListener(listener1);

		mnNewMenu.add(mntmPantalla1);

		mntmPantalla2 = new JMenuItem("Ir Pantalla 2");
		mntmPantalla2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, InputEvent.CTRL_DOWN_MASK));
		ActionListener listener2 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				irPantalla2("");

			}
		};
		mntmPantalla2.addActionListener(listener2);

		mnNewMenu.add(mntmPantalla2);

		mntmPantalla3 = new JMenuItem("Ir Pantalla 3");
		mntmPantalla3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_3, InputEvent.CTRL_DOWN_MASK));
		ActionListener listener3 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				irPantalla3("");

			}
		};
		mntmPantalla3.addActionListener(listener3);

		mnNewMenu.add(mntmPantalla3);

		mnSalir = new JMenu("Salir");
		menuBar.add(mnSalir);

		mntmSalir = new JMenuItem("Salir");
		mntmSalir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
		ActionListener listenerSalir = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		};
		mntmSalir.addActionListener(listenerSalir);
		mnSalir.add(mntmSalir);
	}

	public void irPantalla1(String textoPrevio) {

		frame.setContentPane(pantalla);
		pantalla.cambiarTexto(textoPrevio);
		frame.setJMenuBar(menuBar);
		frame.revalidate();

	}

	public void irPantalla2(String textoPrevio) {

		frame.setContentPane(pantalla2);
		pantalla2.cambiarTexto(textoPrevio);
		frame.setJMenuBar(menuBar);
		frame.revalidate();
	}

	public void irPantalla3(String textoPrevio) {

		frame.setContentPane(pantalla3);
		pantalla3.cambiarTexto(textoPrevio);
		frame.setJMenuBar(menuBar);
		frame.revalidate();
	}
	public void irPantallaBienvenida() {
		frame.setContentPane(pantallaBienvenida);
		
		frame.revalidate();
	}
}
