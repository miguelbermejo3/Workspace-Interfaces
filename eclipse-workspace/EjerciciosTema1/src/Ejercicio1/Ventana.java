package Ejercicio1;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 6918473583195548501L;

	public void inicializar() {

		setTitle("Esto es una prueba");

		setSize(600, 400);

		setLocationRelativeTo(null);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Creo un botón

		JButton boton = new JButton();

		boton.setText("Probando");

		JButton boton2 = new JButton();

		boton2.setText("CANCELANDO");

		// Obtengo el contenedor y añado el botón

		Container contenedor = getContentPane();

		GridLayout layout = new GridLayout(3, 2);

		setLayout(layout);

		// Creamos un panel para la primera celda y le establecemos su propio layout

		JPanel panelUltimaCelda = new JPanel();

		GridLayout layoutPrimeraCelda = new GridLayout(2, 2);

		panelUltimaCelda.setLayout(layoutPrimeraCelda);

		for (int i = 1; i <= 6; i++) {

			if (i < 6) {

				JLabel b = new JLabel();

				b.setText("Texto " + i);

				contenedor.add(b);
			} else {
				for (int j = 1; j <= 4; j++) {

					JLabel b = new JLabel();

					panelUltimaCelda.add(b);

					b.setText("texto6." + j);
					contenedor.add(panelUltimaCelda);

				}
			}

		}

	}
}
