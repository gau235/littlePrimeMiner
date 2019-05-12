package lGpl20.comb;

import lGpl20.o.O;
import lGpl20.o.ery.Seq;

/**
 * @version 2017/03/17_09:17:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=PWBlankAsCirc_Z" >PWBlankAsCirc_Z.java
 *          </a>
 * 
 * @see PWBlankAsCirc
 */
public abstract class PWBlankAsCirc_Z extends PWBlankAsCirc_A {

	private static final Class<PWBlankAsCirc_Z> CLASS_THIS = PWBlankAsCirc_Z.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 從 1 全相異數列中取出 k 個數做排列.<br/>
	 * To pick several numbers from a list of distinct numbers then to permutate.
	 */
	public static long[] go(int n, int k) {

		if (n <= 0 || n > 30 || k <= 0 || n >= k) { // fuck, about 30, see toStrToOntoBySAryByB32

			O.x("n=" + n + ", k=" + k);

		}

		// int theBlank=k-n;
		int b32Base = (0b1 << k) - 0b1;
		// O.l("b32Base=" + O.L + B32va.toStrIn8Bit((int) b32Base));
		int b32Blank = b32Base ^ ((0b1 << n) - 0b1);
		// O.l("b32Blank=" + O.L + B32va.toStrIn8Bit((int) b32Blank));
		long prefix = 0b1L;
		Seq seq = new Seq();

		go(b32Base, b32Blank, prefix, k, seq);

		return seq.trim().ary(false);

	}

}
