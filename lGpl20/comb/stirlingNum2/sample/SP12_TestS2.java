package lGpl20.comb.stirlingNum2.sample;

import lGpl20.comb.filter.Condi;
import lGpl20.comb.onto.sample.SP12_Onto;
import lGpl20.comb.stirlingNum1.sample.SP12_TestS1;
import lGpl20.comb.stirlingNum2.S2va;
import lGpl20.comb.stirlingNum3.sample.SP12_TestS3;
import lGpl20.o.O;
import lGpl20.o.ery.Ery;
import lGpl20.o.str.Strva;
import lGpl20.other.jsp.Jsp;

/**
 * Stirling number of the second kind.<br/>
 * <br/>
 * Stirling number of the second kind.
 * 
 * @version 2019/03/27_18:00:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP12_TestS2" >SP12_TestS2.java</a>
 * 
 * @see SP12_Onto
 * 
 * @see SP12_TestS1
 * 
 * @see SP12_TestS2
 * 
 * @see SP12_TestS3
 */
public class SP12_TestS2 {

	public static void main(String[] sAry) throws Throwable {

		// S2va.passTest();

		Condi condi = new Condi();
		condi.n = 5;
		condi.k = 3;
		condi.min = 1;
		condi.max = condi.n;

		condi.checkArg();

		// Strva.numOfWordPerLineForS2 = 1;

		Ery<int[]> eryOfAry32 = S2va.go(condi);
		eryOfAry32.sort();

		long len = eryOfAry32.len();
		long ans = S2va.int64ByToDiI(condi);

		if (len != ans) {

			O.x();

		}

		StringBuilder str = S2va.toStrByEryOfAryOfB32As2PowBySAry(eryOfAry32, Strva.S_ARY_A_J, O.L);
		O.l(str);
		O.l();

		StringBuilder strForHtml = S2va.toHtmlStrByAryOfB32As2PowBySAry(eryOfAry32, Strva.S_ARY_A_J, Jsp.L, "tabForS2");
		O.l(strForHtml);

		O.l();

		O.l("len=" + len);
		// O.l("a1=" + Adder32.a1);

		O.l("ans1=" + ans);
		O.l("ans2=" + S2va.bigIntByToDiI(condi));
	}

}
