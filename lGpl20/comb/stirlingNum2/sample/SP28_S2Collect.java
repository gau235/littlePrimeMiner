package lGpl20.comb.stirlingNum2.sample;

import lGpl20.comb.filter.Condi;
import lGpl20.comb.onto.sample.SP12_Onto;
import lGpl20.comb.stirlingNum1.sample.SP12_TestS1;
import lGpl20.comb.stirlingNum2.S2va;
import lGpl20.comb.stirlingNum3.sample.SP12_TestS3;
import lGpl20.o.O;
import lGpl20.o.ery.Ery;
import lGpl20.o.str.Strva;

/**
 * Stirling number of the second kind.<br/>
 * <br/>
 * Stirling number of the second kind.
 * 
 * @version 2019/03/27_18:00:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP28_S2Collect" >SP28_S2Collect.java</a>
 * 
 * @see SP12_Onto
 * 
 * @see SP12_TestS1
 * 
 * @see SP12_TestS3
 */
public class SP28_S2Collect {

	public static void main(String[] sAry) throws Throwable {

		// S2va.passTest();

		Condi condi = new Condi();
		condi.n = 5;
		condi.k = 5;
		condi.min = 1;
		condi.max = condi.n;

		condi.checkArg();

		Ery<int[]> eryOfAry32 = S2va.collectToKByToGo(condi, true);

		long len = eryOfAry32.len();
		long ans = S2va.int64SumToKWLim(condi);

		if (len != ans) {

			O.x();

		}

		StringBuilder str = S2va.toStrByEryOfAryOfB32As2PowBySAry(eryOfAry32, Strva.S_ARY_A_J, O.L);

		O.l(str);

		O.l();

		O.l("len=" + len);
		O.l("ans=" + ans);

		// O.l("a1=" + Adder32.a1);

	}

}
