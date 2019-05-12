package lGpl20.comb.cartesianProd;

import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.o.O;
import lGpl20.o.ery.Ery;
import lGpl20.o.ery.Seq;

/**
 * @version 2019/03/17_20:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=CartesianProdPva_L" >CartesianProdPva_L.java</a>
 * 
 * @see CartesianProdPva_U
 */
public abstract class CartesianProdPva_L extends CartesianProdPva_A {

	private static final Class<CartesianProdPva_L> CLASS_THIS = CartesianProdPva_L.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To sum.<br/>
	 * To sum.
	 */
	public static long sumAftConvertToB64As2PowByB6Cell(long[] ary) {

		long retB64As2Pow = 0b0L;

		for (int i = 0; i != ary.length; i++) {

			retB64As2Pow = retB64As2Pow + B64IntoB6.toB64As2PowByB6Cell(ary[i]);

		}

		return retB64As2Pow;

	}

	/**
	 * To bear.<br/>
	 * To bear.
	 */
	public static void cloneNJoin(Seq leftHandSideSeq, long[] rightAryOfB64IntoB6, final int index32, Ery<Seq> eryToCollect) {

		if (index32 ==  Integer.MIN_VALUE) {

			for (int i = 0; i != rightAryOfB64IntoB6.length; i++) {

				eryToCollect.a(leftHandSideSeq.clone().a(rightAryOfB64IntoB6[i]));

			}

		} else {

			final int rVal32 = ((int) B64IntoB6.selSort(leftHandSideSeq.at(index32))) & B64IntoB6.MASK32;

			long rB64IntoB6;
			for (int i = 0; i != rightAryOfB64IntoB6.length; i++) {

				rB64IntoB6 = rightAryOfB64IntoB6[i];

				if ((((int) B64IntoB6.selSort(rB64IntoB6)) & B64IntoB6.MASK32) > rVal32) {

					eryToCollect.a(leftHandSideSeq.clone().a(rB64IntoB6));

				}

			}

		}

	}

}
