package lGpl20.prime64.sample;

import lGpl20.o.O;
import lGpl20.o.str.SByN;
import lGpl20.o.time.T64;
import lGpl20.prime64.Marker;
import lGpl20.prime64.Miner;

/**
 * 找較大質數.<br/>
 * <br/>
 * To load prime then to mine bigger prime.
 * 
 * @version 2017/08/11_10:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP17_GrowPrimeAryNMineLargePrime" >
 *          SP17_GrowPrimeAryNMineLargePrime.java</a>
 * 
 */
public class SP17_GrowPrimeAryNMineLargePrime {

	private static final Class<SP17_GrowPrimeAryNMineLargePrime> CLASS_THIS = SP17_GrowPrimeAryNMineLargePrime.class;

	public static void main(String[] sAry) throws Throwable {

		final long t0 = T64.t64();

		if (Miner.tailPrimeInOriAryOfPrime() < Miner.$MAX_INT_TO_GROW_ORI_ARY_OF_PRIME) {

			Marker marker = new Marker(Miner.$MAX_INT_TO_GROW_ORI_ARY_OF_PRIME);
			marker.start();
			marker.join();

			long[] primeAry = marker.retrievePrimeAryWLen(1L, Miner.$MAX_INT_TO_GROW_ORI_ARY_OF_PRIME,
					Miner.$MAX_LEN32_OF_ORI_ARY_OF_PRIME);

			Miner.setOriAryOfPrime(primeAry, CLASS_THIS);

		}

		O.l("tailPrimeInOriAryOfPrime=" + SByN.f(Miner.tailPrimeInOriAryOfPrime()) + O.S32
				+ SP17_GrowPrimeAryNMineLargePrime.class);

		// long[] aryOfPrime = Miner.mineWFitLenAry(Ranger.$MAX_TEST_INT, Long.MAX_VALUE - 1);
		long[] aryOfPrime = Miner.mineWFitLenAry(Long.MAX_VALUE - 170, Long.MAX_VALUE - 1);

		for (long p : aryOfPrime) {

			O.l(SByN.f(p));

		}

		aryOfPrime = Miner.mineFrom2Pow63DownTo(Long.MAX_VALUE - 170);

		for (long p : aryOfPrime) {

			O.l(SByN.f(p));

		}

		O.l("time cost=" + T64.difInF32Sec(t0) + O.S32 + SP17_GrowPrimeAryNMineLargePrime.class);

	}

}
