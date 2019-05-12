package lGpl20.other.uI;

import java.io.Serializable;

import javax.swing.table.DefaultTableModel;

import lGpl20.o.O;

/**
 * 本類別記錄用表格的模組.<br/>
 * <br/>
 * The TableModel of table for record.
 * 
 * @version 2017/04/11_15:50:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=MyTableModel" >MyTableModel.java</a>
 * 
 * @see MyTableToRec
 */
public class MyTableModel extends DefaultTableModel implements Serializable {

	private static final Class<MyTableModel> CLASS_THIS = MyTableModel.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 建構方法.<br/>
	 * Constructor.
	 */
	public MyTableModel(Object[][] objAry2D, Object[] objAryOfColumnName) {

		super(objAry2D, objAryOfColumnName);

	}

	@Override
	public final boolean isCellEditable(int row, int col) {

		return false;

	}

	// public Class<?> getColumnClass(int c) {
	// return getValueAt(0, c).getClass();
	// }

}
