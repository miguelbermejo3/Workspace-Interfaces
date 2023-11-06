package ejercicio17;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import ejercicio01.modelo.Pelicula;

public class TableModel extends AbstractTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<Pelicula> peliculas;

	public TableModel() {
		peliculas = new ArrayList<Pelicula>();
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return peliculas.size();
	}

	@Override
	public int getColumnCount() {

		return 3;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Pelicula peliculaFila = peliculas.get(rowIndex);
		if (columnIndex == 0) {
			return peliculaFila.getId();
		}
		if (columnIndex == 1) {
			return peliculaFila.getNombre();
		}
		return peliculaFila.getLongitud();

	}

	@Override
	public String getColumnName(int column) {
		if (column == 0) {
			return "id";
		}
		if (column == 1) {
			return "nombre";
		}

		return "longitud";

	}

	public List<Pelicula> getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(List<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}

	
}
