package lGpl20.other.sample;

import lGpl20.o.O;
import lGpl20.o.str.S;
import lGpl20.o.str.SByN;
import lGpl20.o.thr.ThrWBox;
import lGpl20.o.time.T64;
import lGpl20.other.jsp.Jsp;
import lGpl20.other.uI.MyAide;
import lGpl20.prime64.Miner;
import lGpl20.prime64.Ranger;
import lGpl20.prime64.ery.EryOfPrimeAry;
import lGpl20.prime64.thr.Moon;
import lGpl20.prime64.thr.Thrva;

/**
 * 啟動多執行緒找質數.<br/>
 * <br/>
 * To mine prime with threads.
 * 
 * @version 2019/04/23_01:00:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=C983_TestOnToMineWThr" >
 *          C983_TestOnToMineWThr.java</a>
 * 
 */
public class C983_TestOnToMineWThr extends ThrWBox<Object> {

	private static final Class<C983_TestOnToMineWThr> CLASS_THIS = C983_TestOnToMineWThr.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	public Moon moonMP;

	public void run() {

		for (int i = 0; i != 10; i++) {

			final long n1 = O.THR_LOCAL_RANDOM.nextInt(300) + 1;
			final long n2 = 23_456_789 + O.THR_LOCAL_RANDOM.nextInt(2_000_000);
			final int numOfThr = O.ARY32_OF_QTY_OF_CPU[O.ARY32_OF_QTY_OF_CPU.length >>> 1];

			O.l("n1=" + SByN.f(n1) + O.L + "n2=" + SByN.f(n2));
			O.l("Ranger.$MAX_TEST_INT=" + Ranger.$MAX_TEST_INT);

			moonMP = Miner.mineWThrW1EryOfPrimeAry(n1, n2, numOfThr);
			Thrva.startAllNew(moonMP.aryThrMP);
			Thrva.startAllNew(moonMP.otherThr);

			while (Thrva.headAlive(moonMP.aryThrMP) != null) {

				try {

					sleep(100);

				} catch (InterruptedException interruptedEx) {

					interruptedEx.printStackTrace();

				}

			}

			O.l("afterSlept" + O.S32 + CLASS_THIS);

			EryOfPrimeAry headEryOfPrimeAry = moonMP.aryOfEryOfPrimeAry[0];
			long ansMP = headEryOfPrimeAry.totalPrime();

			/////////////////////////////////////////////////////////////

			long ansCP = Miner.countPrime(n1, n2);

			if (ansMP != ansCP) {

				S errS = new S();
				errS.lineWr = Jsp.L;

				errS.l(T64.toTimeStr() + O.S32 + C983_TestOnToMineWThr.class);
				errS.l("n1=" + Jsp.L + n1);
				errS.l("n2=" + Jsp.L + n2);
				errS.l("ansMP=" + Jsp.L + ansMP);
				errS.l("ansCP=" + Jsp.L + ansCP);

				MyAide.sendHttpErr(errS.str, O.Z);
				O.x("err:" + O.L + "n1=" + SByN.f(n1) + O.L + "n2=" + SByN.f(n2) + O.L + "ansMP=" + SByN.f(ansMP) + O.L + "ansCP="
						+ SByN.f(ansCP));

			}

		}

	}

	public static void main(String[] sAry) {

		new C983_TestOnToMineWThr().run();

	}

}