package lGpl20.comb.cartesianProd;

import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.o.O;
import lGpl20.o.ery.Ery;
import lGpl20.o.ery.Seq;
import lGpl20.o.str.Strva;

/**
 * To product.<br/>
 * <br/>
 * To product.
 * 
 * @version 2019/03/23_17:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=CartesianProdPva" >CartesianProdPva.java
 *          </a>
 * 
 * @see CartesianProdva
 * 
 * @see CartesianProdCva
 * 
 * @see CartesianProdPva
 */
public abstract class CartesianProdPva extends CartesianProdPva_U {

	private static final Class<CartesianProdPva> CLASS_THIS = CartesianProdPva.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 把伍轉成字串建立者.<br/>
	 * To convert the Ery to StringBuilder.
	 */
	public static StringBuilder toStrByAryOfB64IntoB6(long[] aryOfB64As2Pow, String[] sAry) {

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		for (int i = 0; i != aryOfB64As2Pow.length;) {

			retStr.append(B64IntoB6.toStrByValMinus1InB6Cell(aryOfB64As2Pow[i], sAry));

			if (++i != aryOfB64As2Pow.length) {

				retStr.append(charSeqAsSeparator);

			}

		}

		return retStr;

	}

	/**
	 * 把伍轉成字串建立者.<br/>
	 * To convert the Ery to StringBuilder.
	 */
	public static StringBuilder toStrByEryOfSeq(Ery<Seq> eryOfSeq, String[] sAry, CharSequence charSeqAftRowNum32,
			CharSequence lineWr) {

		StringBuilder retStr = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);
		Object[] objAryOfSeq = eryOfSeq.trim().aryOfElem();
		Seq seq;
		long[] ary;

		for (int i = 0; i != objAryOfSeq.length;) {

			seq = (Seq) objAryOfSeq[i];
			// O.l("seq=" + seq.toStr());

			ary = seq.trim().ary(false);

			retStr.append(i + 1).append(charSeqAftRowNum32).append(toStrByAryOfB64IntoB6(ary, sAry));

			if (++i != objAryOfSeq.length) {

				retStr.append(lineWr);

				if (i == Strva.int32MaxRowForHtml) {

					return retStr;

				}

			}

		}

		return retStr;

	}

}
