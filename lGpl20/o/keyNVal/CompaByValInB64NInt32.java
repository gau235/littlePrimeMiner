package lGpl20.o.keyNVal;

import java.io.Serializable;
import java.util.Comparator;

import lGpl20.o.O;

/**
 * B64NInt32WCompa 比較器.<br/>
 * The comparator for B64NInt32WCompa.
 * 
 * @version 2019/03/07_09:00:00<br/>
 *          <a target="_blank" href= "http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=CompaByValInB64NInt32" >
 *          CompaByValInB64NInt32.java</a>
 * 
 */
public class CompaByValInB64NInt32 implements Comparator<B64NInt32WCompa>, Serializable {

	private static final Class<CompaByValInB64NInt32> CLASS_THIS = CompaByValInB64NInt32.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	@Override
	public int compare(B64NInt32WCompa b64NInt32WCompa, B64NInt32WCompa otherB64NInt32WCompa) {

		if (b64NInt32WCompa.count32 > otherB64NInt32WCompa.count32) {

			return 1;

		}

		if (b64NInt32WCompa.count32 < otherB64NInt32WCompa.count32) {

			return -1;

		}

		return 0;

	}

}