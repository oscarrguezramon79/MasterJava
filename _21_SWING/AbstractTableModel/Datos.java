package _21_SWING.AbstractTableModel;

import javax.swing.table.AbstractTableModel;

@SuppressWarnings("serial")
public class Datos  extends AbstractTableModel{
	final String[] cabeceras = {"Nombre","Apellido","Departamento","Sueldo", "Directivo"};
	@SuppressWarnings({ "removal" })
	final Object [][] datos = {
			{"Mario","Sanchez","Contabilidad", new Integer(2200), new Boolean(true)},
			{"Tomas","Garcia","Ventas", new Integer(1500), new Boolean(false)},
			{"Pedro","Minguez","Contabilidad", new Integer(1200), new Boolean(false)},
			{"Ana","Lobo","Marketing", new Integer(1250), new Boolean(false)},
			{"Celia","Martinez","Contabilidad", new Integer(3200), new Boolean(true)},
			{"Federico","Antunez","Informatica", new Integer(1850), new Boolean(false)},
			{"Jesus","Muñoz","Administracion", new Integer(2250), new Boolean(true)},
			{"Julio","Olmos","Informatica", new Integer(1650), new Boolean(false)},
			{"Marta","Sanchez","Contabilidad", new Integer(1000), new Boolean(false)},
			{"Dario","Montesinos","Informatica", new Integer(1500), new Boolean(false)},
	};
	
	public int getColumnCount() {return cabeceras.length;}
	public int getRowCount() {return datos.length;}
	public Object getValueAt(int row, int col) {return datos [row][col];}
	public String getColumnName(int column) {return cabeceras [column];}
	
	public Class<? extends Object> getColumnClass (int col) {return getValueAt(0,col).getClass();}
	
	//public boolean isCellEditable (int row, int col) {
		//if (col = 2) return true;
		//else return false;
	//}
	public void setValueAt(Object aValue, int row, int column) {
		datos[row][column] = aValue;
	}
}
