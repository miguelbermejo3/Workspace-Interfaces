package ejemploTabla;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class TableModel extends AbstractTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<Pais> paises;

	public TableModel() {
		paises = new ArrayList<Pais>();
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return paises.size();
	}

	@Override
	public int getColumnCount() {

		return 3;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Pais paisFila = paises.get(rowIndex);
		if (columnIndex == 0) {
			return paisFila.getCodigo();
		}
		if (columnIndex == 1) {
			return paisFila.getNombre();
		}
		return paisFila.getPoblacion();

	}

	@Override
	public String getColumnName(int column) {
		if (column == 0) {
			return "codigo";
		}
		if (column == 1) {
			return "descripcion";
		}
		return "poblacion";

	}

}
