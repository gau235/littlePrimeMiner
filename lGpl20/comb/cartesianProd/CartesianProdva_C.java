package lGpl20.comb.cartesianProd;

import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.comb.cartesianProd.thr.ThrToProdWStr;
import lGpl20.o.O;
import lGpl20.o.ery.Ery;

/**
 * @version 2019/03/14_20:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=CartesianProdva_C" >CartesianProdva_C.
 *          java</a>
 * 
 * @see CartesianProdva_J
 */
public abstract class CartesianProdva_C extends CartesianProdva_B {

	private static final Class<CartesianProdva_C> CLASS_THIS = CartesianProdva_C.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To append all from left.<br/>
	 * To append all from left.
	 */
	public static long[] prodNMergeInB64IntoB6(long b64IntoB6, long... aryOfOtherB64IntoB6) {

		long[] retAry = new long[aryOfOtherB64IntoB6.length];
		for (int i = 0; i != aryOfOtherB64IntoB6.length; i++) {

			retAry[i] = B64IntoB6.appendAllFromL(b64IntoB6, aryOfOtherB64IntoB6[i]);

		}

		return retAry;

	}

	/**
	 * [1, 2] product [Alice, Bob] then return:<br/>
	 * 1,Alice<br/>
	 * 1,Bob<br/>
	 * 2,Alice<br/>
	 * 2,Bob<br/>
	 * <br/>
	 * To product.
	 */
	public static ThrToProdWStr prodNMergeInStrWThr(Ery<String[]> eryOfSAry, CharSequence charSeqAftRowNum32,
			CharSequence lineWr) {

		ThrToProdWStr thrToProdWStr = new ThrToProdWStr();

		thrToProdWStr.eryOfSAry = eryOfSAry;

		thrToProdWStr.charSeqAftRowNum32 = charSeqAftRowNum32;
		thrToProdWStr.lineWr = lineWr;

		return thrToProdWStr;

	}

}
