package lGpl20.o.time;

import java.util.TreeMap;

import lGpl20.o.O;
import lGpl20.prime64.Ranger;

/**
 * @version 2017/08/20_11:27:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Time64_Z" >Time64_Z.java</a>
 * 
 * @see Time64
 */
public abstract class Time64_Z extends Time64_X {

	private static final Class<Time64_Z> CLASS_THIS = Time64_Z.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 算時間差值.<br/>
	 * To return the difference.
	 */
	public static float difInF32Sec(long t0) {// difInF64Sec

		return ((float) ((System.currentTimeMillis() - t0))) / 1_000F;

	}

	/**
	 * 算時間差絕對值.<br/>
	 * To return the difference in absolute value.
	 */
	public static TreeMap<Long, Long> dif(long t64_0, long t64_1) {

		long dif = StrictMath.abs(t64_1 - t64_0);

		long dDay = dif / $1_DAY;
		long dHour = dif % $1_DAY / $1_HOUR;
		long dMinute = dif % $1_HOUR / $1_MINUTE;
		long dSecond = dif % $1_MINUTE / $1_SEC;
		long dMilliSecond = dif % $1_SEC;

		TreeMap<Long, Long> treeMap = new TreeMap<Long, Long>();

		treeMap.put($1_MILLI_SEC, dMilliSecond);
		treeMap.put($1_SEC, dSecond);
		treeMap.put($1_MINUTE, dMinute);
		treeMap.put($1_HOUR, dHour);
		treeMap.put($1_DAY, dDay);

		return treeMap;
		// return dDay + "_" + String.format("%02d", dHour) + ":" + String.format("%02d", dMinute) + ":"
		// + String.format("%02d", dSecond);
	}

	/**
	 * 算時間差絕對值.<br/>
	 * To return the difference in absolute value.
	 */
	public static TreeMap<Long, Long> dif(String formattedString0OrString0OfT64, String formattedString1OrString1OfT64) {

		if (formattedString0OrString0OfT64.indexOf(C47) <= 1) {

			return dif(Long.parseLong(formattedString1OrString1OfT64), Long.parseLong(formattedString0OrString0OfT64));

		}

		return dif(toT64(formattedString1OrString1OfT64), toT64(formattedString0OrString0OfT64));

	}

	/**
	 * 檢查 time0 小於等於 time1.<br/>
	 * To check if time0 &lt;= time1.
	 */
	public static boolean isT0LessOrEqT1(long t64_0, long t64_1) {

		return t64_0 <= t64_1;

	}

	/**
	 * 檢查 formattedString0OrString0OfT64 小於等於 formattedString1OrString1OfT64.<br/>
	 * To check if formattedString0OrString0OfT64 &lt;= formattedString1OrString1OfT64.
	 */
	public static boolean isT0LessOrEqT1(String formattedString0OrString0OfT64, String formattedString1OrString1OfT64) {

		return toT64(formattedString0OrString0OfT64) <= toT64(formattedString1OrString1OfT64);

	}

	/**
	 * 檢查 from 到 to 是否在 originFrom 到 originTo 之前.<br/>
	 * To check if from to to is between originFrom to originTo.
	 * 
	 * @see Ranger#checkBetween(long, long, long, long)
	 */
	public static void checkBetween(String from, String to, String originFrom, String originTo) {

		Ranger.checkBetween(toT64(from), toT64(to), toT64(originFrom), toT64(originTo));

	}

	/**
	 * 檢查 from 到 to 是否在 originFrom 到 originTo 之前.<br/>
	 * To check if from to to is between originFrom to originTo.
	 * 
	 * @see Ranger#checkExactBetween(long, long, long, long)
	 */
	public static void checkExactBetween(String from, String to, String originFrom, String originTo) {

		Ranger.checkExactBetween(toT64(from), toT64(to), toT64(originFrom), toT64(originTo));

	}

}
