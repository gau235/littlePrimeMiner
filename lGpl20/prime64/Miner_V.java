package lGpl20.prime64;

import lGpl20.o.O;
import lGpl20.prime64.ery.EryOfPrimeAry;
import lGpl20.prime64.thr.Moon;
import lGpl20.prime64.thr.MoonerMP;
import lGpl20.prime64.thr.ThrToMine;
import lGpl20.prime64.thr.Thrva;

/**
 * @version 2017/05/21_18:30:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Miner_V" >Miner_V.java</a>
 * 
 * @see Miner_Z
 */
public abstract class Miner_V extends Miner_T {

	private static final Class<Miner_V> CLASS_THIS = Miner_V.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 啟動多執行緒找 n1 ~ n2 間所有質數.<br/>
	 * To mine all primes between n1 and n2 (both inclusive) with threads.
	 * 
	 * @see #mineWThr(long, long, int)
	 * 
	 * @see #mineWThrW1EryOfPrimeAry(long, long, int)
	 */
	public static Moon mineWThr(long n1, long n2, int numOfThr) {

		Ranger.checkArg(n1, n2, numOfThr, ID_TO_MINE_PRIME);

		final int bigRange32 = GuessFromGauss.bigRange32ForThrToMinePrime(n1);
		Moon moon = new Moon();

		////////////////////////////////
		ThrToMine[] aryThrMP = new ThrToMine[numOfThr];
		EryOfPrimeAry[] aryOfEryOfPrimeAry = EryOfPrimeAry
				.genAryOfEryOfPrimeAry((numOfThr - 1) / Thrva.INT32_OF_THR_TO_SHARE_1_ERY_OF_PRIME_ARY + 1);

		long bigN1;
		for (int iOfThr = 0; iOfThr != numOfThr; iOfThr++) {

			bigN1 = n1 + ((long) (bigRange32 * iOfThr));

			if (bigN1 <= n2) {

				// O.l("bigN1=" + bigN1 + O.S32 + CLASS_THIS);
				// originFromNum + i * range could be > 2^63-1
				ThrToMine thrToMine = new ThrToMine(bigN1, n2, numOfThr, bigRange32, aryThrMP,
						aryOfEryOfPrimeAry[iOfThr / Thrva.INT32_OF_THR_TO_SHARE_1_ERY_OF_PRIME_ARY], iOfThr, moon);

				aryThrMP[iOfThr] = thrToMine;

			} else {

				break;

			}

		}

		aryThrMP = O.trimTailAllNull(aryThrMP);// fuck
		////////////////////////////////

		moon.intAsType = ID_TO_MINE_PRIME;

		moon.oriN1 = n1;
		moon.oriN2 = n2;
		moon.numOfThr = numOfThr;

		moon.bigRange32 = bigRange32;

		moon.aryThrMP = aryThrMP;
		moon.aryOfEryOfPrimeAry = aryOfEryOfPrimeAry;

		moon.otherThr = new MoonerMP(moon);

		return moon;

	}

	/**
	 * 啟動多執行緒找 n1 ~ n2 間所有質數.<br/>
	 * To mine all primes between n1 and n2 (both inclusive) with threads.
	 * 
	 * @see #mineWThr(long, long, int)
	 * 
	 * @see #mineWThrW1EryOfPrimeAry(long, long, int)
	 */
	public static Moon mineWThrW1EryOfPrimeAry(long n1, long n2, int numOfThr) {

		Ranger.checkArg(n1, n2, numOfThr, ID_TO_MINE_PRIME_W_1_ERY_OF_PRIME_ARY);

		final int bigRange32 = GuessFromGauss.bigRange32ForThrToMinePrime(n1);
		Moon moon = new Moon();

		////////////////////////////////
		ThrToMine[] aryThrMP = new ThrToMine[numOfThr];
		EryOfPrimeAry eryOfPrimeAry = new EryOfPrimeAry();
		EryOfPrimeAry[] aryOfEryOfPrimeAry = new EryOfPrimeAry[] { eryOfPrimeAry };

		long bigN1;
		ThrToMine thrToMine;
		for (int iOfThr = 0; iOfThr != numOfThr; iOfThr++) {

			bigN1 = n1 + ((long) (bigRange32 * iOfThr));

			if (bigN1 <= n2) {

				thrToMine = new ThrToMine(bigN1, n2, numOfThr, bigRange32, aryThrMP, eryOfPrimeAry, iOfThr, moon);

				aryThrMP[iOfThr] = thrToMine;

			} else {

				break;

			}

		}

		aryThrMP = O.trimTailAllNull(aryThrMP);// fuck
		////////////////////////////////

		moon.intAsType = ID_TO_MINE_PRIME_W_1_ERY_OF_PRIME_ARY;

		moon.oriN1 = n1;
		moon.oriN2 = n2;
		moon.numOfThr = numOfThr;

		moon.bigRange32 = bigRange32;

		moon.aryThrMP = aryThrMP;
		moon.aryOfEryOfPrimeAry = aryOfEryOfPrimeAry;

		moon.otherThr = new MoonerMP(moon);

		return moon;

	}

}
