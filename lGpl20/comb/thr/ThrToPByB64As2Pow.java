package lGpl20.comb.thr;

import lGpl20.b64.B64va;
import lGpl20.comb.Pva;
import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.o.O;
import lGpl20.o.thr.ThrWBox;

/**
 * 從 1 全相異數列中取出 n 個數.<br/>
 * To pick several numbers from a list of distinct numbers.
 * 
 * @version 2019/03/04_12:50:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=ThrToPByB64As2Pow" >ThrToPByB64As2Pow.
 *          java</a>
 * 
 */
public class ThrToPByB64As2Pow extends ThrWBox<long[]> {

	private static final Class<ThrToPByB64As2Pow> CLASS_THIS = ThrToPByB64As2Pow.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	protected long allB64As2Pow;

	protected final int k;

	protected int iLen = 0;

	/**
	 * 從 1 全相異數列中取出 k 個數做排列.<br/>
	 * To pick several numbers from a list of distinct numbers then to permutate.
	 */
	public void reGo(long prefixB64IntoB6) {

		// O.l("prefixB64IntoB6=" + O.L + B64IntoB6.str24(prefixB64IntoB6));

		long prefixB64As2Pow = B64IntoB6.toB64As2PowByB6Cell(prefixB64IntoB6);

		long b64Remainder = allB64As2Pow ^ prefixB64As2Pow;
		long lowest1;

		if ((k - Long.bitCount(prefixB64As2Pow)) == 1) {

			for (; b64Remainder != 0b0L; b64Remainder = b64Remainder ^ lowest1) {

				lowest1 = (b64Remainder & -b64Remainder);

				// seq.add((prefixB64IntoB6 << B64IntoB6.$NUM_OF_BIT_PER_CELL_INT32) | (long) value32);
				box[iLen++] = ((prefixB64IntoB6 << B64IntoB6.$6)
						| (long) (B64va.log2OfLowest1(lowest1) + 1));
				// O.l("prefixB64IntoB6=" + O.L + B64IntoB6.str24(prefixB64IntoB6) + O.S44 + CLASS_THIS);

			}

			return;

		}

		for (; b64Remainder != 0b0L; b64Remainder = b64Remainder ^ lowest1) {

			lowest1 = (b64Remainder & -b64Remainder);// Integer.lowestOneBit(b32Remainder);

			reGo(((prefixB64IntoB6 << B64IntoB6.$6) | (long) (B64va.log2OfLowest1(lowest1) + 1)));

		}

	}

	/**
	 * 建構方法.<br/>
	 * Constructor.
	 */
	public ThrToPByB64As2Pow(long allB64As2Pow, int k) {

		this.allB64As2Pow = allB64As2Pow;

		this.k = k;

		box = new long[(int) Pva.int64(Long.bitCount(allB64As2Pow), k)];

	}

	@Override
	public void run() {

		reGo(0b0L);

	}

}
