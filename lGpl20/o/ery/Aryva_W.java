package lGpl20.o.ery;

import lGpl20.b32.Ary32va;
import lGpl20.o.O;

/**
 * @version 2018/04/08_10:30:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Aryva_Z" >Aryva_Z.java</a>
 * 
 * @see Aryva_Z
 */
public abstract class Aryva_W extends Aryva_J {

	private static final Class<Aryva_W> CLASS_THIS = Aryva_W.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To gen the ascending long[].<br/>
	 * To gen the ascending long[].
	 * 
	 * @see Ary32va#genAscAry32From1(int)
	 */
	public static long[] genAscAryFrom1(int len) {

		long[] tempAry = new long[len];

		for (int i = 0; i < len; i++) {

			tempAry[i] = i + 1;

		}

		return tempAry;

	}

	

}
