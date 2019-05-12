package lGpl20.comb.stirlingNum3.sample;

import lGpl20.comb.filter.Condi;
import lGpl20.comb.stirlingNum3.S3va;
import lGpl20.o.O;
import lGpl20.o.ery.Ery;
import lGpl20.o.str.Strva;

/**
 * Stirling number of the second kind.<br/>
 * <br/>
 * Stirling number of the second kind.
 * 
 * @version 2019/03/26_20:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP28_S3Collect" >SP28_S3Collect.java</a>
 * 
 * @see SP28_S3Collect
 * 
 * @see SP29_S3CollectByCartesianProd
 */
public class SP28_S3Collect {

	public static void main(String[] sAry) throws Throwable {

		// S2va.passTest();

		Condi condi = new Condi();
		condi.n = 5;
		condi.k = 3;
		condi.min = 1;
		condi.max = condi.n;

		condi.checkArg();

		Ery<long[]> eryOfAry = S3va.collectToKByToGoByS2(condi, true);

		long len = eryOfAry.len();
		long ans = S3va.int64SumToKWLim(condi);

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
