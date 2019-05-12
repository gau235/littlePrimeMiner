package lGpl20.b32.eqDiv;

import lGpl20.o.O;

/**
 * 本類別比較人, 用來互相比較 long, double, BigInteger, BigDecimal, Fr64, Fraction, BigFraction 之間大小.<br/>
 * <br/>
 * To compare among long, double, BigInteger, BigDecimal, Fr64, Fraction, BigFraction.
 * 
 * @version 2015/10/18_21:17:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=CompaForFraction" >CompaForFraction.java
 *          </a>
 * 
 * @see Fr64
 * 
 * @see BigFraction
 */
public abstract class CompaForFraction extends CompaForFraction_Z {

	private static final Class<CompaForFraction> CLASS_THIS = CompaForFraction.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

}
