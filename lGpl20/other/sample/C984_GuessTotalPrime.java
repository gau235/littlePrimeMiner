package lGpl20.other.sample;

import lGpl20.o.O;
import lGpl20.o.str.SByN;
import lGpl20.prime64.GuessFromGauss;

/**
 * To guess the number of primes.<br/>
 * <br/>
 * To guess the number of primes.
 * 
 * @version 2018/04/07_12:03:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=C984_GuessTotalPrime" >
 *          C984_GuessTotalPrime.java</a>
 * 
 */
public class C984_GuessTotalPrime extends Thread {

	public static void main(String[] sAry) throws Throwable {

		for (int i = 0; i < 50; i++) {

			final long n1 = O.THR_LOCAL_RANDOM.nextInt(400) + 1;
			final long n2 = 923_456_789 + O.THR_LOCAL_RANDOM.nextInt(2_000_000);

			long g1 = GuessFromGauss.guessTotalPrimeNRetInt32(n1, n2);
			long g2 = GuessFromGauss.guessTotalPrime(n1, n2);

			if (Math.abs(g1 - g2) > 235) {
				// if (Math.abs(g1 - g2) == 0) {

				O.l("err:" + O.L + "n1=" + SByN.f(n1) + O.L + "n2=" + SByN.f(n2) + O.L + "g1=" + SByN.f(g1) + O.L + "g2="
						+ SByN.f(g2));

			}

		}

	}

}