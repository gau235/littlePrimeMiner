package lGpl20.shareWXyz;

import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.comb.filter.Adder32;
import lGpl20.divIntoHeap.DiIGo;
import lGpl20.o.O;

/**
 * @version 2019/04/11_22:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=ShWAns_R" >ShWAns_R.java</a>
 *
 * @see ShWAns
 */
public abstract class ShWAns_R extends ShWAns_H {

	private static final Class<ShWAns_R> CLASS_THIS = ShWAns_R.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 即 n 個相同物品分成給 k 人, 每人最少 1 個.<br/>
	 * To return the number of ways to share several identical items with every person. int k as termination condition.
	 */
	public static long reInt64WLim0ToMax(int n, int k, final int min, final long b64IntoB6ForMaxPlus1, long prefix) {

		Adder32.a1++;

		if (k == 1) {

			if (n <= (((int) b64IntoB6ForMaxPlus1) & B64IntoB6.MASK32)) {// need to be limited by bound32Max

				return 1L;

			}

			return 0L;

		}

		final int newK = k - 1;

		// note: get every max from leftmost
		final int currMax = ((int) (b64IntoB6ForMaxPlus1 >>> (B64IntoB6.$6 * newK))
				& B64IntoB6.MASK32); // B64IntoB6.at();

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

		long ans = 0L;

		for (int val32 = predictedMin; val32 <= predictedMax; val32++) {

			newN = n - val32;

			newPrefix = (prefix << B64IntoB6.$6) | (long) val32;

			ans = ans + reInt64WLim0ToMax(newN, newK, min, b64IntoB6ForMaxPlus1, newPrefix);

		}

		return ans;

	}

	/**
	 * 即 n 個相同物品分成給 k 人, 每人最少 1 個.<br/>
	 * To return the number of ways to share several identical items with every person.
	 * 
	 * @see ShWGo#goWLim0ToMax(int, int, long)
	 */
	public static long int64WLim0ToMax(int n, int k, long sortedB64IntoB6ForMaxPlus1) {// min must be 0

		Adder32.a1 = 0;

		// O.l("sortedB64IntoB6ForMaxPlus1=" + O.L + B64IntoB6.str24(sortedB64IntoB6ForMaxPlus1) + O.S32 + CLASS_THIS);
		// sortedB64IntoB6ForMaxPlus1 = B64IntoB6.revAgainstB6NShiftR(sortedB64IntoB6ForMaxPlus1);// important

		n = n + k;// min==0

		DiIGo.checkArg(n, k, 1, n);// min=1, the sortedB64IntoB6ForMaxPlus1 will limit all; must be DiIGo

		long ans = reInt64WLim0ToMax(n, k, 1, sortedB64IntoB6ForMaxPlus1, 0b0L);

		O.l("Adder32.a1=" + Adder32.a1 + O.S32 + CLASS_THIS);

		return ans;

	}

}
