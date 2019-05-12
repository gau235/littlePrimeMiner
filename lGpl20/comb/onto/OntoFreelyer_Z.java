package lGpl20.comb.onto;

import lGpl20.comb.filter.CompaForAry32OfB32As2Pow;
import lGpl20.comb.filter.Condi;
import lGpl20.comb.filter.FilterInComb;
import lGpl20.o.O;
import lGpl20.o.ery.Ery;

/**
 * @version 2019/03/25_20:50:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=OntoFreelyer_Z" >OntoFreelyer_Z.java</a>
 * 
 * @see OntoFreelyer
 */
public abstract class OntoFreelyer_Z extends OntoFreelyer_W {

	private static final Class<OntoFreelyer_Z> CLASS_THIS = OntoFreelyer_Z.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To put n people in k rooms.<br/>
	 * To put n people in k rooms.
	 */
	public static void reBearByTempEryOfAry32(int currB32As2Pow, int[] aryOfB32, Condi condi, Ery<int[]> tempEryOfAry32) {

		int[] clonedAryOfB32;
		int keptValue;
		int countOfBit;

		if (currB32As2Pow >= (1 << (condi.n - 1))) {

			// O.l("currB32As2Pow=" + currB32As2Pow + O.S32 + CLASS_THIS);

			for (int i = 0; i != aryOfB32.length; i++) {

				clonedAryOfB32 = aryOfB32.clone();
				keptValue = clonedAryOfB32[i] | currB32As2Pow;

				countOfBit = Integer.bitCount(keptValue);
				// O.l("i=" + i + O.S32 + CLASS_THIS);

				// if (countOfBit >= condi.min && countOfBit <= condi.max) {

				// O.l("bef=" + toStrToOntoByB32(clonedAryOfB32) + O.S32 + CLASS_THIS);
				clonedAryOfB32[i] = keptValue;
				// O.l("aft=" + toStrToOntoByB32(clonedAryOfB32) + O.S32 + CLASS_THIS);
				// O.l();
				// O.l("i=" + i + ", put=" + B32va.toStrByLog2OfLowest1AtB32(currB32As2Pow) + O.S32 + CLASS_THIS);

				if (FilterInComb.ifEveryBitCountInAry32Between(clonedAryOfB32, condi.min, condi.max)) {

					tempEryOfAry32.a(clonedAryOfB32);

				}

			}

			return;

		}

		for (int i = 0; i != aryOfB32.length; i++) {

			clonedAryOfB32 = aryOfB32.clone();
			keptValue = clonedAryOfB32[i] | currB32As2Pow;

			countOfBit = Integer.bitCount(keptValue);
			if (/* countOfBit >= condi.min && */countOfBit <= condi.max) {
				// if (/* countOfBit >= condi.min && */countOfBit <= condi.max) {

				// O.l("put keptValue=" + B32va.toStrByLog2OfLowest1AtB32(keptValue) + O.S32 + CLASS_THIS);

				// O.l("bef=" + toStrToOntoByB32(clonedAryOfB32) + O.S32 + CLASS_THIS);
				clonedAryOfB32[i] = keptValue;
				// O.l("aft=" + toStrToOntoByB32(clonedAryOfB32) + O.S32 + CLASS_THIS);

				// if (FilterInComb.ifEveryBitCountInAry32Between(clonedAryOfB32, 0, condi.max)) {

				tempEryOfAry32.a(clonedAryOfB32);

			}

		}

	}

	/**
	 * To put n people in k rooms.<br/>
	 * To put n people in k rooms.
	 * 
	 * @see #go(Condi)
	 */
	public static Ery<int[]> bearByTempEryOfAry32(Condi condi) {

		Ery<int[]> retEryOfAry32 = new Ery<int[]>(new int[condi.k]);// fuck
		Ery<int[]> tempEryOfAry32 = new Ery<int[]>();

		Object[] objAry;
		// int[] ary32;// for to operate
		for (int currB32As2Pow = 0b1, maxB32As2Pow = 1 << (condi.n
				- 1); currB32As2Pow <= maxB32As2Pow; currB32As2Pow = currB32As2Pow << 1) {

			objAry = retEryOfAry32.trim().aryOfElem();
			for (int i = 0; i != objAry.length; i++) {

				reBearByTempEryOfAry32(currB32As2Pow, (int[]) objAry[i], condi, tempEryOfAry32);

			}

			retEryOfAry32 = tempEryOfAry32;
			tempEryOfAry32 = new Ery<int[]>();

		}

		retEryOfAry32.setComparator(new CompaForAry32OfB32As2Pow());

		return retEryOfAry32;

	}

}
