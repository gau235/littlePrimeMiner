package lGpl20.divIntoHeap;

import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.comb.filter.Adder32;
import lGpl20.o.O;
import lGpl20.o.ery.Seq;
import lGpl20.shareWXyz.ShWGo;

/**
 * @version 2018/06/05_15:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=DiIGo_R" >DiIGo_R.java</a>
 *
 * @see DiIGo_Z
 */
public abstract class DiIGo_R extends DiIGo_A {

	private static final Class<DiIGo_R> CLASS_THIS = DiIGo_R.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * n 個相同物品分成 k 堆, 每堆最少 min 個.<br/>
	 * To return the number of ways to divide several identical items into several identical heaps.
	 * 
	 * @see ShWGo#reGo(int, int, int, int, long, Seq)
	 */
	public static void reGo(int n, int k, int min, int max, long b64IntoB6AsPrefix, Seq seq) {

		Adder32.a1++;

		if (k == 1) {

			// b64IntoB6AsPrefix = (b64IntoB6AsPrefix << B64IntoB6.$NUM_OF_BIT_PER_CELL_INT32) | (long) n;
			seq.a((b64IntoB6AsPrefix << B64IntoB6.$6) | (long) n);

			// StringBuilder str = B64IntoB6.toStrForToDiI(prefix, min);
			// O.l(str + O.S32 + CLASS_THIS);

			return;

		}

		int value32;
		if (b64IntoB6AsPrefix == 0b0L) {

			value32 = min;

		} else {

			value32 = ((int) b64IntoB6AsPrefix) & B64IntoB6.MASK32;

		}

		// gen newK
		// gen newMin
		// gen newN
		// gen newMax

		// final int upperBound = StrictMath.min(n / k, newMax);
		int nEqDivK = n / k;

		int newK = k - 1;
		int newMax = StrictMath.min(n - newK * min, max);// predict
		int newKMulNewMax = newK * newMax;// predict

		int newN;
		long newB64IntoB6AsPrefix;
		for (; value32 <= nEqDivK; value32++) {

			newN = n - value32;
			// O.l("newN=" + newN + O.S32 + CLASS_THIS);

			if (newN <= newKMulNewMax && newN >= (newK * value32)/* newMin will increase */) {

				newB64IntoB6AsPrefix = (b64IntoB6AsPrefix << B64IntoB6.$6) | (long) value32;
				reGo(newN, newK, min, newMax, newB64IntoB6AsPrefix, seq);

			}

		}

	}

	/**
	 * n 個相同物品分成 k 堆, 每堆最少 min 個.<br/>
	 * To return the number of ways to divide several identical items into several identical heaps.
	 * 
	 * @see ShWGo#go(int, int, int, int)
	 */
	public static long[] go(int n, int k, int min, int max) {// reduced for performance; min allowed 0

		int[] tempAry32 = DiIAns.regu(n, k, min, max);

		int newN = tempAry32[0];
		int newMax = tempAry32[1];

		checkArg(newN, k, 1, newMax);

		Seq seq = new Seq();
		reGo(newN, k, 1, newMax, 0b0L, seq);// B64IntoB6.toStrForToDiI(ary, min, O.L) will fix

		// StringBuilder str = B64va.toStrForToDiI(seq.trim().ary(false), O.L);
		// O.l(str + O.L + CLASS_THIS);

		return seq.trim().ary(false);

	}

}
