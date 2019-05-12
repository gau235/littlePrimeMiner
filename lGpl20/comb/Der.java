package lGpl20.comb;

import lGpl20.o.O;

/**
 * To derange.<br/>
 * <br/>
 * To derange.
 * 
 * @version 2018/06/24_16:50:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Der" >Der.java</a>
 * 
 * @see Pva
 */
public abstract class Der extends Der_Z {

	private static final Class<Der> CLASS_THIS = Der.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * If passes test.<br/>
	 * If passes test.
	 */
	public static void passTest() {

		int endN = 10;

		for (int n = 1; n <= endN; n++) {

			for (int k = 1; k <= n; k++) {

				if (int64(n, k) != bigInt(n, k).longValue()) {

					O.x("n=" + n + ", k=" + k);

				}

			}

		}

		for (int n = 1; n <= endN; n++) {

			if (int64(n) != bigInt(n).longValue()) {

				O.x("n=" + n);

			}

		}

		long sum = 0L;
		for (int n = 1; n <= endN; n++) {

			for (int k = 1; k <= n; k++) {

				sum = sum + int64(n, k);

			}

			if ((sum + 1L) != Pva.int64(n)) {

				O.x(sum + "," + Pva.int64(n));

			}

			sum = 0L;

		}

	}

}
