package Ejemplo4;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

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
			
			//Creo un layout
			FlowLayout layout = new FlowLayout();
			//cambio el layout de la ventana 
			setLayout(layout);
			
			
			// Obtengo el contenedor y añado el botón
			Container contenedor = getContentPane();
			contenedor.add(boton);
			
			
			
			
			for (int i=0;i<=10;i++) {
				JButton botonN= new JButton();
				botonN.setText("nuevo ejemplo");
				contenedor.add(botonN);
				
				
			}
			contenedor.add(boton);
			
			
			
		}
}
