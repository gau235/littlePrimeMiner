package lGpl20.other.sample;

import java.io.File;

import lGpl20.o.O;
import lGpl20.o.str.SByN;
import lGpl20.o.time.T64;
import lGpl20.other.iO.IOr;
import lGpl20.prime64.Miner;
import lGpl20.prime64.Ranger;

/**
 * To loan then to check primes.<br/>
 * <br/>
 * To loan then to check primes.
 * 
 * @version 2017/10/14_16:30:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=C990_LoadNCheckPrime" >
 *          C990_LoadNCheckPrime.java</a>
 * 
 */
public class C990_LoadNCheckPrime extends Thread {

	private static final Class<C990_LoadNCheckPrime> CLASS_THIS = C990_LoadNCheckPrime.class;

	public static void main(String[] sAry) throws Throwable {

		long t0 = T64.t64();

		File f = new File("C:/Users/gau/Desktop/temp299.txt");
		long[] tempAryOfPrime = IOr.readFileNConvertToAryOfPrime(f);

		O.l("tempAryOfPrime.length=" + SByN.f(tempAryOfPrime.length));
		O.l("t=" + T64.difInF32Sec(t0));

		long n;
		for (int i = tempAryOfPrime.length - 1; i != 0; i--) {

			n = tempAryOfPrime[i];

			if (n >= 5L) {

				if (i % IOr.BOUND_TO_FLUSH_WHEN_TO_READ_INT32 == 0) {

					O.l("i=" + SByN.f(i) + O.S32 + CLASS_THIS);
					O.l("n=" + SByN.f(n) + O.S32 + CLASS_THIS);
					O.l("t=" + T64.difInF32Sec(t0));
					// O.l("i ppp=" + SByN.f(ppp) + O.S32 + CLASS_THIS);

				}

				if (n < Ranger.$2POW31_MINUS1) {

					if (!Miner.testPrime32((int) n)) {

						O.l("ppp=" + SByN.f(n) + O.S32 + CLASS_THIS);
						O.l(SByN.f(n) + "=" + Miner.decompoNRetStr(n) + O.S32 + CLASS_THIS);
						O.l("file=" + f);

					}

				} else {

					if (!Miner.testPrime(n)) {

						O.l("ppp=" + SByN.f(n) + O.S32 + CLASS_THIS);
						O.l(SByN.f(n) + "=" + Miner.decompoNRetStr(n) + O.S32 + CLASS_THIS);
						O.l("file=" + f);

					}

				}

			}

		}

	}

}