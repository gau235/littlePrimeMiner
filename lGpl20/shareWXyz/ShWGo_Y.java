package lGpl20.shareWXyz;

import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.o.O;
import lGpl20.o.str.Strva;

/**
 * @version 2019/04/18_20:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=ShWGo_Y" >ShWGo_Y.java</a>
 *
 * @see ShWGo_Z
 */
public abstract class ShWGo_Y extends ShWGo_X {

	private static final Class<ShWGo_Y> CLASS_THIS = ShWGo_Y.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To StringBuilder by B64IntoB6.<br/>
	 * To StringBuilder by B64IntoB6.
	 */
	public static StringBuilder toRowStrAftToH(long b64IntoB6, final int min, String[] sAry) {

		b64IntoB6 = B64IntoB6.revAgainstB6FromR(b64IntoB6);

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		final int diff = min - 1;
		int valPlusDiff;

		StringBuilder tempStr;

		for (int i = 0; true;) {

			valPlusDiff = (((int) b64IntoB6) & B64IntoB6.MASK32) + diff;

			if (valPlusDiff != 0) {

				tempStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

				do {

					tempStr.append(sAry[i]).append(O.C44);

				} while (--valPlusDiff != 0);

				retStr.append(tempStr);

			}

			i++;

			if ((b64IntoB6 = b64IntoB6 >>> B64IntoB6.$6) == 0b0L) {

				// todo: need to improve
				int strLen32Minus1 = retStr.length() - 1;
				if (retStr.lastIndexOf(O.S44) == strLen32Minus1) {

					retStr.deleteCharAt(strLen32Minus1);

				}

				return retStr;

			}

		}

	}

	/**
	 * To StringBuilder by B64IntoB6.<br/>
	 * To StringBuilder by B64IntoB6.
	 */
	public static StringBuilder toStrToHByAryOfB64IntoB6(long[] aryOfB64IntoB6, final int min, String[] sAry, CharSequence prefix,
			CharSequence lineWr) {

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		for (int i = 0; i != aryOfB64IntoB6.length;) {

			retStr.append(i + 1).append(prefix);
			retStr.append(toRowStrAftToH(aryOfB64IntoB6[i], min, sAry));

			if (++i != aryOfB64IntoB6.length) {

				retStr.append(lineWr);

				if (i == Strva.int32MaxRowForHtml) {

					return retStr;

				}

			}

		}

		return retStr;

	}

}
