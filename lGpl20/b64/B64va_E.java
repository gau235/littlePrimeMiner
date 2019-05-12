package lGpl20.b64;

import lGpl20.o.O;

/**
 * @version 2019/04/16_11:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=B64va_E" >B64va_E.java</a>
 * 
 * @see B64va_L
 */
public abstract class B64va_E extends B64va_C {

	private static final Class<B64va_E> CLASS_THIS = B64va_E.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	// /**
	// * 回傳 2 進位字串建立者.<br/>
	// * To StringBuilder of 2 bit digit.
	// */
	// public static StringBuilder str16(long int64) {
	//
	// int int32 = (int) int64;
	//
	// final int lenOfTempCharAry = 19;
	// char[] tempCharAry = new char[lenOfTempCharAry];
	//
	// // Arrays.fill(tempCharAry, '0');// for (int i = 0, len = a.length; i < len; i++)
	//
	// for (int i = 0; i != lenOfTempCharAry; i++) {
	//
	// tempCharAry[i] = O.C48;
	//
	// }
	//
	// int iUnderline = 1;
	// for (int i = lenOfTempCharAry - 1; i >= 0;) {// i must >=0
	//
	// if ((int32 & 0b1) == 0) {// mask
	//
	// tempCharAry[i] = O.C48;
	//
	// } else {
	//
	// tempCharAry[i] = O.C49;
	//
	// }
	//
	// if ((iUnderline++ % $4) == 0) {// fuck
	//
	// if (--i != -1) {
	//
	// tempCharAry[i] = O.C95;
	//
	// }
	//
	// }
	//
	// i--;
	//
	// // O.l("iUnderline=" + iUnderline + O.S32 + CLASS_THIS);
	//
	// int32 = int32 >>> 1;
	//
	// }
	//
	// return new StringBuilder(lenOfTempCharAry).append(tempCharAry);
	//
	// }

	/**
	 * 回傳 2 進位字串建立者.<br/>
	 * To StringBuilder of 2 bit digit.
	 */
	public static StringBuilder str(long int64) {

		final int lenOfTempCharAry = 79;
		char[] tempCharAry = new char[lenOfTempCharAry];

		// Arrays.fill(tempCharAry, '0');// for (int i = 0, len = a.length; i < len; i++)

		for (int i = 0; i != lenOfTempCharAry; i++) {

			tempCharAry[i] = O.C48;

		}

		if (int64 == 0L) {

			return new StringBuilder(STRING_64BIT_$0_W_UNDERLINE);

		}

		if (int64 == 1L) {

			return new StringBuilder(STRING_64BIT_$1_W_UNDERLINE);

		}

		int iUnderline = 1;
		for (int i = lenOfTempCharAry - 1; i >= 0;) {// i must >=0

			if (((int) int64 & 0b1) == 0) {// mask

				tempCharAry[i] = O.C48;

			} else {

				tempCharAry[i] = O.C49;

			}

			if ((iUnderline++ % $4) == 0) {// fuck

				if (--i != -1) {

					tempCharAry[i] = O.C95;

				}

			}

			i--;

			// O.l("iUnderline=" + iUnderline + O.S32 + CLASS_THIS);

			int64 = int64 >>> 1;

		}

		return new StringBuilder(lenOfTempCharAry).append(tempCharAry);

	}

}
