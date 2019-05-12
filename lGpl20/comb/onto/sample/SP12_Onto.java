package lGpl20.comb.onto.sample;

import lGpl20.comb.filter.Condi;
import lGpl20.comb.onto.Ontova;
import lGpl20.comb.stirlingNum2.S2va;
import lGpl20.comb.stirlingNum2.sample.SP12_TestS2;
import lGpl20.o.O;
import lGpl20.o.ery.Ery;
import lGpl20.o.str.Strva;
import lGpl20.other.jsp.Jsp;

/**
 * Onto.<br/>
 * <br/>
 * The Onto function.
 * 
 * @version 2019/03/26_20:30:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP12_Onto" >SP12_Onto.java</a>
 * 
 * @see SP12_TestS2
 */
public class SP12_Onto {

	public static void main(String[] sAry) throws Throwable {

		// OntoFreelyer.passTest();

		Condi condi = new Condi();
		condi.n = 5;
		condi.k = 3;
		condi.min = 1;
		condi.max = condi.n;

		condi.checkArg();// fuck

		Ery<int[]> eryOfAry32 = Ontova.go(condi);
		eryOfAry32.sort();

		long len = eryOfAry32.len();
		long ans = Ontova.int64ByToShW(condi);

		if (len != ans) {

			O.x();

		}

		StringBuilder str = S2va.toStrByEryOfAryOfB32As2PowBySAry(eryOfAry32, Strva.S_ARY_A_J, O.L);
		O.l(str);

		O.l();

		StringBuilder strForHtml = S2va.toHtmlStrByAryOfB32As2PowBySAry(eryOfAry32, Strva.S_ARY_A_J, Jsp.L, "tabForOnto");
		O.l(strForHtml);

		O.l();

		O.l("len=" + len);
		O.l("ans=" + ans);
		O.l("ans2=" + Ontova.int64ByToInEx(condi));

	}

}
