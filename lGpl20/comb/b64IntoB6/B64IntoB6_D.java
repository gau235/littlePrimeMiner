package lGpl20.comb.b64IntoB6;

import lGpl20.o.O;

/**
 * The first index of cell from the right hand side is 0.
 * 
 * @version 2019/04/18_18:50:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=B64IntoB6_D" >B64IntoB6_D.java</a>
 * 
 * @see B64IntoB6_E
 */
public abstract class B64IntoB6_D extends B64IntoB6_C {

	private static final Class<B64IntoB6_D> CLASS_THIS = B64IntoB6_D.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 回傳 2 進位字串建立者.<br/>
	 * To StringBuilder of 2 bit digit.
	 */
	public static StringBuilder str24(long int64) {

		final int lenOfTempCharAry = 27;
		char[] tempCharAry = new char[lenOfTempCharAry];

		// Arrays.fill(tempCharAry, '0');// for (int i = 0, len = a.length; i < len; i++)

		for (int i = 0; i != lenOfTempCharAry; i++) {

			tempCharAry[i] = O.C48;

		}

		int iUnderline = 1;
		for (int i = lenOfTempCharAry - 1; i >= 0;) {// i must >=0

			if (((int) int64 & 0b1) == 0) {// mask

				tempCharAry[i] = O.C48;

			} else {

				tempCharAry[i] = O.C49;

			}

			if ((iUnderline++ % $6) == 0) {// fuck

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

	/**
	 * 回傳 2 進位字串建立者.<br/>
	 * To StringBuilder of 2 bit digit.
	 */
	public static StringBuilder str(long int64) {

		final int lenOfTempCharAry = 74;
		char[] tempCharAry = new char[lenOfTempCharAry];

		// Arrays.fill(tempCharAry, '0');// for (int i = 0, len = a.length; i < len; i++)

		for (int i = 0; i != lenOfTempCharAry; i++) {

			tempCharAry[i] = O.C48;

		}

		int iUnderline = 1;
		for (int i = lenOfTempCharAry - 1; i >= 0;) {// i must >=0

			if (((int) int64 & 0b1) == 0) {// mask

				tempCharAry[i] = O.C48;

			} else {

				tempCharAry[i] = O.C49;

			}

			if ((iUnderline++ % $6) == 0) {// fuck

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
