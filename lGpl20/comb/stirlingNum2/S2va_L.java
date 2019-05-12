package lGpl20.comb.stirlingNum2;

import lGpl20.b32.B32va;
import lGpl20.comb.Cva;
import lGpl20.comb.filter.Adder32;
import lGpl20.comb.filter.CompaForAry32OfB32As2Pow;
import lGpl20.comb.filter.Condi;
import lGpl20.comb.filter.FilterInComb;
import lGpl20.comb.onto.Ontova;
import lGpl20.o.O;
import lGpl20.o.ery.Ery;
import lGpl20.o.ery.Seq32;

/**
 * @version 2018/09/18_10:30:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=S2va_L" >S2va_L.java</a>
 * 
 * @see S2va_U
 */
public abstract class S2va_L extends S2va_K {

	private static final Class<S2va_L> CLASS_THIS = S2va_L.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To tail the S2 function by bit32.<br/>
	 * To tail the S2 function by bit32.<br/>
	 * S2: 水平组合後再垂直组合<br/>
	 * Onto: 水平排列後再垂直组合
	 */
	public static void putOnVerticallyIfGt(final int b32Remainder, int[] aryOfB32, int iHorizontal, Condi condi,
			Ery<int[]> retEry) {

		Adder32.a1++;

		final int newValue = b32Remainder & (-b32Remainder);// Integer.lowestOneBit(b32Remainder);

		if (Integer.bitCount(b32Remainder) == 1) { // termination condition

			int keptValue;
			for (int i = iHorizontal; i != aryOfB32.length; i++) {
				// for (int i = aryOfB32.length - 1; i >= iHorizontal; i--) {

				keptValue = aryOfB32[i];
				// O.l("keptValue=" + keptValue);

				if (newValue > keptValue) {// all items distinct and 8 > 4+2+1

					int[] clonedAryOfB32 = aryOfB32.clone();
					clonedAryOfB32[i] = newValue | keptValue;// press on == keptValue | newValue

					// O.l("clonedAryOfB32=" + Arrays.toString(clonedAryOfB32));

					// countOfBit = Integer.bitCount(keptValue);
					// O.l("countOfBit=" + countOfBit + O.S32 + CLASS_THIS);
					// if (/* countOfBit >= min && */countOfBit <= condi.max) {

					if (FilterInComb.ifEveryBitCountInAry32Between(clonedAryOfB32, condi.min, condi.max)) {

						retEry.a(clonedAryOfB32);

					}

				} else {

					return;

				}

			}

			return;

		}

		int keptValue;
		for (int i = iHorizontal; i != aryOfB32.length; i++) {
			// for (int i = aryOfB32.length - 1; i >= iHorizontal; i--) {

			keptValue = aryOfB32[i];
			// O.l("keptValue=" + keptValue);

			if (newValue < keptValue) {

				return;

			}

			int[] clonedAryOfB32 = aryOfB32.clone();
			clonedAryOfB32[i] = newValue | keptValue;// press on == keptValue | newValue

			// O.l("clonedAryOfB32=" + Arrays.toString(clonedAryOfB32));

			// if (FilterInComb.ifEveryBitCountInAry32Between(clonedAry32, min, max)) {

			putOnVerticallyIfGt((b32Remainder ^ newValue), clonedAryOfB32, iHorizontal, condi, retEry);

			// }

		}

	}

	////////////////////////////////////////////////////

	/**
	 * Stirling number of the second kind.<br/>
	 * Stirling number of the second kind.
	 * 
	 * @see Ontova#go(Condi)
	 */
	public static Ery<int[]> go(Condi condi) {

		Ery<int[]> eryOfAry32 = new Ery<int[]>();

		int b32Base = (0b1 << condi.n) - 0b1;
		if (condi.k == 1) {// k==1

			eryOfAry32.a(new int[] { b32Base });
			eryOfAry32.setComparator(new CompaForAry32OfB32As2Pow());
			return eryOfAry32;

		}

		if (condi.n == condi.k) {

			eryOfAry32.a(B32va.distributeOverAry32OnBit(b32Base));
			eryOfAry32.setComparator(new CompaForAry32OfB32As2Pow());
			return eryOfAry32;

		}

		Seq32 seq32 = new Seq32();
		// int maxB32As2Pow = 0b1 << (n - 1);
		Cva.reGoByB32As2Pow(0b1 << (condi.n - 1), condi.k, 0b1, 0b10, seq32);// the 'A' symbol must be at the most left hand side

		int[] ary32 = seq32.trim().ary32(false);
		int theB32;
		for (int i = 0; i != ary32.length; i++) {

			theB32 = ary32[i];
			// int b32Remainder = b32Base ^ theB32;

			putOnVerticallyIfGt(b32Base ^ theB32, B32va.distributeOverAry32OnBit(theB32), 0, condi, eryOfAry32);

		}

		eryOfAry32.setComparator(new CompaForAry32OfB32As2Pow());

		return eryOfAry32;

	}

	////////////////////////////////////////////////////

	/**
	 * Stirling number of the second kind.<br/>
	 * Stirling number of the second kind.<br/>
	 * To collect.
	 */
	public static Ery<int[]> collectToKByToGo(Condi condi, boolean isToSort) {// min starts from 1

		Ery<int[]> retEryOfAry32 = new Ery<int[]>();

		final int endK = condi.k;

		Condi clonedConi = condi.clone();
		clonedConi.min = 1;// fuck

		for (int k = 1; k <= endK; k++) {

			clonedConi.k = k;
			Ery<int[]> eryOfAry32 = go(clonedConi);

			if (isToSort) {

				eryOfAry32.sort();

			}

			retEryOfAry32.appendAll(eryOfAry32);

		}

		retEryOfAry32.setComparator(new CompaForAry32OfB32As2Pow());

		return retEryOfAry32;

	}

}
