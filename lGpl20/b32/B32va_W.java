package lGpl20.b32;

import java.math.BigInteger;

import lGpl20.b64.B64va;
import lGpl20.o.O;

/**
 * @version 2018/04/09_21:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=B32va_W" >B32va_W.java</a>
 * 
 * @see B32va_Z
 */
public abstract class B32va_W extends B32va_V {

	private static final Class<B32va_W> CLASS_THIS = B32va_W.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 回傳 2 進位字串建立者, 沒正負號.<br/>
	 * To StringBuilder of 2 bit digit without sign.
	 */
	public static StringBuilder toStrIn2ByAry8OfPosBigIntNSkipAllHead0(byte[] ary8OfPositiveBigInteger) {

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		int f1 = getIndexOfFirst1(ary8OfPositiveBigInteger);

		if (f1 < 0) {

			return retStr.append(O.C48);

		}

		for (int i = f1; i < ary8OfPositiveBigInteger.length; i++) {// no sign, but still i=0

			byte num = ary8OfPositiveBigInteger[i];

			// retStr.append(toStrIn8Bit(num));
			retStr.append(Integer.toBinaryString(num).subSequence(0, 8));

		}

		return skipAllHead0(retStr);

	}

	/**
	 * 回傳 2 進位字串建立者.<br/>
	 * To StringBuilder of 2 bit digit.
	 */
	public static StringBuilder toStrIn2NSkipAllHead0(int[] ary32) {

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		int f1 = f1(ary32);

		if (f1 < 0) {

			return retStr.append(O.C48);

		}

		for (int i = f1; i < ary32.length; i++) {

			// str.append(str32(ary32[i]));
			retStr.append(Integer.toBinaryString(ary32[i]));

		}

		// return str;
		return skipAllHead0(retStr);

	}

	/**
	 * 轉 64 位元整數.<br/>
	 * To long.
	 * 
	 * @see Long#parseLong(String, int)
	 * 
	 */
	public static long toInt64(String stringOf01NoSign) {

		if (stringOf01NoSign.length() > 63) {

			O.x();

		}

		long numOf2Pow = 1;
		long sum = 0;

		char[] charAry = stringOf01NoSign.toCharArray();

		for (int i = charAry.length - 1; i >= 0; i--) {

			if (charAry[i] == O.C49) {// '1'

				sum = sum + numOf2Pow;

			}

			numOf2Pow = numOf2Pow * 2;

		}

		return sum;

	}

	/**
	 * 轉 BigInteger.<br/>
	 * To BigInteger.
	 */
	public static BigInteger toBigInteger(int[] ary32) {

		BigInteger numOf2Pow = BigInteger.ONE;
		BigInteger sum = BigInteger.ZERO;

		for (int i = ary32.length - 1; i >= 0; i--) {

			int num32 = ary32[i];

			for (int iShift = 0; iShift < INT32_$32; iShift++) {

				if ((num32 & 0b1) == 1) {

					sum = sum.add(numOf2Pow);

				}

				num32 = num32 >>> 1;
				numOf2Pow = numOf2Pow.multiply(BIG_INT_$2);

			}

		}

		return sum;

	}

	/**
	 * 轉整數.<br/>
	 * To BigInteger.
	 */
	public static BigInteger toBigInteger(StringBuilder strOf01NoSign) {

		BigInteger numOf2Pow = BigInteger.ONE;
		BigInteger sum = BigInteger.ZERO;

		for (int i = strOf01NoSign.length() - 1; i >= 0; i--) {

			if (strOf01NoSign.charAt(i) == O.C49) {// '1'

				sum = sum.add(numOf2Pow);

			}

			numOf2Pow = numOf2Pow.multiply(BIG_INT_$2);

		}

		return sum;

	}

	/**
	 * 回傳 2 進位字串建立者.<br/>
	 * To StringBuilder of 2 bit digit.
	 */
	public static int[] toAry32(StringBuilder strOf01NoSign) {

		int numOf0ToPad = INT32_$32 - strOf01NoSign.length() % INT32_$32;

		if (numOf0ToPad > 0 && numOf0ToPad < INT32_$32) {

			pad0(strOf01NoSign, numOf0ToPad);

		}

		int[] retAry32 = new int[strOf01NoSign.length() / INT32_$32];

		for (int i = 0, iShift = 0; i < retAry32.length; i++, iShift = iShift + INT32_$32) {

			long int64 = Long.parseLong(strOf01NoSign.substring(iShift, iShift + INT32_$32), 2);

			retAry32[i] = (int) (int64 & B64va.$32_1_OF_64BIT);

		}

		return retAry32;

	}

}
