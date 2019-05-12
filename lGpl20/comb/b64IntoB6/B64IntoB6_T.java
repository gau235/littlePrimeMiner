package lGpl20.comb.b64IntoB6;

import java.util.Arrays;

import lGpl20.o.O;

/**
 * The first index of cell from the right hand side is 0.
 * 
 * @version 2018/04/09_21:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=B64IntoB6_T" >B64IntoB6_T.java</a>
 * 
 * @see B64IntoB6_V
 */
public abstract class B64IntoB6_T extends B64IntoB6_N {

	private static final Class<B64IntoB6_T> CLASS_THIS = B64IntoB6_T.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To StringBuilder.<br/>
	 * To StringBuilder.
	 */
	public static StringBuilder toStrForToDiI(long b64IntoB6, int min) {

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		b64IntoB6 = revAgainstB6FromR(b64IntoB6);
		// O.l("revAgainstB6NShiftR=" + B32va.toStrIn64Bit(b64IntoB6) + O.S32 + CLASS_THIS);

		final int diff = min - 1;
		int temp32;

		do {

			temp32 = ((int) b64IntoB6) & MASK32;
			retStr.append(temp32 + diff);

			if ((b64IntoB6 = b64IntoB6 >>> $6) == 0b0L) {// terminate

				return retStr;

			} else {

				retStr.append(O.C44);

			}

		} while (true);

	}

	/**
	 * To StringBuilder.<br/>
	 * To StringBuilder.
	 */
	public static StringBuilder toStrOfCharForToDiI(long b64IntoB6, int min) {// its like: $,$,$$$

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		b64IntoB6 = revAgainstB6FromR(b64IntoB6);
		// O.l("revAgainstB6NShiftR=" + B32va.toStrIn64Bit(b64IntoB6) + O.S32 + CLASS_THIS);

		final int diff = min - 1;
		int temp32;

		do {

			temp32 = ((int) b64IntoB6) & MASK32;
			temp32 = temp32 + diff;

			if ((b64IntoB6 = b64IntoB6 >>> $6) == 0b0L) {// terminate

				if (temp32 == 0) {

					retStr.append(O.C95);

				} else {

					retStr.append(Arrays.copyOfRange(CHAR_ARY_OF_$, 0, temp32));

				}

				return retStr;

			} else {

				if (temp32 == 0) {

					retStr.append(O.C95);

				} else {

					retStr.append(Arrays.copyOfRange(CHAR_ARY_OF_$, 0, temp32));

				}

				retStr.append(O.C44);

			}

		} while (true);

	}

	/**
	 * To StringBuilder as [1,1,2].<br/>
	 * To StringBuilder as [1,1,2].
	 */
	public static StringBuilder toStrForToDiI(long[] aryOfB64IntoB6, int min, CharSequence lineWr) {

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		for (int i = 0; i != aryOfB64IntoB6.length;) {

			retStr.append(O.C91);
			retStr.append(toStrForToDiI(aryOfB64IntoB6[i], min));
			retStr.append(O.C93);

			if (++i != aryOfB64IntoB6.length) {

				retStr.append(lineWr);

			}

		}

		return retStr;

	}

	/**
	 * To StringBuilder.<br/>
	 * To StringBuilder.
	 */
	public static StringBuilder toStrOfCharForToDiI(long[] aryOfB64IntoB6, int min, CharSequence lineWr) {

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		for (int i = 0; i != aryOfB64IntoB6.length;) {

			// str.append(O.C91);
			retStr.append(toStrOfCharForToDiI(aryOfB64IntoB6[i], min));
			// str.append(O.C93);

			if (++i != aryOfB64IntoB6.length) {

				retStr.append(lineWr);

			}

		}

		return retStr;

	}

}
