package ejercicio19;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import ejercicio01.modelo.Pelicula;

public class TableModel extends AbstractTableModel{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7994541583917709662L;
	private List<Pelicula> datos;
	private List<String> columnas;
	
	public TableModel() {
		datos = new ArrayList<>();
		columnas = new ArrayList<>();
		columnas.add("ID");
		columnas.add("NOMBRE");
		columnas.add("LONGITUD");
	}

	@Override
	public int getRowCount() {
		return datos.size();
	}

	@Override
	public int getColumnCount() {
		return columnas.size();
	}
	
	@Override
	public String getColumnName(int column) {
		return columnas.get(column);
	}

	@Override
	public Object getValueAt(int rowIndex, int column) {
		Pelicula pelicula = datos.get(rowIndex);
		String nombreColumn = columnas.get(column);
		if (nombreColumn.equals("ID")) {
			return pelicula.getId();
		}
		if (nombreColumn.equals("NOMBRE")) {
			return pelicula.getNombre();
		}
		if (nombreColumn.equals("LONGITUD")) {
			return pelicula.getLongitud();
		}
		return "ERROR";
		
	}

	public void setDatos(List<Pelicula> datos) {
		this.datos = datos;
	}

	public List<String> getColumnas() {
		return columnas;
	}

	public void setColumnas(List<String> columnas) {
		this.columnas = columnas;
	}
	
	
	
	
	
}