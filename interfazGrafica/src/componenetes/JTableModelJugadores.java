package componenetes;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class JTableModelJugadores extends AbstractTableModel {

	ArrayList<Jugador> jugadores;
	
	 public JTableModelJugadores(ArrayList<Jugador>lista) {
		this.jugadores = lista;
	}
	
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return jugadores.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Jugador j = jugadores.get(rowIndex);
		if(columnIndex == 0 ) return j.getNombre();
		else if (columnIndex ==1) return j.getEquipo();
		else return "";
		
	
	}


}
