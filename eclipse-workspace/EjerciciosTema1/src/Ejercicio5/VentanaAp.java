package Ejercicio5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;

import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class VentanaAp {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaAp window = new VentanaAp();
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
	public VentanaAp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton Sumar = new JButton("SUMAR");
		Sumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().add(Sumar, BorderLayout.CENTER);

		JLabel lblNewLabel = new JLabel("");
		frame.getContentPane().add(lblNewLabel, BorderLayout.SOUTH);

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
				if (lblNewLabel.getText().isEmpty()) {
					lblNewLabel.setText("1");
				} else {
					Integer conv = Integer.parseInt(lblNewLabel.getText()) + 1;

					String mensaje = conv.toString();
					lblNewLabel.setText(mensaje);

				}

			}
		};

		Sumar.addMouseListener(listenerMouse);
		frame.getContentPane().add(Sumar);

	}

}
