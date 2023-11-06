package Ejercicio9;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Ventana {
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

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
		textField.setBounds(100, 11, 184, 48);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(100, 70, 184, 48);
		frame.getContentPane().add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(100, 129, 184, 48);
		frame.getContentPane().add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(100, 188, 184, 48);
		frame.getContentPane().add(textField_3);

		KeyListener listenerKey = new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {

				if (e.getKeyCode() == KeyEvent.VK_UP) {
					e.getComponent().transferFocusBackward();

				}
				if (e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_ENTER) {
					e.getComponent().transferFocus();
				}

			}
		};

		FocusListener listenerFocus = new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				JTextField texto = (JTextField) e.getSource();
				texto.setBackground(Color.white);
			}

			@Override
			public void focusGained(FocusEvent e) {
				JTextField texto = (JTextField) e.getSource();
				texto.setBackground(Color.green);

			}
		};

		textField.addKeyListener(listenerKey);
		textField_1.addKeyListener(listenerKey);
		textField_2.addKeyListener(listenerKey);
		textField_3.addKeyListener(listenerKey);

		textField.addFocusListener(listenerFocus);
		textField_1.addFocusListener(listenerFocus);
		textField_2.addFocusListener(listenerFocus);
		textField_3.addFocusListener(listenerFocus);
	}
}
