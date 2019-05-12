package lGpl20.o.time;

import java.util.Calendar;
import java.util.TimeZone;

import lGpl20.o.O;

/**
 * @version 2014/06/14_14:37:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Time64_X" >Time64_X.java</a>
 * 
 * @see Time64_Z
 */
public abstract class Time64_X extends Time64_W {

	private static final Class<Time64_X> CLASS_THIS = Time64_X.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 取得現在是星期幾.<br/>
	 * To get the day of week; Sunday is 1.
	 */
	public static long dayOfWeek(TimeZone timeZone) {

		return Calendar.getInstance(timeZone).get(Calendar.DAY_OF_WEEK);

	}

	/**
	 * 取得現在是星期幾.<br/>
	 * To get the day of week; Sunday is 1.
	 */
	public static long dayOfWeek() {

		return dayOfWeek(DEF_TIME_ZONE);

	}

	// /**
	// * 取得現在是星期幾.<br/>
	// * To get the day of week; Sunday is 1.
	// */
	// public static long dayOfWeek(String formattedStringOrStringOfT64) {
	//
	// return getCalendar(formattedStringOrStringOfT64).get(Calendar.DAY_OF_WEEK);
	//
	// }

}
