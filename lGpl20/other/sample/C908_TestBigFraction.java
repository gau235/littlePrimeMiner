package lGpl20.other.sample;

import lGpl20.b32.eqDiv.BigFraction;
import lGpl20.b32.eqDiv.Fr64;
import lGpl20.o.O;

/**
 * 分數運算.<br/>
 * <br/>
 * An easy test for fraction.
 * 
 * @version 2018/11/08_13:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=C908_TestBigFraction" >
 *          C908_TestBigFraction.java</a>
 * 
 */
public class C908_TestBigFraction {

	public static void main(String[] sAry) throws Throwable {

		for (int i = 0; i < 30; i++) {

			long nu1 = O.THR_LOCAL_RANDOM.nextInt(1000);
			long de1 = nu1 * O.THR_LOCAL_RANDOM.nextInt(10) + 1;
			long nu2 = O.THR_LOCAL_RANDOM.nextInt(2000);
			nu2 = -nu2;
			long de2 = de1 * O.THR_LOCAL_RANDOM.nextInt(100) + 1;

			O.l("nu1=" + nu1);
			O.l("de1=" + de1);
			O.l("nu2=" + nu2);
			O.l("de2=" + de2);

			Fr64 fr641 = new Fr64(nu1, de1);
			Fr64 fr642 = new Fr64(nu2, de2);

			O.l("fr641=" + fr641);
			O.l("fr642=" + fr642);

			Fr64 fr643 = fr641.add(fr642);
			Fr64 fr644 = fr641.sub(fr642);

			String s643 = fr643.toString();
			String s644 = fr644.toString();

			BigFraction f1 = new BigFraction(nu1, de1);
			BigFraction f2 = new BigFraction(nu2, de2);

			O.l(f1);
			O.l(f2);

			BigFraction f3 = f1.add(f2);
			BigFraction f4 = f1.sub(f2);

			String s3 = f3.toString();
			String s4 = f4.toString();

			if (!s643.equals(s3) || !s644.equals(s4)) {

				O.x();

			}

		}

		// O.l(Fr64.$2POW63_MINUS1);
		// O.l(Fr64.$_2POW63_PLUS1);

	}

}
