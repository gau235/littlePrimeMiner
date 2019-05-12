package lGpl20.prime64;

import java.util.Arrays;

import lGpl20.o.O;
import lGpl20.o.ery.Seq;

/**
 * @version 2019/04/22_16:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Miner_R" >Miner_R.java</a>
 * 
 * @see Miner_T
 */
public abstract class Miner_R extends Miner_P {

	private static final Class<Miner_R> CLASS_THIS = Miner_R.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 此兩正整數之間 (含端點 ) 含有質數 ?<br/>
	 * from 必須大於等於 3.<br/>
	 * Is there any prime between from and to (both inclusive)?<br/>
	 * Note: The from must be greater than or equal to 3.
	 */
	public static boolean isAnyPrimeWithin(long from, long to) {

		// Ranger.checkBetween(from, Ranger.$3, to);

		from = from | 0b1L;// important, 4 ~ 4 will not do

		if (to < Ranger.$2POW31_MINUS1) {

			int from32 = (int) from;
			int to32 = (int) to;
			for (; from32 <= to32; from32 = from32 + Ranger.$2_INT32) {

				if (testPrime32(from32)) {

					return true;

				}

			}

		} else {

			for (; from <= to; from = from + Ranger.$2) {

				if (testPrime(from)) {

					return true;

				}

			}

		}

		return false;

	}

	/**
	 * To get the index of n.<br/>
	 * To get the index of n.
	 */
	public static int indexOfP(long n) {

		return Arrays.binarySearch(oriAryOfPrime, n);

	}

	/**
	 * 對 n 做質因數分解, n 必須大於 1.<br/>
	 * To decomposite the int64.<br/>
	 * The process of expressing a number as a product of its prime factors is called prime factor decomposition.
	 */
	public static long[] decompo(long n) {

		if (n <= Ranger.$MIN_TEST_INT) {

			O.x();

		}

		int iAryOfPrime = 0;

		Seq seq = new Seq();

		for (long pow = 0, divisor = oriAryOfPrime[iAryOfPrime], root2 = (long) StrictMath.sqrt(n); divisor <= root2;) {

			while (n % divisor == 0) {

				pow++;
				n = n / divisor;
				root2 = (long) StrictMath.sqrt(n);

				seq.a(divisor);

			}

			if (pow > 0) {

				pow = 0;

			}

			divisor = oriAryOfPrime[++iAryOfPrime];

		}

		if (n > 1) {

			seq.a(n);

		}

		return seq.trim().ary(false);

	}

	/**
	 * 對 n 做質因數分解, n 必須大於 1.<br/>
	 * To decomposite the int64.<br/>
	 * The process of expressing a number as a product of its prime factors is called prime factor decomposition.
	 */
	public static StringBuilder decompoNRetStr(long n) {

		if (n <= Ranger.$MIN_TEST_INT) {

			O.x();

		}

		int iAryOfPrime = 0;

		StringBuilder str = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		for (long pow = 0, divisor = oriAryOfPrime[iAryOfPrime], root2 = (long) StrictMath.sqrt(n); divisor <= root2;) {

			while (n % divisor == 0) {

				pow++;
				n = n / divisor;
				root2 = (long) StrictMath.sqrt(n);

				str.append(divisor).append(O.C42);

			}

			if (pow > 0) {

				pow = 0;

			}

			divisor = oriAryOfPrime[++iAryOfPrime];

		}

		// O.l("n=" + n + O.S32 + CLASS_THIS);

		if (n > 1) {

			str.append(n);

		} else {

			int lenOfStr = str.length();
			if (lenOfStr > 1) {

				str.delete(lenOfStr - 1, lenOfStr);

			}

		}

		return str;

	}

}
