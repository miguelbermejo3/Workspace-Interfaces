package ejercicio2;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

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

		JCheckBox politica = new JCheckBox("Acepto la política de privacidad");
		politica.setBounds(133, 191, 223, 23);
		politica.setSelected(true);
		frame.getContentPane().add(politica);

		KeyListener listenerKey = new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				Character c = e.getKeyChar();

				System.out.println(Character.isDigit(c));

				if (!Character.isDigit(c) || !politica.isSelected()) {
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
		
		
		ActionListener listenerAction = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setEditable(politica.isSelected());
				
			}
		};

		
		politica.addActionListener(listenerAction);
		textField.addKeyListener(listenerKey);

	}
}
