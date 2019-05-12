package lGpl20.other.sample;

import java.util.TimeZone;

import lGpl20.o.O;
import lGpl20.o.time.T64;

/**
 * 時間範例.<br/>
 * <br/>
 * The sample of time.
 * 
 * @version 2017/10/14_11:13:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=C102_TimeStr" >C102_TimeStr.java</a>
 * 
 */
public class C102_TimeStr {

	public static void main(String[] sAry) {

		TimeZone timeZone = TimeZone.getTimeZone("GMT+08:00");

		long t64 = 1356062400550L;

		String s1 = T64.toTimeStr(t64, timeZone).toString();
		O.l(s1);

		String s2 = T64.toTimeStrWMilliSec(t64, timeZone).toString();
		O.l(s2);

		String s3 = T64.toTimeStrWGmt(t64, timeZone).toString();
		O.l("s3=" + s3);

		String s4 = T64.toTimeStrWMilliSecWGmt(t64, timeZone).toString();
		O.l(s4);

		String s5 = "2012/12/21_12:00:00";
		String s6 = "2012/12/21_12:00:00.550";
		String s7 = "2012/12/21_12:00:00+08:00";
		String s8 = "2012/12/21_12:00:00.550+08:00";

		long t64_5 = T64.toT64(s5, timeZone);// 2012/12/21_12:00:00

		O.l(t64_5);

		long t64_6 = T64.toT64FromWMilliSec(s6, timeZone);// 2012/12/21_12:00:00.550

		O.l(t64_6);

		long t64_7 = T64.toT64FromWGmt(s7);// 2012/12/21_12:00:00+08:00

		O.l(t64_7);

		long t64_8 = T64.toT64FromWMilliSecWGmt(s8);

		O.l(t64_8);

	}

}
