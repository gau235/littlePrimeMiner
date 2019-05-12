package lGpl20.comb.wDup;

import lGpl20.b64.B64va;
import lGpl20.comb.Cva;
import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.comb.filter.Adder32;
import lGpl20.o.O;
import lGpl20.o.ery.Seq32;
import lGpl20.o.thr.ThrWBox;

/**
 * 從 1 全相異數列中取出 n 個數.<br/>
 * To pick several numbers from a list of distinct numbers.
 * 
 * @version 2019/03/26_17:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=ThrToCWDup" >ThrToCWDup.java</a>
 * 
 */
public class ThrToCWDup extends ThrWBox<DatToPWDup> {

	private static final Class<ThrToCWDup> CLASS_THIS = ThrToCWDup.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	protected long allB64As2Pow;

	protected final int k;

	protected int kMinus1MinusBitCountPrefixB64As2Pow;

	protected long temp64;

	/**
	 * To convert.<br/>
	 * To convert.
	 */
	public static long convertVal32NPlus1InB64As2Pow(long b64As2Pow) {

		long retB64IntoB6 = 0b0L;

		long maskB64 = 0b1L;
		long tempB64;

		do {

			tempB64 = b64As2Pow & maskB64;
			maskB64 = maskB64 << 1;
			// O.l("temp32=" + str16(temp32) + O.S32 + CLASS_THIS);

			int val32;

			if (b64As2Pow < maskB64) {// terminate

				if (tempB64 != 0b0L) {// its necessary

					val32 = B64va.log2OfLowest1(tempB64) / DatToShW.$6;

					retB64IntoB6 = (retB64IntoB6 << B64IntoB6.$6) | (long) (val32 + 1);

				}

				return retB64IntoB6;

			} else {

				if (tempB64 != 0b0L) {// its necessary

					val32 = B64va.log2OfLowest1(tempB64) / DatToShW.$6;

					retB64IntoB6 = (retB64IntoB6 << B64IntoB6.$6) | (long) (val32 + 1);

				}

			}

		} while (true);

	}

	/**
	 * To pick some items with closed mode.<br/>
	 * To pick some items with closed mode.
	 * 
	 * @see Cva#reGoByB32As2Pow(int, int, int, int, Seq32)
	 */
	public void reGo(long prefixB64As2Pow, long currB64As2Pow) {

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

				temp64 = convertVal32NPlus1InB64As2Pow(currB64As2Pow | prefixB64As2Pow);
				currB64As2Pow = currB64As2Pow << 1;

				if (box.ifPassToInEx(temp64)) {

					box.retDistinctSetFromMap.putInNCount(temp64);
					box.total32++;

				}

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

			temp64 = currB64As2Pow | prefixB64As2Pow;
			currB64As2Pow = currB64As2Pow << 1;

			if (!box.isToEx(convertVal32NPlus1InB64As2Pow(temp64))) {

				reGo(temp64, currB64As2Pow);

			}

		}

	}

	/**
	 * 建構方法.<br/>
	 * Constructor.
	 */
	public ThrToCWDup(DatToPWDup datToPWDup) {

		box = datToPWDup;

		this.allB64As2Pow = datToPWDup.b64As2PowOfQRPlus1;

		this.k = datToPWDup.k;

	}

	@Override
	public void run() {

		// reGo(0b0L, Long.lowestOneBit(box.b64As2PowOfQRPlus1));// prefixB64As2Pow is 0b0L
		reGo(0b0L, (allB64As2Pow & -allB64As2Pow));// prefixB64As2Pow is 0b0L

	}

}
