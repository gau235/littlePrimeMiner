package lGpl20.prime64.sample;

import lGpl20.o.O;
import lGpl20.o.time.T64;
import lGpl20.prime64.Miner;
import lGpl20.prime64.ery.EryOfPrimeAry;
import lGpl20.prime64.thr.Moon;
import lGpl20.prime64.thr.Thrva;

/**
 * GrowPrimeAry.<br/>
 * GrowPrimeAry.
 * 
 * @version 2019/04/22_16:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP13_GrowNSetOriAryOfPrime" >
 *          SP13_GrowNSetOriAryOfPrime. java</a>
 * 
 */
public class SP13_GrowNSetOriAryOfPrime {

	private static final Class<SP13_GrowNSetOriAryOfPrime> CLASS_THIS = SP13_GrowNSetOriAryOfPrime.class;

	public static void main(String[] sAry) throws Throwable {

		long t0 = T64.t64();

		final long n1 = 1;
		final long n2 = 123456789;
		final int numOfThr = 5;

		Moon moonMP = Miner.mineWThr(n1, n2, numOfThr);

		Thrva.startAllNew(moonMP.aryThrMP);
		Thrva.startAllNew(moonMP.otherThr);

		moonMP.otherThr.join();

		O.l("timeCost=" + T64.difInF32Sec(t0) + O.S32 + O.S115 + O.S32 + CLASS_THIS);

		O.l();

		O.l("moonMP.aryOfEryOfPrimeAry.len=" + moonMP.aryOfEryOfPrimeAry.length + O.S32 + CLASS_THIS);

		EryOfPrimeAry.setOriAryOfPrimeInMinerAftToMerge(moonMP.aryOfEryOfPrimeAry);

		long countPrime = Miner.countPrime(100, 12345678);
		if (countPrime != 809202) {// to check

			O.x("countPrime=" + countPrime + O.S32 + CLASS_THIS);

		}

		O.l();

		O.l("timeCost=" + T64.difInF32Sec(t0) + O.S32 + O.S115 + O.S32 + CLASS_THIS);

	}

}
