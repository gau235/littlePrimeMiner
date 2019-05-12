package lGpl20.comb.b64IntoB6;

import lGpl20.o.O;

/**
 * The first index of cell from the right hand side is 0.
 * 
 * @version 2019/04/16_21:30:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=B64IntoB6_L" >B64IntoB6_L.java</a>
 * 
 * @see B64IntoB6_N
 */
public abstract class B64IntoB6_L extends B64IntoB6_K {

	private static final Class<B64IntoB6_L> CLASS_THIS = B64IntoB6_L.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To string by B64IntoB6.<br/>
	 * To string by B64IntoB6.
	 */
	public static StringBuilder toStrByValInB6Cell(long b64IntoB6) {

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		b64IntoB6 = revAgainstB6FromR(b64IntoB6);

		int value32;

		do {

			value32 = ((int) b64IntoB6) & MASK32;
			// O.l("value32=" + value32 + O.S32 + CLASS_THIS);
			retStr.append(value32);

			if ((b64IntoB6 = b64IntoB6 >>> $6) == 0b0L) {

				return retStr;

			} else {

				retStr.append(O.C44);

			}

		} while (true);

	}

	/**
	 * To string by B64IntoB6.<br/>
	 * To string by B64IntoB6.
	 */
	public static StringBuilder toStrByValMinus1InB6Cell(long b64IntoB6, String[] sAry) {

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		b64IntoB6 = revAgainstB6FromR(b64IntoB6);

		// if (b64IntoB6 != 0b0L) {
		//
		// O.l("b64IntoB6=" + b64IntoB6 + O.S32 + CLASS_THIS);
		//
		// }

		int val32;

		do {

			val32 = ((int) b64IntoB6) & MASK32;
			retStr.append(sAry[val32 - 1]);

			if ((b64IntoB6 = b64IntoB6 >>> $6) == 0b0L) {

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
	public static StringBuilder toStrByAryOfB64IntoB6(long[] ary, String[] sAry, CharSequence lineWr) {// called by Pva, c312.jsp

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		for (int i = 0; i != ary.length;) {

			// StringBuilder tempStr = toStrByB64IntoB6(sAry, ary[i]);
			// O.l("tempStr=" + tempStr + O.S32 + CLASS_THIS);
			retStr.append(toStrByValMinus1InB6Cell(ary[i], sAry));

			if (++i != ary.length) {

				retStr.append(lineWr);

			}

		}

		return retStr;

	}

}
