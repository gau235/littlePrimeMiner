package lGpl20.other.uI;

import java.util.Comparator;

import javax.swing.DefaultRowSorter;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;

import lGpl20.comb.filter.CompaForStr;
import lGpl20.o.O;

/**
 * 本類別記錄用表格.<br/>
 * <br/>
 * The table to record.
 * 
 * @version 2019/03/14_14:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=MyTableToRec" >MyTableToRec.java</a>
 * 
 * @see MyTableModel
 */
public class MyTableToRec extends JTable {

	private static final Class<MyTableToRec> CLASS_THIS = MyTableToRec.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	protected final DefaultTableModel TABLE_MODEL = new MyTableModel(new Object[][] {},
			new Object[] { "N1", "N2", "Thr", "NumPrime", "Cost(s)", "Time" });

	/**
	 * 比較器, 用於表格直行的排序.<br/>
	 * The Comparator to sort by the column of table to record.
	 */
	public static final Comparator<StringBuilder> COMPA_FOR_STR = new CompaForStr();

	/**
	 * 比較器, 用於表格直行的排序.<br/>
	 * The Comparator to sort by the column of table to record.
	 */
	public static final Comparator<CharSequence> MY_COMPA_FOR_INT64 = new MyCompaForInt64InColOfTable();

	/**
	 * 比較器, 用於表格直行的排序.<br/>
	 * The Comparator to sort by the column of table to record.
	 */
	public static final Comparator<CharSequence> MY_COMPA_FOR_F32 = new MyCompaForF32InColOfTable();

	/**
	 * The row height.<br/>
	 * The row height.
	 */
	protected static final int H_ROW = (int) ((float) MyComponenter.hOfFontDialog_1_22 * 1.0F + 0.0F);

	/**
	 * 建構方法.<br/>
	 * Constructor.
	 */
	public MyTableToRec() {

		setModel(TABLE_MODEL);
		setFont(MyComponenter.dynaFontDialog_1_24);
		setBackground(MyComponenter.COLOR_TEXT_BACKGROUND);
		setBorder(MyComponenter.EMPTY_BORDER);
		setRowHeight(H_ROW);

		setSelectionBackground(MyComponenter.COLOR_BACKGROUND);
		setCellSelectionEnabled(true);
		setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		setFillsViewportHeight(true);
		setShowHorizontalLines(false);
		setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
		// setAutoCreateRowSorter(true);

		DefaultTableCellRenderer myDefTabCellRenderer = new DefaultTableCellRenderer();
		myDefTabCellRenderer.setHorizontalAlignment(SwingConstants.RIGHT);

		TableColumnModel columnModel = getColumnModel();
		TableColumn tabCol0 = columnModel.getColumn(0);
		TableColumn tabCol1 = columnModel.getColumn(1);
		TableColumn tabCol2 = columnModel.getColumn(2);
		TableColumn tabCol3 = columnModel.getColumn(3);
		TableColumn tabCol4 = columnModel.getColumn(4);
		TableColumn tabCol5 = columnModel.getColumn(5);

		// tabCol0.setPreferredWidth(115);// N1
		tabCol1.setPreferredWidth(130);// N2

		// tabCol2.setPreferredWidth(50);// THR
		tabCol3.setPreferredWidth(110);// TOTAL_PRIME
		// tabCol4.setPreferredWidth(80);// COST(s)
		tabCol5.setPreferredWidth(145);// T10

		tabCol0.setCellRenderer(myDefTabCellRenderer);
		tabCol1.setCellRenderer(myDefTabCellRenderer);
		tabCol2.setCellRenderer(myDefTabCellRenderer);
		tabCol3.setCellRenderer(myDefTabCellRenderer);
		tabCol4.setCellRenderer(myDefTabCellRenderer);
		tabCol5.setCellRenderer(myDefTabCellRenderer);

		JTableHeader tableHeader = getTableHeader();
		tableHeader.setBackground(MyComponenter.COLOR_TEXT_BACKGROUND);
		tableHeader.setBorder(MyComponenter.EMPTY_BORDER);
		tableHeader.setFont(MyComponenter.dynaFontDialog_1_24);

		DefaultRowSorter<DefaultTableModel, ?> myRowSorter = new TableRowSorter<DefaultTableModel>(TABLE_MODEL);

		myRowSorter.setComparator(0, MY_COMPA_FOR_INT64);// N1
		myRowSorter.setComparator(1, MY_COMPA_FOR_INT64);// N2
		myRowSorter.setComparator(2, COMPA_FOR_STR);// THR
		myRowSorter.setComparator(3, MY_COMPA_FOR_INT64);// NumPrime
		myRowSorter.setComparator(4, MY_COMPA_FOR_F32);// COST(s)
		myRowSorter.setComparator(5, COMPA_FOR_STR);// TIME

		setRowSorter(myRowSorter);

	}

}
