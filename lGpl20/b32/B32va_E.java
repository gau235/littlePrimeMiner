package lGpl20.b32;

import lGpl20.o.O;

/**
 * @version 2016/05/14_20:57:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=B32va_E" >B32va_E.java</a>
 * 
 * @see B32va_J
 */
public abstract class B32va_E extends B32va_C {

	private static final Class<B32va_E> CLASS_THIS = B32va_E.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 回傳第 index 的 bit.<br/>
	 * To return the bit at the index position.
	 */
	public static long theBit(long num, int index) {

		if (num < 0) {

			O.x();

		}

		if (num == 0) {

			return 0;

		}

		long tempNum = num >>> index;
		long retN = tempNum & 0b1L;

		return retN;

	}

	/**
	 * 補 0.<br/>
	 * To pad 0.
	 */
	public static StringBuilder pad0(StringBuilder strOf01, int numOf0ToPad) {

		String strOf0ToPad = STRING_32BIT_0.substring(0, numOf0ToPad);
		strOf01.insert(0, strOf0ToPad);

		return strOf01;

	}

	/**
	 * 找出第 1 個 1 的位置, 1 ~ 256.<br/>
	 * To get index of first 1.
	 * 
	 * @see #f1(int[])
	 */
	public static int getIndexAtBitOfFirst1(int[] ary32) {

		int count = 1;

		for (int i = 0; i < ary32.length; i++) {

			int num = ary32[i];

			for (int iEntry = 1; iEntry <= INT32_$32; iEntry++, count++) {

				if ((num & $HEAD1_1_OF_32BIT) != 0) {

					return count;

				}

				num = num << 1;

				// O.l("temp=" + num);

			}

		}

		return count;

	}

	/**
	 * 找出第 1 個 1 的位置.<br/>
	 * To get index of first 1.
	 * 
	 * @see #getIndexOfFirst1(int[])
	 */
	public static int f1(int[] ary32) {

		for (int i = 0; i < ary32.length; i++) {

			if (ary32[i] != 0) {

				return i;

			}

		}

		// O.l("===indexOfFirst1="+indexOfFirst1);

		return -1;

	}

	/**
	 * 找出第 1 個 1 的位置.<br/>
	 * To get index of first 1.
	 * 
	 * @see #getIndexAtBitOfFirst1(int[] )
	 * 
	 */
	public static int getIndexOfFirst1(int[] ary32) {

		return f1(ary32);

	}

	/**
	 * 找出第 1 個 1 的位置.<br/>
	 * To find index of first 1.
	 */
	public static int getIndexOfFirst1(byte[] ary8) {

		for (int i = 0; i < ary8.length; i++) {

			if (ary8[i] != 0) {

				return i;

			}

		}

		// O.l("===indexOfFirst1="+indexOfFirst1);

		return -1;

	}

	/**
	 * 找出第 1 個 1 的位置.<br/>
	 * To find index of first 1.
	 */
	public static int getIndexOfFirst1(StringBuilder strOf01) {

		for (int i = 0, len = strOf01.length(); i < len; i++) {

			if (strOf01.charAt(i) == O.C49) {

				return i;

			}

		}

		return -1;

	}

	/**
	 * 找出所有有效位元數.<br/>
	 * To count all bits without the head 0s.
	 * 
	 * @see #getIndexAtBitOfFirst1(int[])
	 * 
	 */
	public static int getNumOfValidBit(int[] ary32) {

		int f1AtBit = getIndexAtBitOfFirst1(ary32);

		if (f1AtBit < 0) {

			return 0;

		}

		return ary32.length - f1AtBit + 1;

	}

	/**
	 * 左移 1 個位置.<br/>
	 * To shift 1eft 1 bit on number of 2 power.
	 */
	public static int[] shiftLeftOnNumOf2Pow(int[] ary32) {

		int f1 = f1(ary32);

		int num = ary32[f1];

		if (num < 0) {

			ary32[f1] = 0;
			ary32[f1 - 1] = 1;

		} else {

			ary32[f1] = num << 1;

		}

		return ary32;

	}

	/**
	 * 去掉所有頭 0.<br/>
	 * To skip all head 0.
	 */
	public static StringBuilder skipAllHead0(StringBuilder strOf01) {

		int f1 = getIndexOfFirst1(strOf01);

		// if (indexOfFirst1 < 0) {
		// }

		CharSequence charSequence = strOf01.subSequence(f1, strOf01.length());

		return new StringBuilder(charSequence);

	}

}
