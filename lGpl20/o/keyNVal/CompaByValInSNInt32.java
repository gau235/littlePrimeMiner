package lGpl20.o.keyNVal;

import java.io.Serializable;
import java.util.Comparator;

import lGpl20.o.O;

/**
 * SNInt32WCompa 比較器.<br/>
 * The comparator for SNInt32WCompa.
 * 
 * @version 2019/03/07_09:00:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=CompaByValInSNInt32" >
 *          CompaByValInSNInt32.java</a>
 * 
 */
public class CompaByValInSNInt32 implements Comparator<SNInt32WCompa>, Serializable {

	private static final Class<CompaByValInSNInt32> CLASS_THIS = CompaByValInSNInt32.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	@Override
	public int compare(SNInt32WCompa sNInt32WCompa, SNInt32WCompa otherSNInt32WCompa) {

		if (sNInt32WCompa.count32 > otherSNInt32WCompa.count32) {

			return 1;

		}

		if (sNInt32WCompa.count32 < otherSNInt32WCompa.count32) {

			return -1;

		}

		return 0;

	}

}