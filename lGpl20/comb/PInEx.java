package lGpl20.comb;

import lGpl20.o.O;

/**
 * 排容原理.<br/>
 * 例如 :<br/>
 * A, B, C, D 排成一列, 但 A 不排第 1 位, B 不排第 2 位的方法數 :<br/>
 * 為 4 人有 2 人是限定條件 inEx(4,2).<br/>
 * <br/>
 * To return the inclusion and exclusion function result, the number of<br/>
 * that n people line up but k guys not at their position.<br/>
 * inEx(n,k)=C(k,0)*n! -C(k,1)*(n-1)! +C(k,2)*(n-2)! - ... +-C(k,k)*(n-k)!
 * 
 * @version 2016/09/04_12:47:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=PInEx" >PInEx.java</a>
 * 
 * @see Deranger
 */
public abstract class PInEx extends PInEx_Z {

	private static final Class<PInEx> CLASS_THIS = PInEx.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

}
