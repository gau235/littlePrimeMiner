package lGpl20.prime64;

import lGpl20.o.O;
import lGpl20.o.ery.Aryva;
import lGpl20.o.str.SByN;

/**
 * @version 2017/06/03_19:17:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Miner_J" >Miner_J.java</a>
 * 
 * @see Miner_P
 */
public abstract class Miner_J extends Miner_I {

	private static final Class<Miner_J> CLASS_THIS = Miner_J.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 找出輸入兩正整數之間所含質數, 裝入陣列回傳.<br/>
	 * To mine all primes between n1 and n2(both inclusive).
	 * 
	 * @see #mineNRetAry(long, long)
	 */
	public static long[] mineWFitLenAry(long n1, long n2) {

		// O.l("n1=" + SByN.f(n1) + O.L + "n2=" + SByN.f(n2) + O.S32 + CLASS_THIS);

		int lenByGuess = GuessFromGauss.guessTotalPrimeNRetInt32(n1, n2);

		long[] retAry = new long[lenByGuess];

		int iToCarry = 0;

		if (n1 <= Ranger.$3) {

			if (n2 <= Ranger.$3) {

				for (; n1 <= n2; n1++) {

					if (n1 == MIN_NAT_PRIME || n1 == Ranger.$3_INT32) {

						retAry[iToCarry++] = n1;

					}

				}

			} else { // n2 > 3

				for (; n1 <= Ranger.$3; n1++) {

					if (n1 == MIN_NAT_PRIME || n1 == Ranger.$3_INT32) {

						retAry[iToCarry++] = n1;

					}

				}

			}

		}

		n1 = n1 | 0b1L;// important, 4 ~ 4 will not do

		if (n2 < Ranger.$2POW31_MINUS1) {

			int n1_32 = (int) n1;
			int n2_32 = (int) n2;
			for (; n1_32 <= n2_32; n1_32 += Ranger.$2_INT32) {

				if (testPrime32(n1_32)) {

					if (iToCarry == lenByGuess) {

						O.l("aryIndexOver:" + O.L + "n1=" + SByN.f(n1) + O.L + "n2=" + SByN.f(n2_32) + O.S32 + CLASS_THIS);

						// retAry = Aryva.extAryToLen32(retAry, retAry.length + (retAry.length >>> 6));

						long[] newRetAry = new long[lenByGuess + (lenByGuess >>> 6)];
						System.arraycopy(retAry, 0, newRetAry, 0, lenByGuess);

						O.l("old len=" + SByN.f(lenByGuess) + O.L + "new len=" + SByN.f(newRetAry.length) + O.S32 + CLASS_THIS);

						lenByGuess = newRetAry.length;// maybe we have next time
						retAry = newRetAry;

					}

					retAry[iToCarry++] = n1_32;

				}

			}

		} else {

			for (; n1 <= n2; n1 = n1 + Ranger.$2) {

				// if ((n1 % 3L != 0L) && (n1 % 5L != 0L) && (n1 % 7L != 0L) && (n1 % 11L != 0L) && (n1 % 13L != 0L)
				// && testPrimeFrom13(n1)) {
				if (testPrime(n1)) {

					if (iToCarry == lenByGuess) {

						O.l("aryIndexOver:" + O.L + "n1=" + SByN.f(n1) + O.L + "n2=" + SByN.f(n2) + O.S32 + CLASS_THIS);

						// retAry = Aryva.extAryToLen32(retAry, retAry.length + (retAry.length >>> 6));

						long[] newRetAry = new long[lenByGuess + (lenByGuess >>> 6) + 64];// fuck
						System.arraycopy(retAry, 0, newRetAry, 0, lenByGuess);

						O.l("old len=" + SByN.f(lenByGuess) + O.L + "new len=" + SByN.f(newRetAry.length) + O.S32 + CLASS_THIS);

						lenByGuess = newRetAry.length;// maybe we have next time
						retAry = newRetAry;

					}

					retAry[iToCarry++] = n1;

				}

			}

		}

		return O.trimTailAll0(retAry);

	}

	/**
	 * 找出輸入兩正整數之間所含質數, 裝入陣列回傳.<br/>
	 * To mine all primes between n1 and n2(both inclusive).
	 * 
	 * @see #mineWFitLenAry(long, long)
	 */
	public static long[] mineNRetAry(long n1, long n2) {

		int lenByGuess = GuessFromGauss.guessTotalPrimeNRetInt32(n1, n2);

		long[] retAry = new long[lenByGuess];

		int iToCarry = 0;

		if (n1 <= Ranger.$3) {

			if (n2 <= Ranger.$3) {

				for (; n1 <= n2; n1++) {

					if (n1 == MIN_NAT_PRIME || n1 == Ranger.$3_INT32) {

						retAry[iToCarry++] = n1;

					}

				}

			} else { // n2 > 3

				for (; n1 <= Ranger.$3; n1++) {

					if (n1 == MIN_NAT_PRIME || n1 == Ranger.$3_INT32) {

						retAry[iToCarry++] = n1;

					}

				}

			}

		}

		n1 = n1 | 0b1L;// important, 4 ~ 4 will not do

		if (n2 < Ranger.$2POW31_MINUS1) {

			int n1_32 = (int) n1;
			int n2_32 = (int) n2;
			for (; n1_32 <= n2_32; n1_32 += Ranger.$2_INT32) {

				if (testPrime32(n1_32)) {

					if (iToCarry == lenByGuess) {

						retAry = Aryva.extAryToLen32Mul2Plus1024(retAry);
						lenByGuess = retAry.length;

					}

					retAry[iToCarry++] = n1_32;

				}

			}

		} else {

			for (; n1 <= n2; n1 = n1 + Ranger.$2) {

				if (testPrime(n1)) {

					// O.l("n1=" + n1 + O.S32 + CLASS_THIS);

					if (iToCarry == lenByGuess) {

						retAry = Aryva.extAryToLen32Mul2Plus1024(retAry);
						lenByGuess = retAry.length;

					}

					retAry[iToCarry++] = n1;

				}

			}

		}

		return O.trimTailAll0(retAry);

	}

}
