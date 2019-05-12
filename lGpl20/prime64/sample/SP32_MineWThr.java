package lGpl20.prime64.sample;

import lGpl20.o.O;
import lGpl20.o.time.T64;
import lGpl20.prime64.Miner;
import lGpl20.prime64.thr.Moon;
import lGpl20.prime64.thr.Thrva;

/**
 * 啟動多執行緒找質數.<br/>
 * To mine prime with threads.
 * 
 * @version 2019/04/21_12:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP32_MineWThr" >SP32_MineWThr.java</a>
 * 
 */
public class SP32_MineWThr {

	public static void main(String[] sAry) throws Throwable {

		long t0 = T64.t64();

		final long n1 = 1;
		final long n2 = 123456789;
		final int numOfThr = O.RUNTIME.availableProcessors() * 9 / 10;

		Moon moonMP = Miner.mineWThrW1EryOfPrimeAry(n1, n2, numOfThr);
		Thrva.startAllNew(moonMP.aryThrMP);
		Thrva.startAllNew(moonMP.otherThr);

		O.l("timeCost=" + T64.difInF32Sec(t0) + O.S32 + O.S115);

	}

}