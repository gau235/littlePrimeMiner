package lGpl20.prime64;

import lGpl20.o.O;
import lGpl20.o.str.SByN;

/**
 * @version 2017/08/11_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Miner_G" >Miner_G.java</a>
 * 
 * @see Miner_I
 */
public abstract class Miner_G extends Miner_D {

	private static final Class<Miner_G> CLASS_THIS = Miner_G.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 取得內建的 oriAryOfPrime.<br/>
	 * To get the inside oriAryOfPrime.
	 * 
	 * @see #setOriAryOfPrime(long[], Class)
	 */
	public static long[] getOriAryOfPrime() {

		return oriAryOfPrime;

	}

	/**
	 * 置換入另一個 oriAryOfPrime.<br/>
	 * To set in another oriAryOfPrime.
	 * 
	 * @see #getOriAryOfPrime()
	 */
	public static void setOriAryOfPrime(long[] aryOfPrime, Class<?> calledByWhichClass) {

		synchronized (KEY_TO_SYN) {

			if (aryOfPrime[0] != MIN_NAT_PRIME) {

				O.x("aryOfPrime[0]=" + SByN.f(aryOfPrime[0]) + O.S32 + CLASS_THIS);

			}

			oriAryOfPrime = aryOfPrime;

		}

		O.l("setOriAryOfPrime newTailPrime=" + SByN.f(aryOfPrime[aryOfPrime.length - 1]) + O.S32 + CLASS_THIS);
		O.l("calledByWhichClass=" + calledByWhichClass);

	}

	/**
	 * 內建的質數陣列內第 0 位置質數.<br/>
	 * To return the 0-th(head) prime of the inside oriAryOfPrime.
	 * 
	 * @see #tailPrimeInOriAryOfPrime()
	 * 
	 * @see #totalPrimeInOriAryOfPrime()
	 */
	public static long headPrimeInOriAryOfPrime() {

		return oriAryOfPrime[0];

	}

	/**
	 * 內建的質數陣列內第末位置質數.<br/>
	 * To return the last prime of the inside oriAryOfPrime.
	 * 
	 * @see #headPrimeInOriAryOfPrime()
	 * 
	 * @see #totalPrimeInOriAryOfPrime()
	 */
	public static long tailPrimeInOriAryOfPrime() {

		// O.l("tailPrime=" + oriAryOfPrime[oriAryOfPrime.length - 1] + O.S32 + CLASS_THIS);

		return oriAryOfPrime[oriAryOfPrime.length - 1];

	}

	/**
	 * 內建的質數陣列內所有質數.<br/>
	 * To return total number of prime of the inside oriAryOfPrime.
	 * 
	 * @see #headPrimeInOriAryOfPrime()
	 * 
	 * @see #tailPrimeInOriAryOfPrime()
	 */
	public static long totalPrimeInOriAryOfPrime() {

		return oriAryOfPrime.length;

	}

}
