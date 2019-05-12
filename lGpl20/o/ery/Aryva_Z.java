package lGpl20.o.ery;

import lGpl20.o.O;

/**
 * @version 2019/03/25_08:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Aryva_Z" >Aryva_Z.java</a>
 * 
 * @see Aryva
 */
public abstract class Aryva_Z extends Aryva_W {

	private static final Class<Aryva_Z> CLASS_THIS = Aryva_Z.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To convert.<br/>
	 * To convert.
	 */
	public static Ery<long[]> toEryOfAryOfB64IntoB6(Ery<int[]> eryOfAry32) {

		Ery<long[]> retEry = new Ery<long[]>();
		Object[] objAry = eryOfAry32.trim().aryOfElem();

		int[] ary32;
		long[] ary;
		for (int iEry = 0; iEry != objAry.length; iEry++) {

			ary32 = (int[]) objAry[iEry];
			ary = new long[ary32.length];

			for (int iAry32 = 0; iAry32 != ary32.length; iAry32++) {

				ary[iAry32] = (long) (ary32[iAry32]);

			}

			retEry.a(ary);

		}

		return retEry;

	}

}
