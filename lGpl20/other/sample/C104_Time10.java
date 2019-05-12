package lGpl20.other.sample;

import lGpl20.o.O;
import lGpl20.o.time.T64;
import lGpl20.other.jsp.Jsp;

/**
 * 時間範例.<br/>
 * <br/>
 * The sample of time.
 * 
 * @version 2017/10/14_12:53:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=C104_Time10" >C104_Time10.java</a>
 * 
 */
public class C104_Time10 {

	public static void main(String[] sAry) {

		// float milliSecFromT10 = 791.70f * 86.4f * 1000 - (8 * 3600 * 1000);
		float milliSecFromT10 = 377.25f * 86.4f * 1000 - (8 * 3600 * 1000);

		O.l("(long)milliSecFromT10=" + (long) milliSecFromT10);
		O.l("T64.toTimeStr=" + T64.toTimeStr((long) milliSecFromT10, Jsp.MY_TIME_ZONE));
		O.l("T64.toTimeStr=" + T64.toTimeStr((long) milliSecFromT10));

		O.l("T64.toTimeStr=" + T64.toTimeStr(0));

		milliSecFromT10 = 0.79170f * 24f;
		O.l("milliSecFromT10=" + milliSecFromT10);

	}

}
