package lGpl20.comb.stirlingNum3.sample;

import lGpl20.comb.filter.Condi;
import lGpl20.comb.stirlingNum1.sample.SP12_TestS1;
import lGpl20.comb.stirlingNum2.sample.SP12_TestS2;
import lGpl20.comb.stirlingNum3.S3va;
import lGpl20.o.O;
import lGpl20.o.ery.Ery;
import lGpl20.o.str.Strva;
import lGpl20.other.jsp.Jsp;

/**
 * Stirling number of the third kind.<br/>
 * <br/>
 * Stirling number of the third kind.
 * 
 * @version 2019/03/25_20:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP12_TestS3" >SP12_TestS3.java</a>
 * 
 * @see SP12_TestS1
 * 
 * @see SP12_TestS2
 * 
 * @see SP12_TestS3
 */
public class SP12_TestS3 {

	private static final Class<SP12_TestS3> CLASS_THIS = SP12_TestS3.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	public static void main(String[] sAry) throws Throwable {

		// S3va.passTest();

		Condi condi = new Condi();
		condi.n = 5;
		condi.k = 3;
		condi.min = 1;
		condi.max = condi.n;

		condi.checkArg();

		Ery<long[]> eryOfAry = S3va.goByS2(condi);
		eryOfAry.sort();

		long len = eryOfAry.len();
		long ans = S3va.int64ByToDiI(condi);

		if (len != ans) {

			O.x();

		}

		StringBuilder str = S3va.toStrByEryOfAryOfB64IntoB6BySAry(eryOfAry, Strva.S_ARY_A_J, O.L);
		O.l(str);

		StringBuilder strForHtml = S3va.toHtmlStrByEryOfAryOfB64IntoB6BySAry(eryOfAry, Strva.S_ARY_A_J, Jsp.L, "tabForStirling3");
		O.l(strForHtml);

		O.l();

		O.l("len=" + len);

		O.l("ans1=" + ans);
		O.l("ans2=" + S3va.bigIntByLah(condi.n, condi.k));
		O.l("ans3=" + S3va.int64ByLah(condi.n, condi.k));

	}

}
