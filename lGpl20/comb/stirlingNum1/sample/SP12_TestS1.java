package lGpl20.comb.stirlingNum1.sample;

import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.comb.filter.Condi;
import lGpl20.comb.stirlingNum1.S1va;
import lGpl20.comb.stirlingNum2.sample.SP12_TestS2;
import lGpl20.comb.stirlingNum3.S3va;
import lGpl20.comb.stirlingNum3.sample.SP12_TestS3;
import lGpl20.o.O;
import lGpl20.o.ery.Ery;
import lGpl20.o.str.Strva;

/**
 * Stirling number of the first kind.<br/>
 * <br/>
 * Stirling number of the first kind.
 * 
 * @version 2019/04/16_17:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP12_TestS1" >SP12_TestS1.java</a>
 * 
 * @see SP12_TestS1
 * 
 * @see SP12_TestS2
 * 
 * @see SP12_TestS3
 */
public class SP12_TestS1 {

	private static final Class<SP12_TestS1> CLASS_THIS = SP12_TestS1.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	public static void main(String[] sAry) throws Throwable {

		// S1va.passTest();

		Condi condi = new Condi();
		condi.n = 5;
		condi.k = 3;
		condi.min = 1;
		condi.max = condi.n;

		condi.checkArg();

		Ery<long[]> eryOfAry = S1va.goByS2(condi);
		eryOfAry.sort();

		long len = eryOfAry.len();
		long ans = S1va.int64ByToDiI(condi);

		if (len != ans) {

			O.x();

		}

		StringBuilder str = S3va.toStrByEryOfAryOfB64IntoB6BySAry(eryOfAry, Strva.S_ARY_A_J, O.L);

		O.l(str);

		O.l();

		O.l("len=" + len);
		O.l("ans=" + ans);
		O.l("ans2=" + S1va.bigIntByToDiI(condi));

		O.l("tail 0=" + B64IntoB6.toStrByValMinus1InB6Cell(eryOfAry.tail()[0], Strva.S_ARY_A_J));

	}

}
