package lGpl20.prime64;

import lGpl20.comb.selfCallva.Recursva;
import lGpl20.o.O;

/**
 * @version 2017/03/28_10:57:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Ranger_Z" >Ranger_Z.java</a>
 * 
 * @see Ranger_Z
 */
public abstract class Ranger_R extends Ranger_A {

	private static final Class<Ranger_R> CLASS_THIS = Ranger_R.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 找最大公因數 G.C.D.<br/>
	 * To return the G.C.D.
	 * 
	 * @see Recursva#gcdByToCallSelfBackward(long,long)
	 */
	public static long gcd(long bigN, long smallN) {

		if (bigN < 1 || smallN < 1) {

			O.x();

		}

		if (bigN < smallN) {

			long temp = bigN;
			bigN = smallN;
			smallN = temp;

		}

		long r;

		while ((r = bigN % smallN) > 0) {

			// O.l("r=" + r);
			bigN = smallN;
			smallN = r;

		}

		// O.l("=" + smallNum);
		return smallN;

	}

	/**
	 * n1, n2 互質嗎？<br/>
	 * Are n2 and n1 relatively primes?
	 */
	public static boolean checkRelativelyPrime(long n1, long n2) {

		return gcd(n2, n1) == 1;

	}

}
