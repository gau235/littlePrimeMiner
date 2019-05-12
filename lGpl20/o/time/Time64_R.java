package lGpl20.o.time;

import java.util.Calendar;
import java.util.TimeZone;

import lGpl20.o.O;

/**
 * @version 2014/10/24_21:17:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Time64_R" >Time64_R.java</a>
 * 
 * @see Time64_W
 */
public abstract class Time64_R extends Time64_K {

	private static final Class<Time64_R> CLASS_THIS = Time64_R.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 取得現在時間 64 位元毫秒數.<br/>
	 * To get current time in absolute millisecond.
	 */
	public static long toT64() {

		return t64();

	}

	/**
	 * 把格式化的時間字串, 如 2012/12/21_12:00:00 轉 64 位元整數.<br/>
	 * To convert formattedTimeString(2012/12/21_12:00:00) of time in absolute millisecond.
	 */
	public static long toT64(String formattedTimeString, TimeZone timeZone) {

		if (formattedTimeString.indexOf(C43) >= 0 || formattedTimeString.indexOf(C45) >= 0
				|| formattedTimeString.indexOf(C46) >= 0) {

			O.x();

		}

		formattedTimeString = formattedTimeString.replaceAll(REGEX_NOT_NUM, Z);

		Calendar cal = Calendar.getInstance(timeZone);
		cal.setLenient(false);// fuck
		// Calendar cal = Calendar.getInstance(TIME_ZONE_GMT_0);// fuck

		int year = Integer.parseInt(formattedTimeString.substring(0, 4));
		int month = Integer.parseInt(formattedTimeString.substring(4, 6)) - 1;
		int date = Integer.parseInt(formattedTimeString.substring(6, 8));
		int hourOfDay = Integer.parseInt(formattedTimeString.substring(8, 10));
		int minute = Integer.parseInt(formattedTimeString.substring(10, 12));
		int second = Integer.parseInt(formattedTimeString.substring(12, 14));

		cal.set(year, month, date, hourOfDay, minute, second);

		return cal.getTimeInMillis();

	}

	/**
	 * 把格式化的時間字串, 如 2012/12/21_12:00:00 轉 64 位元整數.<br/>
	 * To convert formattedTimeString(2012/12/21_12:00:00) of time in absolute millisecond.
	 */
	public static long toT64(String formattedTimeString) {

		return toT64(formattedTimeString, DEF_TIME_ZONE);

	}

	/**
	 * 把格式化的時間字串, 如 2012/12/21_12:00:00 轉 64 位元整數.<br/>
	 * To convert formattedTimeString(2012/12/21_12:00:00) of time in absolute millisecond.
	 */
	public static long toT64(TimeZone timeZone) {

		return Calendar.getInstance(timeZone).getTimeInMillis();

	}

	/**
	 * 把格式化的時間字串, 如 2012/12/21_12:00:00.550 轉 64 位元整數.<br/>
	 * To convert formattedTimeString(2012/12/21_12:00:00.550) of time in absolute millisecond.
	 */
	public static long toT64FromWMilliSec(String formattedTimeStringWMilliSec, TimeZone timeZone) {

		if (formattedTimeStringWMilliSec.indexOf(C43) >= 0 || formattedTimeStringWMilliSec.indexOf(C45) >= 0
				|| formattedTimeStringWMilliSec.length() != 23) {

			O.x();

		}

		formattedTimeStringWMilliSec = formattedTimeStringWMilliSec.replaceAll(REGEX_NOT_NUM, Z);

		Calendar cal = Calendar.getInstance(timeZone);
		cal.setLenient(false);// fuck

		int year = Integer.parseInt(formattedTimeStringWMilliSec.substring(0, 4));
		int month = Integer.parseInt(formattedTimeStringWMilliSec.substring(4, 6)) - 1;
		int date = Integer.parseInt(formattedTimeStringWMilliSec.substring(6, 8));
		int hourOfDay = Integer.parseInt(formattedTimeStringWMilliSec.substring(8, 10));
		int minute = Integer.parseInt(formattedTimeStringWMilliSec.substring(10, 12));
		int second = Integer.parseInt(formattedTimeStringWMilliSec.substring(12, 14));

		cal.set(year, month, date, hourOfDay, minute, second);
		cal.set(Calendar.MILLISECOND, Integer.parseInt(formattedTimeStringWMilliSec.substring(14, 17)));

		return cal.getTimeInMillis();

	}

