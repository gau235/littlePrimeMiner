package lGpl20.comb.wDup;

import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.o.O;

/**
 * @version 2018/12/17_11:50:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=PWDup_B" >PWDup_B.java</a>
 *
 * @see PWDup
 */
public abstract class PWDup_B extends PWDup_A {

	private static final Class<PWDup_B> CLASS_THIS = PWDup_B.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To check if contain key (none 0).<br/>
	 * To check if contain key (none 0).
	 */
	public static boolean isToPutOn_old(long prefixB64IntoB6, int currQR, boolean isToPermutate) {

		int q = currQR / DatToShW.$6;
		int r = currQR % DatToShW.$6;

		if (prefixB64IntoB6 == 0b0L) {

			if (r == 0) {

				return true;

			}

		}

		// O.l("isToPutOn: qR,q,r=" + O.L + qR + "," + q + "," + r);

		int maxRBehind = Integer.MIN_VALUE;// fuck
		do {

			int b6Minus1 = (((int) prefixB64IntoB6) & B64IntoB6.MASK32) - 1;
			int qB6Minus1 = b6Minus1 / DatToShW.$6;

			// O.l("check q, qB6Minus1=" + O.L + q + ", " + qB6Minus1);
			if (q == qB6Minus1) {

				maxRBehind = b6Minus1 % DatToShW.$6;// rB6Minus1
				break;// fuck;

			}

		} while (isToPermutate && ((prefixB64IntoB6 = prefixB64IntoB6 >>> B64IntoB6.$6) != 0b0L));

		// O.l("isToPutOn maxRBehind, q, r=" + O.L + maxRBehind + "," + q + "," + r);

		if (maxRBehind == Integer.MIN_VALUE) {// not the same q

			if (r == 0) {

				return true;

			}

		} else {// check max r

			if (r == (maxRBehind + 1)) {

				// O.l("check rBase=" + rBase);
				return true;

			}

		}

		return false;

	}

}
