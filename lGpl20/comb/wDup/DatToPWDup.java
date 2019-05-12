package lGpl20.comb.wDup;

import lGpl20.o.O;
import lGpl20.o.keyNVal.B64NInt32WCompa;
import lGpl20.o.str.Strva;

/**
 * @version 2019/03/08_18:50:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=DatToPWDup" >DatToPWDup.java</a>
 *
 * @see PWDup
 */
public class DatToPWDup extends DatToPWDup_L {

	private static final Class<DatToPWDup> CLASS_THIS = DatToPWDup.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To StringBuilder.<br/>
	 * To StringBuilder.
	 */
	public StringBuilder toStrAftP(CharSequence prefix, CharSequence lineWr) {

		StringBuilder str = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		B64NInt32WCompa tempB64NInt32;
		for (int i = 0, size = retDistinctSetFromMap.iSize; i != size;) {

			tempB64NInt32 = retDistinctSetFromMap.aryOfB64NInt32WCompa[i];

			// int min = 1;
			// StringBuilder sDiI = B64IntoB6.toStrForToDiI(tempB64NInt32.b64, min);// b64IntoB6OfQtyPlus1
			// O.l("add " + sDiI);
			//
			// StringBuilder str24 = B64IntoB6.str24((int) tempB64NInt32.b64);
			//
			// O.l("add " + str24);

			str.append(i + 1).append(prefix).append(toRowStrAftP(tempB64NInt32.b64)).append(O.C61).append(tempB64NInt32.count32);

			if (++i != size) {

				str.append(lineWr);

				if (i == Strva.int32MaxRowForHtml) {

					return str;

				}

			}

		}

		return str;

	}

}
