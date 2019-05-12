package lGpl20.o.time;

import java.util.Calendar;
import java.util.TimeZone;

import lGpl20.o.O;

/**
 * @version 2014/10/24_21:17:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Time64_K" >Time64_K.java</a>
 * 
 * @see Time64_R
 */
public abstract class Time64_K extends Time64_C {

	private static final Class<Time64_K> CLASS_THIS = Time64_K.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 把以 64 位元整數表示的時間值, 轉格式化的時間字串建立者, 格式如 2012/12/21_12:00:00<br/>
	 * To convert the time in millisecond to formatted StringBuilder of time.<br/>
	 * For example: 2012/12/21_12:00:00
	 */
	public static StringBuilder toTimeStr(long milliSec, TimeZone timeZone) {

		Calendar cal = Calendar.getInstance(timeZone);
		cal.setTimeInMillis(milliSec);// 1311487484432

		return new StringBuilder(String.format(DEF_REGEX_TIME, cal));

	}

	/**
	 * 把以 64 位元整數表示的時間值, 轉格式化的時間字串建立者, 格式如 2012/12/21_12:00:00<br/>
	 * To convert the time in millisecond to formatted StringBuilder of time.<br/>
	 * For example: 2012/12/21_12:00:00
	 */
	public static StringBuilder toTimeStr(long milliSec) {

		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(milliSec);// 1311487484432

		return new StringBuilder(String.format(DEF_REGEX_TIME, cal));

	}

	/**
	 * 把以 64 位元整數表示的時間值, 轉格式化的時間字串建立者, 格式如 2012/12/21_12:00:00<br/>
	 * To convert the time in millisecond to formatted StringBuilder of time.<br/>
	 * For example: 2012/12/21_12:00:00
	 */
	public static StringBuilder toTimeStr(TimeZone timeZone) {

		return new StringBuilder(String.format(DEF_REGEX_TIME, Calendar.getInstance(timeZone)));

	}

	/**
	 * 把以 64 位元整數表示的時間值, 轉格式化的時間字串建立者, 格式如 2012/12/21_12:00:00<br/>
	 * To convert the time in millisecond to formatted StringBuilder of time.<br/>
	 * For example: 2012/12/21_12:00:00
	 */
	public static StringBuilder toTimeStr() {

		return new StringBuilder(String.format(DEF_REGEX_TIME, Calendar.getInstance()));

	}

	/**
	 * 把以 64 位元整數表示的時間值, 轉格式化的時間字串建立者, 格式如 2012/12/21_12:00:00.550<br/>
	 * To convert the time in millisecond to formatted StringBuilder of time.<br/>
	 * For example: 2012/12/21_12:00:00.550
	 */
	public static StringBuilder toTimeStrWMilliSec(long milliSec, TimeZone timeZone) {

		Calendar cal = Calendar.getInstance(timeZone);
		cal.setTimeInMillis(milliSec);// 1311487484432

		return new StringBuilder(String.format(DEF_REGEX_TIME_W_MILLI_SEC, cal));

	}

	/**
	 * 把以 64 位元整數表示的時間值, 轉格式化的時間字串建立者, 格式如 2012/12/21_12:00:00.550<br/>
	 * To convert the time in millisecond to formatted StringBuilder of time.<br/>
	 * For example: 2012/12/21_12:00:00.550
	 */
	public static StringBuilder toTimeStrWMilliSec(long milliSec) {

		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(milliSec);

		return new StringBuilder(String.format(DEF_REGEX_TIME_W_MILLI_SEC, cal));

	}

	/**
	 * 把以 64 位元整數表示的時間值, 轉格式化的時間字串建立者, 格式如 2012/12/21_12:00:00.550<br/>
	 * To convert the time in millisecond to formatted StringBuilder of time.<br/>
	 * For example: 2012/12/21_12:00:00.550
	 */
	public static StringBuilder toTimeStrWMilliSec(TimeZone timeZone) {

		return new StringBuilder(String.format(DEF_REGEX_TIME_W_MILLI_SEC, Calendar.getInstance(timeZone)));

	}

	/**
	 * 把以 64 位元整數表示的時間值, 轉格式化的時間字串建立者, 格式如 2012/12/21_12:00:00.550<br/>
	 * To convert the time in millisecond to formatted StringBuilder of time.<br/>
	 * For example: 2012/12/21_12:00:00.550
	 */
	public static StringBuilder toTimeStrWMilliSec() {

		return new StringBuilder(String.format(DEF_REGEX_TIME_W_MILLI_SEC, Calendar.getInstance()));

	}

