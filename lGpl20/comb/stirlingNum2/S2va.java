package lGpl20.comb.stirlingNum2;

import lGpl20.comb.filter.Condi;
import lGpl20.comb.stirlingNum1.S1va;
import lGpl20.comb.stirlingNum3.S3va;
import lGpl20.o.O;

/**
 * Stirling number of the second kind.<br/>
 * <br/>
 * Stirling number of the second kind.
 * 
 * @version 2018/04/05_19:49:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=S2va" >S2va.java</a>
 * 
 * @see S1va
 * 
 * @see S2va
 * 
 * @see S3va
 */
public abstract class S2va extends S2va_Z {

	private static final Class<S2va> CLASS_THIS = S2va.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * If passes test.<br/>
	 * If passes test.
	 */
	public static void passTest() {

		int endN = 6;
		int min = 1;

		Condi condi;

		for (int n = 1; n <= endN; n++) {

			for (int k = 1; k <= n; k++) {

				condi = new Condi();
				condi.n = n;
				condi.k = k;
				condi.min = min;
				condi.max = n;

				condi.checkArg();

				if (go(condi).len() != int64ByToDiI(condi)) {

					O.x("n, k, min, max=" + condi.n + ", " + condi.k + ", " + condi.min + ", " + condi.max);

				}

				if (go(condi).len() != bigIntByToDiI(condi).longValue()) {

					O.x("n, k, min, max=" + condi.n + ", " + condi.k + ", " + condi.min + ", " + condi.max);

				}

			}

			condi = new Condi();
			condi.n = n;
			condi.k = n;// fuck
			condi.min = min;
			condi.max = n;

			condi.checkArg();

			if (collectToKByToGo(condi, true).len() != int64SumToKWLim(condi)) {

				O.x("n, k, min, max=" + condi.n + ", " + condi.k + ", " + condi.min + ", " + condi.max);

			}

			if (collectToKByToGo(condi, false).len() != bigIntSumToKWLim(condi).longValue()) {

				O.x("n, k, min, max=" + condi.n + ", " + condi.k + ", " + condi.min + ", " + condi.max);

			}

		}

	}

}
