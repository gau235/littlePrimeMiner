package lGpl20.comb.onto;

import lGpl20.comb.filter.Condi;
import lGpl20.comb.stirlingNum2.S2va;
import lGpl20.o.O;

/**
 * 回傳 Onto 函數值; 求 m 本相異書分給 n 個小孩的方法數.<br/>
 * To return the number of that m distinguish books giving to n people<br/>
 * then everyone at least got one.<br/>
 * Onto(n,k)=C(k,0)*k^n -C(k,1)*(k-1)^n +C(k,2)*(k-2)^n- ... +-C(k,k-1)*1^n
 * 
 * @version 2018/05/20_22:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Ontova" >Ontova.java</a>
 * 
 * @see S2va
 */
public abstract class Ontova extends Ontova_Z {

	private static final Class<Ontova> CLASS_THIS = Ontova.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * If passes test.<br/>
	 * If passes test.
	 */
	public static void passTest() {

		int endN = 5;
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

				if (go(condi).len() != int64ByToInEx(condi)) {

					O.x("n, k, min, max=" + condi.n + ", " + condi.k + ", " + condi.min + ", " + condi.max);

				}

				if (go(condi).len() != bigIntByToInEx(condi).longValue()) {

					O.x("n, k, min, max=" + condi.n + ", " + condi.k + ", " + condi.min + ", " + condi.max);

				}

				if (go(condi).len() != int64ByToShW(condi)) {

					O.x("n, k, min, max=" + condi.n + ", " + condi.k + ", " + condi.min + ", " + condi.max);

				}

				if (go(condi).len() != bigIntByToShW(condi).longValue()) {

					O.x("n, k, min, max=" + condi.n + ", " + condi.k + ", " + condi.min + ", " + condi.max);

				}

			}

		}

	}

}
