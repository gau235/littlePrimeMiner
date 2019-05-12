package lGpl20.o.time;

import java.util.TimeZone;

import lGpl20.o.O;

/**
 * @version 2017/07/04_12:57:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Time64_W" >Time64_W.java</a>
 * 
 * @see Time64_X
 */
public abstract class Time64_W extends Time64_R {

	private static final Class<Time64_W> CLASS_THIS = Time64_W.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 取得時間字串 0 到 4, 如: 2015/01/18_11:02:00.123+0800 取得 2015<br/>
	 * To get time's substring from 0 to 4.
	 */
	public static String subTimeString0To4(TimeZone timeZone) {

		String s = toTimeStrWMilliSecWGmt(timeZone).substring(0, 4);

		return s;

	}

	/**
	 * 取得時間字串 5 到 10, 如: 2015/01/18_11:02:00.123+0800 取得 01/18<br/>
	 * To get time's substring from 5 to 10.
	 */
	public static String subTimeString5To10(TimeZone timeZone) {

		String s = toTimeStrWMilliSecWGmt(timeZone).substring(5, 10);

		return s;

	}

	/**
	 * 取得時間字串 11 到 16, 如: 2015/01/18_11:02:00.123+0800 取得 11:02<br/>
	 * To get time's substring from 11 to 16.
	 */
	public static String subTimeString11To16(TimeZone timeZone) {

		String s = toTimeStrWMilliSecWGmt(timeZone).substring(11, 16);

		return s;

	}

	/**
	 * 取得時間字串 0 到 10, 如: 2015/01/18_11:02:00.123+0800 取得 2015/01/18<br/>
	 * To get time's substring from 0 to 10.
	 */
	public static String subTimeString0To10(TimeZone timeZone) {

		String s = toTimeStrWMilliSecWGmt(timeZone).substring(0, 10);

		return s;

	}

	/**
	 * 取得時間字串 11 到 19, 如: 2015/01/18_11:02:00.123+0800 取得 11:02:00<br/>
	 * To get time's substring from 11 to 19.
	 */
	public static String subTimeString11To19(TimeZone timeZone) {

		String s = toTimeStrWMilliSecWGmt(timeZone).substring(11, 19);

		return s;

	}

	/**
	 * 取得時間字串 5 到 16, 如: 2015/01/18_11:02:00.123+0800 取得 01/18_11:02<br/>
	 * To get time's substring from 5 to 16.
	 */
	public static String subTimeString5To16(TimeZone timeZone) {

		String s = toTimeStrWMilliSecWGmt(timeZone).substring(5, 16);

		return s;

	}

	/**
	 * 取得時間字串 0 到 16, 如: 2015/01/18_11:02:00.123+0800 取得 2015/01/18_11:02<br/>
	 * To get time's substring from 0 to 16.
	 */
	public static String subTimeString0To16(TimeZone timeZone) {

		String s = toTimeStrWMilliSecWGmt(timeZone).substring(0, 16);

		return s;

	}

	/**
	 * 取得時間字串 5 到 19, 如: 2015/01/18_11:02:00.123+0800 取得 01/18_11:02:00<br/>
	 * To get time's substring from 5 to 19.
	 */
	public static String subTimeString5To19(TimeZone timeZone) {

		String s = toTimeStrWMilliSecWGmt(timeZone).substring(5, 19);

		return s;

	}

	/**
	 * 取得時間字串 0 到 4, 如: 2015/01/18_11:02:00.123+0800 取得 2015<br/>
	 * To get time's substring from 0 to 4.
	 */
	public static String subTimeString0To4() {

		String s = toTimeStrWMilliSecWGmt().substring(0, 4);

		return s;

	}

	/**
	 * 取得時間字串 5 到 10, 如: 2015/01/18_11:02:00.123+0800 取得 01/18<br/>
	 * To get time's substring from 5 to 10.
	 */
	public static String subTimeString5To10() {

		String s = toTimeStrWMilliSecWGmt().substring(5, 10);

		return s;

	}

	/**
	 * 取得時間字串 11 到 16, 如: 2015/01/18_11:02:00.123+0800 取得 11:02<br/>
	 * To get time's substring from 11 to 16.
	 */
	public static String subTimeString11To16() {

		String s = toTimeStrWMilliSecWGmt().substring(11, 16);

		return s;

	}

	/**
	 * 取得時間字串 0 到 10, 如: 2015/01/18_11:02:00.123+0800 取得 2015/01/18<br/>
	 * To get time's substring from 0 to 10.
	 */
	public static String subTimeString0To10() {

		String s = toTimeStrWMilliSecWGmt().substring(0, 10);

		return s;

	}

	/**
	 * 取得時間字串 11 到 19, 如: 2015/01/18_11:02:00.123+0800 取得 11:02:00<br/>
	 * To get time's substring from 11 to 19.
	 */
	public static String subTimeString11To19() {

		String s = toTimeStrWMilliSecWGmt().substring(11, 19);

		return s;

	}

	/**
	 * 取得時間字串 5 到 16, 如: 2015/01/18_11:02:00.123+0800 取得 01/18_11:02<br/>
	 * To get time's substring from 5 to 16.
	 */
	public static String subTimeString5To16() {

		String s = toTimeStrWMilliSecWGmt().substring(5, 16);

		return s;

	}

	/**
	 * 取得時間字串 0 到 16, 如: 2015/01/18_11:02:00.123+0800 取得 2015/01/18_11:02<br/>
	 * To get time's substring from 0 to 16.
	 */
	public static String subTimeString0To16() {

		String s = toTimeStrWMilliSecWGmt().substring(0, 16);

		return s;

	}

	/**
	 * 取得時間字串 5 到 19, 如: 2015/01/18_11:02:00.123+0800 取得 01/18_11:02:00<br/>
	 * To get time's substring from 5 to 19.
	 */
	public static String subTimeString5To19() {

		String s = toTimeStrWMilliSecWGmt().substring(5, 19);

		return s;

	}

}
