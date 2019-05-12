package lGpl20.comb;

import lGpl20.b32.B32va;
import lGpl20.o.O;
import lGpl20.o.ery.Seq;

/**
 * @version 2019/04/06_11:30:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=PAsCirc_Z" >PAsCirc_Z.java</a>
 * 
 * @see PAsCirc
 */
public abstract class PAsCirc_Z extends PAsCirc_C {

	private static final Class<PAsCirc_Z> CLASS_THIS = PAsCirc_Z.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 從 1 全相異數列中取出 k 個數做環狀排列.<br/>
	 * To pick several numbers from a list of distinct numbers then to do circular permutation.
	 */
	public static long[] go(int n) {// n==k

		if (n <= 0 || n > 30) {// fuck, about 30, see toStrToOntoBySAryByB32

			O.x("n=" + n);

		}

		if (n == 1) {

			return new long[] { 0b1L };

		}

		int b32Base = (0b1 << n) - 0b1;
		long prefix = 0b1L;// fuck
		Seq seq = new Seq();

		// O.l("b32Base=" + B32va.str16(b32Base));

		reGo(b32Base, n, prefix, seq);

		return seq.trim().ary(false);

	}

	/**
	 * 從 1 全相異數列中取出 k 個數做環狀排列.<br/>
	 * To pick several numbers from a list of distinct numbers then to do circular permutation.
	 */
	public static long[] goOnNEqKAftCByB32As2Pow(int n, int k) {

		if (n <= 0 || n > 30 || k <= 0 || n < k) {// fuck, about 30, see toStrToOntoBySAryByB32

			O.x("n=" + n + ", k=" + k);

		}

		Seq seq = new Seq();

		if (k == 1) {

			for (int i = 0b01; i <= n; i++) {

				seq.a((long) i);

			}

			return seq.trim().ary(false);

		}

		int[] ary32 = Cva.goByB32As2Pow(n, k);

		int theBase32;
		long prefix;
		for (int i = 0; i != ary32.length; i++) {

			theBase32 = ary32[i];
			// O.l("theBase32=" + B32va.str32(theBase32) + O.S32 + CLASS_THIS);

			prefix = (long) (B32va.log2OfLowest1(theBase32 & -theBase32) + 1);// fuck

			reGo(theBase32, Integer.bitCount(theBase32), prefix, seq);

		}

		return seq.trim().ary(false);

	}

}
