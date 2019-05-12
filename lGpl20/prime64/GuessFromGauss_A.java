package lGpl20.prime64;

import java.io.Serializable;

import lGpl20.o.O;
import lGpl20.o.str.SByN;

/**
 * 學數學家高斯猜輸入兩正整數之間所有質數數目.<br/>
 * <br/>
 * To return guessed number of primes between two input numbers, basing on Gauss's Guess.
 * 
 * @version 2019/04/21_11:00:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=GuessFromGauss_A" >GuessFromGauss_A.java
 *          </a>
 * 
 * @see GuessFromGauss
 */
public abstract class GuessFromGauss_A implements Serializable {

	private static final Class<GuessFromGauss_A> CLASS_THIS = GuessFromGauss_A.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * The bound of guess.<br/>
	 * The bound of guess.
	 */
	public static final int $BOUND32_TO_GUESS_TOTAL_PRIME = 8_000_000;

	/**
	 * 學數學家高斯猜輸入兩正整數之間所有質數數目.<br/>
	 * To return guessed number of primes between two input numbers.
	 * 
	 * @see #range32ToMinePrime(long)
	 */
	public static long guessTotalPrime(long n1, long n2) {

		if (n2 <= $BOUND32_TO_GUESS_TOTAL_PRIME) {// MyThrToPeekAtToCountPrime

			return (int) (((n2 - n1) >>> 2) + 4L);

		}

		final float f32N1 = n1;
		final float f32N2 = n2;

		final float n1DivLogN1 = f32N1 / (float) StrictMath.log1p(f32N1);
		final float n2DivLogN2 = f32N2 / (float) StrictMath.log(f32N2);// f32N2 > lowerBound

		final float n2MinusN1 = f32N2 - f32N1;
		final float log_N2PlusN1_Mul_LogN2 = (float) StrictMath.log(f32N2 + f32N1) * (float) StrictMath.log(f32N2);
		final float paramToFix = 405f;

		final float nOfPrime = n2DivLogN2 - n1DivLogN1 + (n2MinusN1 / log_N2PlusN1_Mul_LogN2) + paramToFix;

		// l("from=" + n1 + S32 + "guess " + (long) nOfPrime + S32 + CLASS_THIS);

		return (long) nOfPrime;

	}

	/**
	 * 學數學家高斯猜輸入兩正整數之間所有質數數目.<br/>
	 * To return guessed number of primes between two input numbers.
	 * 
	 * @see #range32ToMinePrime(long)
	 */
	public static int guessTotalPrimeNRetInt32(long n1, long n2) {

		if (n2 <= $BOUND32_TO_GUESS_TOTAL_PRIME) {

			return (int) (((n2 - n1) >>> 2) + 4L);

		}

		final float f32N1 = n1;
		final float f32N2 = n2;

		final float n1DivLogN1 = f32N1 / (float) StrictMath.log1p(f32N1);
		final float n2DivLogN2 = f32N2 / (float) StrictMath.log(f32N2);// f32N2 > lowerBound

		final float n2MinusN1 = f32N2 - f32N1;
		final float log_N2PlusN1_Mul_LogN2 = (float) StrictMath.log(f32N2 + f32N1) * (float) StrictMath.log(f32N2);
		final float paramToFix = 169f;

		final float nOfPrime = n2DivLogN2 - n1DivLogN1 + (n2MinusN1 / log_N2PlusN1_Mul_LogN2) + paramToFix;

		// l("from=" + n1 + S32 + "guess " + (long) nOfPrime + S32 + CLASS_THIS);

		return (int) nOfPrime;

	}

	/**
	 * 計算出每一次要測試的質數有多少個.<br/>
	 * How many tests it needs to test a num?<br/>
	 * N / lnN
	 * 
	 * @see #guessTotalPrimeNRetInt32(long, long)
	 */
	public static int nOfTestToBuildPrimeAry(long num) {

		float root2OfNum = (float) StrictMath.sqrt(num);

		float numOfTest = root2OfNum / (float) StrictMath.log1p(root2OfNum);

		float range = Ranger.$INT32_OF_TO_ACCESS_ARY_N_MOD / numOfTest;

		return (int) range;

	}

