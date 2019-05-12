package lGpl20.comb.b64IntoB6;

import lGpl20.o.O;

/**
 * The first index of cell from the right hand side is 0.
 * 
 * @version 2019/04/13_21:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=B64IntoB6_J" >B64IntoB6_J.java</a>
 * 
 * @see B64IntoB6_K
 */
public abstract class B64IntoB6_J extends B64IntoB6_H {

	private static final Class<B64IntoB6_J> CLASS_THIS = B64IntoB6_J.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To gen the ascending B64IntoB6.<br/>
	 * To return 0011_0010_0001 as 3,2,1 like int[]{1,2,3}.
	 */
	public static long genB64IntoB6ByAry32(int... ary32) {

		long retB64IntoB6 = 0b0L;

		for (int i = 0; true;) {

			// O.l("i=" + i + ", " + ary32[i] + O.S32 + CLASS_THIS);
			retB64IntoB6 = retB64IntoB6 | (long) ary32[i];

			if (++i == ary32.length) {

				// O.l("retB64IntoB6=" + O.L + str24(retB64IntoB6) + O.S32 + CLASS_THIS);
				return revAgainstB6FromR(retB64IntoB6);

			}

			retB64IntoB6 = retB64IntoB6 << $6;

		}

	}

}
