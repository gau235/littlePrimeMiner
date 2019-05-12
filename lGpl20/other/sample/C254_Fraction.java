package lGpl20.other.sample;

import lGpl20.b32.eqDiv.BigFraction;
import lGpl20.o.O;
import lGpl20.o.time.T64;

/**
 * 分數運算.<br/>
 * <br/>
 * The easy test for fraction.
 * 
 * @version 2017/10/14_12:53:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=C254_Fraction" >C254_Fraction.java</a>
 * 
 */
public class C254_Fraction {

	public static void main(String[] sAry) throws Throwable {

		BigFraction ans = BigFraction.$0;

		long t0 = T64.t64();

		for (int i = 1; i < 200; i++) {

			// O.l(i);
			ans = ans.add(new BigFraction((int) Math.pow(-1, i) * 2, i));

		}

		O.l(ans);
		// O.l("=" + ans.toBigDecimal());
		O.l("t=" + T64.difInF32Sec(t0));

	}

}