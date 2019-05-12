package lGpl20.comb;

import lGpl20.b32.B32va;
import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.o.O;
import lGpl20.o.ery.Ery;
import lGpl20.o.ery.Seq;

/**
 * @version 2018/03/12_17:39:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Der_Z" >Der_Z.java</a>
 * 
 * @see Der
 */
public abstract class Der_Z extends Der_C {

	private static final Class<Der_Z> CLASS_THIS = Der_Z.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 回傳亂序數.<br/>
	 * 即 n 個人排成一列後解散再排成一列, 沒有人排在自己原先的位置的方法數.<br/>
	 * D(n)=nD(n-1)+(-1)^n<br/>
	 * 0, 1, 2, 9, 44, 265, 1854,...<br/>
	 * To return the number of ways that n people line up then dismiss, and<br/>
	 * line up again but nobody is at the previous position.
	 */
	public static long[] goOnNEqKAftP(int n) {

		if (n <= 0 || n > 30) {// fuck, about 30, see toStrToOntoBySAryByB32

			O.x("n=" + n);

		}

		int b32Base = (0b1 << n) - 0b1;
		long prefix = 0b0L;
		Seq seq = new Seq();

		// O.l("b32Base=" + B32va.str16(b32Base));

		goOnNEqKAftP(b32Base, prefix, n, n, seq);// n==k

		return seq.trim().ary(false);

	}

	/**
	 * 回傳亂序數.<br/>
	 * 即 n 個人排成一列後解散再排成一列, 沒有人排在自己原先的位置的方法數.<br/>
	 * D(n)=nD(n-1)+(-1)^n<br/>
	 * 0, 1, 2, 9, 44, 265, 1854,...<br/>
	 * To return the number of ways that n people line up then dismiss, and<br/>
	 * line up again but nobody is at the previous position.
	 */
	public static void goOnNEqKAftP(final int b32Base, long prefix, final int k, long[] ary, final int atAry, Ery<long[]> retEry) {

		int prefix32 = B64IntoB6.toB32As2PowByB6Cell(prefix);
		int b32Remainder = b32Base ^ prefix32;
		// int atKPlus1 = B64IntoB6.totalNone0B6CellFromR(prefix) + 1;
		int atKPlus1 = Integer.bitCount(prefix32) + 1;

		if (atKPlus1 == k) {

			int lowest1;
			for (; b32Remainder > 0; b32Remainder = b32Remainder ^ lowest1) {

				lowest1 = (b32Remainder & -b32Remainder);// Integer.lowestOneBit(b32Remainder);

				// int i_th1AtB32FromR = B32va.i_th1AtB32FromR(b32Base, atKPlus1);
				if (B32va.i_th1AtB32FromR(b32Base, atKPlus1) == lowest1) {

					continue;

				}

				int value = B32va.log2OfLowest1(lowest1) + 1;

				// seq.add((prefix << B64IntoB6.BIT_OF_CELL_INT32) | value);
				long[] clonedAry = ary.clone();
				clonedAry[atAry] = (prefix << B64IntoB6.$6) | (long) value;
				retEry.a(clonedAry);

			}

			return;

		}

		int lowest1;
		for (; b32Remainder > 0; b32Remainder = b32Remainder ^ lowest1) {

			lowest1 = (b32Remainder & -b32Remainder);// Integer.lowestOneBit(b32Remainder);

			// int i_th1AtB32FromR = B32va.i_th1AtB32FromR(b32Base, atKPlus1);
			if (B32va.i_th1AtB32FromR(b32Base, atKPlus1) == lowest1) {

				continue;

			}

			int value = B32va.log2OfLowest1(lowest1) + 1;

			goOnNEqKAftP(b32Base, (prefix << B64IntoB6.$6) | (long) value, k, ary, atAry, retEry);

		}

	}

}
