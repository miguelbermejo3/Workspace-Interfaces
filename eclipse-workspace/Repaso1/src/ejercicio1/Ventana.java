package ejercicio1;

import java.awt.EventQueue;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JTextField;

public class Ventana {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana window = new Ventana();
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
	public Ventana() {
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

		JLabel lblNewLabel = new JLabel("FORMULARIO EDAD");
		lblNewLabel.setBounds(159, 20, 218, 59);
		frame.getContentPane().add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(88, 90, 289, 68);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		KeyListener listenerKey = new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				Character c = e.getKeyChar();

				System.out.println(Character.isDigit(c));

				if (!Character.isDigit(c)) {
					e.consume();
				}

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {

				if (e.getKeyCode() == KeyEvent.VK_UP) {
					if (textField.getText().isEmpty()) {
						textField.setText("1");
					} else {
						Integer conv = Integer.parseInt(textField.getText()) + 1;
						String mensaje = conv.toString();
						textField.setText(mensaje);
					}

				}
				if (e.getKeyCode() == KeyEvent.VK_DOWN) {

					Integer conv = Integer.parseInt(textField.getText()) - 1;
					if (conv > 0) {
						String mensaje = conv.toString();
						textField.setText(mensaje);

					}

				}
			}
		};

		textField.addKeyListener(listenerKey);

	}

}
