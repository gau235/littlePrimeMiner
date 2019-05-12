package lGpl20.prime64;

import lGpl20.o.O;
import lGpl20.o.str.S;
import lGpl20.o.str.SByN;
import lGpl20.o.time.T64;
import lGpl20.other.jsp.Jsp;
import lGpl20.other.uI.MyAide;

/**
 * @version 2017/08/20_11:57:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Marker_R" >Marker_R.java</a>
 * 
 * @see Marker_Z
 */
public abstract class Marker_R extends Marker_J {

	private static final Class<Marker_R> CLASS_THIS = Marker_R.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To retrieve.<br/>
	 * To retrieve.
	 */
	public long[] retrievePrimeAry(long n1, long n2) {

		// int lenByGuess = GuessFromGauss.guessTotalPrime(n1, n2);
		int lenByGuess = (GuessFromGauss.guessTotalPrimeNRetInt32(n1, n2) / 3) << 2;
		long[] retAry = new long[lenByGuess];

		int iToCarry = 0;// the prime 2
		if (n1 <= Miner.MIN_NAT_PRIME && n2 > 1L) {// 1 ~ 1, 0p

			retAry[iToCarry++] = Miner.MIN_NAT_PRIME;
			n1 = 3L;

		}

		if (((n1 & 0b1L) == 0L) || n1 == 1L) {// 1 ~ 1, 0p

			n1++;

		}

		// O.l("n1=" + n1 + O.S32 + CLASS_THIS);
		// O.l("n2=" + n2 + O.S32 + CLASS_THIS);
		long[] newRetAry;
		for (; n1 <= n2; n1 += Ranger.$2) {

			if (get0Or1InB32AryForCompo(n1) == 0) {

				if (iToCarry == lenByGuess) {

					O.l("aryIndexOver:" + O.S32 + SByN.f(n1) + O.S32 + CLASS_THIS);

					newRetAry = new long[lenByGuess + Ranger.$100_INT32];

					System.arraycopy(retAry, 0, newRetAry, 0, lenByGuess);

					lenByGuess = newRetAry.length;
					retAry = newRetAry;

				}

				retAry[iToCarry++] = n1;

			}

		}

		return O.trimTailAll0(retAry);

	}

	/**
	 * To retrieve.<br/>
	 * To retrieve.
	 */
	public long[] retrievePrimeAryWLen(long n1, long n2, int len32) {

		long[] retAry = new long[len32];

		int iToCarry = 0;// the prime 2
		if (n1 <= Miner.MIN_NAT_PRIME && n2 > 1L) {// 1 ~ 1, 0p

			retAry[iToCarry++] = Miner.MIN_NAT_PRIME;
			n1 = 3L;

		}

		if (((n1 & 0b1L) == 0L) || n1 == 1L) {// 1 ~ 1, 0p

			n1++;

		}

		// O.l("n1=" + n1 + O.S32 + CLASS_THIS);
		// O.l("n2=" + n2 + O.S32 + CLASS_THIS);

		for (; n1 <= n2; n1 += Ranger.$2) {

			if (get0Or1InB32AryForCompo(n1) == 0) {

				retAry[iToCarry++] = n1;

			}

		}

		return retAry;

	}

	/**
	 * 找出輸入兩正整數之間所含質數數目.<br/>
	 * To count the number of primes between n1 and n2.
	 */
	public long countPrimeByB32AryForCompo(long n1, long n2) {

		long countOfP = 0L;
		int count32OfP = 0;

		// if (n1 == 1L && n2 == 1L) {
		//
		// return 0L;
		//
		// }

		if ((n1 <= Miner.MIN_NAT_PRIME) && (n2 > 1L)) {// 1 ~ 1, 0p

			count32OfP++;
			n1 = Ranger.$3;

		}

		if (((n1 & 0b1L) == 0L) || (n1 == 1L)) {// even number and 1 ~ 1, 0p

			n1++;

		}

		if ((n1 & 0b1L) == 0L) {// even number

			S errS = new S();
			errS.lineWr = Jsp.L;

			errS.l(T64.toTimeStr() + O.S32 + CLASS_THIS);
			errS.l("n1=" + SByN.f(n1));
			errS.l("n2=" + SByN.f(n2));
			errS.l("n1 mod 2=" + SByN.f(n1 & 0b1L));
			errS.l("count32OfP=" + SByN.f(count32OfP));

			// MyAide.saveErrCharSeqInFile(errS.str());
			MyAide.sendHttpErr(errS.str, O.SYS_USER_DOT_NAME);

		}

		int q;
		int rDiv2;

		for (; n1 <= n2; n1 = n1 + Ranger.$2) {

			////////////////////////////////////////////// if (get0Or1InB32AryForCompo(n1) == 0) {
			q = (int) (n1 >>> 6);
			rDiv2 = (((int) n1) & 0b11_1111) >>> 1;// r=2 or r=3, the pos is 1

			if (((box[q] >>> rDiv2) & 0b1) == 0) {

				if ((++count32OfP) < 0) {

					count32OfP = 0;
					countOfP = countOfP + ((long) Integer.MAX_VALUE) + 1L;

				}

			}

			//////////////////////////////////////////////

		}

		return countOfP + ((long) count32OfP);

	}

	/**
	 * 找出輸入兩正整數之間所含質數數目.<br/>
	 * To count the number of primes between n1 and n2.
	 */
	public long countPrimeByB32AryForCompo(long n1, long n2, Class<?> calledByWhichClass) {

		long countOfP = 0L;
		int count32OfP = 0;

		// if (n1 == 1L && n2 == 1L) {
		//
		// return 0L;
		//
		// }

		if ((n1 <= Miner.MIN_NAT_PRIME) && (n2 > 1L)) {// 1 ~ 1, 0p

			count32OfP++;
			n1 = Ranger.$3;

		}

		if (((n1 & 0b1L) == 0L) || (n1 == 1L)) {// even number and 1 ~ 1, 0p

			n1++;

		}

		if ((n1 & 0b1L) == 0L) {// even number

			S errS = new S();
			errS.lineWr = Jsp.L;

			errS.l(T64.toTimeStr() + O.S32 + CLASS_THIS);
			errS.l("n1=" + SByN.f(n1));
			errS.l("n2=" + SByN.f(n2));
			errS.l("n1 mod 2=" + SByN.f(n1 & 0b1L));
			errS.l("count32OfP=" + SByN.f(count32OfP));

			// MyAide.saveErrCharSeqInFile(errS.str());
			MyAide.sendHttpErr(errS.str, calledByWhichClass.toString());

		}

		int q;
		int rDiv2;

		for (; n1 <= n2; n1 = n1 + Ranger.$2) {

			////////////////////////////////////////////// if (get0Or1InB32AryForCompo(n1) == 0) {
			q = (int) (n1 >>> 6);
			rDiv2 = (((int) n1) & 0b11_1111) >>> 1;// r=2 or r=3, the pos is 1

			if (((box[q] >>> rDiv2) & 0b1) == 0) {

				if ((++count32OfP) < 0) {

					count32OfP = 0;
					countOfP = countOfP + ((long) Integer.MAX_VALUE) + 1L;

				}

			}

			//////////////////////////////////////////////

		}

		return countOfP + ((long) count32OfP);

	}

}
