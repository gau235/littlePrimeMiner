package lGpl20.prime64;

import java.math.BigInteger;

import lGpl20.o.O;

/**
 * @version 2017/06/07_06:50:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Ranger_Z" >Ranger_Z.java</a>
 * 
 * @see Ranger
 */
public abstract class Ranger_Z extends Ranger_R {

	private static final Class<Ranger_Z> CLASS_THIS = Ranger_Z.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 檢查是否超出界限.<br/>
	 * To check if it is between.
	 */
	public static void checkBetween(long from, long to, long originFrom, long originTo) {

		if (!(from <= to) || !(originFrom <= originTo)) {

			O.x();

		}

		if (!(originFrom <= from) || !(to <= originTo)) {

			O.x();

		}

	}

	/**
	 * 檢查是否超出界限.<br/>
	 * To check if it is between.
	 */
	public static void checkExactBetween(long from, long to, long originFrom, long originTo) {

		if (!(from <= to) || !(originFrom <= originTo)) {

			O.x();

		}

		if (!(originFrom < from) || !(to < originTo)) {

			O.x();

		}

	}

	/**
	 * 檢查是否超出界限.<br/>
	 * To check if it is between.
	 */
	public static void checkBetween(long num, long originFrom, long originTo) {

		if (!(originFrom <= originTo)) {

			throw new IllegalArgumentException("originFrom=" + originFrom + ", originTo=" + originTo);

		}

		if (!(originFrom <= num) || !(num <= originTo)) {

			throw new IllegalArgumentException("num=" + num + ", originFrom=" + originFrom + ", originTo=" + originTo);

		}

	}

	/**
	 * 檢查是否超出界限.<br/>
	 * To check if it is between.
	 */
	public static void checkExactBetween(long num, long originFrom, long originTo) {

		if (!(originFrom <= originTo)) {

			throw new IllegalArgumentException("originFrom=" + originFrom + ", originTo=" + originTo);

		}

		if (!(originFrom < num) || !(num < originTo)) {

			throw new IllegalArgumentException("num=" + num + ", originFrom=" + originFrom + ", originTo=" + originTo);

		}

	}

	/**
	 * 運算並檢查是否超出界限 (Fr64).<br/>
	 * To calculate and to check if out of bound.
	 * 
	 * @throws ArithmeticException
	 */
	public static long calculateNCheckOutOfBound(long n1, long n2, long numAsType) {// Fr64

		if (numAsType == TYPE_ADD) {

			long sum = n1 + n2;

			if (sum >= 0) {

				return sum;
			}

			throw new ArithmeticException(n1 + O.S32 + O.S43 + O.S32 + n2 + "out of bound");

		}

		if (numAsType == TYPE_MUL) {

			if (n1 <= $ROOT2_OF_2POW63_MINUS1 && n2 <= $ROOT2_OF_2POW63_MINUS1) {

				return n1 * n2;

			} else {

				BigInteger big1 = BigInteger.valueOf(n1);
				BigInteger big2 = BigInteger.valueOf(n2);

				BigInteger big3 = big1.multiply(big2);

				long prod = big3.longValue();

				if (prod == n1 * n2) {

					return prod;

				}

				throw new ArithmeticException(n1 + O.S32 + O.S42 + O.S32 + n2 + "out of bound");

			}

		}

		throw new ArithmeticException("out of bound when to calculate Fr64");

	}

	/**
	 * 檢查參數合法性.<br/>
	 * Is the argument legal?
	 */
	public static void checkArg(long n1, long n2, int numOfThr, long id) {

		if (id == Miner.ID_TO_MINE_PRIME || id == Miner.ID_TO_MINE_PRIME_W_1_ERY_OF_PRIME_ARY) {

			checkBetween(n1, 1, n2);
			checkBetween(n2, n1, Miner.currMaxIntToTest());

			if (numOfThr < 1) {

				O.x();

			}

		}

	}

	/**
	 * 計算出已經找到的質數的比例.<br/>
	 * To calculate the percent.
	 */
	public static int countPercent(long currN, long n1, long n2MinusN1) {

		if (currN < 0) {

			return $100_INT32;// fuck

		}

		// try {

		int percentage = (int) (((currN - n1) * $100) / n2MinusN1);

		// O.l("percentage=" + percentage + O.S37 + O.S32 + CLASS_THIS);

		if (percentage < $100_INT32 /* && percentage > PROGRBAR.getValue() */) {

			return percentage;

		}

		// } catch (ArithmeticException arithmeticException) {

		// return 0;

		// }

		return $100_INT32 - 1;

	}

	/**
	 * 計算出已經找到的質數的比例.<br/>
	 * To calculate the percent.
	 */
	public static int countPercent(long currN, long tailN) {

		if (currN < 0) {

			return $100_INT32;// fuck

		}

		// try {

		int percentage = (int) ((currN * $100) / tailN);

		// O.l("percentage=" + percentage + O.S37 + O.S32 + CLASS_THIS);

		if (percentage < $100_INT32 /* && percentage > PROGRBAR.getValue() */) {

			return percentage;

		}

		// } catch (ArithmeticException arithmeticException) {

		// return 0;

		// }

		return $100_INT32 - 1;

	}

}