	/**
	 * 把以 64 位元整數表示的時間值, 轉格式化的時間字串建立者, 格式如 2012/12/21_12:00:00+08:00<br/>
	 * To convert the time in millisecond to formatted StringBuilder of time.<br/>
	 * For example: 2012/12/21_12:00:00+08:00
	 */
	public static StringBuilder toTimeStrWGmt(long milliSec, TimeZone timeZone) {

		Calendar cal = Calendar.getInstance(timeZone);
		cal.setTimeInMillis(milliSec);

		StringBuilder str = new StringBuilder(String.format(DEF_REGEX_TIME_W_GMT, cal));
		return str.insert(str.length() - 2, C58);

	}

	/**
	 * 把以 64 位元整數表示的時間值, 轉格式化的時間字串建立者, 格式如 2012/12/21_12:00:00+08:00<br/>
	 * To convert the time in millisecond to formatted StringBuilder of time.<br/>
	 * For example: 2012/12/21_12:00:00+08:00
	 */
	public static StringBuilder toTimeStrWGmt(long milliSec) {

		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(milliSec);

		StringBuilder str = new StringBuilder(String.format(DEF_REGEX_TIME_W_GMT, cal));
		return str.insert(str.length() - 2, C58);

	}

	/**
	 * 把以 64 位元整數表示的時間值, 轉格式化的時間字串建立者, 格式如 2012/12/21_12:00:00+08:00<br/>
	 * To convert the time in millisecond to formatted StringBuilder of time.<br/>
	 * For example: 2012/12/21_12:00:00+08:00
	 */
	public static StringBuilder toTimeStrWGmt(TimeZone timeZone) {

		Calendar cal = Calendar.getInstance(timeZone);

		StringBuilder str = new StringBuilder(String.format(DEF_REGEX_TIME_W_GMT, cal));
		return str.insert(str.length() - 2, C58);

	}

	/**
	 * 把以 64 位元整數表示的時間值, 轉格式化的時間字串建立者, 格式如 2012/12/21_12:00:00+08:00<br/>
	 * To convert the time in millisecond to formatted StringBuilder of time.<br/>
	 * For example: 2012/12/21_12:00:00+08:00
	 */
	public static StringBuilder toTimeStrWGmt() {

		Calendar cal = Calendar.getInstance();

		StringBuilder str = new StringBuilder(String.format(DEF_REGEX_TIME_W_GMT, cal));
		return str.insert(str.length() - 2, C58);

	}

	/**
	 * 把以 64 位元整數表示的時間值, 轉格式化的時間字串建立者, 格式如 2012/12/21_12:00:00.550+08:00<br/>
	 * To convert the time in millisecond to formatted StringBuilder of time.<br/>
	 * For example: 2012/12/21_12:00:00.550+08:00
	 */
	public static StringBuilder toTimeStrWMilliSecWGmt(long milliSec, TimeZone timeZone) {

		Calendar cal = Calendar.getInstance(timeZone);
		cal.setTimeInMillis(milliSec);

		StringBuilder str = new StringBuilder(String.format(DEF_REGEX_TIME_W_MILLI_SEC_W_GMT, cal));
		return str.insert(str.length() - 2, C58);

	}

	/**
	 * 把以 64 位元整數表示的時間值, 轉格式化的時間字串建立者, 格式如 2012/12/21_12:00:00.550+08:00<br/>
	 * To convert the time in millisecond to formatted StringBuilder of time.<br/>
	 * For example: 2012/12/21_12:00:00.550+08:00
	 */
	public static StringBuilder toTimeStrWMilliSecWGmt(long milliSec) {

		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(milliSec);

		StringBuilder str = new StringBuilder(String.format(DEF_REGEX_TIME_W_MILLI_SEC_W_GMT, cal));
		return str.insert(str.length() - 2, C58);

	}

	/**
	 * 把以 64 位元整數表示的時間值, 轉格式化的時間字串建立者, 格式如 2012/12/21_12:00:00.550+08:00<br/>
	 * To convert the time in millisecond to formatted StringBuilder of time.<br/>
	 * For example: 2012/12/21_12:00:00.550+08:00
	 */
	public static StringBuilder toTimeStrWMilliSecWGmt(TimeZone timeZone) {

		Calendar cal = Calendar.getInstance(timeZone);

		StringBuilder str = new StringBuilder(String.format(DEF_REGEX_TIME_W_MILLI_SEC_W_GMT, cal));
		return str.insert(str.length() - 2, C58);

	}

	/**
	 * 把以 64 位元整數表示的時間值, 轉格式化的時間字串建立者, 格式如 2012/12/21_12:00:00.550+08:00<br/>
	 * To convert the time in millisecond to formatted StringBuilder of time.<br/>
	 * For example: 2012/12/21_12:00:00.550+08:00
	 */
	public static StringBuilder toTimeStrWMilliSecWGmt() {

		Calendar cal = Calendar.getInstance();

		StringBuilder str = new StringBuilder(String.format(DEF_REGEX_TIME_W_MILLI_SEC_W_GMT, cal));
		return str.insert(str.length() - 2, C58);

	}

}
