package lGpl20.comb.selfCallva;

import lGpl20.o.O;
import lGpl20.prime64.GuessFromGauss;
import lGpl20.prime64.Miner;

/**
 * 本類別前進式自己呼叫自己的人.<br/>
 * <br/>
 * To call self forward.
 * 
 * @version 2016/08/18_15:19:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=ForwardSelfCallva_A" >ForwardSelfCallva_A.java
 *          </a>
 * 
 * @see ForwardSelfCallva_C
 */
public abstract class ForwardSelfCallva_A extends SelfCallva {

	private static final Class<ForwardSelfCallva_A> CLASS_THIS = ForwardSelfCallva_A.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 自己呼叫自己法找質數.<br/>
	 * To count prime by to call self.
	 */
	public static int countPrime(long n1, long n2) {

		long myN2 = n1 + GuessFromGauss.range32ToCountPrime(n1);

		if (myN2 >= n2) {

			return Miner.countPrime(n1, n2);

		}

		// return countPrime(n1, myN2) + countPrime(myN2 + 1, n2);
		return Miner.countPrime(n1, myN2) + countPrime(myN2 + 1, n2);

	}

}