	/**
	 * 把格式化的時間字串, 如 2012/12/21_12:00:00.550 轉 64 位元整數.<br/>
	 * To convert formattedTimeString(2012/12/21_12:00:00.550) of time in absolute millisecond.
	 */
	public static long toT64FromWMilliSec(String formattedTimeStringWMilliSec) {

		if (formattedTimeStringWMilliSec.indexOf(C43) >= 0 || formattedTimeStringWMilliSec.indexOf(C45) >= 0
				|| formattedTimeStringWMilliSec.length() != 23) {

			O.x();

		}

		formattedTimeStringWMilliSec = formattedTimeStringWMilliSec.replaceAll(REGEX_NOT_NUM, Z);

		Calendar cal = Calendar.getInstance();
		cal.setLenient(false);// fuck

		int year = Integer.parseInt(formattedTimeStringWMilliSec.substring(0, 4));
		int month = Integer.parseInt(formattedTimeStringWMilliSec.substring(4, 6)) - 1;
		int date = Integer.parseInt(formattedTimeStringWMilliSec.substring(6, 8));
		int hourOfDay = Integer.parseInt(formattedTimeStringWMilliSec.substring(8, 10));
		int minute = Integer.parseInt(formattedTimeStringWMilliSec.substring(10, 12));
		int second = Integer.parseInt(formattedTimeStringWMilliSec.substring(12, 14));

		cal.set(year, month, date, hourOfDay, minute, second);
		cal.set(Calendar.MILLISECOND, Integer.parseInt(formattedTimeStringWMilliSec.substring(14, 17)));

		return cal.getTimeInMillis();

	}

	/**
	 * 把格式化的時間字串, 如 2012/12/21_12:00:00+08:00 轉 64 位元整數.<br/>
	 * To convert formattedTimeString(2012/12/21_12:00:00+08:00) of time in absolute millisecond.
	 */
	public static long toT64FromWGmt(String formattedTimeStringWGmt) {

		if (formattedTimeStringWGmt.length() != 25 || formattedTimeStringWGmt.indexOf(C46) >= 0) {// 2012/12/21_12:00:00+08:00

			O.x();

		}

		TimeZone timeZone = TimeZone.getTimeZone(STRING_GMT + formattedTimeStringWGmt.substring(19, 25));

		formattedTimeStringWGmt = formattedTimeStringWGmt.replaceAll(REGEX_NOT_NUM, Z);

		Calendar cal = Calendar.getInstance(timeZone);
		cal.setLenient(false);// fuck

		int year = Integer.parseInt(formattedTimeStringWGmt.substring(0, 4));
		int month = Integer.parseInt(formattedTimeStringWGmt.substring(4, 6)) - 1;
		int date = Integer.parseInt(formattedTimeStringWGmt.substring(6, 8));
		int hourOfDay = Integer.parseInt(formattedTimeStringWGmt.substring(8, 10));
		int minute = Integer.parseInt(formattedTimeStringWGmt.substring(10, 12));
		int second = Integer.parseInt(formattedTimeStringWGmt.substring(12, 14));

		cal.set(year, month, date, hourOfDay, minute, second);

		return cal.getTimeInMillis();

	}

	/**
	 * 把格式化的時間字串, 如 2012/12/21_12:00:00.550+08:00 轉 64 位元整數.<br/>
	 * To convert formattedTimeString(2012/12/21_12:00:00.550+08:00) of time in absolute millisecond.
	 */
	public static long toT64FromWMilliSecWGmt(String formattedTimeStringWMilliSecWGmt) {

		if (formattedTimeStringWMilliSecWGmt.length() != 29) {// 2012/12/21_12:00:00.550+08:00

			O.x();

		}

		// String stringForGmt = formattedTimeStringWMilliSecWGmt.substring(23, 29);
		// O.l(stringForGmt + ", toT64FromWGmt");
		TimeZone timeZone = TimeZone.getTimeZone(STRING_GMT + formattedTimeStringWMilliSecWGmt.substring(23, 29));
		// O.l(timeZone + ", toT64FromWGmt");

		formattedTimeStringWMilliSecWGmt = formattedTimeStringWMilliSecWGmt.replaceAll(REGEX_NOT_NUM, Z);

		Calendar cal = Calendar.getInstance(timeZone);
		cal.setLenient(false);// fuck

		int year = Integer.parseInt(formattedTimeStringWMilliSecWGmt.substring(0, 4));
		int month = Integer.parseInt(formattedTimeStringWMilliSecWGmt.substring(4, 6)) - 1;
		int date = Integer.parseInt(formattedTimeStringWMilliSecWGmt.substring(6, 8));
		int hourOfDay = Integer.parseInt(formattedTimeStringWMilliSecWGmt.substring(8, 10));
		int minute = Integer.parseInt(formattedTimeStringWMilliSecWGmt.substring(10, 12));
		int second = Integer.parseInt(formattedTimeStringWMilliSecWGmt.substring(12, 14));

		cal.set(year, month, date, hourOfDay, minute, second);
		cal.set(Calendar.MILLISECOND, Integer.parseInt(formattedTimeStringWMilliSecWGmt.substring(14, 17)));

		return cal.getTimeInMillis();

	}

}
