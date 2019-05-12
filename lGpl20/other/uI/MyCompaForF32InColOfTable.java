package lGpl20.other.uI;

import java.io.Serializable;
import java.util.Comparator;

import lGpl20.o.O;

/**
 * 本類別比較器, 用於表格直行的排序.<br/>
 * The Comparator to sort by the column of table for record.
 * 
 * @version 2019/03/14_14:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=MyCompaForF32InColOfTable" >
 *          MyCompaForF32InColOfTable.java</a>
 * 
 * @see MyCompaForInt64InColOfTable
 * 
 * @see MyCompaForF32InColOfTable
 */
public class MyCompaForF32InColOfTable implements Comparator<CharSequence>, Serializable {

	private static final Class<MyCompaForF32InColOfTable> CLASS_THIS = MyCompaForF32InColOfTable.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	@Override
	public final int compare(CharSequence charSequence1, CharSequence charSequence2) {

		float f32_1 = Float.valueOf(charSequence1.toString().replace(O.S44, O.Z));// like 1,874.123
		float f32_2 = Float.valueOf(charSequence2.toString().replace(O.S44, O.Z));

		if (f32_1 > f32_2) {

			return 1;

		}

		if (f32_1 < f32_2) {

			return -1;

		}

		return 0;

	}

}
