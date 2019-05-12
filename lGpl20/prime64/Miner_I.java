package lGpl20.prime64;

import lGpl20.o.O;

/**
 * @version 2017/04/17_16:50:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Miner_I" >Miner_I.java</a>
 * 
 * @see Miner_J
 */
public abstract class Miner_I extends Miner_G {

	private static final Class<Miner_I> CLASS_THIS = Miner_I.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 根據內建 oriAryOfPrime 檢驗此奇數 (大於等於 5) 是否為質數.<br/>
	 * To test if the natureOddNum (great than or equal to 5) is a prime by the inside oriAryOfPrime.
	 * 
	 * @see #testPrime(long)
	 */
	public static boolean testPrime32(int natOddNum) {

		int divisor = Ranger.$3_INT32;
		int iAryOfPrime = 2;// important
		final int root2 = (int) StrictMath.sqrt(natOddNum);

		do {

			if (natOddNum % divisor == 0) {

				return false;

			}

		} while ((divisor = (int) oriAryOfPrime[iAryOfPrime++]) <= root2);

		return true;

	}

	/**
	 * 根據內建 oriAryOfPrime 檢驗此奇數 (大於等於 5) 是否為質數.<br/>
	 * To test if the natureOddNum (great than or equal to 5) is a prime by the inside oriAryOfPrime.
	 * 
	 * @see #testPrime32(int)
	 */
	public static boolean testPrime(long natOddNum) {

		long divisor = Ranger.$3;
		int iAryOfPrime = 2;// important
		final long root2 = (long) StrictMath.sqrt(natOddNum);

		do {

			if (natOddNum % divisor == 0L) {

				return false;

			}

		} while ((divisor = oriAryOfPrime[iAryOfPrime++]) <= root2);

		return true;

	}

	// /**
	// * 根據內建 oriAryOfPrime 檢驗此奇數 (大於等於 5) 是否為質數.<br/>
	// * To test if the natureOddNum (great than or equal to 5) is a prime by the inside oriAryOfPrime.
	// *
	// * @see #testPrime32(int)
	// */
	// public static boolean testPrimeFrom13(long natureOddNum) {
	//
	// long divisor = Ranger.$3;
	// int iAryOfPrime = 6;// important
	// final long root2 = (long) StrictMath.sqrt(natureOddNum);
	//
	// do {
	//
	// if (natureOddNum % divisor == 0L) {
	//
	// return false;
	//
	// }
	//
	// } while ((divisor = oriAryOfPrime[iAryOfPrime++]) <= root2);
	//
	// return true;
	//
	// }

}
