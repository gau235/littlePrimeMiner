package lGpl20.comb.onto;

import lGpl20.comb.PInEx;
import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.comb.filter.Condi;
import lGpl20.comb.stirlingNum2.S2va;
import lGpl20.o.O;
import lGpl20.shareWXyz.ShWGo;

/**
 * @version 2019/03/26_20:30:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Ontova_L" >Ontova_L.java</a>
 * 
 * @see Ontova_U
 */
public abstract class Ontova_L extends Ontova_F {

	private static final Class<Ontova_L> CLASS_THIS = Ontova_L.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 回傳 Onto 函數值; 求 n 本相異書分給 k 個人的方法數.<br/>
	 * To return the number of ways to give n distinguish books to k people<br/>
	 * then everyone at least gets one book.<br/>
	 * Onto(n,k)=C(k,0)*k^n -C(k,1)*(k-1)^n +C(k,2)*(k-2)^n- ... +-C(k,k-1)*1^n
	 * 
	 * @see PInEx#script(int, int, CharSequence)
	 */
	public static StringBuilder scriptByToInEx(Condi condi, CharSequence lineWr) {

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		for (int i = 0, kMinus1 = condi.k - 1; i != condi.k; i++) {

			if ((i & 0b1) == 0) {

				retStr.append(O.C67).append(O.C40).append(condi.k).append(O.C44).append(i).append(O.C41).append(O.C42)
						.append(condi.k - i).append(O.C94).append(condi.n).append(O.C32);

			} else {

				retStr.append(O.C45).append(O.C67).append(O.C40).append(condi.k).append(O.C44).append(i).append(O.C41)
						.append(O.C42).append(condi.k - i).append(O.C94).append(condi.n).append(O.C32);

				if (i != kMinus1) {// its a special case and do not use ++i != condi.k

					retStr.append(lineWr).append(O.C43);

				}

			}

		}

		return retStr;

	}

	/**
	 * 回傳 Onto 函數值; 求 n 本相異書分給 k 個人的方法數.<br/>
	 * To return the number of ways to give n distinguish books to k people<br/>
	 * then everyone at least gets one book.<br/>
	 * Onto(n,k)=C(k,0)*k^n -C(k,1)*(k-1)^n +C(k,2)*(k-2)^n- ... +-C(k,k-1)*1^n
	 * 
	 * @see S2va#script(Condi, CharSequence)
	 */
	public static StringBuilder scriptByS2(Condi condi, CharSequence lineWr) {// script by S2, min must be > 0

		StringBuilder retStr = new StringBuilder(Integer.toString(condi.k)).append(O.C33).append(O.C42);// String.valueOf(int);
		StringBuilder strS2 = S2va.script(condi, lineWr);

		return retStr.append(O.C91).append(strS2).append(O.C93);

	}

	/**
	 * script.<br/>
	 * script.
	 */
	// @Override why I can not override?
	public static StringBuilder script(Condi condi, CharSequence lineWr) {

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		final int diff32 = condi.min - 1;// reduced for performance
		long[] ary = ShWGo.go(condi.n, condi.k, condi.min, condi.max);

		long b64IntoB6ForC;

		int restN = condi.n;
		int val32;

		for (int iAry = 0; iAry != ary.length;) {

			b64IntoB6ForC = B64IntoB6.revAgainstB6FromR(ary[iAry]);
			// O.l("b64IntoB6ForC=" + B64IntoB6.str24((int) b64IntoB6ForC) + O.S32 + CLASS_THIS);

			while (b64IntoB6ForC != 0b0L) {

				val32 = (int) b64IntoB6ForC & B64IntoB6.MASK32;
				val32 = val32 + diff32;

				retStr.append(O.C67).append(O.C40).append(restN).append(O.C44).append(val32).append(O.C41);

				restN = restN - val32;
				b64IntoB6ForC = b64IntoB6ForC >>> B64IntoB6.$6;

				if (b64IntoB6ForC != 0b0L) {

					retStr.append(O.C42);

				}

			}

			if (++iAry < ary.length) {

				retStr.append(lineWr).append(O.C43);
				restN = condi.n;

			}

		}

		return retStr;

	}

}
