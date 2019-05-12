package lGpl20.comb;

import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.o.O;

/**
 * @version 2019/04/15_18:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=PWBlank_Z" >PWBlank_Z.java</a>
 * 
 * @see PWBlank
 */
public abstract class PWBlank_Z extends PWBlank_W {

	private static final Class<PWBlank_Z> CLASS_THIS = PWBlank_Z.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To StringBuilder for Permutation with blank.<br/>
	 * To StringBuilder for Permutation with blank.
	 */
	public static StringBuilder toStrByB64IntoB6IfLte(long b64IntoB6, int nReal, String[] sAry) {

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		b64IntoB6 = B64IntoB6.revAgainstB6FromR(b64IntoB6);

		int val32;

		do {

			val32 = ((int) b64IntoB6) & B64IntoB6.MASK32;

			if ((b64IntoB6 = b64IntoB6 >>> B64IntoB6.$6) == 0b0L) {

				if (val32 > nReal) {

					retStr.append(O.C95);

				} else {

					retStr.append(sAry[val32 - 1]);// O.C65 is 'A'

				}

				return retStr;

			} else {

				if (val32 > nReal) {

					retStr.append(O.C95);

				} else {

					retStr.append(sAry[val32 - 1]);// O.C65 is 'A'

				}

				retStr.append(O.C44);

			}

		} while (true);

	}

	/**
	 * 把伍轉成字串建立者.<br/>
	 * To convert the long[] to StringBuilder.
	 */
	public static StringBuilder toStrToPWBlankByAryOfB64IntoB6(long[] aryOfB64IntoB6, int nReal, String[] sAry,
			CharSequence lineWr) {

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		for (int i = 0; i != aryOfB64IntoB6.length;) {

			retStr.append(toStrByB64IntoB6IfLte(aryOfB64IntoB6[i], nReal, sAry));

			if (++i != aryOfB64IntoB6.length) {

				retStr.append(lineWr);

			}

		}

		return retStr;

	}

}
