package lGpl20.comb.stirlingNum3;

import java.math.BigInteger;

import lGpl20.comb.Cva;
import lGpl20.comb.Pva;
import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.comb.filter.Condi;
import lGpl20.comb.stirlingNum2.S2va_Z;
import lGpl20.divIntoHeap.DiIGo;
import lGpl20.o.O;

/**
 * Lah numbers.<br/>
 * Stirling number of the third kind.<br/>
 * Lah numbers.<br/>
 * <br/>
 * 简称: 5 人排 3 队.
 * 
 * @version 2018/04/09_21:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=S3va_A" >S3va_A.java</a>
 * 
 * @see S3va_B
 */
public abstract class S3va_A extends S2va_Z {

	private static final Class<S3va_A> CLASS_THIS = S3va_A.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To divide into then to permutate.<br/>
	 * To divide into then to permutate.
	 * 
	 * @see #bigIntByToDiI(Condi)
	 */
	public static long int64ByToDiI(Condi condi) {

		final int diff32 = condi.min - 1;// reduced for performance
		long[] ary = DiIGo.go(condi.n, condi.k, condi.min, condi.max);// reduced for performance

		long ans = 0L;
		long tempAns;

		long b64IntoB6ForC;
		long b64IntoB6Dup;
		long b64IntoB6CountDup;

		int restN = condi.n;
		int val32;
		for (int iAry = 0; iAry != ary.length;) {

			b64IntoB6ForC = B64IntoB6.revAgainstB6FromR(ary[iAry]);
			b64IntoB6Dup = b64IntoB6ForC;

			// O.l("b64IntoB6ForC=" + B32va.str24((int) b64IntoB6ForC));

			tempAns = 1L;

			while (b64IntoB6ForC != 0b0L) {

				val32 = ((int) b64IntoB6ForC) & B64IntoB6.MASK32;
				val32 = val32 + diff32;
				// O.l("restN, temp32=" + restN + "," + temp32);
				tempAns = tempAns * Pva.int64(restN, val32);
				restN = restN - val32;
				b64IntoB6ForC = b64IntoB6ForC >>> B64IntoB6.$6;

			}

			// O.l("sortedB64IntoB6Dup =" + O.L + B64IntoB6.str24(b64IntoB6Dup) + O.S32 + CLASS_THIS);
			// O.l("min=" + ((int) b64IntoB6Dup & b64IntoB6Dup.$6_1_OF_32BIT) + O.S32 + CLASS_THIS);
			// O.l("max=" + B64IntoB6.leftestFromR(b64IntoB6Dup) + O.S32 + CLASS_THIS);

			b64IntoB6CountDup = B64IntoB6.countDup(b64IntoB6Dup);
			b64IntoB6CountDup = B64IntoB6.revAgainstB6FromR(b64IntoB6CountDup);// important for performance
			// O.l("b64IntoB6CountDup=" + O.L + B64IntoB6.str24(b64IntoB6CountDup) + O.S32 + CLASS_THIS);

			while (b64IntoB6CountDup != 0b0L) {

				tempAns = tempAns / Pva.int64(((int) b64IntoB6CountDup) & B64IntoB6.MASK32);

				b64IntoB6CountDup = b64IntoB6CountDup >>> B64IntoB6.$6;

			}

			// O.l("tempAns=" + tempAns + O.S32 + CLASS_THIS);
			if (++iAry < ary.length) {

				restN = condi.n;

			}

			ans = ans + tempAns;
			// O.l("ans=" + ans + O.S32 + CLASS_THIS);

		}

		return ans;

	}

