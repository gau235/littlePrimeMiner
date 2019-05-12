package lGpl20.comb.onto;

import lGpl20.comb.filter.Adder32;
import lGpl20.comb.filter.Condi;
import lGpl20.o.O;
import lGpl20.o.ery.Ery;
import lGpl20.o.str.Strva;

/**
 * @version 2019/03/28_14:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=OntoFreelyer_W" >OntoFreelyer_W.java</a>
 * 
 * @see OntoFreelyer_Z
 */
public abstract class OntoFreelyer_W extends OntoFreelyer_A {

	private static final Class<OntoFreelyer_W> CLASS_THIS = OntoFreelyer_W.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To put n people in k rooms.<br/>
	 * To put n people in k rooms.
	 */
	public static void reGo(final int maxB32As2Pow, int currB32As2Pow, int[] ary32, Condi condi, Ery<int[]> eryOfAry32) {

		Adder32.a1++;

		// O.l("b32As2Pow=" + b32As2Pow + O.S32 + CLASS_THIS);
		int[] clonedAry32;
		int b32Val;
		int countOfBit;

		if (currB32As2Pow == maxB32As2Pow) {

			for (int atK = 0; atK != condi.k; atK++) {

				// O.l("atK=" + atK + O.S32 + CLASS_THIS);
				clonedAry32 = ary32.clone();
				b32Val = clonedAry32[atK] | currB32As2Pow;

				countOfBit = Integer.bitCount(b32Val);
				// O.l("countOfBit=" + countOfBit + O.S32 + CLASS_THIS);

				// StringBuilder str = Strva.toStrForCByB32As2PowBySAryByB32As2Pow(Strva.S_ARY_A_J, clonedAry32, O.Z);
				// O.l("str=" + str + O.S32 + CLASS_THIS);

				// if (FilterInComb.ifEveryBitCountInAry32Between(clonedAry32, 0, max)) {}

				if (countOfBit >= condi.min && countOfBit <= condi.max) {

					clonedAry32[atK] = b32Val;
					eryOfAry32.a(clonedAry32);

				}

			}

			return;

		}

		for (int atK = 0; atK != condi.k; atK++) {

			clonedAry32 = ary32.clone();
			b32Val = clonedAry32[atK] | currB32As2Pow;

			countOfBit = Integer.bitCount(b32Val);

			// O.l("countOfBit=" + countOfBit + O.S32 + CLASS_THIS);

			if (/* countOfBit >= min && */countOfBit <= condi.max) {

				clonedAry32[atK] = b32Val;
				reGo(maxB32As2Pow, currB32As2Pow << 1, clonedAry32, condi, eryOfAry32);

			}

		}

	}

	/**
	 * To put n people in k rooms.<br/>
	 * To put n people in k rooms.
	 * 
	 * @see OntoFreelyer#bearByTempEryOfAry32(Condi)
	 * 
	 * @see Ontova#go(Condi)
	 */
	public static Ery<int[]> go(Condi condi) {

		if (condi.min != 0) {

			O.x();

		}

		Ery<int[]> eryOfAry32 = new Ery<int[]>();

		reGo(0b1 << (condi.n - 1), 0b1, new int[condi.k], condi, eryOfAry32);

		// eryOfAry32.setComparator(new CompaForAry32OfB32As2Pow());

		return eryOfAry32;

	}

}
