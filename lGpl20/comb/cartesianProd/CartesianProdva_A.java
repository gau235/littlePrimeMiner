package lGpl20.comb.cartesianProd;

import java.io.Serializable;

import lGpl20.o.O;

/**
 * To product.<br/>
 * <br/>
 * To product.
 * 
 * @version 2019/03/17_16:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=CartesianProdva_A" >CartesianProdva_A.java</a>
 * 
 * @see CartesianProdva_B
 */
public abstract class CartesianProdva_A implements Serializable {

	private static final Class<CartesianProdva_A> CLASS_THIS = CartesianProdva_A.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * the separator.<br/>
	 * the separator.
	 */
	public static CharSequence charSeqAsSeparator = new StringBuilder(" || ");

}