	/**
	 * To divide into then to permutate.<br/>
	 * To divide into then to permutate.
	 * 
	 * @see #int64ByToDiI(Condi)
	 */
	public static BigInteger bigIntByToDiI(Condi condi) {

		final int diff32 = condi.min - 1;
		long[] ary = DiIGo.go(condi.n, condi.k, condi.min, condi.max);

		BigInteger ans = BigInteger.ZERO;
		BigInteger tempAns;

		long b64IntoB6ForC;
		long b64IntoB6Dup;
		long b64IntoB6CountDup;

		int restN = condi.n;
		int val32;
		for (int iAry = 0; iAry != ary.length;) {

			b64IntoB6ForC = B64IntoB6.revAgainstB6FromR(ary[iAry]);
			b64IntoB6Dup = b64IntoB6ForC;

			// O.l("b64IntoB6ForC=" + B32va.str24((int) b64IntoB6ForC));

			tempAns = BigInteger.ONE;

			while (b64IntoB6ForC != 0b0L) {

				val32 = (int) b64IntoB6ForC & B64IntoB6.MASK32;
				val32 = val32 + diff32;
				// O.l("restN, temp32=" + restN + "," + temp32);
				tempAns = tempAns.multiply(Pva.bigInt(restN, val32));
				restN = restN - val32;
				b64IntoB6ForC = b64IntoB6ForC >>> B64IntoB6.$6;

			}

			// O.l("sortedB64IntoB6Dup =" + O.L + B64IntoB6.str24(b64IntoB6Dup) + O.S32 + CLASS_THIS);
			// O.l("min=" + ((int) b64IntoB6Dup & b64IntoB6Dup.$6_1_OF_32BIT) + O.S32 + CLASS_THIS);
			// O.l("max=" + B64IntoB6.leftestFromR(b64IntoB6Dup) + O.S32 + CLASS_THIS);

			b64IntoB6CountDup = B64IntoB6.countDup(b64IntoB6Dup);
			b64IntoB6CountDup = B64IntoB6.revAgainstB6FromR(b64IntoB6CountDup);// important for performance
			// O.l("b64IntoB6CountDup=" + O.L + B64IntoB6.str24(b64IntoB6CountDup) + O.S32 + CLASS_THIS);

			while (b64IntoB6CountDup != 0b0L) {

				tempAns = tempAns.divide(Pva.bigInt(((int) b64IntoB6CountDup) & B64IntoB6.MASK32));

				b64IntoB6CountDup = b64IntoB6CountDup >>> B64IntoB6.$6;

			}

			if (++iAry < ary.length) {

				restN = condi.n;

			}

			ans = ans.add(tempAns);
			// O.l("ans=" + ans + O.S32 + CLASS_THIS);

		}

		return ans;

	}

	/**
	 * Stirling number of the third kind.<br/>
	 * S3(n,k) = C(n-1,k-1)*n!/k!
	 */
	public static long int64ByLah(int n, int k) {

		if (n <= 0 || k <= 0 || n < k) {

			O.x("n=" + n + ", k=" + k);

		}

		if (k == 1) {

			return Pva.int64(n);

		}

		// return Cva.cInt64(n - 1, k - 1) * (Pva.pInt64(n-k));
		return Cva.int64(n - 1, k - 1) * (Pva.int64(n) / Pva.int64(k));

	}

	/**
	 * Stirling number of the third kind.<br/>
	 * S3(n,k) = C(n-1,k-1)*n!/k!
	 */
	public static BigInteger bigIntByLah(int n, int k) {

		if (n <= 0 || k <= 0 || n < k) {

			O.x("n=" + n + ", k=" + k);

		}

		if (k == 1) {

			return Pva.bigInt(n);

		}

		return Cva.bigInt(n - 1, k - 1).multiply(Pva.bigInt(n).divide(Pva.bigInt(k)));

	}

	/**
	 * To divide into then to permutate.<br/>
	 * To divide into then to permutate.
	 * 
	 * @see #int64ByToDiI(Condi)
	 */
	public static long int64SumToKWLim(Condi condi) {

		final int endK = condi.k;

		Condi clonedConi = condi.clone();
		clonedConi.min = 1;// fuck

		long ans = 0L;

		for (int k = 1; k <= endK; k++) {

			clonedConi.k = k;
			ans = ans + int64ByToDiI(clonedConi);

		}

		return ans;

	}

	/**
	 * To divide into then to permutate.<br/>
	 * To divide into then to permutate.
	 * 
	 * @see #int64ByToDiI(Condi)
	 */
	public static BigInteger bigIntSumToKWLim(Condi condi) {

		final int endK = condi.k;

		Condi clonedConi = condi.clone();
		clonedConi.min = 1;// fuck

		BigInteger ans = BigInteger.ZERO;

		for (int k = 1; k <= endK; k++) {

			clonedConi.k = k;
			ans = ans.add(bigIntByToDiI(clonedConi));

		}

		return ans;

	}

}
