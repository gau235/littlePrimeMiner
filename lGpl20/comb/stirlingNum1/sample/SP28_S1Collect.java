package lGpl20.comb.stirlingNum1.sample;

import lGpl20.comb.filter.Condi;
import lGpl20.comb.onto.sample.SP12_Onto;
import lGpl20.comb.stirlingNum1.S1va;
import lGpl20.comb.stirlingNum3.S3va;
import lGpl20.comb.stirlingNum3.sample.SP12_TestS3;
import lGpl20.o.O;
import lGpl20.o.ery.Ery;
import lGpl20.o.str.Strva;

/**
 * Stirling number of the second kind.<br/>
 * <br/>
 * Stirling number of the second kind.
 * 
 * @version 2019/03/27_17:50:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP28_S1Collect" >SP28_S1Collect.java</a>
 * 
 * @see SP12_Onto
 * 
 * @see SP12_TestS1
 * 
 * @see SP12_TestS3
 */
public class SP28_S1Collect {

	public static void main(String[] sAry) throws Throwable {

		// S2va.passTest();

		Condi condi = new Condi();
		condi.n = 5;
		condi.k = 3;
		condi.min = 0;
		condi.max = condi.n;

		condi.checkArg();

		Ery<long[]> eryOfAry = S1va.collectToKByToGoByS2(condi, true);

		long len = eryOfAry.len();
		long ans = S1va.int64SumToKWLim(condi);

		if (len != ans) {

			O.x();

		}

		StringBuilder str = S3va.toStrByEryOfAryOfB64IntoB6BySAry(eryOfAry, Strva.S_ARY_A_J, O.L);

		O.l(str);

		O.l("len=" + len);
		O.l("ans=" + ans);

		// O.l("a1=" + Adder32.a1);

	}

}
