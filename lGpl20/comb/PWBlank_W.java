package lGpl20.comb;

import lGpl20.b32.B32va;
import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.o.O;
import lGpl20.o.ery.Seq;

/**
 * @version 2018/03/11_20:59:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=PWBlank_W" >PWBlank_W.java</a>
 * 
 * @see PWBlank_Z
 */
public abstract class PWBlank_W extends PWBlank_A {

	private static final Class<PWBlank_W> CLASS_THIS = PWBlank_W.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 從 1 全相異數列中取出 k 個數做排列.<br/>
	 * To pick several numbers from a list of distinct numbers then to permutate.
	 */
	public static void go(final int b32Base, final int b32Blank, long prefix, final int k, Seq seq) {

		int prefix32 = B64IntoB6.toB32As2PowByB6Cell(prefix);
		int b32Remainder = b32Base ^ prefix32;
		// int atKPlus1 = B64IntoB6.totalNone0B6CellFromR(prefix) + 1;
		int atKPlus1 = Integer.bitCount(prefix32) + 1;

		if (atKPlus1 == k) {

			int lowest1;
			for (; b32Remainder > 0; b32Remainder = b32Remainder ^ lowest1) {

				lowest1 = (b32Remainder & -b32Remainder);// Integer.lowestOneBit(b32Remainder);
				int value = B32va.log2OfLowest1(lowest1) + 1;

				if ((lowest1 & b32Blank) == 0b0) {

					seq.a((prefix << B64IntoB6.$6) | (long) value);

				} else {

					if (lowest1 > Integer.highestOneBit(prefix32)) {

						seq.a((prefix << B64IntoB6.$6) | (long) value);

					} else {

						continue;

					}

				}

			}

			return;

		}

		int lowest1;
		for (; b32Remainder > 0; b32Remainder = b32Remainder ^ lowest1) {

			lowest1 = (b32Remainder & -b32Remainder);// Integer.lowestOneBit(b32Remainder);
			int value = B32va.log2OfLowest1(lowest1) + 1;

			if ((lowest1 & b32Blank) == 0b0) {

				go(b32Base, b32Blank, (prefix << B64IntoB6.$6) | (long) value, k, seq);

			} else {

				if (lowest1 > Integer.highestOneBit(prefix32)) {

					go(b32Base, b32Blank, (prefix << B64IntoB6.$6) | (long) value, k, seq);

				} else {

					continue;

				}

			}

		}

	}

	/**
	 * 從 1 全相異數列中取出 k 個數做排列.<br/>
	 * To pick several numbers from a list of distinct numbers then to permutate.
	 */
	public static long[] go(int n, int k) {

		if (n <= 0 || n > 30 || k <= 0) { // fuck, about 30, see toStrToOntoBySAryByB32

			O.x("n=" + n + ", k=" + k);

		}

		// int theBlank=k-n;
		int b32Base = (0b1 << k) - 0b1;
		// O.l("b32Base=" + O.L + B32va.toStrIn8Bit((int) b32Base));
		int b32Blank = b32Base ^ ((0b1 << n) - 0b1);
		// O.l("b32Blank=" + O.L + B32va.toStrIn8Bit((int) b32Blank));
		long prefix = 0b0L;
		Seq seq = new Seq();

		go(b32Base, b32Blank, prefix, k, seq);

		return seq.trim().ary(false);

	}

}
