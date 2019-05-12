package lGpl20.o;

import java.io.Serializable;
import java.lang.reflect.Array;

/**
 * 本類別原生人.<br/>
 * 提供每個類別一個識別數字.<br/>
 * 另一功能是做為 synchronize 的 KEY_TO_SYN.<br/>
 * <br/>
 * To identify the classes in program.<br/>
 * You need to compile this first.<br/>
 * <br/>
 * a: add; append<br/>
 * aft: after<br/>
 * ans: answer<br/>
 * app: application<br/>
 * ary: array or long[]<br/>
 * ary64: long[]<br/>
 * asc: ascend<br/>
 * attr: attribute<br/>
 * b32: the type int<br/>
 * b64: the type long; 64 bit integer<br/>
 * bef: before<br/>
 * calcu: calculate<br/>
 * catag: catagorize<br/>
 * circ: circle; circular<br/>
 * comb: combinatorics<br/>
 * compa: comparable or comparator<br/>
 * compo: composite<br/>
 * condi: condition<br/>
 * curr: current<br/>
 * def: default<br/>
 * der:derange; deranger<br/>
 * dev: develop; developer<br/>
 * dim: dimension<br/>
 * div: divisor; divide<br/>
 * dsc: descend<br/>
 * dup: duplicate<br/>
 * dyna: dynamically<br/>
 * elem: element<br/>
 * eq: equal<br/>
 * ex: exception; exclude<br/>
 * f32: the type float<br/>
 * f64: the type double<br/>
 * fr64: a kind of fraction number<br/>
 * ident:identical<br/>
 * idv: individual<br/>
 * in: include; input; internal<br/>
 * int32: the type int<br/>
 * int64: the type long; 64 bit integer<br/>
 * lim: limit<br/>
 * l: left<br/>
 * n: nature number; and; then<br/>
 * nat:nature<br/>
 * nat:nature<br/>
 * o: origin<br/>
 * occur: occurrence<br/>
 * pow: power<br/>
 * product: prod<br/>
 * qty:quantity<br/>
 * r: right<br/>
 * rec: record<br/>
 * reg: regex<br/>
 * regu:regularize<br/>
 * ret: return<br/>
 * rev: reverse<br/>
 * sp: sample<br/>
 * syn: synchronized<br/>
 * seq: sequence; sequential<br/>
 * thr: thread<br/>
 * vandermonde convolution: vandermonde convol<br/>
 * w: with<br/>
 * wr: wrapper<br/>
 * 
 * @version 2019/03/24_08:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Origin" >Origin.java</a>
 * 
 * @see O_A
 */
public abstract class Origin implements Serializable {

	/**
	 * 產生數值.<br/>
	 * The create a number.
	 */
	public static long genInt64AsId(String stringNameOfClass) {

		char[] cAry = stringNameOfClass.toCharArray();

		long int64 = 0L;

		for (int i = 0; i != cAry.length; i++) {

			int int32 = cAry[i];
			int64 = int64 + int32 * int32 * (i + 1);

		}

		// O.l("nameOfClass=" + nameOfClass+ O.S32 + CLASS_THIS);

		return int64;

	}

	protected static final long serialVersionUID = genInt64AsId(Origin.class.getCanonicalName());

	/**
	 * 檢查物件是不是有 1 為 null.<br/>
	 * To check if anyone of the objects is null.
	 */
	@SuppressWarnings("unchecked")
	public static <T extends Object> boolean isAnyNull(T... objAry) {

		for (int i = 0; i != objAry.length; i++) {

			if (objAry[i] == null) {

				return true;

			}

		}

		return false;

	}

	/**
	 * 切掉陣列末的多個 0.<br/>
	 * To remove all 0 of the tail digits in the array.
	 */
	public static long[] trimTailAll0(long[] ary) {

		int lenMinus1 = ary.length - 1;

		if (lenMinus1 >= 0 && ary[lenMinus1] == 0L) {

			int indexNot0 = lenMinus1 - 1;

			for (; indexNot0 >= 0; indexNot0--) {

				if (ary[indexNot0] != 0L) {

					break;

				}

			}

			// O.l("indexNot0=" + indexNot0 + O.S32 + Origin.class);
			if (indexNot0 < 0) {

				return O.ARY0;

			}

			// O.l("indexNot0=" + indexNot0 + O.S32 + Origin.class);

			if ((lenMinus1 - indexNot0) < 3) {

				O.l("removeTailAll0 < 3" + O.S32 + Origin.class);

			}

			int retLen = indexNot0 + 1;
			long[] retAry = new long[retLen];

			System.arraycopy(ary, 0, retAry, 0, retLen);

			return retAry;
			// return Arrays.copyOfRange(ary, 0, indexNot0 + 1);

		}

		return ary;

	}

	/**
	 * 切掉陣列末的多個 0.<br/>
	 * To remove all 0 of the tail digits in the array.
	 */
	public static int[] trimTailAll0(int[] ary32) {

		int lenMinus1 = ary32.length - 1;

		if (lenMinus1 >= 0 && ary32[lenMinus1] == 0) {

			int indexNot0 = lenMinus1 - 1;

			for (; indexNot0 >= 0; indexNot0--) {

				if (ary32[indexNot0] != 0) {

					break;

				}

			}

			if (indexNot0 < 0) {

				return O.INT32_ARY0;

			}

			// O.l("indexNot0=" + indexNot0 + O.S32 + CLASS_THIS);

			if ((lenMinus1 - indexNot0) < 3) {

				O.l("removeTailAll0 < 3" + O.S32 + Origin.class);

			}

			int retLen = indexNot0 + 1;
			int[] retAry32 = new int[retLen];

			System.arraycopy(ary32, 0, retAry32, 0, retLen);

			return retAry32;
			// return Arrays.copyOfRange(ary32, 0, indexNot0 + 1);

		}

		return ary32;

	}

	/**
	 * 切掉陣列末的多個 null.<br/>
	 * To remove all null of the tail digits in the array.
	 */
	public static <T extends Object> T[] trimTailAllNull(T[] objAry) {

		int lenMinus1 = objAry.length - 1;

		if (lenMinus1 >= 0 && objAry[lenMinus1] == null) {

			int indexNotNull = lenMinus1 - 1;

			for (; indexNotNull >= 0; indexNotNull--) {

				if (objAry[indexNotNull] != null) {

					break;

				}

			}

			// O.l("indexNotNull=" + O.S32 + indexNotNull + O.S32 + Origin.class);

			if (indexNotNull < 0) {

				return objAry;

			}

			int retLen = indexNotNull + 1;
			@SuppressWarnings("unchecked")
			T[] retAry = (T[]) Array.newInstance(objAry[0].getClass(), retLen);
			System.arraycopy(objAry, 0, retAry, 0, retLen);

			return retAry;

		}

		return objAry;

	}

}
