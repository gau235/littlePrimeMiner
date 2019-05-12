package lGpl20.shareWXyz;

import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.comb.filter.Adder32;
import lGpl20.divIntoHeap.DiIAns;
import lGpl20.divIntoHeap.DiIGo;
import lGpl20.o.O;
import lGpl20.o.ery.Seq;

/**
 * @version 2018/11/20_18:50:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=ShWGo_C" >ShWGo_C.java</a>
 *
 * @see ShWGo_V
 */
public abstract class ShWGo_C extends ShWGo_A {

	private static final Class<ShWGo_C> CLASS_THIS = ShWGo_C.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 即 n 個相同物品分成給 k 人, 每人最少 1 個.<br/>
	 * To return the number of ways to share several identical items with every person. int restK as termination condition.
	 * 
	 * @see DiIGo#reGo(int, int, int, int, long, Seq)
	 */
	public static void reGo(int n, int k, int min, int max, long b64IntoB6AsPrefix, Seq seq) {

		Adder32.a1++;

		if (k == 1) {

			// long ans = (b64IntoB6AsPrefix << B64IntoB6.$NUM_OF_BIT_PER_CELL_INT32) | (long) n;
			seq.a((b64IntoB6AsPrefix << B64IntoB6.$6) | (long) n);
			// O.l(B64IntoB6.toStrForToDiI(newB64IntoB6));

			return;

		}

		final int newK = k - 1;
		final int newMax = StrictMath.min(n - newK * min, max);// predict base on min
		final int newMin = StrictMath.max(n - newK * max, min);// predict

		int newN;
		final int newKMulNewMin = newK * newMin;// predict
		final int newKMulNewMax = newK * newMax;// predict

		long newB64IntoB6AsPrefix;
		for (int value32 = newMin; value32 <= newMax; value32++) {

			newN = n - value32;

			if (newN <= newKMulNewMax && newN >= newKMulNewMin /**/) {

				newB64IntoB6AsPrefix = (b64IntoB6AsPrefix << B64IntoB6.$6) | (long) value32;
				reGo(newN, newK, newMin, newMax, newB64IntoB6AsPrefix, seq);

			}

		}

	}

	/**
	 * 即 n 個相同物品分成給 k 人, 每人最少 1 個.<br/>
	 * To return the number of ways to share several identical items with every person.
	 * 
	 * @see DiIAns#int64(int, int, int, int)
	 * 
	 * @see DiIGo#go(int, int, int, int)
	 */
	public static long[] go(int n, int k, int min, int max) {

		// regularize
		// check arg
		// special case

		int[] tempAry32 = ShWAns.regu(n, k, min, max);

		int newN = tempAry32[0];
		int newMax = tempAry32[1];

		DiIGo.checkArg(newN, k, 1, newMax);

		Seq seq = new Seq();
		reGo(newN, k, 1, newMax, 0b0L, seq);

		return seq.trim().ary(false);

	}

}
