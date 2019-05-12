package lGpl20.comb;

import lGpl20.b32.B32va;
import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.o.O;
import lGpl20.o.ery.Seq;

/**
 * @version 2019/04/06_18:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=PInEx_Y" >PInEx_Y.java</a>
 * 
 * @see PInEx_Z
 */
public abstract class PInEx_Y extends PInEx_A {

	private static final Class<PInEx_Y> CLASS_THIS = PInEx_Y.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 回傳亂序數.<br/>
	 * 即 n 個人排成一列後解散再排成一列, 沒有人排在自己原先的位置的方法數.<br/>
	 * D(n)=nD(n-1)+(-1)^n<br/>
	 * 0, 1, 2, 9, 44, 265, 1854,...<br/>
	 * To return the number of ways that n people line up then dismiss, and<br/>
	 * line up again but nobody is at the previous position.
	 */
	public static void goOnNEqKAftP(final int b32Base, long prefix, final int k, final int topKToEx, Seq seq) {

		int prefix32 = B64IntoB6.toB32As2PowByB6Cell(prefix);
		int b32Remainder = b32Base ^ prefix32;// b32Base - prefix32
		// int atKPlus1 = B64IntoB6.totalNone0B6CellFromR(prefix) + 1;
		int atKPlus1 = Integer.bitCount(prefix32) + 1;

		int lowest1;

		if (atKPlus1 == k) {

			for (; b32Remainder != 0; b32Remainder = b32Remainder ^ lowest1) {

				lowest1 = (b32Remainder & -b32Remainder);// Integer.lowestOneBit(b32Remainder);
				// int totalB6Plus1 = B64IntoB6.totalNone0B6CellFromR(prefix) + 1;
				// int i_th1AtB32FromR = B32va.i_th1AtB32FromR(b32Base, atKPlus1);

				if ((atKPlus1 <= topKToEx) && (B32va.i_th1AtB32FromR(b32Base, atKPlus1) == lowest1)) {

					continue;

				}

				seq.a((prefix << B64IntoB6.$6) | (B32va.log2OfLowest1(lowest1) + 1));

			}

			return;

		}

		for (; b32Remainder != 0; b32Remainder = b32Remainder ^ lowest1) {

			lowest1 = (b32Remainder & -b32Remainder);// Integer.lowestOneBit(b32Remainder);
			// int i_th1AtB32FromR = B32va.i_th1AtB32FromR(b32Base, atKPlus1);

			if ((atKPlus1 <= topKToEx) && (B32va.i_th1AtB32FromR(b32Base, atKPlus1) == lowest1)) {

				continue;

			}

			goOnNEqKAftP(b32Base, (prefix << B64IntoB6.$6) | (B32va.log2OfLowest1(lowest1) + 1), k,
					topKToEx, seq);

		}

	}

	/**
	 * 回傳亂序數.<br/>
	 * 即 n 個人排成一列後解散再排成一列, 沒有人排在自己原先的位置的方法數.<br/>
	 * D(n)=nD(n-1)+(-1)^n<br/>
	 * 0, 1, 2, 9, 44, 265, 1854,...<br/>
	 * To return the number of ways that n people line up then dismiss, and<br/>
	 * line up again but nobody is at the previous position.
	 */
	public static long[] goOnNEqKAftPAftCByB32As2Pow(int n, int k, int topKToEx) {

		if (n <= 0 || n > 30 || k <= 0 || n < k || topKToEx < 0) {// fuck, about 30, see toStrToOntoBySAryByB32

			O.x("n=" + n + ", k=" + k + ", topKToEx=" + topKToEx);

		}

		int[] ary32 = Cva.goByB32As2Pow(n, k);
		Seq seq = new Seq();

		for (int i = 0; i < ary32.length; i++) {// first atK is 0

			int theBase32 = ary32[i];
			// O.l("theBase32=" + B32va.toStrIn12Bit(theBase32) + O.S32 + CLASS_THIS);
			goOnNEqKAftP(theBase32, 0b0L, Integer.bitCount(theBase32), topKToEx, seq);

		}

		return seq.trim().ary(false);

	}

}
