package Ejercicio6;

import java.awt.EventQueue;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import javax.swing.JButton;

public class Ventana {

	private JFrame frame;
	private JTextField texto;

	/**
	 * Se lanza la aplicación.
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
	 * Se crea la aplicacion.
	 */
	public Ventana() {
		initialize();
	}

	/**
	 * Se inicia el contenido del panel.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		texto = new JTextField();
		texto.setBounds(0, 191, 434, 70);
		frame.getContentPane().add(texto);
		texto.setColumns(10);

		 JButton botonSumar = new JButton("SUMAR");
		botonSumar.setBounds(0, 0, 434, 192);
		frame.getContentPane().add(botonSumar);

		MouseListener listenerMouse = new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {

				try {

					if (botonSumar.getText().isEmpty()) {
						botonSumar.setText("1");
					}

					else {
						Integer conv = Integer.parseInt(botonSumar.getText()) + 1;

						String mensaje = conv.toString();
						botonSumar.setText(mensaje);

					}
				} catch (NumberFormatException i) {
					JOptionPane.showMessageDialog(null, "ERROR");
					texto.setText("");
				}
			}
		};

		botonSumar.addMouseListener(listenerMouse);
		frame.getContentPane().add(botonSumar);

	}

}
