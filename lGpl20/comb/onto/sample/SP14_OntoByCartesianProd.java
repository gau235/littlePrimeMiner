package lGpl20.comb.onto.sample;

import lGpl20.comb.cartesianProd.CartesianProdCva;
import lGpl20.comb.filter.Condi;
import lGpl20.comb.onto.Ontova;
import lGpl20.comb.stirlingNum2.sample.SP12_TestS2;
import lGpl20.o.O;
import lGpl20.o.ery.Ery;
import lGpl20.o.ery.Seq;
import lGpl20.o.str.Strva;

/**
 * Onto.<br/>
 * <br/>
 * The Onto function.
 * 
 * @version 2019/03/26_21:30:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP14_OntoByCartesianProd" >
 *          SP14_OntoByCartesianProd.java</a>
 * 
 * @see SP12_TestS2
 */
public class SP14_OntoByCartesianProd {

	public static void main(String[] sAry) throws Throwable {

		// OntoFreelyer.passTest();

		Condi condi = new Condi();
		condi.n = 5;
		condi.k = 2;
		condi.min = 2;
		condi.max = condi.n;

		condi.checkArg();// fuck

		Ery<Seq> eryOfSeq = Ontova.goByCartesianProd(condi);

		long len = eryOfSeq.len();
		long ans = Ontova.int64ByToShW(condi);

		if (len != ans) {

			O.x();

		}

		StringBuilder str = CartesianProdCva.toStrByEryOfSeq(eryOfSeq, Strva.S_ARY_A_J, "\t", O.L);
		O.l(str);

		O.l();

		O.l("len=" + len);
		O.l("ans=" + ans);
		O.l("ans2=" + Ontova.int64ByToInEx(condi));

	}

}
