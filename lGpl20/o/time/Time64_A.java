package lGpl20.o.time;

import java.util.TimeZone;

import lGpl20.o.O;
import lGpl20.o.str.StrByN_A;

/**
 * 時間轉毫秒數.<br/>
 * <br/>
 * The time in 64 bit millisecond.
 * 
 * @version 2017/03/17_09:17:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Time64_A" >Time64_A.java</a>
 * 
 * @see Time64_C
 */
public abstract class Time64_A extends StrByN_A {

	private static final Class<Time64_A> CLASS_THIS = Time64_A.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 時間轉字串的格式, 如 2012/12/21_12:00:00<br/>
	 * The format, for example: 2012/12/21_12:00:00
	 */
	public static final String DEF_REGEX_TIME = "%1$tY/%1$tm/%1$td_%1$tH:%1$tM:%1$tS";

	/**
	 * 時間轉字串的格式, 如 2012/12/21_12:00:00.550<br/>
	 * The format, for example: 2012/12/21_12:00:00.550
	 */
	public static final String DEF_REGEX_TIME_W_MILLI_SEC = "%1$tY/%1$tm/%1$td_%1$tH:%1$tM:%1$tS.%1$tL";

	/**
	 * 時間轉字串的格式, 如 2012/12/21_12:00:00+0800.<br/>
	 * 後需再轉為 2012/12/21_12:00:00+08:00<br/>
	 * The format, for example: 2012/12/21_12:00:00+08:00.
	 */
	public static final String DEF_REGEX_TIME_W_GMT = "%1$tY/%1$tm/%1$td_%1$tH:%1$tM:%1$tS%1$tz";

	/**
	 * 時間轉字串的格式, 如 2012/12/21_12:00:00.550+0800.<br/>
	 * 後需再轉為 2012/12/21_12:00:00.550+08:00<br/>
	 * The format, for example: 2012/12/21_12:00:00.550+0800.
	 */
	public static final String DEF_REGEX_TIME_W_MILLI_SEC_W_GMT = "%1$tY/%1$tm/%1$td_%1$tH:%1$tM:%1$tS.%1$tL%1$tz";

	/**
	 * 1 毫秒的毫秒數.<br/>
	 * 1 millisecond in millisecond.
	 */
	public static final long $1_MILLI_SEC = 1L;

	/**
	 * 1 秒的毫秒數.<br/>
	 * 1 second in millisecond.
	 */
	public static final long $1_SEC = 1_000L;

	/**
	 * 1 分鐘的毫秒數.<br/>
	 * 1 minute in millisecond.
	 */
	public static final long $1_MINUTE = 60_000L;// $1_SEC * 60L;

	/**
	 * 1 小時的毫秒數.<br/>
	 * 1 hour in millisecond.
	 */
	public static final long $1_HOUR = 3_600_000L;// $1_MINUTE * 60L;

	/**
	 * 1 天的毫秒數.<br/>
	 * 1 day in millisecond.
	 */
	public static final long $1_DAY = 86_400_000L;// $1_HOUR * 24L;

	/**
	 * 1 週的毫秒數.<br/>
	 * 1 week in millisecond.
	 */
	public static final long $1_WEEK = 604_800_000L;// $1_DAY * 7L;

	/**
	 * The TimeZone GMT+0000.<br/>
	 * The TimeZone GMT+0000.
	 */
	public static final TimeZone TIME_ZONE_GMT_0 = TimeZone.getTimeZone("GMT+00:00");

	/**
	 * 預設的 TimeZone.<br/>
	 * Default TimeZone.
	 */
	public static final TimeZone DEF_TIME_ZONE = TimeZone.getDefault();

	/**
	 * GMT.<br/>
	 * GMT.
	 */
	public static final String STRING_GMT = "GMT";

}
