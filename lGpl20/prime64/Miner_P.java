package lGpl20.prime64;

import lGpl20.o.O;

/**
 * @version 2017/03/06_15:13:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Miner_P" >Miner_P.java</a>
 * 
 * @see Miner_R
 */
public abstract class Miner_P extends Miner_J {

	private static final Class<Miner_P> CLASS_THIS = Miner_P.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 找出輸入兩正整數之間所含質數數目.<br/>
	 * To count the number of primes between n1 and n2.<br/>
	 * If n1 is 1, then it will be π(n2)
	 * 
	 * @see #testPrime(long)
	 * 
	 * @see #testPrime32(int)
	 */
	public static int countPrime(long n1, long n2) {// fuck, return int32

		// Ranger.checkBetween(n1, 1, n2);

		int count32 = 0;

		if (n1 <= Ranger.$3) {

			if (n2 <= Ranger.$3) {

				for (; n1 <= n2; n1++) {

					if (n1 == MIN_NAT_PRIME || n1 == Ranger.$3_INT32) {

						count32++;

					}

				}

			} else {// n2 > 3

				for (; n1 <= Ranger.$3; n1++) {

					if (n1 == MIN_NAT_PRIME || n1 == Ranger.$3_INT32) {

						count32++;

					}

				}

			}

		}

		n1 = n1 | 0b1L;// important, 4 ~ 4 will not do

		if (n2 < Ranger.$2POW31_MINUS1) {

			int n1_32 = (int) n1;
			int n2_32 = (int) n2;
			for (; n1_32 <= n2_32; n1_32 = n1_32 + Ranger.$2_INT32) {

				if (testPrime32(n1_32)) {

					count32++;

				}

			}

		} else {

			for (; n1 <= n2; n1 = n1 + Ranger.$2) {

				if (testPrime(n1)) {

					count32++;

				}

			}

		}

		return count32;

	}

	/**
	 * 找出從 2^63 到 num (含端點) 所含質數.<br/>
	 * To mine prime from 2^63 down to num (both inclusive).
	 * 
	 * @see #mineNRetAry(long, long)
	 */
	public static long[] mineFrom2Pow63DownTo(long num) {

		long endP = Ranger.$MAX_PRIME_LESS_THAN_2POW63;

		int lenByGuess = GuessFromGauss.guessTotalPrimeNRetInt32(num, endP);

		long[] retAry = new long[lenByGuess];

		int iToCarry = 0;

		for (; endP >= num; endP = endP - Ranger.$2) {

			if (testPrime(endP)) {

				retAry[iToCarry++] = endP;

			}

		}

		return O.trimTailAll0(retAry);

	}

}
