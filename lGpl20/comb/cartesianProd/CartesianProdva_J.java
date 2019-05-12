package lGpl20.comb.cartesianProd;

import lGpl20.o.O;
import lGpl20.o.ery.Ery;
import lGpl20.o.ery.Seq;

/**
 * @version 2019/03/24_09:00:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=CartesianProdva_J" >CartesianProdva_J.
 *          java</a>
 * 
 * @see CartesianProdva_U
 */
public abstract class CartesianProdva_J extends CartesianProdva_C {

	private static final Class<CartesianProdva_J> CLASS_THIS = CartesianProdva_J.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To bear.<br/>
	 * To bear.
	 */
	public static void cloneNJoin(Seq seq/* various */, long[] ary/* fixed */, Ery<Seq> eryToCollect) {

		for (int i = 0; i != ary.length; i++) {

			eryToCollect.a(seq.clone().a(ary[i]));

		}

	}

	/**
	 * To product.<br/>
	 * To product.
	 */
	public static Ery<Seq> prodEachOther(Ery<long[]> eryOfAry) {

		Ery<Seq> tempEry = new Ery<Seq>();
		Ery<Seq> eryToCollect = new Ery<Seq>();

		long[] tempAry = eryOfAry.at(0);
		for (int i = 0; i != tempAry.length; i++) {

			tempEry.a(new Seq(tempAry[i]));

		}

		if (eryOfAry.len() == 1) {

			return tempEry;

		}

		int oriLen = eryOfAry.len();// termCond
		int iOri;

		int sizeOfTempEry;
		int iTempEry;

		for (iOri = 1; true;) {

			tempAry = eryOfAry.at(iOri);

			for (iTempEry = 0, sizeOfTempEry = tempEry.len(); iTempEry != sizeOfTempEry; iTempEry++) {

				cloneNJoin(tempEry.at(iTempEry)/* various */, tempAry/* fixed */, eryToCollect);

			}

			if (++iOri == oriLen) {

				return eryToCollect;

			}

			tempEry = eryToCollect;
			eryToCollect = new Ery<Seq>();

		}

	}

}
