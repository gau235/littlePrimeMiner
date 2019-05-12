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
 * @version 2019/03/26_20:30:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP38_OntoFreelyerByToBear" >
 *          SP38_OntoFreelyerByToBear.java</a>
 * 
 * @see SP34_OntoFreelyer
 * 
 * @see SP38_OntoFreelyerByToBear
 */
public class SP38_OntoFreelyerByToBear {

	public static void main(String[] sAry) throws Throwable {

		// OntoFreelyer.passTest();

		Condi condi = new Condi();
		condi.n = 5;
		condi.k = 3;
		condi.min = 0;
		condi.max = 3;// condi.n / 2 + 1;

		condi.checkArg();

		Ery<int[]> eryOfAry32 = OntoFreelyer.bearByTempEryOfAry32(condi);
		// eryOfAry32.sort();

		long len = eryOfAry32.len();
		long ans = OntoFreelyer.int64ByToShW(condi);

		if (len != ans) {

			O.x();

		}

		StringBuilder str = S2va.toStrByEryOfAryOfB32As2PowBySAry(eryOfAry32, Strva.S_ARY_A_J, O.L);
		O.l("str=" + O.L + str);

		O.l("len=" + len);
		O.l("ans=" + ans);

	}

}
