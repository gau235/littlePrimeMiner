package lGpl20.b32;

import lGpl20.o.O;
import lGpl20.o.ery.Aryva;

/**
 * 本類別是使用 32 位元的整數陣列.<br/>
 * <br/>
 * The array of 32 bit integer.
 * 
 * @version 2019/03/18_12:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Ary32va" >Ary32va.java</a>
 *
 */
public abstract class Ary32va extends Ary32va_Z {

	private static final Class<Ary32va> CLASS_THIS = Ary32va.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To gen the ascending int[].<br/>
	 * To gen the ascending int[].
	 * 
	 * @see Aryva#genAscAryFrom1(int)
	 */
	public static int[] genAscAry32From1(int len) {

		int[] retAry32 = new int[len];

		for (int i = 0; i != len; i++) {

			retAry32[i] = i + 1;

		}

		return retAry32;

	}

	/**
	 * To gen the ascending B64IntoB6.<br/>
	 * To return 0011_0010_0001 as 3,2,1 like int[]{1,2,3}.
	 */
	public static int[] genAry32FromS(String s, String regexToSplit) {

		String[] sAry = O.splitNTrimAll(s, regexToSplit);

		int[] retAry32 = new int[sAry.length];

		for (int i = 0; i != retAry32.length; i++) {

			retAry32[i] = Integer.parseInt(sAry[i]);

		}

		// removeTailAll0(retAry32);

		return retAry32;

	}

}