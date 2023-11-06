package ejercicio16;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class TableModel extends AbstractTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<Persona> personas;

	public TableModel() {
		personas = new ArrayList<Persona>();
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return personas.size();
	}

	@Override
	public int getColumnCount() {

		return 2;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Persona personaFila = personas.get(rowIndex);
		if (columnIndex == 0) {
			return personaFila.getNombre();
		}
		return personaFila.getApellido();

	}

	@Override
	public String getColumnName(int column) {
		if (column == 0) {
			return "nombre";
		}
		
			return "apellido";
		

	}

	public List<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}
	

}
