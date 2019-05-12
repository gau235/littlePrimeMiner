package lGpl20.comb.onto.sample;

import lGpl20.comb.filter.Condi;
import lGpl20.comb.onto.OntoFreelyer;
import lGpl20.comb.stirlingNum2.S2va;
import lGpl20.o.O;
import lGpl20.o.ery.Ery;
import lGpl20.o.str.Strva;

/**
 * OntoFreelyer(n,k).<br/>
 * <br/>
 * OntoFreelyer(n,k).
 * 
 * @version 2019/03/28_14:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP34_OntoFreelyer" >SP34_OntoFreelyer.
 *          java</a>
 * 
 * @see SP34_OntoFreelyer
 * 
 * @see SP38_OntoFreelyerByToBear
 */
public class SP34_OntoFreelyer {

	public static void main(String[] sAry) throws Throwable {

		// OntoFreelyer.passTest();

		Condi condi = new Condi();
		condi.n = 5;
		condi.k = 5;
		condi.min = 0;
		condi.max = condi.n;// condi.n

		condi.checkArg();

		Ery<int[]> eryOfAry32 = OntoFreelyer.go(condi);
		// eryOfAry32.sort();

		long len = eryOfAry32.len();
		long ans = OntoFreelyer.int64ByToShW(condi);
		long ans2 = ans;// OntoFreelyer.int64ByToDiI(condi);

		if (len != ans) {

			O.x("ans=" + ans);

		}

		if (len != ans2) {

			O.x("ans2=" + ans2);

		}

		StringBuilder str = S2va.toStrByEryOfAryOfB32As2PowBySAry(eryOfAry32, Strva.S_ARY_A_J, O.L);
		O.l("str=" + O.L + str);

		eryOfAry32 = OntoFreelyer.go(condi);
		// eryOfAry32.sort();

		O.l("len=" + len);
		O.l("ans=" + ans);

	}

}
