package lGpl20.comb.filter;

import java.io.Serializable;

import lGpl20.o.O;

/**
 * 本類別累加器.<br/>
 * <br/>
 * The adder (of int32) to count.
 * 
 * @version 2017/06/10_13:47:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Adder32" >Adder32.java</a>
 *
 */
public class Adder32 implements Serializable {

	private static final Class<Adder32> CLASS_THIS = Adder32.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To count number of callings.<br/>
	 * To count number of callings.
	 */
	public static int a1 = 0;

	/**
	 * To count number of callings.<br/>
	 * To count number of callings.
	 */
	public static int a2 = 0;

}