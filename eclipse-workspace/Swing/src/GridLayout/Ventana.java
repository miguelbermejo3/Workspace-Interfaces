package GridLayout;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame {

	
	
	private static final long serialVersionUID = 6918473583195548501L;
	
	public void inicializar() {
		
		
		setTitle("Esto es una prueba");
		setSize(600, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		
		Container contenedor = getContentPane();
		
		// Creo un botón
				JButton boton = new JButton();
				boton.setText("Probando");
				
				// Obtengo el contenedor y añado el botón
				Container contenedor1 = getContentPane();
				contenedor.add(boton);
		
		
		//creo un layout
		GridLayout layout = new GridLayout(4,2);
		//cambio aypout de la ventana
		setLayout(layout);
		
		//nuevo panel para la primera celda y establecemos su propio layout
		JPanel panelPrimeraCelda = new JPanel();
		GridLayout layoutPrimeraCelda = new GridLayout(1,2);
		panelPrimeraCelda.setLayout(layoutPrimeraCelda);
		
		contenedor.add(panelPrimeraCelda);
		
		for (int i=0; i<=7;i++) {
				
				JButton botonN = new JButton();
				contenedor.add(botonN);
				botonN.setText("Botón"+(i+1));
				
	
		}
	
	
	
	
	
	
	
	
	}
}
