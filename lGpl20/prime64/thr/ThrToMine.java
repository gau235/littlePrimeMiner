package lGpl20.prime64.thr;

import lGpl20.o.O;
import lGpl20.o.thr.ThrWBox;
import lGpl20.prime64.GuessFromGauss;
import lGpl20.prime64.Miner;
import lGpl20.prime64.ery.EryOfPrimeAry;

/**
 * 找質數數目的執行緒.<br/>
 * <br/>
 * The thread to mine and to count number of primes.
 * 
 * @version 2017/06/02_18:17:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=ThrToMine" >ThrToMine.java</a>
 */
public class ThrToMine extends ThrWBox<EryOfPrimeAry> {

	private static final Class<ThrToMine> CLASS_THIS = ThrToMine.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 初數.<br/>
	 * bigN1.
	 */
	protected long bigN1;

	/**
	 * 原始的末數.<br/>
	 * The origin N2.
	 */
	protected final long ORI_N2;

	protected final long BIG_N2;

	protected final long NUM_OF_THR;

	protected final long BIG_RANGE;

	protected final long BIG_RANGE_MINUS_1;

	protected final long BIG_RANGE_MUL_NUM_OF_THR;

	protected final ThrToMine[] ARY_THR_MP;

	protected final int INDEX32_OF_THR;

	protected final Moon MOON;

	protected int count32;

	/**
	 * 找質數數目的執行緒的建構方法.<br/>
	 * Constructor.
	 */
	public ThrToMine(long fromNum, long originToNum, long numOfThr, long bigRange, ThrToMine[] aryThrMP,
			EryOfPrimeAry eryOfPrimeAryAsBox, final int index32OfThr, Moon moon) {

		bigN1 = fromNum;// bigN1 already <= originToNum

		ORI_N2 = originToNum;

		NUM_OF_THR = numOfThr;

		BIG_RANGE = bigRange;

		BIG_RANGE_MINUS_1 = bigRange - 1L;

		BIG_RANGE_MUL_NUM_OF_THR = bigRange * numOfThr;

		BIG_N2 = bigN1 + BIG_RANGE_MINUS_1;

		ARY_THR_MP = aryThrMP;

		box = eryOfPrimeAryAsBox;

		INDEX32_OF_THR = index32OfThr;

		MOON = moon;

	}

	@Override
	public void run() {

		if (BIG_N2 >= ORI_N2) {

			long n1 = bigN1;
			// long range = 10_000L;
			long range = GuessFromGauss.range32ToMinePrime(n1);
			long rangeMinus1 = range - 1L;
			long n2 = n1 + rangeMinus1;

			for (; n2 < ORI_N2;) {

				// long t0 = T64.t64();

				// if (!Marker.isGrowing && n2 < Marker.tailN) {
				//
				// // O.l("retrievePrimeAry" + O.S32 + CLASS_THIS);
				// box.add(Marker.retrievePrimeAry(n1, n2));
				//
				// } else {
				//
				// box.add(Miner.mineWFitLenAry(n1, n2));
				//
				// }

				box.a(Miner.mineWFitLenAry(n1, n2));

				n1 = n1 + range;
				n2 = n1 + rangeMinus1;

				// O.l("timeCost=" + (T64.t64() - t0) + O.S32 + CLASS_THIS);

			}

			// the rest part
			if (n1 <= ORI_N2) {

				// if (!Marker.isGrowing && ORI_N2 < Marker.tailN) {
				//
				// // O.l("retrievePrimeAry" + O.S32 + CLASS_THIS);
				// box.add(Marker.retrievePrimeAry(n1, ORI_N2));
				//
				// } else {
				//
				// box.add(Miner.mineWFitLenAry(n1, ORI_N2));
				//
				// }

				box.a(Miner.mineWFitLenAry(n1, ORI_N2));

				return;

			}

		} else {

			long n1 = bigN1;
			// long range = 10_000L;
			long range = GuessFromGauss.range32ToMinePrime(n1);
			long rangeMinus1 = range - 1L;
			long n2 = n1 + rangeMinus1;

			for (; n2 < BIG_N2;) {

				box.a(Miner.mineWFitLenAry(n1, n2));

				n1 = n1 + range;
				n2 = n1 + rangeMinus1;

				// O.l("timeCost=" + (T64.t64() - t0) + O.S32 + CLASS_THIS);

			}

			// the rest part
			if (n1 <= BIG_N2) {

				box.a(Miner.mineWFitLenAry(n1, BIG_N2));

			}

			bigN1 = bigN1 + BIG_RANGE_MUL_NUM_OF_THR;

			// O.l("aft bigN1=" + SByN.f(bigN1) + O.S32 + CLASS_THIS);

			if (bigN1 <= ORI_N2) {

				ThrToMine newThrToMine = new ThrToMine(bigN1, ORI_N2, NUM_OF_THR, BIG_RANGE, ARY_THR_MP, box, INDEX32_OF_THR,
						MOON);

				// thrToMinePrime.setDaemon(true);
				newThrToMine.start();
				ARY_THR_MP[INDEX32_OF_THR] = newThrToMine;

			}

		}

	}

}