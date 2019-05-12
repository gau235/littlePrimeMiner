package lGpl20.comb;

import java.io.Serializable;
import java.math.BigInteger;

import lGpl20.o.O;

/**
 * 組合 (取物).<br/>
 * <br/>
 * To do some Combinatorics exercise.
 * 
 * @version 2019/04/17_21:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Cva_A" >Cva_A.java</a>
 * 
 * @see Cva_C
 */
public abstract class Cva_A implements Serializable {

	private static final Class<Cva_A> CLASS_THIS = Cva_A.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * -1(BigInteger).<br/>
	 * -1.
	 */
	public static final BigInteger $_1 = BigInteger.ONE.negate();

}
