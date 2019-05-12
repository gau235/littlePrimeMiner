package lGpl20.other.sample;

import lGpl20.o.O;
import lGpl20.o.time.T64;

/**
 * 時間範例.<br/>
 * <br/>
 * The sample of time.
 * 
 * @version 2016/07/04_21:17:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=C103_TheTime" >C103_TheTime.java</a>
 * 
 */
public class C103_TheTime {

	public static void main(String[] sAry) {

		long from = T64.t64();
		from = from + T64.$1_DAY * 90;
		Object theTime = T64.toTimeStr(from);

		O.l("theTime=" + theTime);

	}

}
