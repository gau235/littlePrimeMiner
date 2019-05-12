package lGpl20.comb.stirlingNum3;

import lGpl20.b32.B32va;
import lGpl20.comb.Pva;
import lGpl20.comb.filter.CompaForAryOfB64IntoB6;
import lGpl20.comb.filter.Condi;
import lGpl20.comb.stirlingNum1.S1va;
import lGpl20.comb.stirlingNum2.S2va;
import lGpl20.o.O;
import lGpl20.o.ery.Aryva;
import lGpl20.o.ery.Ery;
import lGpl20.o.ery.Seq;

/**
 * @version 2019/03/25_12:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=S3va_J" >S3va_J.java</a>
 * 
 * @see S3va_U
 */
public abstract class S3va_J extends S3va_L {

	private static final Class<S3va_J> CLASS_THIS = S3va_J.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * Stirling number of the third kind.<br/>
	 * Stirling number of the third kind.
	 * 
	 * @see Pva#reGo(int, int, long, Seq)
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

				if (bitCountOfB32Base == 1) {

					int value32 = B32va.log2OfLowest1(b32Base) + 1;
					// long[] clonedAry = ary.clone();
					ary[atK] = (long) value32;
					tempEry.a(ary);

				} else {

					Pva.goForStirling(b32Base, bitCountOfB32Base, 0b0L, ary, atK, tempEry);

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
	 * Stirling number of the third kind.<br/>
	 * Stirling number of the third kind.
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
