package lGpl20.comb.onto;

import java.io.Serializable;
import java.math.BigInteger;

import lGpl20.comb.Cva;
import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.comb.filter.Condi;
import lGpl20.o.O;
import lGpl20.shareWXyz.ShWGo;

/**
 * 回傳 Onto 函數值; 求 n 本相異書分給 k 個小孩的方法數.<br/>
 * To return the number of that m distinguish books giving to n people<br/>
 * then everyone at least got one.<br/>
 * Onto(n,k)=C(k,0)*k^n -C(k,1)*(k-1)^n +C(k,2)*(k-2)^n- ... +-C(k,k-1)*1^n
 * 
 * @version 2019/03/30_22:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Ontova_A" >Ontova_A.java</a>
 * 
 * @see Ontova_F
 */
public abstract class Ontova_A implements Serializable {

	private static final Class<Ontova_A> CLASS_THIS = Ontova_A.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 回傳 Onto 函數值; 求 n 本相異書分給 k 個人的方法數.<br/>
	 * To return the number of ways to give n distinguish books to k people<br/>
	 * then everyone at least gets one book.<br/>
	 * Onto(n,k)=C(k,0)*k^n -C(k,1)*(k-1)^n +C(k,2)*(k-2)^n- ... +-C(k,k-1)*1^n
	 */
	public static long int64ByToInEx(Condi condi) {

		long ans = 0;

		for (int i = 0; i != condi.k; i++) {

			if ((i & 0b1) == 0) {// odd

				ans = ans + Cva.int64(condi.k, i) * O.pow(condi.k - i, condi.n);
				// O.l("C(" + n + "," + i + ")*" + (n - i) + "^" + m + O.S32 + CLASS_THIS);

			} else {

				ans = ans - Cva.int64(condi.k, i) * O.pow(condi.k - i, condi.n);
				// O.l("-C(" + n + "," + i + ")*" + (n - i) + "^" + m + O.S32 + CLASS_THIS);

			}

		}

		return ans;

	}

	/**
	 * 回傳 Onto 函數值; 求 n 本相異書分給 k 個人的方法數.<br/>
	 * To return the number of ways to give n distinguish books to k people<br/>
	 * then everyone at least gets one book.<br/>
	 * Onto(n,k)=C(k,0)*k^n -C(k,1)*(k-1)^n +C(k,2)*(k-2)^n- ... +-C(k,k-1)*1^n
	 */
	public static BigInteger bigIntByToInEx(Condi condi) {

		BigInteger ans = BigInteger.ZERO;

		for (int i = 0; i != condi.k; i++) {

			if ((i & 0b1) == 0) {// odd

				ans = ans.add(Cva.bigInt(condi.k, i).multiply(BigInteger.valueOf(condi.k - i).pow(condi.n)));
				// O.l("C(" + n + "," + i + ")*" + (n - i) + "^" + m + O.S32 + CLASS_THIS);

			} else {

				ans = ans.subtract(Cva.bigInt(condi.k, i).multiply(BigInteger.valueOf(condi.k - i).pow(condi.n)));
				// O.l("-C(" + n + "," + i + ")*" + (n - i) + "^" + m + O.S32 + CLASS_THIS);

			}

		}

		return ans;

	}

	// /**
	// * Onto.<br/>
	// * Onto.
	// */
	// public static long int64ByToDiI(Condi condi) {
	//
	// final int diff32 = condi.min - 1;// reduced for performance
	// long[] ary = DiIGo.go(condi.n, condi.k, condi.min, condi.max);// reduced for performance
	//
	// long ans = 0L;
	// long tempAns;
	//
	// long b64IntoB6ForC;
	// long b64IntoB6Dup;
	// long b64IntoB6CountDup;
	//
	// int restN = condi.n;
	// int val32;
	// for (int iAry = 0; iAry != ary.length;) {
	//
	// b64IntoB6ForC = B64IntoB6.revAgainstB6FromR(ary[iAry]);
	// b64IntoB6Dup = b64IntoB6ForC;
	//
	// // O.l("b64IntoB6ForC=" + B32va.str24((int) b64IntoB6ForC));
	// O.l("b64IntoB6ForC=" + B64IntoB6.toStrForToDiI(B64IntoB6.revAgainstB6FromR(b64IntoB6ForC), 0) + O.S32 + CLASS_THIS);
	//
	// tempAns = 1L;
	//
	// while (b64IntoB6ForC != 0b0L) {
	//
	// val32 = ((int) b64IntoB6ForC) & B64IntoB6.$6_1_OF_32BIT;
	// val32 = val32 + diff32;
	//
	// // O.l("restN, val32=" + restN + "," + val32);
	// tempAns = tempAns * Cva.int64(restN, val32);
	// restN = restN - val32;
	// b64IntoB6ForC = b64IntoB6ForC >>> B64IntoB6.$NUM_OF_BIT_PER_CELL_INT32;
	//
	// }
	//
	// // O.l("sortedB64IntoB6Dup =" + O.L + B64IntoB6.str24(b64IntoB6Dup) + O.S32 + CLASS_THIS);
	// // O.l("min=" + ((int) b64IntoB6Dup & b64IntoB6Dup.$6_1_OF_32BIT) + O.S32 + CLASS_THIS);
	// // O.l("max=" + B64IntoB6.leftestFromR(b64IntoB6Dup) + O.S32 + CLASS_THIS);
	//
	// b64IntoB6CountDup = B64IntoB6.countDup(B64IntoB6.selSort(b64IntoB6Dup));
	// // b64IntoB6CountDup = B64IntoB6.revAgainstB6FromR(b64IntoB6CountDup);// important for performance
	// // O.l("b64IntoB6CountDup=" + O.L + B64IntoB6.str24(b64IntoB6CountDup) + O.S32 + CLASS_THIS);
	//
	// O.l("b64IntoB6CountDup=" + B64IntoB6.toStrForToDiI(b64IntoB6CountDup, 1) + O.S32 + CLASS_THIS);
	//
	// tempAns = tempAns * Pva.int64(condi.n);
	//
	// while (b64IntoB6CountDup != 0b0L) {
	//
	// tempAns = tempAns / Pva.int64(((int) b64IntoB6CountDup) & B64IntoB6.$6_1_OF_32BIT);
	//
	// b64IntoB6CountDup = b64IntoB6CountDup >>> B64IntoB6.$NUM_OF_BIT_PER_CELL_INT32;
	//
	// }
	//
	// // O.l("tempAns=" + tempAns + O.S32 + CLASS_THIS);
	// if (++iAry < ary.length) {
	//
	// restN = condi.n;
	//
	// }
	//
	// ans = ans + tempAns;
	// // O.l("ans=" + ans + O.S32 + CLASS_THIS);
	//
	// }
	//
	// return ans;
	//
	// }