	/**
	 * 計算出每一次要找質數的區間有多長; 假設 n1 近似 n2.<br/>
	 * To calculate the range (a number) for computing one time.
	 * 
	 * @see #guessTotalPrimeNRetInt32(long, long)
	 */
	public static int range32ToMinePrime(long n1) {

		// if (n1 < 4_000L) {
		//
		// n1 = 4_000L;
		//
		// }

		long tempN2 = n1 + 4_000L;

		float avgOfRoot2 = ((float) StrictMath.sqrt(n1) + (float) StrictMath.sqrt(tempN2)) / 2F;

		// l("avgOfRoot2=" + avgOfRoot2 + S32 + CLASS_THIS);

		float numOfTest = avgOfRoot2 / (float) StrictMath.log(avgOfRoot2);

		// l("numOfTest=" + numOfTest + S32 + CLASS_THIS);

		float range = Ranger.$INT32_OF_TO_ACCESS_ARY_N_MOD / numOfTest;

		if (tempN2 < Ranger.$2POW31_MINUS1) {

			range = range * 2.3f;

		}

		int range32 = (int) range;

		// l("range32ToMinePrime=" + SByN.f(range32) + S32 + S32 + "n1=" + SByN.f(n1) + S32 + S32 +
		// CLASS_THIS);

		if (range32 > Ranger.$MAX_RANGE32_TO_MINE_PRIME) {

			return Ranger.$MAX_RANGE32_TO_MINE_PRIME;

		}

		if (range32 < Ranger.$MIN_RANGE32_TO_MINE_PRIME) {

			return Ranger.$MIN_RANGE32_TO_MINE_PRIME;

		}

		// range32 = range32 / Ranger.$MIN_RANGE32_TO_MINE_PRIME * Ranger.$MIN_RANGE32_TO_MINE_PRIME;
		// l("range32ToMinePrime=" + SByN.f(range32) + S32 + S32 + "n1=" + SByN.f(n1) + S32 + S32 +
		// CLASS_THIS);
		// return range32;

		return range32 / Ranger.$MIN_RANGE32_TO_MINE_PRIME * Ranger.$MIN_RANGE32_TO_MINE_PRIME;

	}

	/**
	 * 計算出每 1 次要找質數的區間有多長.<br/>
	 * To calculate the range (a number) for computing one time.
	 * 
	 * @see #bigRange32ForThrToCountPrime(long)
	 */
	public static int bigRange32ForThrToMinePrime(long n1) {

		// int range32 = range32ToMinePrime(n1) * 8;
		int range32 = range32ToMinePrime(n1) * 10;

		if (range32 > Ranger.$MAX_BIG_RANGE32_FOR_THR_TO_MINE_PRIME) {

			return Ranger.$MAX_BIG_RANGE32_FOR_THR_TO_MINE_PRIME;

		}

		if (range32 < Ranger.$MIN_BIG_RANGE32_FOR_THR_TO_MINE_PRIME) {

			return Ranger.$MIN_BIG_RANGE32_FOR_THR_TO_MINE_PRIME;

		}

		O.l("bigRange32ToMinePrime=" + SByN.f(range32) + O.S32 + "n1=" + SByN.f(n1) + O.S32 + CLASS_THIS);

		return range32 / Ranger.$MIN_BIG_RANGE32_FOR_THR_TO_MINE_PRIME * Ranger.$MIN_BIG_RANGE32_FOR_THR_TO_MINE_PRIME;

	}

	/**
	 * 計算出每一次要找質數的區間有多長.<br/>
	 * To calculate the range(a number) for computing one time.
	 * 
	 * @see #guessTotalPrimeNRetInt32(long, long)
	 */
	public static int range32ToCountPrime(long n1) {

		int range32 = (range32ToMinePrime(n1) * 3) >>> 1;

		if (range32 > Ranger.$MAX_RANGE32_TO_MINE_PRIME) {

			return Ranger.$MAX_RANGE32_TO_MINE_PRIME;

		}

		if (range32 < Ranger.$MIN_RANGE32_TO_MINE_PRIME) {

			return Ranger.$MIN_RANGE32_TO_MINE_PRIME;

		}

		return range32 / Ranger.$MIN_RANGE32_TO_MINE_PRIME * Ranger.$MIN_RANGE32_TO_MINE_PRIME;

	}

	/**
	 * 計算出每 1 次要找質數的數目的區間有多長.<br/>
	 * To calculate the range (a number) for computing one time.
	 * 
	 * @see #bigRange32ForThrToMinePrime(long)
	 */
	public static int bigRange32ForThrToCountPrime(long n1) {

		int bigRange32 = bigRange32ForThrToMinePrime(n1) << 1;

		if (bigRange32 > Ranger.$MAX_BIG_RANGE32_FOR_THR_TO_COUNT_PRIME) {

			O.l("bigRange32ForThrToCountPrime=" + SByN.f(Ranger.$MAX_BIG_RANGE32_FOR_THR_TO_COUNT_PRIME) + O.S32 + "n1=" + n1
					+ O.S32 + CLASS_THIS);

			return Ranger.$MAX_BIG_RANGE32_FOR_THR_TO_COUNT_PRIME;

		}

		if (bigRange32 < Ranger.$MIN_BIG_RANGE32_FOR_THR_TO_COUNT_PRIME) {

			O.l("bigRange32ForThrToCountPrime=" + SByN.f(Ranger.$MIN_BIG_RANGE32_FOR_THR_TO_COUNT_PRIME) + O.S32 + "n1=" + n1
					+ O.S32 + CLASS_THIS);

			return Ranger.$MIN_BIG_RANGE32_FOR_THR_TO_COUNT_PRIME;

		}

		O.l("bigRange32ForThrToCountPrime=" + SByN.f(bigRange32) + O.S32 + "n1=" + n1 + O.S32 + CLASS_THIS);

		return bigRange32 / Ranger.$MIN_BIG_RANGE32_FOR_THR_TO_COUNT_PRIME * Ranger.$MIN_BIG_RANGE32_FOR_THR_TO_COUNT_PRIME;

	}

}
