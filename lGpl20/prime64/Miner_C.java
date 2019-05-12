package lGpl20.prime64;

import java.io.Serializable;

import lGpl20.o.KeyToSyn;
import lGpl20.o.O;

/**
 * @version 2017/06/14_22:07:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Miner_C" >Miner_C.java</a>
 * 
 * @see Miner_D
 */
public abstract class Miner_C extends Miner_A {

	private static final Class<Miner_C> CLASS_THIS = Miner_C.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 內建的物件, 用於多執行緒的存取控制.<br/>
	 * For synchronizing.
	 */
	protected static final Serializable KEY_TO_SYN = new KeyToSyn();

	/**
	 * 此自然數是質數 ?<br/>
	 * Is the nature odd number a prime?<br/>
	 * n must be odd and be greater than or equal to 3
	 */
	protected static boolean testPrimeByOriAry32OfOddPrime239(int natOddNum) {

		// n >= 3
		for (int index = 0, divisor = ORI_ARY32_OF_ODD_PRIME_239[index], root2 = (int) StrictMath
				.sqrt(natOddNum); divisor <= root2;) {

			// if (divisor > root2) {
			//
			// return true;
			//
			// }

			if (natOddNum % divisor == 0) {

				return false;

			}

			divisor = ORI_ARY32_OF_ODD_PRIME_239[++index];

		}

		return true;

	}

	/**
	 * 不使用 oriAryOfPrime 找 1~ n 以下所有質數, 並放入陣列回傳.<br/>
	 * To mine all primes without oriAryOfPrime from 1 to n (both inclusive).<br/>
	 * Note: n must be greater than or equal 2.
	 */
	public static long[] initByOriAry32OfOddPrime239() {

		synchronized (KEY_TO_SYN) {

			long[] retAry = new long[$COUNT32_OF_PRIME_LESS_OR_EQUAL_INIT_TAIL_PRIME];

			int iRetAry = 0;
			retAry[iRetAry++] = MIN_NAT_PRIME;// fuck

			for (int int32 = Ranger.$3_INT32; int32 <= $INIT_TAIL_PRIME_OF_ORI_ARY_OF_PRIME_INT32; int32 = int32
					+ Ranger.$2_INT32) {

				if (testPrimeByOriAry32OfOddPrime239(int32)) {

					retAry[iRetAry++] = int32;// carry it

				}

			}

			// O.l("initByOriAry32OfOddPrime239" + O.S32 + CLASS_THIS);
			return retAry;

		}

	}

}
