package Ejercicio2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 6918473583195548501L;

	public void inicializar() {

		setTitle("Esto es una prueba");

		setSize(400, 200);

		setLocationRelativeTo(null);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contenedor = getContentPane();

		GridLayout layout = new GridLayout(4, 2);

		setLayout(layout);

		for (int i = 1; i <= 8; i++) {

			if (i == 1) {
				JLabel nombre = new JLabel();
				nombre.setText("Nombre:");
				contenedor.add(nombre, BorderLayout.CENTER);
				JTextField nombreR = new JTextField(8);
				contenedor.add(nombreR, BorderLayout.EAST);

			}
			if (i == 2) {

				JLabel dni = new JLabel();
				dni.setText("DNI:");
				contenedor.add(dni);

				JTextField nombreR = new JTextField(8);
				contenedor.add(nombreR, BorderLayout.EAST);

			}

			if (i == 3) {
				JLabel fechaN = new JLabel();
				fechaN.setText("Fecha de nacimiento:");
				contenedor.add(fechaN);

				JPanel panelFecha = new JPanel();
				panelFecha.setLayout(new FlowLayout());
				panelFecha.add(new JTextField(2));
				panelFecha.add(new JLabel("/"));
				panelFecha.add(new JTextField(2));
				panelFecha.add(new JLabel("/"));
				panelFecha.add(new JTextField(2));

				contenedor.add(panelFecha);

			}

			if (i == 4) {

				JButton aceptar = new JButton();
				aceptar.setText("ACEPTAR");
				contenedor.add(aceptar);

				JButton cancelar = new JButton();
				cancelar.setText("CANCELAR");
				contenedor.add(cancelar);
			}

		}
	}
}
