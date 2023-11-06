package ejercicio6;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

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

		textField = new JTextField();
		textField.setBounds(62, 66, 292, 81);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("NUEVA CIUDAD");
		lblNewLabel.setBounds(176, 27, 87, 28);
		frame.getContentPane().add(lblNewLabel);

		JComboBox<String> comboBox = new JComboBox<>();
		comboBox.setBounds(141, 183, 142, 22);
		frame.getContentPane().add(comboBox);

		JLabel lblNewLabel_1 = new JLabel("DESTINOS DISPONIBLES");
		lblNewLabel_1.setLabelFor(comboBox);
		lblNewLabel_1.setBounds(141, 158, 122, 14);
		frame.getContentPane().add(lblNewLabel_1);

		JButton btnLimpiar = new JButton("limpiar");
		btnLimpiar.setBounds(26, 173, 89, 23);
		frame.getContentPane().add(btnLimpiar);

		JButton btnSeleccionar = new JButton("seleccionar");
		btnSeleccionar.setBounds(26, 207, 89, 23);
		frame.getContentPane().add(btnSeleccionar);

		JLabel lblCiudad = new JLabel("");
		lblCiudad.setBounds(151, 216, 225, 34);
		frame.getContentPane().add(lblCiudad);

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
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					String nuevo = textField.getText();
					comboBox.addItem(nuevo);
					textField.setText("");
					comboBox.setSelectedItem(null);
				}

			}
		};

		ActionListener listenerAction = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnLimpiar) {
					comboBox.removeAllItems();
				}

			}
		};
		ActionListener listener2 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnSeleccionar) {
					lblCiudad.setText("La ciudad elegida es : " + comboBox.getSelectedItem().toString());

				}

			}
		};
		btnSeleccionar.addActionListener(listener2);
		btnLimpiar.addActionListener(listenerAction);
		textField.addKeyListener(listenerKey);

	}
}
