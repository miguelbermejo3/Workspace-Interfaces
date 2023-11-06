package ejercicio17;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import ejercicio01.modelo.Pelicula;
import ejercicio01.service.PeliculaService;
import ejercicio01.service.PeliculasServiceException;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class Consultar {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Consultar window = new Consultar();
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
	public Consultar() {
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

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 414, 203);
		frame.getContentPane().add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
		TableModel modelo = new TableModel();
		table.setModel(modelo);

		JButton btnNewButton = new JButton("CONSULTAR");

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				PeliculaService ps = new PeliculaService();
				try {
					List<Pelicula> peliculas = ps.consultarPeliculas();
					modelo.setPeliculas(peliculas);
					modelo.fireTableDataChanged();

				} catch (PeliculasServiceException e1) {
					e1.getMessage();
				}

			}
		});

		btnNewButton.setBounds(162, 225, 141, 23);

		frame.getContentPane().add(btnNewButton);

	}

}
