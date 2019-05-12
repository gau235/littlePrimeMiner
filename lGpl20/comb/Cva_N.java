package lGpl20.comb;

import lGpl20.o.O;
import lGpl20.o.ery.Seq32;

/**
 * @version 2018/03/27_11:17:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Cva_N" >Cva_N.java</a>
 * 
 * @see Cva_R
 */
public abstract class Cva_N extends Cva_L {

	private static final Class<Cva_N> CLASS_THIS = Cva_N.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 組合總數.<br/>
	 * To collect all C(n,r).<br/>
	 */
	public static int[] collectToNByToGo(int n) {

		Seq32 retSeq32 = new Seq32();

		for (int k = 1; k <= n; k++) {

			Seq32 seq32 = new Seq32();
			reGoByB32As2Pow(0b1 << (n - 1), k, 0b0, 0b1, seq32);

			retSeq32.appendAll(seq32);

		}

		return retSeq32.trim().ary32(false);

	}

}
