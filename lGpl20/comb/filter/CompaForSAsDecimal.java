package lGpl20.comb.filter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Comparator;

import lGpl20.o.O;

/**
 * StringBuilder 比較器.<br/>
 * The comparator of long[].
 * 
 * @version 2019/04/19_18:50:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=CompaForSAsDecimal" >CompaForSAsDecimal.
 *          java</a>
 * 
 */
public class CompaForSAsDecimal implements Comparator<String>, Serializable {

	private static final Class<CompaForSAsDecimal> CLASS_THIS = CompaForSAsDecimal.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	@Override
	public int compare(String s1, String s2) {// todo: reverseOrder

		return new BigDecimal(s1).compareTo(new BigDecimal(s2));

	}

	/**
	 * To compare.<br/>
	 * To compare.
	 */
	public static int compa(String s1, String s2) {

		return new BigDecimal(s1).compareTo(new BigDecimal(s2));

	}

}