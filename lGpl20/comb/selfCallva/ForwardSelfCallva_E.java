package lGpl20.comb.selfCallva;

import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.o.O;
import lGpl20.o.ery.Seq;

/**
 * @version 2016/08/20_07:35:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=ForwardSelfCallva_E" >ForwardSelfCallva_E
 *          .java </a>
 * 
 * @see ForwardSelfCallva_Z
 */
public abstract class ForwardSelfCallva_E extends ForwardSelfCallva_C {

	private static final Class<ForwardSelfCallva_E> CLASS_THIS = ForwardSelfCallva_E.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 5 戰 3 勝.<br/>
	 * 5 戰 3 勝.
	 */
	public static void playOffIn3Over5(final int n, long b64IntoB6AsPrefix, Seq retSeq) {

		if ((((int) B64IntoB6.selSortDesc(B64IntoB6.countDup(B64IntoB6.selSort(b64IntoB6AsPrefix)))) & B64IntoB6.MASK32) == n) {

			// O.l("b64IntoB6AsPrefix=" + B64IntoB6.str24(b64IntoB6AsPrefix) + O.S32 + CLASS_THIS);

			retSeq.a(b64IntoB6AsPrefix);

			return;

		}

		playOffIn3Over5(n, (b64IntoB6AsPrefix << B64IntoB6.$6) | 1L, retSeq);
		playOffIn3Over5(n, (b64IntoB6AsPrefix << B64IntoB6.$6) | 2L, retSeq);

	}

}