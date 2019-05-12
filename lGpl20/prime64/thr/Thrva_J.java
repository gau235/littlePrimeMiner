package lGpl20.prime64.thr;

import lGpl20.o.O;

/**
 * @version 2019/04/29_11:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Thrva_D" >Thrva_D.java</a>
 * 
 * @see Thrva_Z
 */
public abstract class Thrva_J extends Thrva_A {

	private static final Class<Thrva_J> CLASS_THIS = Thrva_J.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * aryOfThr 內有執行緒活著嗎 ?<br/>
	 * Is there any thread alive in aryOfThr?
	 */
	@SuppressWarnings("unchecked")
	public static <T extends Thread> T headAlive(T... aryOfThr) {

		T thr;
		for (int i = 0; i != aryOfThr.length; i++) {

			thr = aryOfThr[i];
			if (thr != null && thr.isAlive()) {

				return thr;

			}

		}

		return null;

	}

	/**
	 * 啟動 aryOfThr 內執行緒.<br/>
	 * To start the threads of aryOfThr.
	 */
	@SafeVarargs
	public static <T extends Thread> void startAllNew(T... aryOfThr) {

		T thr;
		for (int i = 0; i != aryOfThr.length; i++) {

			thr = aryOfThr[i];
			// O.l("thr.getState()=" + thr.getState() + O.S32 + CLASS_THIS);

			if ((thr != null) && (Thread.State.NEW.equals(thr.getState()))) {

				// O.l("startIfNew i=" + i + O.S32 + CLASS_THIS);
				// O.l("thr.getState() =" + thr.getState() + O.S32 + CLASS_THIS);
				thr.start();

			}

		}

	}

	/**
	 * 回傳 aryOfThr 內執行緒活著的數目.<br/>
	 * To return the number of the alive thread in aryOfThr.
	 */
	@SuppressWarnings("unchecked")
	public static <T extends Thread> int countOfAlive(T... aryOfThr) {

		int countOfAlive = 0;

		T thr;
		for (int i = 0; i != aryOfThr.length; i++) {

			thr = aryOfThr[i];

			if ((thr != null) && thr.isAlive()) {

				countOfAlive++;

			}

		}

		return countOfAlive;

	}

	/**
	 * To join aryOfThr 內執行緒.<br/>
	 * To join the threads of aryOfThr.
	 */
	@SuppressWarnings("unchecked")
	public static <T extends Thread> void joinAll(T... aryOfThr) throws InterruptedException {

		T thr;
		for (int i = 0; i != aryOfThr.length; i++) {

			thr = aryOfThr[i];
			if (thr != null) {

				thr.join();

			}

		}

	}

	/**
	 * 停止 aryOfThr 內執行緒.<br/>
	 * To stop the threads of aryOfThr.
	 */
	@SafeVarargs
	@SuppressWarnings("deprecation")
	public static <T extends Thread> void stopAllAlive(T... aryOfThr) {

		T thr;
		for (int i = 0; i != aryOfThr.length; i++) {

			thr = aryOfThr[i];
			if ((thr != null) && thr.isAlive()) {

				thr.stop();

			}

		}

	}

}