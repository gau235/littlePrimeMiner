package lGpl20.comb.wDup;

import lGpl20.b64.B64va;
import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.o.O;
import lGpl20.o.thr.ThrWBox;

/**
 * 從 1 全相異數列中取出 n 個數.<br/>
 * To pick several numbers from a list of distinct numbers.
 * 
 * @version 2019/03/26_17:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=ThrToPWDup" >ThrToPWDup.java</a>
 * 
 */
public class ThrToPWDup extends ThrWBox<DatToPWDup> {

	private static final Class<ThrToPWDup> CLASS_THIS = ThrToPWDup.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	protected long allB64As2Pow;

	protected final int k;

	protected long temp64;

	/**
	 * To convert.<br/>
	 * To convert.
	 */
	public static long convertVal32NPlus1InB64IntoB6(long b64IntoB6OfQRPlus1) {

		b64IntoB6OfQRPlus1 = B64IntoB6.revAgainstB6FromR(b64IntoB6OfQRPlus1);

		long retB64IntoB6 = 0b0L;

		int val32;

		do {

			val32 = (((int) b64IntoB6OfQRPlus1 & B64IntoB6.MASK32) - 1) / DatToShW.$6 + 1;// must plus 1

			retB64IntoB6 = ((retB64IntoB6 << B64IntoB6.$6) | (long) val32);

		} while ((b64IntoB6OfQRPlus1 = b64IntoB6OfQRPlus1 >>> B64IntoB6.$6) != 0b0L);

		return retB64IntoB6;

	}

	/**
	 * 從 1 全相異數列中取出 k 個數做排列.<br/>
	 * To pick several numbers from a list of distinct numbers then to permutate.
	 */
	public void reGo(long prefixB64IntoB6) {

		// O.l("prefix=" + O.L + B64IntoB6.str24(prefix));

		long prefixB64As2Pow = B64IntoB6.toB64As2PowByB6Cell(prefixB64IntoB6);

		long b64Remainder = allB64As2Pow ^ prefixB64As2Pow;
		long lowest1;
		int value32;

		if ((k - Long.bitCount(prefixB64As2Pow)) == 1) {

			for (; b64Remainder != 0b0L; b64Remainder = b64Remainder ^ lowest1) {

				lowest1 = (b64Remainder & -b64Remainder);
				value32 = B64va.log2OfLowest1(lowest1) + 1;

				// seq.add((prefixB64IntoB6 << B64IntoB6.$NUM_OF_BIT_PER_CELL_INT32) | (long) value32);

				temp64 = (prefixB64IntoB6 << B64IntoB6.$6) | (long) value32;
				temp64 = convertVal32NPlus1InB64IntoB6(temp64);

				if (box.ifPassToInEx(temp64)) {

					box.retDistinctSetFromMap.putInNCount(temp64);
					box.total32++;

				}

				// box.addAftPassedInExNCount((prefixB64IntoB6 << B64IntoB6.$NUM_OF_BIT_PER_CELL_INT32) | (long) value32);
				// O.l("prefixB64IntoB6=" + O.L + B64IntoB6.str24(prefixB64IntoB6) + O.S44 + CLASS_THIS);

				// err:
				// prefixB64IntoB6 = ((prefixB64IntoB6 << B64IntoB6.$NUM_OF_BIT_PER_CELL_INT32) | (long) value32);
				// box.addAftPassedInExNCount(prefixB64IntoB6);

			}

			return;

		}

		for (; b64Remainder != 0b0L; b64Remainder = b64Remainder ^ lowest1) {

			lowest1 = (b64Remainder & -b64Remainder);// Integer.lowestOneBit(b32Remainder);
			value32 = B64va.log2OfLowest1(lowest1) + 1;

			temp64 = (prefixB64IntoB6 << B64IntoB6.$6) | (long) value32;

			if (!box.isToEx(convertVal32NPlus1InB64IntoB6(temp64))) {

				reGo(temp64);

			}

		}

	}

	/**
	 * 建構方法.<br/>
	 * Constructor.
	 */
	public ThrToPWDup(DatToPWDup datToPWDup) {

		box = datToPWDup;

		this.allB64As2Pow = datToPWDup.b64As2PowOfQRPlus1;

		this.k = datToPWDup.k;

	}

	@Override
	public void run() {

		reGo(0b0L);

	}

}
