package lGpl20.prime64.sample;

import lGpl20.o.O;
import lGpl20.o.time.T64;
import lGpl20.other.uI.MyStrva;
import lGpl20.prime64.Miner;
import lGpl20.prime64.thr.Moon;
import lGpl20.prime64.thr.Thrva;

/**
 * 啟動多執行緒找質數.<br/>
 * To mine prime with threads.
 * 
 * @version 2019/05/01_17:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP35_MineWThrNSendErr" >
 *          SP35_MineWThrNSendErr.java</a>
 * 
 */
public class SP35_MineWThrNSendErr {

	public static void main(String[] sAry) throws Throwable {

		// IOr.appendCharSeqToCtemp("test time=" + T64.timeStr() + O.L);
		// MyAide.sendHttpErr("test time=", O.Z);

		final int numOfThr = 4;

		for (int i = 0; i != 1000; i++) {

			long t0 = T64.t64();

			Moon moonMP = Miner.mineWThrW1EryOfPrimeAry(1, Miner.$MAX_INT_TO_GROW_ORI_ARY_OF_PRIME / 100, numOfThr);
			Thrva.startAllNew(moonMP.aryThrMP);
			moonMP.otherThr.start();

			while (moonMP.otherThr.isAlive()) {

				MyStrva.getTailPrimeNStrToShowFromAryOfEryOfPrimeAry(moonMP.aryOfEryOfPrimeAry, T64.difInF32Sec(t0));
				Thread.sleep(300);

			}

			O.l("timeCost=" + T64.difInF32Sec(t0) + O.S32 + O.S115);

		}

	}

}