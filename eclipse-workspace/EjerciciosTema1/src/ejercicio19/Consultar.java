package ejercicio19;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import ejercicio01.modelo.Pelicula;
import ejercicio01.service.PeliculaService;
import ejercicio01.service.PeliculasServiceException;

import javax.swing.JCheckBox;


public class Consultar {

	private JFrame frame;
	private JTable table;
	private TableModel modelo;

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
		frame.setResizable(false);
		frame.setBounds(100, 100, 656, 464);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(84, 103, 499, 277);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		modelo = new TableModel();
		table.setModel(modelo);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(84, 28, 499, 21);
		frame.getContentPane().add(btnConsultar);
		
		JCheckBox chckbxId = new JCheckBox("ID");
		chckbxId.setSelected(true);
		chckbxId.setBounds(111, 65, 93, 21);
		frame.getContentPane().add(chckbxId);
		
		JCheckBox chckbxNombre = new JCheckBox("NOMBRE");
		chckbxNombre.setSelected(true);
		chckbxNombre.setBounds(229, 65, 93, 21);
		frame.getContentPane().add(chckbxNombre);
		
		JCheckBox chckbxLong = new JCheckBox("LONGITUD");
		chckbxLong.setSelected(true);
		chckbxLong.setBounds(383, 65, 93, 21);
		frame.getContentPane().add(chckbxLong);
		btnConsultar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PeliculaService service = new PeliculaService();
				try {
					List<Pelicula> peliculas = service.consultarPeliculas();
					modelo.setDatos(peliculas);
					modelo.getColumnas().clear();
					if (chckbxId.isSelected()) {
						modelo.getColumnas().add("ID");
					}
					if (chckbxNombre.isSelected()) {
						modelo.getColumnas().add("NOMBRE");
					}
					if (chckbxLong.isSelected()) {
						modelo.getColumnas().add("LONGITUD");
					}
					modelo.fireTableStructureChanged();
					modelo.fireTableDataChanged();
					
					
					
					
				} catch (PeliculasServiceException e1) {
					JOptionPane.showMessageDialog(null,"Error", e1.getMessage(), JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
	}
}