package lGpl20.comb.wDup;

import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.o.O;

/**
 * @version 2019/03/08_18:30:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=DatToPWDup" >DatToPWDup.java</a>
 *
 * @see DatToPWDup
 */
public class DatToPWDup_L extends DatToPWDup_A {

	private static final Class<DatToPWDup_L> CLASS_THIS = DatToPWDup_L.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To string by B64IntoB6.<br/>
	 * To string by B64IntoB6.
	 */
	public StringBuilder toRowStrAftP(long b64IntoB6) {

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		b64IntoB6 = B64IntoB6.revAgainstB6FromR(b64IntoB6);

		do {

			retStr.append(distinctSortedSAry[(((int) b64IntoB6) & B64IntoB6.MASK32) - 1]);

			if ((b64IntoB6 = b64IntoB6 >>> B64IntoB6.$6) == 0b0L) {

				return retStr;

			} else {

				retStr.append(O.C44);

			}

		} while (true);

	}

	/**
	 * To add then to append.<br/>
	 * To add then to append.
	 */
	public boolean isToEx(long b64IntoB6) {

		StringBuilder tempStr = toRowStrAftP(b64IntoB6);

		return matcherEx.reset(tempStr).find();

	}

	/**
	 * To add then to append.<br/>
	 * To add then to append.
	 */
	public boolean ifPassToInEx(long b64IntoB6) {

		StringBuilder tempStr = toRowStrAftP(b64IntoB6);

		return matcherIn.reset(tempStr).find() && (!matcherEx.reset(tempStr).find());

	}

}
