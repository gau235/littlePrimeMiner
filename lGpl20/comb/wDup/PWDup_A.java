package lGpl20.comb.wDup;

import java.io.Serializable;

import lGpl20.comb.Pva;
import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.o.O;
import lGpl20.shareWXyz.ShWGo;

/**
 * @version 2019/04/07_15:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=PWDup_A" >PWDup_A.java</a>
 *
 * @see PWDup_B
 */
public abstract class PWDup_A implements Serializable {

	private static final Class<PWDup_A> CLASS_THIS = PWDup_A.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 6!/(1!*2!*3!)<br/>
	 * 6!/(1!*2!*3!)
	 */
	public static long factorialNDiv(final long factorialOfK, long b64IntoB6OfQtyPlus1) {

		long ans = factorialOfK;
		int val32;

		do {

			val32 = (((int) b64IntoB6OfQtyPlus1) & B64IntoB6.MASK32) - 1;
			// O.l("val32=" + val32 + O.S32 + CLASS_THIS);

			if (val32 > 1) {

				ans = ans / Pva.int64(val32);

			}

		} while ((b64IntoB6OfQtyPlus1 = b64IntoB6OfQtyPlus1 >>> B64IntoB6.$6) != 0b0L);

		// O.l("ans=" + ans + O.S32 + CLASS_THIS);
		return ans;

	}

	/**
	 * To permutate with duplicated char.<br/>
	 * To permutate with duplicated char.
	 */
	public static long int64ByToShW(int k, int lenOfDistinctCharAry, long b64IntoB6OfQtyPlus1) {

		long[] ary = ShWGo.goWLim0ToMax(k, lenOfDistinctCharAry, b64IntoB6OfQtyPlus1);
		final long factorialOfK = Pva.int64(k);

		long ans = 0L;

		for (int i = 0; i != ary.length; i++) {

			ans = ans + factorialNDiv(factorialOfK, ary[i]);

		}

		return ans;

	}

}
