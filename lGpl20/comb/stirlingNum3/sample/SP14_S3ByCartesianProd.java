package lGpl20.comb.stirlingNum3.sample;

import lGpl20.comb.cartesianProd.CartesianProdPva;
import lGpl20.comb.filter.Condi;
import lGpl20.comb.stirlingNum1.sample.SP12_TestS1;
import lGpl20.comb.stirlingNum2.sample.SP12_TestS2;
import lGpl20.comb.stirlingNum3.S3va;
import lGpl20.o.O;
import lGpl20.o.ery.Ery;
import lGpl20.o.ery.Seq;
import lGpl20.o.str.Strva;

/**
 * Stirling number of the third kind.<br/>
 * <br/>
 * Stirling number of the third kind.
 * 
 * @version 2019/03/27_18:00:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP14_S3ByCartesianProd" >
 *          SP14_S3ByCartesianProd.java</a>
 * 
 * @see SP12_TestS1
 * 
 * @see SP12_TestS2
 * 
 * @see SP14_S3ByCartesianProd
 */
public class SP14_S3ByCartesianProd {

	private static final Class<SP14_S3ByCartesianProd> CLASS_THIS = SP14_S3ByCartesianProd.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	public static void main(String[] sAry) throws Throwable {

		Condi condi = new Condi();
		condi.n = 5;
		condi.k = 2;
		condi.min = 2;
		condi.max = condi.n;

		condi.checkArg();

		Ery<Seq> eryOfSeq = S3va.goByCartesianProd(condi);

		long len = eryOfSeq.len();
		long ans = S3va.int64ByToDiI(condi);

		if (len != ans) {

			O.x();

		}

		StringBuilder str = CartesianProdPva.toStrByEryOfSeq(eryOfSeq, Strva.S_ARY_A_J, "\t", O.L);

		O.l(str);

		O.l();

		O.l("ans=" + ans);
		O.l("ans2=" + S3va.int64ByLah(condi.n, condi.k));

	}

}
