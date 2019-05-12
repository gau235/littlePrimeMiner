package lGpl20.other.uI;

import lGpl20.o.O;
import lGpl20.o.ery.Ery;
import lGpl20.o.str.SByN;
import lGpl20.o.time.T64;
import lGpl20.prime64.Recva;

/**
 * @version 2019/05/01_18:00:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=MyAide_K" >MyAide_K.java</a>
 * 
 * @see MyAide_N
 */
public abstract class MyAide_L extends MyAide_K {

	private static final Class<MyAide_L> CLASS_THIS = MyAide_L.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To generate the Ery for one entry in Ery2D as row lists.<br/>
	 * To generate the Ery for one entry in Ery2D as row lists.
	 */
	public static Ery<CharSequence> genEryOfStrForEry2DAsRowList(Recva recva) {

		Ery<CharSequence> eryOfStr = new Ery<CharSequence>();

		eryOfStr.a(SByN.f(recva.n1));
		eryOfStr.a(SByN.f(recva.n2));
		eryOfStr.a(recva.charSequenceAsNote);// fuck

		eryOfStr.a(SByN.f(recva.totalPrime));
		eryOfStr.a(new StringBuilder(String.format(SByN.REGEX_FLOAT, recva.f32TimeCost)));

		eryOfStr.a(new StringBuilder(T64.timeStr().substring(8, 19)));

		// eryOfStr.close();
		return eryOfStr;

	}

	/**
	 * To insert into Ery 2D as all rows in table.<br/>
	 * To insert into Ery 2D as all rows in table.
	 */
	public static void insertIntoEry2DAsAllRowInTable(Ery<CharSequence> eryOfCharSequence) {

		// O.l("eryOfCharSequence=" + eryOfCharSequence.toStrWLineWr(O.L) + O.S32 + CLASS_THIS);

		// for NullPointerException
		// DefaultRowSorter.convertRowIndexToModel(DefaultRowSorter.java:518)

		// synchronized (ery2DAsAllRowInTable) {// synchronized(myTable)

		if (ery2DAsAllRowInTable.len() > BOUND32_TO_CLEAR_REC) {

			ery2DAsAllRowInTable = new Ery<Ery<CharSequence>>();

		}

		ery2DAsAllRowInTable.a(eryOfCharSequence);

		try {

			if (MyComponenter.defTableModel.getRowCount() > BOUND32_TO_CLEAR_REC) {

				MyComponenter.defTableModel.setRowCount(0);

			}

			MyComponenter.defTableModel.insertRow(0, eryOfCharSequence.toGenericAry(O.STR_ARY0));

		} catch (Throwable throwable) {

			throwable.printStackTrace();
			MyAide.sendHttpErr(O.toStrByThrowable(throwable), O.Z);

		}

	}

}
