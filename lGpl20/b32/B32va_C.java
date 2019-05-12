package lGpl20.b32;

import lGpl20.o.O;

/**
 * @version 2019/04/16_12:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=B32va_C" >B32va_C.java</a>
 * 
 * @see B32va_E
 */
public abstract class B32va_C extends B32va_A {

	private static final Class<B32va_C> CLASS_THIS = B32va_C.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 回傳 2 進位字串建立者.<br/>
	 * To StringBuilder of 2 bit digit.
	 */
	public static StringBuilder str16(int int32) {

		final int lenOfTempCharAry = 19;
		char[] tempCharAry = new char[lenOfTempCharAry];

		// Arrays.fill(tempCharAry, '0');// for (int i = 0, len = a.length; i < len; i++)

		for (int i = 0; i != lenOfTempCharAry; i++) {

			tempCharAry[i] = O.C48;

		}

		int iUnderline = 1;
		for (int i = lenOfTempCharAry - 1; i >= 0;) {// i must >=0

			if ((int32 & 0b1) == 0) {// mask

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

			int32 = int32 >>> 1;

		}

		return new StringBuilder(lenOfTempCharAry).append(tempCharAry);
	}

	/**
	 * 回傳 2 進位字串建立者.<br/>
	 * To StringBuilder of 2 bit digit.
	 */
	public static StringBuilder str(int int32) {

		final int lenOfTempCharAry = 39;
		char[] tempCharAry = new char[lenOfTempCharAry];

		// Arrays.fill(tempCharAry, '0');// for (int i = 0, len = a.length; i < len; i++)

		for (int i = 0; i != lenOfTempCharAry; i++) {

			tempCharAry[i] = O.C48;

		}

		int iUnderline = 1;
		for (int i = lenOfTempCharAry - 1; i >= 0;) {// i must >=0

			if ((int32 & 0b1) == 0) {// mask

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

			int32 = int32 >>> 1;

		}

		return new StringBuilder(lenOfTempCharAry).append(tempCharAry);

	}

}
