package lGpl20.o.str;

import java.math.BigInteger;

import lGpl20.o.O;
import lGpl20.o.O_Z;

/**
 * 本類別字串來自於數.<br/>
 * <br/>
 * The string of number.
 * 
 * @version 2019/03/10_10:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=StrByN_A" >StrByN_A.java</a>
 * 
 * @see SByN
 */
public abstract class StrByN_A extends O_Z {

	private static final Class<StrByN_A> CLASS_THIS = StrByN_A.class;

	protected static final long serialVersionUID = genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 數字的格式, 如 1,993<br/>
	 * The regex for int64.
	 */
	public static final String REGEX_INT = "%,d";

	/**
	 * 數字的格式, 如 1,993.123<br/>
	 * The regex for float.
	 */
	public static final String REGEX_FLOAT = "%,.3f";

	/**
	 * 非數字的格式.<br/>
	 * The regex for not a number.
	 */
	public static final String REGEX_NOT_NUM = "[^0-9]";

	/**
	 * 檢查字串是 null 或字串是空字串.<br/>
	 * To check if the string is null or empty string.
	 */
	public static boolean isNullOrEmpty(String s) {

		if (s == null || O.Z.equals(s)) {

			return true;

		}

		return false;

	}

	// /**
	// * 檢查字串是 null 或字串是空字串.<br/>
	// * To check if the string is null or empty string.
	// */
	// public static boolean isAnyNullOrEmpty(String... sAry) {
	//
	// for (int i = 0; i != sAry.length; i++) {
	//
	// String s = sAry[i];
	//
	// if (s == null || O.Z.equals(s)) {
	//
	// return true;
	//
	// }
	//
	// }
	//
	// return false;
	//
	// }

	/**
	 * 把數字轉格式化字串.<br/>
	 * To format and to string.
	 * 
	 * @see #df(String)
	 */
	public static StringBuilder f(long int64) {

		return new StringBuilder(String.format(REGEX_INT, int64));

	}

	/**
	 * 把數字轉格式化字串.<br/>
	 * To format and to string.
	 * 
	 * @see #df(String)
	 */
	public static StringBuilder f(BigInteger bigInt) {

		return new StringBuilder(String.format(REGEX_INT, bigInt));

	}

	/**
	 * 把格式化字串轉數字.<br/>
	 * To deformat and to int64.
	 * 
	 * @see #f(long)
	 */
	public static long df(String string) {

		return Long.parseLong(string.replace(S44, Z));

	}

	/**
	 * 把正整數或 0 轉成 numOfDigit 位數的字串 ( 由數字組成, 自動前面補 0).<br/>
	 * 英國人的人生就是玩 26 字母與 10 數字而已.<br/>
	 * To convert a positive or 0 number to a numOfDigit digits string.
	 */
	public static StringBuilder toPadded0Str(String prefix, String postfix, long positiveOr0Num, int numOfDigit) {

		if (positiveOr0Num < 0) {

			O.x();

		}

		// return String.format("%0" + numOfDigit + "d", positiveOr0Num);
		StringBuilder strOfNum = new StringBuilder(String.format(S37 + S48 + numOfDigit + S100, positiveOr0Num));

		return new StringBuilder(prefix).append(strOfNum).append(postfix);

	}

	/**
	 * 把正整數或 0 轉成 numOfDigit 位數的字串 ( 由數字組成, 自動前面補 0 ).<br/>
	 * To convert a positive or 0 number to a numOfDigit digits string.
	 */
	public static StringBuilder pad0D2(long positiveOr0Num) {

		return new StringBuilder(String.format("%02d", positiveOr0Num));

	}

	/**
	 * 把正整數或 0 轉成 numOfDigit 位數的字串 ( 由數字組成, 自動前面補 0 ).<br/>
	 * To convert a positive or 0 number to a numOfDigit digits string.
	 */
	public static StringBuilder pad0D3(long positiveOr0Num) {

		return new StringBuilder(String.format("%03d", positiveOr0Num));

	}

	/**
	 * 把正整數或 0 轉成 numOfDigit 位數的字串 ( 由數字組成, 自動前面補 0 ).<br/>
	 * To convert a positive or 0 number to a numOfDigit digits string.
	 */
	public static StringBuilder pad0D4(long positiveOr0Num) {

		return new StringBuilder(String.format("%04d", positiveOr0Num));

	}

	/**
	 * 把正整數或 0 轉成 numOfDigit 位數的字串 ( 由數字組成, 自動前面補 0 ).<br/>
	 * To convert a positive or 0 number to a numOfDigit digits string.
	 */
	public static StringBuilder pad0D5(long positiveOr0Num) {

		return new StringBuilder(String.format("%05d", positiveOr0Num));

	}

	/**
	 * 產生一個 numOfDigit 位數的字串 ( 由數字組成, 自動前面補 0).<br/>
	 * To create a numOfDigit digits string.
	 */
	public static StringBuilder genPadded0Str(String prefix, String postfix, int numOfDigit) {

		return toPadded0Str(prefix, postfix, O.THR_LOCAL_RANDOM.nextLong((long) StrictMath.pow(10, numOfDigit)), numOfDigit);

	}

}
