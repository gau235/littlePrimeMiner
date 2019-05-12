package lGpl20.comb.selfCallva;

import lGpl20.b32.eqDiv.BigFraction;
import lGpl20.o.O;
import lGpl20.prime64.Ranger;

/**
 * 本類別後退式自己呼叫自己的人.<br/>
 * <br/>
 * To call self backward.
 * 
 * @version 2016/02/28_09:37:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=BackwardSelfCallva_A" >
 *          BackwardSelfCallva_A.java </a>
 * 
 * @see BackwardSelfCallva_C
 */
public abstract class BackwardSelfCallva_A extends SelfCallva {

	private static final Class<BackwardSelfCallva_A> CLASS_THIS = BackwardSelfCallva_A.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 遞迴累加.<br/>
	 * To sum by recursive way.
	 */
	public static long sumByToCallSelfBackward(long n) {

		if (n <= 0L) {

			O.x("n=" + n);

		}

		if (n == 1L) {

			return 1L;

		}

		return n + sumByToCallSelfBackward(n - 1);

	}

	/**
	 * 遞迴累加.<br/>
	 * To sum the inverse BigFraction by recursive way.
	 */
	public static BigFraction sumInverseBigFraction(int n) {

		if (n <= 0) {

			O.x("n=" + n);

		}

		if (n == 1) {

			return BigFraction.$1;

		}

		BigFraction tempBigFraction = new BigFraction(1, n);

		return tempBigFraction.add(sumInverseBigFraction(n - 1));

	}

	/**
	 * 找最大公因數.<br/>
	 * To return the G.C.D.
	 * 
	 * @see Ranger#gcd(long,long)
	 */
	public static long gcdByToCallSelfBackward(long bigNum, long smallNum) {

		if (bigNum <= 0 || smallNum <= 0) {

			O.x("bigNum=" + bigNum + ", smallNum=" + smallNum);

		}

		if (bigNum < smallNum) {

			long temp = bigNum;
			bigNum = smallNum;
			smallNum = temp;

		}

		long remainder = bigNum % smallNum;

		if (remainder == 0) {

			return smallNum;
		}

		return gcdByToCallSelfBackward(smallNum, remainder);

	}

}
