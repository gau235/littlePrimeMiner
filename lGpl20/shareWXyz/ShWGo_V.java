package lGpl20.shareWXyz;

import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.comb.filter.Adder32;
import lGpl20.divIntoHeap.DiIGo;
import lGpl20.o.O;
import lGpl20.o.ery.Seq;

/**
 * @version 2019/04/10_10:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=ShWGo_V" >ShWGo_V.java</a>
 *
 * @see ShWGo_W
 */
public abstract class ShWGo_V extends ShWGo_R {

	private static final Class<ShWGo_V> CLASS_THIS = ShWGo_V.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 即 n 個相同物品分成給 k 人, 每人最少 1 個.<br/>
	 * To return the number of ways to share several identical items with every person. int k as termination condition.
	 */
	public static void reGoWLim0ToMax(int n, int k, final int min, final long b64IntoB6ForMaxPlus1, long prefix, Seq seq) {

		Adder32.a1++;

		if (k == 1) {// termination condition

			if (n <= (((int) b64IntoB6ForMaxPlus1) & B64IntoB6.MASK32)) {// limMax

				// long tempB64 = (prefix << B64IntoB6.$NUM_OF_BIT_PER_CELL_INT32) | (long) n;
				// O.l("tempB64=" + B64IntoB6.str24(tempB64) + O.S32 + CLASS_THIS);

				seq.a((prefix << B64IntoB6.$6) | (long) n);

			}

			return;

		}

		final int newK = k - 1;

		// note: get every max from leftmost
		final int currMax = ((int) (b64IntoB6ForMaxPlus1 >>> (B64IntoB6.$6 * newK))
				& B64IntoB6.MASK32); // B64IntoB6.at();

		// O.l("currMax=" + currMax + O.S32 + CLASS_THIS);

		final int maxMax = (((int) b64IntoB6ForMaxPlus1) & B64IntoB6.MASK32);// tail

		// O.l("maxMax=" + maxMax + O.S32 + CLASS_THIS);

		int predictedMax = n - newK * min;
		// ShW(10,3) with limMax[2,9,9]
		// predictedMax may be 8 as 8 + 1 + 1 = 10
		// but predictedMax can not > 2
		if (predictedMax > currMax) {

			predictedMax = currMax;

		}

		int predictedMin = n - newK * maxMax;
		// ShW(10,3) with limMax[2,8,9] // more and more larger
		// predictedMin may be -6 as -6 + 8 + 8 = 10
		// but predictedMin can not < 1
		if (predictedMin < min) {

			predictedMin = min;

		}

		int newN;
		long newPrefix;

		for (int val32 = predictedMin; val32 <= predictedMax; val32++) {

			newN = n - val32;

			newPrefix = (prefix << B64IntoB6.$6) | (long) val32;

			reGoWLim0ToMax(newN, newK, min, b64IntoB6ForMaxPlus1, newPrefix, seq);

		}

	}

	/**
	 * 即 n 個相同物品分成給 k 人, 每人最少 1 個.<br/>
	 * To return the number of ways to share several identical items with every person.
	 * 
	 * @see ShWAns#int64WLim0ToMax(int, int, long)
	 */
	public static long[] goWLim0ToMax(int n, int k, long sortedDescB64IntoB6ForMaxPlus1) {// important; 5, 5, 3 is good

		Adder32.a1 = 0;

		n = n + k;// min==0

		DiIGo.checkArg(n, k, 1, n);// min=1, the sortedDescB64IntoB6ForMaxPlus1 will limit all

		Seq seq = new Seq();
		reGoWLim0ToMax(n, k, 1, sortedDescB64IntoB6ForMaxPlus1, 0b0L, seq);

		O.l("Adder32.a1=" + Adder32.a1 + O.S32 + CLASS_THIS);

		return seq.trim().ary(false);

	}

}
