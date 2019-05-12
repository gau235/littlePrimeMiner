package lGpl20.comb;

import lGpl20.o.O;
import lGpl20.o.ery.Seq32;

/**
 * @version 2019/02/25_19:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Cva_L" >Cva_L.java</a>
 * 
 * @see Cva_N
 */
public abstract class Cva_L extends Cva_J {

	private static final Class<Cva_L> CLASS_THIS = Cva_L.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 從 1 列全相異數列中取出 k 個數.<br/>
	 * To pick several numbers from a list of distinct numbers.
	 */
	public static void reGoByB32As2Pow(final int maxB32As2Pow, final int k, int prefixB32As2Pow, int currB32As2Pow,
			Seq32 retSeq32) {

		final int kMinus1MinusBitCountPrefix = k - 1 - Integer.bitCount(prefixB32As2Pow);

		if (kMinus1MinusBitCountPrefix == 0) {// termination condition

			// for (; (b32As2Pow << kMinus1MinusBitCountPrefix) <= maxB32As2Pow;) {
			for (; currB32As2Pow <= maxB32As2Pow;) {

				retSeq32.a(currB32As2Pow | prefixB32As2Pow);

				currB32As2Pow = currB32As2Pow << 1;

			}

			return;

		}

		for (; (currB32As2Pow << kMinus1MinusBitCountPrefix) <= maxB32As2Pow;) {// k - atK + atBase <= n

			// O.l("bitCount=" + bitCount + " currB32As2Pow=" + currB32As2Pow + " tempPrefix=" + B32va.str16(tempPrefix));

			reGoByB32As2Pow(maxB32As2Pow, k, (currB32As2Pow | prefixB32As2Pow), (currB32As2Pow = currB32As2Pow << 1), retSeq32);

		}

	}

	/**
	 * 從 1 列全相異數列中取出 k 個數.<br/>
	 * To pick several numbers from a list of distinct numbers.
	 */
	public static int[] goByB32As2Pow(int n, int k) {

		if (n > 30) {// fuck see toStrToOntoBySAryByB32

			O.x("n=" + n);

		}

		// todo: as k > n; k == n

		Seq32 seq32 = new Seq32();
		reGoByB32As2Pow(0b1 << (n - 1), k, 0b0, 0b1, seq32);

		return seq32.trim().ary32(false);

	}

}
