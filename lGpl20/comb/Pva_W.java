package lGpl20.comb;

import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.o.O;

/**
 * @version 2019/04/15_23:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Pva_W" >Pva_W.java</a>
 * 
 * @see Pva_Z
 */
public abstract class Pva_W extends Pva_J {

	private static final Class<Pva_W> CLASS_THIS = Pva_W.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To string by B64IntoB6.<br/>
	 * To string by B64IntoB6.
	 */
	public static StringBuilder toStrWWornHeadSByB64IntoB6(long b64IntoB6, String[] sAry, String[] sAryForHead) {

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		b64IntoB6 = B64IntoB6.revAgainstB6FromR(b64IntoB6);

		// if (b64IntoB6 != 0b0L) {
		//
		// O.l("b64IntoB6=" + b64IntoB6 + O.S32 + CLASS_THIS);
		//
		// }

		int value32;
		int iHead = 0;

		do {

			value32 = ((int) b64IntoB6) & B64IntoB6.MASK32;
			retStr.append(sAryForHead[iHead]).append(O.C58).append(sAry[value32 - 1]);

			if (++iHead == sAryForHead.length) {

				iHead = 0;

			}

			if ((b64IntoB6 = b64IntoB6 >>> B64IntoB6.$6) == 0b0L) {

				return retStr;

			} else {

				retStr.append(O.C44);

			}

		} while (true);

	}

	/**
	 * 把 long[] of B64IntoB6 轉成字串建立者.<br/>
	 * To convert the long[] of B64IntoB6 to StringBuilder.
	 */
	public static StringBuilder toStrWWornSHeadByAryOfB64IntoB6(long[] ary, String[] sAry, String[] sAryForHead,
			CharSequence lineWr) {

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		for (int i = 0; i != ary.length;) {

			// StringBuilder tempStr = toStrByB64IntoB6(sAry, ary[i]);
			// O.l("tempStr=" + tempStr + O.S32 + CLASS_THIS);
			retStr.append(toStrWWornHeadSByB64IntoB6(ary[i], sAry, sAryForHead));

			if (++i != ary.length) {

				retStr.append(lineWr);

			}

		}

		return retStr;

	}

}
