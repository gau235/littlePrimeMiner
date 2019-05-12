package lGpl20.comb.onto;

import lGpl20.comb.filter.Condi;
import lGpl20.o.O;

/**
 * OntoFreelyer(n,k).<br/>
 * <br/>
 * OntoFreelyer(n,k).
 * 
 * @version 2018/05/20_22:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=OntoFreelyer" >OntoFreelyer.java</a>
 * 
 */
public abstract class OntoFreelyer extends OntoFreelyer_Z {

	private static final Class<OntoFreelyer> CLASS_THIS = OntoFreelyer.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * If passes test.<br/>
	 * If passes test.
	 */
	public static void passTest() {

		int endN = 6;
		int min = 0;
		Condi condi;

		for (int n = 1; n <= endN; n++) {

			for (int k = 1; k <= n; k++) {

				condi = new Condi();
				condi.n = n;
				condi.k = k;
				condi.min = min;
				condi.max = n;

				condi.checkArg();

				if (go(condi).len() != O.pow(k, n)) {

					O.x("n, k, min, max=" + condi.n + ", " + condi.k + ", " + condi.min + ", " + condi.max);

				}

				if (bearByTempEryOfAry32(condi).len() != O.pow(k, n)) {

					O.x("n, k, min, max=" + condi.n + ", " + condi.k + ", " + condi.min + ", " + condi.max);

				}

				if (int64ByToShW(condi) != O.pow(k, n)) {

					O.x("n, k, min, max=" + condi.n + ", " + condi.k + ", " + condi.min + ", " + condi.max);

				}

				if (bigIntByToShW(condi).longValue() != O.pow(k, n)) {

					O.x("n, k, min, max=" + condi.n + ", " + condi.k + ", " + condi.min + ", " + condi.max);

				}

			}

		}

	}

}
