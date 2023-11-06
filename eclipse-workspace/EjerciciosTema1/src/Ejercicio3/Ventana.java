package Ejercicio3;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;

	public void inicializar() {
		setTitle("Ejercicios");
		setSize(300, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void cargarComponentes() {

		GridLayout layout = new GridLayout(4, 1);
		Container contenedorPrincipal = getContentPane();
		contenedorPrincipal.setLayout(layout);
		JLabel label = new JLabel();

		ActionListener listenerBotones = new ActionListener() {
			
			
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String actionCommandOrigen = e.getActionCommand();

				label.setText(" Has hecho click en el boton " + actionCommandOrigen);

			}
		};

		for (int i = 1; i <= 3; i++) {

			JButton boton = new JButton();
			boton.addActionListener(listenerBotones);
			boton.setText(String.valueOf(i));
			boton.setActionCommand("Botón" + i);
			contenedorPrincipal.add(boton);

		}

		label.setText("¿Dónde has hecho click?");
		contenedorPrincipal.add(label);

	}

}
