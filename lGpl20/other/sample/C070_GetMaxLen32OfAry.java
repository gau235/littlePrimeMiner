package lGpl20.other.sample;

import lGpl20.o.O;
import lGpl20.o.str.SByN;

/**
 * getMaxLen32OfAry.<br/>
 * getMaxLen32OfAry.
 * 
 * @version 2019/04/21_11:00:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=C070_GetMaxLen32OfAry" >
 *          C070_GetMaxLen32OfAry.java</a>
 * 
 */
public class C070_GetMaxLen32OfAry {

	private static final Class<C070_GetMaxLen32OfAry> CLASS_THIS = C070_GetMaxLen32OfAry.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	public static int getMaxLen32OfAry() {

		int len32 = Integer.MAX_VALUE;
		for (; len32 > 0; len32--) {

			try {

				O.l("getMaxLen32OfAry()=" + SByN.f(len32) + O.S32 + new boolean[len32] + O.S32 + CLASS_THIS);

			} catch (Throwable throwable) {

				throwable.printStackTrace();

				continue;

			}

			return len32;

		}

		return len32;

	}

	public static void main(String[] sAry) {

		getMaxLen32OfAry();

	}

}
