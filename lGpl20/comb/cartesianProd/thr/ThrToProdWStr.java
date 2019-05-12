package lGpl20.comb.cartesianProd.thr;

import lGpl20.comb.cartesianProd.CartesianProdva;
import lGpl20.o.O;
import lGpl20.o.ery.Ery;
import lGpl20.o.thr.ThrWBox;

/**
 * The thread with box to product.<br/>
 * The thread with box to product.
 * 
 * @version 2019/03/14_14:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=ThrToProdWStr" >ThrToProdWStr.java</a>
 * 
 */
public class ThrToProdWStr extends ThrWBox<StringBuilder> {

	private static final Class<ThrToProdWStr> CLASS_THIS = ThrToProdWStr.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	public Ery<String[]> eryOfSAry;

	protected int sizeOfEryMinus1;

	protected int rowNum32 = 1;

	public CharSequence charSeqAftRowNum32;

	public CharSequence lineWr;

	/**
	 * [1, 2] product [Alice, Bob] then return:<br/>
	 * 1,Alice<br/>
	 * 1,Bob<br/>
	 * 2,Alice<br/>
	 * 2,Bob<br/>
	 * <br/>
	 * To product.
	 */
	public void reGo(int index, StringBuilder prefix) {

		String[] sAry;
		if (index == sizeOfEryMinus1) {// termination condition

			sAry = eryOfSAry.at(index);

			for (int i = 0; i != sAry.length; i++) {

				box.append(rowNum32++).append(charSeqAftRowNum32).append(prefix).append(sAry[i]).append(lineWr);

			}

			return;

		}

		final int indexPlus1 = index + 1;// important

		sAry = eryOfSAry.at(index);

		for (int i = 0; i != sAry.length; i++) {

			// prefix.clone();
			StringBuilder clonedPrefix = new StringBuilder(prefix);
			// O.l("clonedPrefix=" + clonedPrefix + O.S32 + CLASS_THIS);

			reGo(indexPlus1, clonedPrefix.append(sAry[i]).append(CartesianProdva.charSeqAsSeparator));

		}

	}

	@Override
	public void run() {

		sizeOfEryMinus1 = eryOfSAry.len() - 1;
		box = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		reGo(0, new StringBuilder(O.DEF_CAPACITY32_FOR_STR));

	}

}