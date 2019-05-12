package lGpl20.comb;

import lGpl20.o.O;
import lGpl20.o.ery.Seq32;

/**
 * @version 2019/05/01_21:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Cva_R" >Cva_R.java</a>
 * 
 * @see Cva_V
 */
public abstract class Cva_R extends Cva_N {

	private static final Class<Cva_R> CLASS_THIS = Cva_R.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To bear the row for combination by space.<br/>
	 * To bear the row for combination by space.
	 */
	public static void bearForCByB32As2PowByTempSeq32(final int maxB32As2Pow, final int k, int prefix, int b32As2Pow,
			final Seq32 tempSeq32) {

		final int bitCount = Integer.bitCount(prefix);
		final int kMinus1 = k - 1;
		final int kMinus1MinusBitCount = kMinus1 - bitCount;

		for (; (b32As2Pow << kMinus1MinusBitCount) <= maxB32As2Pow;) {

			int tempPrefix = prefix | b32As2Pow;
			// O.l("bitCount=" + bitCount + " b32As2Pow=" + b32As2Pow + " tempPrefix=" + B32va.toStrIn8Bit(tempPrefix));
			b32As2Pow = b32As2Pow << 1;
			tempSeq32.a(tempPrefix);

		}

	}

	/**
	 * 從 1 全相異數列中取出 k 個數.<br/>
	 * To pick several numbers from a list of distinct numbers.
	 * 
	 * @see #goByB32As2Pow(int, int)
	 */
	public static int[] cByB32As2PowByToBearByTempSeq32(int n, int k) {

		if (n <= 0 || k <= 0 || n < k || n > 30) {

			O.x("n=" + n + ", k=" + k);

		}

		if (n == k) {

			return new int[] { (0b1 << n) - 0b1 };

		}

		Seq32 retSeq32 = new Seq32();
		Seq32 tempSeq32 = new Seq32();

		final int maxB32As2Pow = 0b1 << (n - 1);
		int currb32As2Pow = 0b1;

		final int bitCount = 0;// Integer.bitCount(prefix);
		final int kMinus1 = k - 1;
		final int kMinus1MinusBitCount = kMinus1 - bitCount;// k - atK + atBase <= n

		// init
		for (; (currb32As2Pow << kMinus1MinusBitCount) <= maxB32As2Pow;) {// example: C(5,3) the base is 1,2,4,8,16

			retSeq32.a(currb32As2Pow);
			currb32As2Pow = currb32As2Pow << 1;

		} // retSeq32 = [1,2,4]

		for (int atK = 1; atK < k; atK++) {// k=3, atK=1~2

			for (int i = 0; i != retSeq32.iLen; i++) {

				final int prefix = retSeq32.at(i);
				currb32As2Pow = Integer.highestOneBit(prefix) << 1;
				bearForCByB32As2PowByTempSeq32(maxB32As2Pow, k, prefix, currb32As2Pow, tempSeq32);

			}

			retSeq32 = tempSeq32;
			tempSeq32 = new Seq32();

		}

		return retSeq32.trim().ary32(false);

	}

}
