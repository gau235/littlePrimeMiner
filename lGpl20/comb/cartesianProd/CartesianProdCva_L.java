package lGpl20.comb.cartesianProd;

import lGpl20.o.O;
import lGpl20.o.ery.Ery;
import lGpl20.o.ery.Seq;

/**
 * @version 2019/03/17_20:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=CartesianProdCva_L" >CartesianProdCva_L.java</a>
 * 
 * @see CartesianProdCva_U
 */
public abstract class CartesianProdCva_L extends CartesianProdCva_A {

	private static final Class<CartesianProdCva_L> CLASS_THIS = CartesianProdCva_L.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To bear.<br/>
	 * To bear.
	 */
	public static void cloneNJoinIfGt(Seq leftHandSideSeq, long[] rightAryOfB64As2Pow, final int index32, Ery<Seq> eryToCollect) {

		// O.l("index32=" + index32 + O.S32 + CLASS_THIS);

		if (index32 == Integer.MIN_VALUE) {

			for (int i = 0; i != rightAryOfB64As2Pow.length; i++) {

				eryToCollect.a(leftHandSideSeq.clone().a(rightAryOfB64As2Pow[i]));

			}

		} else {

			long lInt = leftHandSideSeq.at(index32);
			final long lLowest1 = lInt & -lInt;
			// O.l("lowest1InLeft=" + lowest1InLeft + O.S32 + CLASS_THIS);

			long rInt;
			for (int i = 0; i != rightAryOfB64As2Pow.length; i++) {

				rInt = rightAryOfB64As2Pow[i];

				if ((rInt & -rInt) > lLowest1) { // lowestOneBit

					eryToCollect.a(leftHandSideSeq.clone().a(rInt));

				}

			}

		}

	}

}
