package lGpl20.comb.stirlingNum1;

import lGpl20.b32.B32va;
import lGpl20.comb.Pva;
import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.comb.filter.CompaForAryOfB64IntoB6;
import lGpl20.comb.filter.Condi;
import lGpl20.comb.stirlingNum2.S2va;
import lGpl20.comb.stirlingNum3.S3va;
import lGpl20.o.O;
import lGpl20.o.ery.Aryva;
import lGpl20.o.ery.Ery;

/**
 * @version 2019/03/27_17:50:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=S1va_L" >S1va_L.java</a>
 * 
 * @see S1va_Z
 */
public abstract class S1va_L extends S1va_B {

	private static final Class<S1va_L> CLASS_THIS = S1va_L.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * Stirling number of the first kind.<br/>
	 * Stirling number of the first kind.
	 * 
	 * @see S1va#goByS2(Condi)
	 * 
	 * @see S2va#go(Condi)
	 * 
	 * @see S3va#goByS2(Condi)
	 */
	public static Ery<long[]> goByS2(Condi condi) {

		Ery<int[]> eryOfAry32 = go(condi);
		O.l("S2 size=" + eryOfAry32.len() + O.S32 + CLASS_THIS);

		// Ery<long[]> retEry = B64IntoB6.convertToEryAryByEryAry32(eryOfAry32);
		Ery<long[]> retEry = Aryva.toEryOfAryOfB64IntoB6(eryOfAry32);
		Ery<long[]> tempEry = new Ery<long[]>();

		Object[] objAry = retEry.trim().aryOfElem();

		long[] ary;// for to operate

		for (int atK = 0; atK != condi.k; atK++) {// atK starts from 0

			for (int i = 0; i != objAry.length; i++) {

				ary = (long[]) objAry[i];

				int b32Base = (int) ary[atK];// fuck
				int bitCountOfB32Base = Integer.bitCount(b32Base);
				// O.l("b32Base=" + B32va.str16(b32Base) + O.S32 + CLASS_THIS);

				if ((bitCountOfB32Base == 1) || (bitCountOfB32Base == 2)) {

					ary[atK] = B64IntoB6.toB64IntoB6ByToLog2OfLowest1NPlus1(b32Base);
					tempEry.a(ary);

				} else {

					// PAsCirc.goOnNEqK(theBase32, 0b0L, biCountBase32, ary, atK, tempEry);

					long prefix = (long) (B32va.log2OfLowest1(b32Base & -b32Base) + 1);// Integer.lowestOneBit(theBase32);
					Pva.goForStirling(b32Base, bitCountOfB32Base, prefix, ary, atK, tempEry);

				}

			}

			retEry = tempEry;
			objAry = tempEry.trim().aryOfElem();
			tempEry = new Ery<long[]>();

		}

		retEry.setComparator(new CompaForAryOfB64IntoB6());

		return retEry;

	}

	/**
	 * Stirling number of the first kind.<br/>
	 * Stirling number of the first kind.
	 * 
	 * @see #goByS2(Condi)
	 */
	public static Ery<long[]> collectToKByToGoByS2(Condi condi, boolean isToSort) {

		Ery<long[]> retEryOfAry = new Ery<long[]>();

		final int endK = condi.k;

		Condi clonedConi = condi.clone();
		clonedConi.min = 1;// fuck

		for (int k = 1; k <= endK; k++) {

			clonedConi.k = k;
			Ery<long[]> eryOfAry32 = goByS2(clonedConi);

			if (isToSort) {

				eryOfAry32.sort();

			}

			retEryOfAry.appendAll(eryOfAry32);

		}

		retEryOfAry.setComparator(new CompaForAryOfB64IntoB6());

		return retEryOfAry;

	}

}
