package lGpl20.other.uI;

import lGpl20.o.O;
import lGpl20.o.ery.Seq;
import lGpl20.other.uI.thr.FanOfMarker;
import lGpl20.other.uI.thr.MyMoonerMP;
import lGpl20.prime64.Marker;
import lGpl20.prime64.Ranger;
import lGpl20.prime64.thr.Thrva;

/**
 * @version 2019/04/29_10:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=MyAide_W" >MyAide_W.java</a>
 * 
 * @see MyAide_Y
 */
public abstract class MyAide_W extends MyAide_U {

	private static final Class<MyAide_W> CLASS_THIS = MyAide_W.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 執行 mine prime 動作.<br/>
	 * To mine prime.
	 * 
	 * @see #stopNClear(java.awt.Component)
	 */
	public static void doMinePrime() {

		try {

			actBef(NUM_MP_0);

			Seq seq = getParam(NUM_MP_0);

			long n1 = seq.at(0);
			long n2 = seq.at(1);
			int numOfThr = (int) seq.at(2);

			// O.l("getParam=" + seq.toStr() + O.S32 + CLASS_THIS);

			moonMP = mineWThr(n1, n2, numOfThr);// autoRange
			moonMP.otherThr = new MyMoonerMP(moonMP);

			Thrva.startAllNew(moonMP.aryThrMP);
			Thrva.startAllNew(moonMP.otherThr);

		} catch (Throwable throwable) {

			throwable.printStackTrace();
			MyComponenter.jTextAreaMP0.insert(throwable.toString() + O.L, 0);

		}

	}

	/**
	 * 執行 mine prime 動作.<br/>
	 * To mine prime.
	 * 
	 * @see #stopNClear(java.awt.Component)
	 */
	public static void doMinePrimeNRepeat(long n1, long n2, int numOfThr) {

		try {

			moonMP = mineWThr(n1, n2, numOfThr);
			moonMP.otherThr = new MyMoonerMP(moonMP);

			Thrva.startAllNew(moonMP.aryThrMP);
			Thrva.startAllNew(moonMP.otherThr);

		} catch (Throwable throwable) {

			throwable.printStackTrace();
			MyComponenter.jTextAreaMP0.insert(throwable.toString() + O.L, 0);

		}

	}

	/**
	 * 執行 mark prime 動作.<br/>
	 * To mark prime.
	 * 
	 * @see #stopNClear(java.awt.Component)
	 */
	public static void doMarkPrime() {

		try {

			actBef(NUM_RP_0);

			Seq seq = getParam(NUM_RP_0);

			long n1 = seq.at(0);
			long n2 = seq.at(1);
			int numOfThr = (int) seq.at(2);

			O.l("numOfThr=" + numOfThr + O.S32 + CLASS_THIS);
			O.l("n2=" + n2 + O.S32 + CLASS_THIS);

			Ranger.checkBetween(n1, 1, n2);// fuck
			Ranger.checkBetween(n2, n1, Marker.$MAX_TEST_N);// fuck

			////////////////////////

			myMarker = new Marker(n2);

			fanOfMarker = new FanOfMarker(n1, n2, myMarker);

			////////////////////////////

			Thrva.startAllNew(myMarker);
			Thrva.startAllNew(fanOfMarker);

		} catch (Throwable throwable) {

			throwable.printStackTrace();
			MyComponenter.jTextAreaRP0.insert(throwable.toString() + O.L, 0);

		}

	}

	/**
	 * 執行 mark prime 動作.<br/>
	 * To mark prime.
	 * 
	 * @see #stopNClear(java.awt.Component)
	 */
	public static void doMarkPrimeNRepeat(long n1, long n2) {

		try {

			myMarker = new Marker(n2);

			FanOfMarker fanOfMarker = new FanOfMarker(n1, n2, myMarker);

			myMarker.start();
			fanOfMarker.start();

		} catch (Throwable throwable) {

			throwable.printStackTrace();
			MyComponenter.jTextAreaRP0.insert(throwable.toString() + O.L, 0);

		}

	}

}
