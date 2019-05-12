package lGpl20.comb.thr;

import lGpl20.comb.Cva;
import lGpl20.comb.filter.Adder32;
import lGpl20.o.O;
import lGpl20.o.ery.Seq;
import lGpl20.o.ery.Seq32;
import lGpl20.o.thr.ThrWBox;

/**
 * 從 1 全相異數列中取出 n 個數.<br/>
 * To pick several numbers from a list of distinct numbers.
 * 
 * @version 2019/03/14_11:50:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=ThrToCByB64As2Pow" >ThrToCByB64As2Pow.
 *          java</a>
 * 
 */
public class ThrToCByB64As2Pow extends ThrWBox<long[]> {

	private static final Class<ThrToCByB64As2Pow> CLASS_THIS = ThrToCByB64As2Pow.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	protected long maxB64As2Pow;

	protected long allB64As2Pow;

	protected final int k;

	protected long beginB64As2Pow;

	protected int kMinus1MinusBitCountPrefixB64As2Pow;

	protected int iLen = 0;

	public Seq tempSeq;

	/**
	 * 從 1 列全相異數列中取出 k 個數.<br/>
	 * To pick several numbers from a list of distinct numbers.
	 */
	public void c(long prefixB64As2Pow, long currB64As2Pow) {

		Adder32.a2++;

		kMinus1MinusBitCountPrefixB64As2Pow = k - 1 - Long.bitCount(prefixB64As2Pow);

		if (kMinus1MinusBitCountPrefixB64As2Pow == 0) {// termination condition

			for (; currB64As2Pow <= maxB64As2Pow; currB64As2Pow = currB64As2Pow << 1) {

				box[iLen++] = currB64As2Pow | prefixB64As2Pow;

			}

			return;

		}

		for (; (currB64As2Pow << kMinus1MinusBitCountPrefixB64As2Pow) <= maxB64As2Pow;) {// k - atK + atBase <= n

			// currB64As2Pow often bigger than prefixB64As2Pow
			c((currB64As2Pow | prefixB64As2Pow), (currB64As2Pow = currB64As2Pow << 1));

		}

	}

	/**
	 * To pick some items with closed mode.<br/>
	 * To pick some items with closed mode.
	 * 
	 * @see Cva#reGoByB32As2Pow(int, int, int, int, Seq32)
	 */
	public void pickFromSpareB64As2Pow(long prefixB64As2Pow, long currB64As2Pow) {

		Adder32.a2++;

		kMinus1MinusBitCountPrefixB64As2Pow = k - 1 - Long.bitCount(prefixB64As2Pow);

		if (kMinus1MinusBitCountPrefixB64As2Pow == 0) {// termination condition

			for (; currB64As2Pow <= allB64As2Pow;) {

				if ((allB64As2Pow & currB64As2Pow) == 0b0L) {// spareB64As2Pow

					currB64As2Pow = currB64As2Pow << 1;

					continue;

				}

				// O.l("up allB64=" + B32va.str16((int) allB64As2Pow) + O.S32 + CLASS_THIS);
				// O.l("up prefixB64=" + B32va.str16((int) prefixB64As2Pow) + O.S32 + CLASS_THIS);
				// O.l("up currB64=" + B32va.str16((int) currB64As2Pow) + O.S32 + CLASS_THIS);

				// long temp64 = prefixB64As2Pow | currB64As2Pow;
				// O.l("add=" + B32va.str16((int) temp64) + O.S32 + CLASS_THIS);
				// O.l();

				// currB64As2Pow often bigger than prefixB64As2Pow
				this.tempSeq.a(currB64As2Pow | prefixB64As2Pow);// this.tempSeq.add(prefixB64As2Pow | currB64As2Pow);

				currB64As2Pow = currB64As2Pow << 1;

			}

		}

		long maskB64;// for performance
		// long tempAns;// very important

		// for (; (currB64As2Pow << kMinus1MinusBitCount) <= maxB32As2Pow;) {// k - atK + atBase <= n
		for (; currB64As2Pow <= allB64As2Pow;) {

			if ((allB64As2Pow & currB64As2Pow) == 0b0L) {// spareB64As2Pow

				currB64As2Pow = currB64As2Pow << 1;

				continue;

			}

			maskB64 = (currB64As2Pow << 1) - 1L;// not (currB32As2Pow<<1) ^ 0b1 //by the way so max int32 must be 30 bits

			// O.l("kMinus1MinusBitCountPrefixB64As2Pow=" + kMinus1MinusBitCountPrefixB64As2Pow + O.S32 + CLASS_THIS);

			//////////////////////////////////////////
			// A=1010
			// B=10 aka 0010
			//
			// mask = (B<<1)-1 = 11
			// maskedA = A & mask = 1010 & 11 = 0010

			// bitCount(A-maskedA) = 1 // aka A ^ maskedA
			// bitCount(A-maskedA) must be gte (k-atK-1)

			if (Long.bitCount(allB64As2Pow ^ (allB64As2Pow & maskB64)) < kMinus1MinusBitCountPrefixB64As2Pow) {

				break;

			}

			////////////////////////////////////////
			// O.l("allB64=" + B32va.str16((int) allB64As2Pow) + O.S32 + CLASS_THIS);
			// O.l("prefixB64=" + B32va.str16((int) prefixB64As2Pow) + O.S32 + CLASS_THIS);
			// O.l("currB64=" + B32va.str16((int) currB64As2Pow) + O.S32 + CLASS_THIS);

			// /O.l("call tempAns=" + B32va.str16((int) tempAns) + O.S32 + CLASS_THIS);
			// O.l("call currB64=" + B32va.str16((int) currB64As2Pow) + O.S32 + CLASS_THIS);
			// O.l();

			pickFromSpareB64As2Pow((currB64As2Pow | prefixB64As2Pow), (currB64As2Pow = currB64As2Pow << 1));

		}

	}

	/**
	 * 建構方法.<br/>
	 * Constructor.
	 */
	public ThrToCByB64As2Pow(int n, int k) {

		if (n > 62) {// fuck see B64va.toStrByLog2OfLowest1AtB64BySAry

			O.x("n=" + n);

		}

		maxB64As2Pow = 0b1L << (n - 1);

		this.k = k;

		box = new long[(int) Cva.int64(n, k)];

	}

	/**
	 * 建構方法.<br/>
	 * Constructor.
	 */
	public ThrToCByB64As2Pow(long allB64As2Pow, int k) {// spareB64As2Pow

		this.allB64As2Pow = allB64As2Pow;
		this.k = k;

		this.beginB64As2Pow = (allB64As2Pow & -allB64As2Pow);

		this.tempSeq = new Seq();

	}

	@Override
	public void run() {

		if (this.tempSeq == null) {// todo: need better condition

			c(0b0L, 0b1L);

			return;

		}

		pickFromSpareB64As2Pow(0b0L, this.beginB64As2Pow);// prefixB64As2Pow is 0b0L
		box = tempSeq.trim().ary(false);

	}

}
