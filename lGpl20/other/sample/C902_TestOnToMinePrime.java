package lGpl20.other.sample;

import lGpl20.o.O;
import lGpl20.o.str.SByN;
import lGpl20.prime64.Miner;
import lGpl20.prime64.thr.Moon;
import lGpl20.prime64.thr.Thrva;

/**
 * 啟動多執行緒找質數.<br/>
 * <br/>
 * To mine prime with threads.
 * 
 * @version 2017/10/14_16:30:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=C902_TestOnToMinePrime" >
 *          C902_TestOnToMinePrime.java</a>
 * 
 */
public class C902_TestOnToMinePrime {

	public static void main(String[] sAry) throws Throwable {

		Moon moonMP = Miner.mineWThrW1EryOfPrimeAry(1, 123456789, 6);
		Thrva.startAllNew(moonMP.aryThrMP);
		Thrva.startAllNew(moonMP.otherThr);

		while (moonMP.otherThr.isAlive()) {

			Thread.sleep(100);

		}

		final long totalPrime = moonMP.aryOfEryOfPrimeAry[0].totalPrime();

		if (totalPrime != 7_027_260L) {

			O.l("totalPrime=" + SByN.f(totalPrime) + O.S32 + C902_TestOnToMinePrime.class);
			O.x();

		}

		Miner.passTest();

	}

}