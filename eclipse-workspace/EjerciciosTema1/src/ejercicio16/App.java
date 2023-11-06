package ejercicio16;

import java.awt.EventQueue;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JScrollPane;

public class App {

	private JFrame frame;
	private JTextField textFieldNombre;
	private JTextField textFieldApellido;
	private JTable table;
	private TableModel modelo;

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
		frame.getContentPane().setLayout(null);

		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(64, 35, 149, 38);
		frame.getContentPane().add(textFieldNombre);
		KeyListener listenerKey = new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER && !textFieldNombre.getText().isEmpty()) {
					e.getComponent().transferFocus();
				}

			}
		};
		textFieldNombre.addKeyListener(listenerKey);
		textFieldNombre.setColumns(10);

		textFieldApellido = new JTextField();
		textFieldApellido.setBounds(223, 35, 147, 38);
		frame.getContentPane().add(textFieldApellido);

		KeyListener listenerKeyApellido = new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER && !textFieldApellido.getText().isEmpty()) {

					Persona p = new Persona();
					p.setApellido(textFieldApellido.getText());
					p.setNombre(textFieldNombre.getText());
					modelo.getPersonas().add(p);
					modelo.fireTableDataChanged();
				}

			}
		};

		textFieldApellido.addKeyListener(listenerKeyApellido);
		textFieldApellido.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 86, 402, 164);
		frame.getContentPane().add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);

		modelo = new TableModel();

		table.setModel(modelo);

	}
}
