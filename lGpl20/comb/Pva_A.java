package lGpl20.comb;

import java.io.Serializable;

import lGpl20.b32.B32va;
import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.o.O;
import lGpl20.o.ery.Ery;
import lGpl20.o.ery.Seq;

/**
 * 排列.<br/>
 * <br/>
 * Permutation.
 * 
 * @version 2019/03/04_12:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Pva_A" >Pva_A.java</a>
 * 
 * @see Pva_H
 */
public abstract class Pva_A implements Serializable {

	private static final Class<Pva_A> CLASS_THIS = Pva_A.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 從 1 全相異數列中取出 k 個數做排列.<br/>
	 * To pick several numbers from a list of distinct numbers then to permutate.
	 */
	public static void reGo(final int b32Base, final int k, long prefix, Seq seq) {

		// O.l("prefix=" + O.L + B64IntoB6.str24(prefix));

		int prefix32 = B64IntoB6.toB32As2PowByB6Cell(prefix);
		// O.l("prefix32=" + O.L + B64IntoB6.str(prefix32));
		int b32Remainder = b32Base ^ prefix32;// b32Base - prefix32
		// O.l("b32Remainder=" + O.L + B64IntoB6.str24(b32Remainder));

		int lowest1;

		if ((k - Integer.bitCount(prefix32)) == 1) {

			for (; b32Remainder != 0; b32Remainder = b32Remainder ^ lowest1) {

				lowest1 = (b32Remainder & -b32Remainder);// Integer.lowestOneBit(b32Remainder);

				// O.l("above=" + B64IntoB6.toStrByB64IntoB6(tempPrefix));
				seq.a((prefix << B64IntoB6.$6) | (long) (B32va.log2OfLowest1(lowest1) + 1));

			}

			return;

		}

		for (; b32Remainder != 0; b32Remainder = b32Remainder ^ lowest1) {

			lowest1 = (b32Remainder & -b32Remainder);// Integer.lowestOneBit(b32Remainder);

			// O.l("below=" + B64IntoB6.toStrByB64IntoB6(tempPrefix) + O.L);

			reGo(b32Base, k, (prefix << B64IntoB6.$6) | (long) (B32va.log2OfLowest1(lowest1) + 1), seq);

		}

	}

	/**
	 * 從 1 全相異數列中取出 k 個數做排列.<br/>
	 * To pick several numbers from a list of distinct numbers then to permutate.
	 */
	public static long[] go(int n, int k) {

		if (n <= 0 || n > 30 || k <= 0 || n < k) { // fuck, about 30, see toStrToOntoBySAryByB32, B32va.log2OfLowest1AtB32

			O.x("n=" + n + ", k=" + k);

		}

		int b32Base = (0b1 << n) - 0b1;
		long prefix = 0b0L;
		Seq seq = new Seq();

		// O.l("b32Base=" + B64IntoB6.str24(b32Base));

		reGo(b32Base, k, prefix, seq);

		return seq.trim().ary(false);

	}

	/**
	 * 從 1 全相異數列中取出 k 個數做排列.<br/>
	 * To pick several numbers from a list of distinct numbers then to permutate.
	 */
	public static void goForStirling(final int b32Base, final int k, long prefix, long[] ary, final int atAry,
			Ery<long[]> retEry) {

		int prefix32 = B64IntoB6.toB32As2PowByB6Cell(prefix);
		int b32Remainder = b32Base ^ prefix32;
		// int atKPlus1 = B64IntoB6.totalNone0B6CellFromR(prefix) + 1;

		int lowest1;
		if ((k - Integer.bitCount(prefix32)) == 1) {

			for (; b32Remainder != 0; b32Remainder = b32Remainder ^ lowest1) {

				lowest1 = (b32Remainder & -b32Remainder);// Integer.lowestOneBit(b32Remainder);

				// O.l("above tempPrefix=" + O.L + B64va.toStrIn12Bit((int) tempPrefix));
				// O.l("above=" + B64IntoB6.toStrByB64IntoB6(tempPrefix));
				// seq.add(tempPrefix);

				long[] clonedAry = ary.clone();
				clonedAry[atAry] = (prefix << B64IntoB6.$6) | (long) (B32va.log2OfLowest1(lowest1) + 1);

				// O.l("above add tempPrefix=" + B64va.toStrIn12Bit((int) tempPrefix));
				retEry.a(clonedAry);

			}

			return;

		}

		for (; b32Remainder != 0; b32Remainder = b32Remainder ^ lowest1) {

			lowest1 = (b32Remainder & -b32Remainder);// Integer.lowestOneBit(b32Remainder);

			goForStirling(b32Base, k, (prefix << B64IntoB6.$6) | (long) (B32va.log2OfLowest1(lowest1) + 1), ary, atAry, retEry);

		}

	}

}
