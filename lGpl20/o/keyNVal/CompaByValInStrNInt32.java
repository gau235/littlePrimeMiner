package lGpl20.o.keyNVal;

import java.io.Serializable;
import java.util.Comparator;

import lGpl20.o.O;

/**
 * StrNInt32WCompa 比較器.<br/>
 * The comparator for StrNInt32WCompa.
 * 
 * @version 2019/03/07_18:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=CompaByValInStrNInt32" >
 *          CompaByValInStrNInt32.java</a>
 * 
 */
public class CompaByValInStrNInt32 implements Comparator<StrNInt32WCompa>, Serializable {

	private static final Class<CompaByValInStrNInt32> CLASS_THIS = CompaByValInStrNInt32.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	@Override
	public int compare(StrNInt32WCompa strNInt32WCompa, StrNInt32WCompa otherStrNInt32WCompa) {

		if (strNInt32WCompa.count32 > otherStrNInt32WCompa.count32) {

			return 1;

		}

		if (strNInt32WCompa.count32 < otherStrNInt32WCompa.count32) {

			return -1;

		}

		return 0;

	}

}