	/**
	 * 回傳 Onto 函數值; 求 n 本相異書分給 k 個人的方法數.<br/>
	 * To return the number of ways to give n distinguish books to k people<br/>
	 * then everyone at least gets one book.<br/>
	 * Onto(n,k)=C(k,0)*k^n -C(k,1)*(k-1)^n +C(k,2)*(k-2)^n- ... +-C(k,k-1)*1^n
	 */
	public static long int64ByToShW(Condi condi) {

		final int diff32 = condi.min - 1;// reduced for performance
		long[] ary = ShWGo.go(condi.n, condi.k, condi.min, condi.max);

		long ans = 0L;
		long tempAns;

		long b64IntoB6ForC;

		int restN = condi.n;
		int val32;

		for (int iAry = 0; iAry != ary.length;) {

			b64IntoB6ForC = B64IntoB6.revAgainstB6FromR(ary[iAry]);
			// O.l("b64IntoB6ForC=" + B64IntoB6.str24((int) b64IntoB6ForC) + O.S32 + CLASS_THIS);
			// O.l("b64IntoB6ForC=" + B64IntoB6.toStrForToDiI(B64IntoB6.revAgainstB6FromR(b64IntoB6ForC), 0) + O.S32 +
			// CLASS_THIS);

			tempAns = 1L;

			while (b64IntoB6ForC != 0b0L) {

				val32 = ((int) b64IntoB6ForC) & B64IntoB6.MASK32;
				val32 = val32 + diff32;

				// O.l("restN, val32=" + restN + "," + val32 + O.S32 + CLASS_THIS);

				tempAns = tempAns * Cva.int64(restN, val32);
				restN = restN - val32;
				b64IntoB6ForC = b64IntoB6ForC >>> B64IntoB6.$6;

			}

			// O.l("tempAns=" + tempAns + O.S32 + CLASS_THIS);

			if (++iAry < ary.length) {

				restN = condi.n;

			}

			ans = ans + tempAns;
			// O.l("tempAns=" + tempAns + O.S32 + CLASS_THIS);

		}

		return ans;

	}

	/**
	 * 回傳 Onto 函數值; 求 n 本相異書分給 k 個人的方法數.<br/>
	 * To return the number of ways to give n distinguish books to k people<br/>
	 * then everyone at least gets one book.<br/>
	 * Onto(n,k)=C(k,0)*k^n -C(k,1)*(k-1)^n +C(k,2)*(k-2)^n- ... +-C(k,k-1)*1^n
	 */
	public static BigInteger bigIntByToShW(Condi condi) {

		final int diff32 = condi.min - 1;
		long[] ary = ShWGo.go(condi.n, condi.k, condi.min, condi.max);

		BigInteger ans = BigInteger.ZERO;
		BigInteger tempAns;

		long b64IntoB6ForC;

		int restN = condi.n;
		int val32;
		for (int iAry = 0; iAry != ary.length;) {

			b64IntoB6ForC = B64IntoB6.revAgainstB6FromR(ary[iAry]);
			// O.l("b64IntoB6ForC=" + B64IntoB6.str24((int) b64IntoB6ForC) + O.S32 + CLASS_THIS);

			tempAns = BigInteger.ONE;

			while (b64IntoB6ForC != 0b0L) {

				val32 = (int) b64IntoB6ForC & B64IntoB6.MASK32;
				val32 = val32 + diff32;
				// O.l("restN, temp32=" + restN + "," + temp32);
				tempAns = tempAns.multiply(Cva.bigInt(restN, val32));
				restN = restN - val32;
				b64IntoB6ForC = b64IntoB6ForC >>> B64IntoB6.$6;

			}

			if (++iAry < ary.length) {

				restN = condi.n;

			}

			ans = ans.add(tempAns);
			// O.l("ans=" + ans + O.S32 + CLASS_THIS);

		}

		return ans;

	}

}
