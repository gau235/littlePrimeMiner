package lGpl20.b32;

import java.io.Serializable;

import lGpl20.o.O;

/**
 * 本類別是使用 32 位元的整數陣列.<br/>
 * <br/>
 * The array of 32 bit integer.
 * 
 * @version 2019/03/17_16:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Ary32va_A" >Ary32va_A.java</a>
 * 
 * @see Ary32va_C
 */
public abstract class Ary32va_A implements Serializable {

	private static final Class<Ary32va_A> CLASS_THIS = Ary32va_A.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 切掉陣列前面的多個 0.<br/>
	 * To remove all 0 of the head digits in the array.
	 */
	public static int[] removeHeadAll0(int[] ary32) {

		if (ary32.length > 0 && ary32[0] == 0) {

			int indexNot0 = 0;

			for (; indexNot0 != ary32.length; indexNot0++) {

				if (ary32[indexNot0] != 0) {

					break;

				}

			}

			if ((ary32.length - indexNot0) < 3) {

				O.l("removeTailAll0 < 3" + O.S32 + ary32[0] + O.S32 + CLASS_THIS);

			}

			int tempLen = ary32.length - indexNot0;// 0,0,1 => 3-2
			int[] tempAry32 = new int[tempLen];
			System.arraycopy(ary32, indexNot0, tempAry32, 0, tempLen);

			return tempAry32;

		}

		return ary32;

	}

	/**
	 * 切掉陣列末的多個 Integer.MAX_VALUE.<br/>
	 * Do not input Integer.MAX_VALUE.<br/>
	 * To remove all Integer.MAX_VALUE of the tail digits in the array.<br/>
	 * Do not input Integer.MAX_VALUE.
	 */
	public static int[] removeTailAllInt32Max(int[] ary32) {

		int lenMinus1 = ary32.length - 1;

		if (lenMinus1 >= 0 && ary32[lenMinus1] == Integer.MAX_VALUE) {

			int indexNotInt32Max = lenMinus1 - 1;

			for (; indexNotInt32Max >= 0; indexNotInt32Max--) {

				if (ary32[indexNotInt32Max] != Integer.MAX_VALUE) {

					break;

				}

			}

			// if ((lenMinus1 - indexNotInt32Max) < 3) {
			//
			// O.l("removeTailAllInt32Max < 3" + O.S32 + ary32[0] + O.S32 + CLASS_THIS);
			//
			// }

			if (indexNotInt32Max == lenMinus1) {

				return ary32;

			}

			int tempLen = indexNotInt32Max + 1;
			int[] tempAry32 = new int[tempLen];
			System.arraycopy(ary32, 0, tempAry32, 0, tempLen);

			return tempAry32;

		}

		return ary32;

	}

}