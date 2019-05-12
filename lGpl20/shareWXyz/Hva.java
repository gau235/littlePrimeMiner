package lGpl20.shareWXyz;

import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.o.O;
import lGpl20.o.str.Strva;

/**
 * 即 n 個相同物品分成給 k 人, 每人最少 1 個.<br/>
 * To return the number of ways to share several identical items with every person.
 * 
 * @version 2018/11/27_21:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Hva" >Hva.java</a>
 *
 * @see ShWGo
 */
public abstract class Hva extends Hva_Z {

	private static final Class<Hva> CLASS_THIS = Hva.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To StringBuilder.<br/>
	 * To StringBuilder.
	 */
	public static StringBuilder toRowStrBySAry(long b64IntoB6, int min, String[] sAry) {

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		b64IntoB6 = B64IntoB6.revAgainstB6FromR(b64IntoB6);
		// O.l("revAgainstB6NShiftR=" + B32va.toStrIn64Bit(b64IntoB6) + O.S32 + CLASS_THIS);

		final int diff = min - 1;
		int temp32;

		do {

			temp32 = ((int) b64IntoB6) & B64IntoB6.MASK32;
			retStr.append(sAry[temp32 + diff]);

			if ((b64IntoB6 = b64IntoB6 >>> B64IntoB6.$6) == 0b0L) {// terminate

				return retStr;

			} else {

				retStr.append(O.C44);

			}

		} while (true);

	}

	/**
	 * To StringBuilder as [1,1,2].<br/>
	 * To StringBuilder as [1,1,2].
	 */
	public static StringBuilder toStrBySAry(long[] aryOfB64IntoB6, int min, String[] sAry, CharSequence lineWr) {

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		for (int i = 0; i != aryOfB64IntoB6.length;) {

			retStr.append(O.C91);
			retStr.append(toRowStrBySAry(aryOfB64IntoB6[i], min, sAry));
			retStr.append(O.C93);

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
