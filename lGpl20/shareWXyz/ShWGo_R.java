package lGpl20.shareWXyz;

import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.comb.filter.Adder32;
import lGpl20.divIntoHeap.DiIGo;
import lGpl20.o.O;
import lGpl20.o.ery.Seq;

/**
 * @version 2019/04/07_11:30:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=ShWGo_R" >ShWGo_R.java</a>
 *
 * @see ShWGo_V
 */
public abstract class ShWGo_R extends ShWGo_J {

	private static final Class<ShWGo_R> CLASS_THIS = ShWGo_R.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 即 n 個相同物品分成給 k 人, 每人最少 1 個.<br/>
	 * To return the number of ways to share several identical items with every person. int k as termination condition.
	 */
	public static void reGoWB64IntoB6ForMax_old(int n, int k, final int min, final long b64IntoB6ForMaxPlus1,
			long b64IntoB6AsPrefix, Seq seq) {

		Adder32.a1++;

		if (k == 1) {

			if (n <= (((int) b64IntoB6ForMaxPlus1) & B64IntoB6.MASK32)) {// need to be limited by bound32Max

				// long tempB64 = (b64IntoB6AsPrefix << B64IntoB6.$NUM_OF_BIT_PER_CELL_INT32) | (long) n;
				seq.a((b64IntoB6AsPrefix << B64IntoB6.$6) | (long) n);
				// O.l("tempB64=" + B64IntoB6.str24(tempB64) + O.S32 + CLASS_THIS);

			}

			return;

		}

		final int newK = k - 1;
		final int bound32Max = ((int) (b64IntoB6ForMaxPlus1 >>> (B64IntoB6.$6 * newK))
				& B64IntoB6.MASK32);// pick b6Cell from leftmost
		// todo: b64IntoB6ForMaxPlus1 is sorted

		// bound32Max sometimes be very big thou sometimes be very small
		int newMax = n - newK * min;// predict
		if (newMax > bound32Max) {

			newMax = bound32Max;

		}

		int newN;
		// final int newKMulNewMax = newK * newMax;// predict
		// final int newKMulNewMin = newK * newMin;// predict

		long newB64IntoB6AsPrefix;
		for (int value32 = min; value32 <= newMax; value32++) {// value32 = newMin will fail

			newN = n - value32;
			// if (newN <= newKMulNewMax /* && newN >= newKMulNewMin */) {

			newB64IntoB6AsPrefix = (b64IntoB6AsPrefix << B64IntoB6.$6) | (long) value32;
			reGoWB64IntoB6ForMax_old(newN, newK, min, b64IntoB6ForMaxPlus1, newB64IntoB6AsPrefix, seq);

			// }

		}

	}

	/**
	 * 即 n 個相同物品分成給 k 人, 每人最少 1 個.<br/>
	 * To return the number of ways to share several identical items with every person.
	 */
	public static long[] goWMin0WB64IntoB6OfQtyPlus1_old(int n, int k, long sortedB64IntoB6ForMaxPlus1/* sortDesc */) { // min
																														// must 0

		Adder32.a1 = 0;

		// O.l("sortedB64IntoB6ForMaxPlus1=" + O.L + B64IntoB6.str24(sortedB64IntoB6ForMaxPlus1) + O.S32 + CLASS_THIS);
		// sortedB64IntoB6ForMaxPlus1 = B64IntoB6.revAgainstB6NShiftR(sortedB64IntoB6ForMaxPlus1);// important; 5, 5, 3 is good

		n = n + k;// min==0

		// int smallMaxPlus1 = B64IntoB6.leftestFromR(sortedB64IntoB6ForMaxPlus1);
		// int bigMaxPlus1 = (((int) b64IntoB6ForMaxPlus1) & B64IntoB6.$6_1_OF_32BIT);
		// O.l("smallMaxPlus1=" + smallMaxPlus1 + O.S32 + CLASS_THIS);
		// O.l("bigMaxPlus1=" + bigMaxPlus1 + O.S32 + CLASS_THIS);

		// DiIGo.checkArg(n, k, 1, smallMaxPlus1);
		DiIGo.checkArg(n, k, 1, n);// min=1, the sortedB64IntoB6ForMaxPlus1 will limit all

		Seq seq = new Seq();
		reGoWB64IntoB6ForMax_old(n, k, 1, sortedB64IntoB6ForMaxPlus1, 0b0L, seq);

		O.l("Adder32.a1=" + Adder32.a1 + O.S32 + CLASS_THIS);

		return seq.trim().ary(false);

	}

}
