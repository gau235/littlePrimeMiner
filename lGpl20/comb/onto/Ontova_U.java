package lGpl20.comb.onto;

import lGpl20.comb.Cva;
import lGpl20.comb.Pva;
import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.comb.filter.Adder32;
import lGpl20.comb.filter.CompaForAry32OfB32As2Pow;
import lGpl20.comb.filter.Condi;
import lGpl20.comb.filter.FilterInComb;
import lGpl20.comb.stirlingNum2.S2va;
import lGpl20.o.O;
import lGpl20.o.ery.Ery;
import lGpl20.o.ery.Seq;
import lGpl20.o.ery.Seq32;

/**
 * @version 2019/04/04_18:50:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Ontova_U" >Ontova_U.java</a>
 * 
 * @see Ontova_W
 */
public abstract class Ontova_U extends Ontova_L {

	private static final Class<Ontova_U> CLASS_THIS = Ontova_U.class;

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
			for (int i = iHorizontal; i < aryOfB32.length; i++) {
				// for (int i = aryOfB32.length - 1; i >= iHorizontal; i--) {

				keptValue = aryOfB32[i];
				// O.l("keptValue=" + keptValue);

				if (newValue > keptValue) {// all items distinct and 8 > 4+2+1

					int[] clonedAryOfB32 = aryOfB32.clone();
					clonedAryOfB32[i] = newValue | keptValue;// press on == keptValue | newValue

					// O.l("clonedAryOfB32=" + Arrays.toString(clonedAryOfB32));
					if (FilterInComb.ifEveryBitCountInAry32Between(clonedAryOfB32, condi.min, condi.max)) {

						retEry.a(clonedAryOfB32);

					}

				} else {

					continue;// horizontally move to next

				}

			}

			return;

		}

		int keptValue;
		for (int i = iHorizontal; i < aryOfB32.length; i++) {
			// for (int i = aryOfB32.length - 1; i >= iHorizontal; i--) {

			keptValue = aryOfB32[i];
			// O.l("keptValue=" + keptValue);

			if (newValue < keptValue) {

				continue;

			}

			int[] clonedAryOfB32 = aryOfB32.clone();
			clonedAryOfB32[i] = newValue | keptValue;// press on == keptValue | newValue

			// O.l("clonedAryOfB32=" + Arrays.toString(clonedAryOfB32));

			if (FilterInComb.ifEveryBitCountInAry32Between(clonedAryOfB32, 1, condi.max)) {

				putOnVerticallyIfGt((b32Remainder ^ newValue), clonedAryOfB32, iHorizontal, condi, retEry);

			}

		}

	}

	/**
	 * To put n people in k rooms.<br/>
	 * To put n people in k rooms.
	 * 
	 * @see S2va#go(Condi)
	 */
	public static Ery<int[]> go(Condi condi) {

		int b32Base = (0b1 << condi.n) - 0b1;
		long prefix = 0b0L;
		Ery<int[]> eryOfAry32 = new Ery<int[]>();

		if (condi.k == 1) {// k==1

			eryOfAry32.a(new int[] { b32Base });
			eryOfAry32.setComparator(new CompaForAry32OfB32As2Pow());
			return eryOfAry32;

		}

		Seq seq = new Seq();
		if (condi.n == condi.k) {

			Pva.reGo(b32Base, condi.k, prefix, seq);
			long[] retAry = seq.trim().ary(false);

			for (int i = 0; i != retAry.length; i++) {

				eryOfAry32.a(B64IntoB6.toAry32OfB32As2Pow(retAry[i]));

			}

			eryOfAry32.setComparator(new CompaForAry32OfB32As2Pow());
			return eryOfAry32;

		}

		Seq32 seq32 = new Seq32();

		// O.l("condi.k=" + condi.k + O.S32 + CLASS_THIS);
		// int maxB32As2Pow = 0b1 << (n - 1);
		Cva.reGoByB32As2Pow(0b1 << (condi.n - 1), condi.k, 0b1, 0b10, seq32);// the word 'A' must be at the leftmost side

		int[] retAry32 = seq32.trim().ary32(false);

		// StringBuilder strToC = Strva.toStrToCByB32As2PowBySAry(retAry32, O.L);
		// O.l("strToC=" + O.L + strToC + O.S32 + CLASS_THIS);

		for (int i = 0; i != retAry32.length; i++) {

			Pva.reGo(retAry32[i], condi.k, prefix, seq);

		}

		long[] retAry = seq.trim().ary(false);
		long b64;
		for (int i = 0; i != retAry.length; i++) {

			b64 = retAry[i];

			putOnVerticallyIfGt(b32Base ^ B64IntoB6.toB32As2PowByB6Cell(b64),
					B64IntoB6.toAry32OfB32As2Pow(B64IntoB6.revAgainstB6FromR(b64)), 0, condi, eryOfAry32);

		}

		eryOfAry32.setComparator(new CompaForAry32OfB32As2Pow());

		return eryOfAry32;

	}

}
