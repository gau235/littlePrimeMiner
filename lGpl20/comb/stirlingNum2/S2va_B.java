package lGpl20.comb.stirlingNum2;

import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.comb.filter.Condi;
import lGpl20.comb.onto.Ontova;
import lGpl20.divIntoHeap.DiIGo;
import lGpl20.o.O;

/**
 * @version 2019/03/15_18:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=S2va_B" >S2va_B.java</a>
 * 
 * @see S2va_K
 */
public abstract class S2va_B extends S2va_A {

	private static final Class<S2va_B> CLASS_THIS = S2va_B.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * Stirling number of the second kind.<br/>
	 * Stirling number of the second kind.
	 * 
	 * @see Ontova#script(Condi, CharSequence)
	 */
	public static StringBuilder script(Condi condi, CharSequence lineWr) {

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		final int diff32 = condi.min - 1;// reduced for performance
		long[] ary = DiIGo.go(condi.n, condi.k, condi.min, condi.max);

		long b64IntoB6ForC;
		long b64IntoB6Dup;
		long b64IntoB6CountDup;

		int restN = condi.n;
		int val32;

		for (int iAry = 0; iAry != ary.length;) {

			b64IntoB6ForC = B64IntoB6.revAgainstB6FromR(ary[iAry]);
			b64IntoB6Dup = b64IntoB6ForC;

			// O.l("b64IntoB6ForC=" + B32va.str24((int) b64IntoB6ForC) + O.S32 + CLASS_THIS);

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

			// O.l("sortedB64IntoB6Dup =" + O.L + B64IntoB6.str24(b64IntoB6Dup) + O.S32 + CLASS_THIS);
			// O.l("min=" + ((int) b64IntoB6Dup & b64IntoB6Dup.$6_1_OF_32BIT) + O.S32 + CLASS_THIS);
			// O.l("max=" + B64IntoB6.leftestFromR(b64IntoB6Dup) + O.S32 + CLASS_THIS);

			b64IntoB6CountDup = B64IntoB6.countDup(b64IntoB6Dup);
			b64IntoB6CountDup = B64IntoB6.revAgainstB6FromR(b64IntoB6CountDup);// important for performance
			// O.l("b64IntoB6CountDup=" + O.L + B64IntoB6.str24(b64IntoB6CountDup) + O.S32 + CLASS_THIS);

			while (b64IntoB6CountDup != 0b0L) {

				retStr.append(O.C47).append(((int) b64IntoB6CountDup) & B64IntoB6.MASK32).append(O.C33);// /n!

				b64IntoB6CountDup = b64IntoB6CountDup >>> B64IntoB6.$6;

			}

			if (++iAry < ary.length) {

				retStr.append(lineWr).append(O.C43);
				restN = condi.n;

			}

		}

		return retStr;

	}

}
