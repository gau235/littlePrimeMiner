package lGpl20.prime64.sample;

import lGpl20.b32.B32va;
import lGpl20.o.O;
import lGpl20.o.time.T64;
import lGpl20.other.uI.MyStrva;
import lGpl20.prime64.Marker;

/**
 * To grow b32 array for composite.<br/>
 * <br/>
 * To grow b32 array for composite.
 * 
 * @version 2019/04/21_12:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP43_MarkPrime" > SP43_MarkPrime.java</a>
 * 
 * @see SP01_MinePrime
 */
public class SP43_MarkPrime {

	public static void main(String[] sAry) throws Throwable {

		MyStrva.tempJTextArea.setBounds(0, 0, 23400, 400);
		O.l("width=" + MyStrva.tempJTextArea.getWidth());

		long t64_0 = System.currentTimeMillis();

		final long headN = 50;
		final long tailN = 100;

		Marker marker = new Marker(tailN);
		marker.start();
		marker.join();

		long[] primeAry = marker.retrievePrimeAry(1, tailN);

		for (int i = 0; i != primeAry.length; i++) {

			O.l(primeAry[i]);

		}

		long count = marker.countPrimeByB32AryForCompo(headN, tailN);

		StringBuilder str = MyStrva.genStrToShowFrom1PrimeAry(primeAry, T64.difInF32Sec(t64_0));

		O.l(str);
		O.l("count=" + count);

		str = B32va.str(marker.box[0]);
		O.l(str);

	}

}