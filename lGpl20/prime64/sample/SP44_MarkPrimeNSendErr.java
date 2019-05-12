package lGpl20.prime64.sample;

import lGpl20.o.O;
import lGpl20.prime64.Marker;

/**
 * To grow b32 array for composite and send err.<br/>
 * To grow b32 array for composite and send err.
 * 
 * @version 2019/04/20_19:30:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP44_MarkPrimeNSendErr" >
 *          SP44_MarkPrimeNSendErr.java</a>
 * 
 * @see SP01_MinePrime
 */
public class SP44_MarkPrimeNSendErr {

	public static void main(String[] sAry) throws Throwable {

		final long tailN = 50;

		Marker marker = new Marker(tailN);
		marker.start();
		marker.join();

		long count = marker.countPrimeByB32AryForCompo(1, 1);

		O.l("count=" + count);

	}

}