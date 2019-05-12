package lGpl20.shareWXyz;

import lGpl20.divIntoHeap.DiIGo;
import lGpl20.o.O;

/**
 * @version 2018/11/09_18:30:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=ShWGo" >ShWGo.java</a>
 *
 * @see ShWAns
 */
public abstract class ShWGo extends ShWGo_Z {

	private static final Class<ShWGo> CLASS_THIS = ShWGo.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * If passes test.<br/>
	 * If passes test.
	 * 
	 * @see DiIGo#passTest()
	 */
	public static void passTest() {

		for (int n = 1; n <= 10; n++) {

			for (int k = 1; k <= 10; k++) {

				int endMin = n / k;
				for (int min = 0; min <= endMin; min++) {

					int startMax = (int) StrictMath.ceil((float) n / (float) k);
					int endMax = n - (k - 1) * min;
					for (int max = startMax; max <= endMax; max++) {

						if (ShWAns.int64(n, k, min, max) != go(n, k, min, max).length) {

							O.x("n, k, min, max=" + n + ", " + k + ", " + min + ", " + max);

						}

						if (ShWAns.int64(n, k, min, max) != Hva.int64(k, n, min, max)) {

							O.x("n, k, min, max=" + n + ", " + k + ", " + min + ", " + max);

						}

					}

				}

			}

		}

	}

}
