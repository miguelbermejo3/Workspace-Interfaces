package Ejercicio4;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

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
		MouseListener listenerMouse = new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				JButton boton2 = (JButton) e.getSource();
				boton2.setText(boton2.getText()+"!");

			}

			@Override
			public void mouseExited(MouseEvent e) {
				JButton boton1 = (JButton) e.getSource();
				boton1.setBackground(null);

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				JButton boton1 = (JButton) e.getSource();
				boton1.setBackground(Color.green);

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}

		};

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
			boton.addMouseListener(listenerMouse);
			contenedorPrincipal.add(boton);

		}

		label.setText("¿Dónde has hecho click?");
		contenedorPrincipal.add(label);

	}
}
