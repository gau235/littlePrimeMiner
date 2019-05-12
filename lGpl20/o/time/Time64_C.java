package lGpl20.o.time;

import java.util.Calendar;

import lGpl20.o.O;

/**
 * @version 2014/06/14_14:37:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Time64_C" >Time64_C.java</a>
 * 
 * @see Time64_K
 */
public abstract class Time64_C extends Time64_A {

	private static final Class<Time64_C> CLASS_THIS = Time64_C.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 取得現在時間 64 位元毫秒數.<br/>
	 * To return current time in millisecond.
	 */
	public static long t64() {

		return System.currentTimeMillis();

	}

	/**
	 * 取得現在時間轉成格式化的時間字串建立者, 格式如 2012/12/21_12:00:00<br/>
	 * To return current time in formatted StringBuilder, for example: 2012/12/21_12:00:00
	 */
	public static StringBuilder timeStr() {

		return new StringBuilder(String.format(DEF_REGEX_TIME, Calendar.getInstance(DEF_TIME_ZONE)));

	}

}
