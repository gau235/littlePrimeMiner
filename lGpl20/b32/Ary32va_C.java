package lGpl20.b32;

import lGpl20.b64.B64va;
import lGpl20.o.O;

/**
 * @version 2018/10/11_17:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Ary32va_C" >Ary32va_C.java</a>
 * 
 * @see Ary32va_K
 */
public abstract class Ary32va_C extends Ary32va_A {

	private static final Class<Ary32va_C> CLASS_THIS = Ary32va_C.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 清空.<br/>
	 * To clear.
	 */
	public static int[] clear(int[] ary32) {

		for (int i = 0; i != ary32.length; i++) {

			// if (ary32[i] != 0) {
			//
			// ary32[i] = 0;
			//
			// }

			ary32[i] = 0;

		}

		return ary32;

	}

	/**
	 * 清空.<br/>
	 * To clear.
	 */
	public static int[] clear(int[] ary32, int indexOfFirst1) {

		// if (indexOfFirst1 < 0) {
		//
		// return ary32;
		//
		// }

		for (int i = indexOfFirst1; i < ary32.length; i++) {

			ary32[i] = 0;

		}

		return ary32;

	}

	/**
	 * 比較 ary32_1 與 ary32_2.<br/>
	 * To compare ary32_1 with the specified ary32_2 for order.
	 * 
	 * @return -1, 0, 1 as this ary32_1 is less than, equal to, or greater than the specified ary32_2.
	 * 
	 */
	public static int compa(int[] ary32_1, int f1_1, int[] ary32_2, int f1_2) {

		if (f1_1 >= 0 && f1_2 >= 0) {

			if (f1_1 < f1_2) {

				return 1;

			}

			if (f1_1 > f1_2) {

				return -1;

			}

			// indexFirst1_1 == indexFirst1_2

			for (int i = 0; i != ary32_1.length; i++) {

				long int64_1 = ary32_1[i] & B64va.$32_1_OF_64BIT;// important
				long int64_2 = ary32_2[i] & B64va.$32_1_OF_64BIT;// important

				if (int64_1 > int64_2) {

					return 1;

				}

				if (int64_1 < int64_2) {

					return -1;

				}

				if (int64_1 == int64_2) {

					continue;

				}

			}

			return 0;

		}

		if (f1_1 >= 0 && f1_2 < 0) {// plus compareTo 0

			return 1;

		}

		if (f1_1 < 0 && f1_2 >= 0) {// 0 compareTo plus

			return -1;

		}

		return 0; // 0 compareTo 0

	}

	/**
	 * 比較 ary32_1 與 ary32_2.<br/>
	 * To compare ary32_1 with the specified ary32_2 for order.
	 * 
	 * @return -1, 0, 1 as this ary32_1 is less than, equal to, or greater than the specified ary32_2.
	 * 
	 */
	public static int compa(int[] ary32_1, int[] ary32_2) {

		// return compa(ary32_1, 0, ary32_2, 0);

		return compa(ary32_1, B32va.f1(ary32_1), ary32_2, B32va.f1(ary32_2));

	}

	/**
	 * 加法.<br/>
	 * To add.
	 */
	public static int[] add(int[] ary32_1, int f1_1, int[] ary32_2, int f1_2) {

		int[] retAry32 = new int[ary32_1.length];

		int bound = StrictMath.min(f1_1, f1_2);

		long sum64 = 0;

		for (int lenMinus1 = ary32_1.length - 1, i = lenMinus1; i >= bound; i--) {

			long int64_1 = ary32_1[i] & B64va.$32_1_OF_64BIT;// important
			long int64_2 = ary32_2[i] & B64va.$32_1_OF_64BIT;// important

			sum64 = int64_1 + int64_2 + (sum64 >>> B32va.INT32_$32);
			retAry32[i] = (int) (sum64); // no need (int) (sum64& $32_1_OF_64_BIT);

		}

		if (--bound >= 0) {

			retAry32[bound] = (int) (sum64 >>> B32va.INT32_$32);

		}

		return retAry32;

	}

	/**
	 * 加法.<br/>
	 * To add.
	 */
	public static int[] addIn(int[] ary32_1, int f1_1, int[] ary32_2, int f1_2) {

		int bound = StrictMath.min(f1_1, f1_2);

		long sum64 = 0;// sum with carry

		for (int lenMinus1 = ary32_1.length - 1, i = lenMinus1; i >= bound; i--) {

			long int64_1 = ary32_1[i] & B64va.$32_1_OF_64BIT;// important
			long int64_2 = ary32_2[i] & B64va.$32_1_OF_64BIT;// important

			sum64 = int64_1 + int64_2 + (sum64 >>> B32va.INT32_$32);
			ary32_1[i] = (int) (sum64); // no need (int) (sum64& $32_1_OF_64_BIT);

		}

		if (--bound >= 0) {

			ary32_1[bound] = (int) (sum64 >>> B32va.INT32_$32);

		}

		return ary32_1;

	}

	/**
	 * 減法.<br/>
	 * To subtract.
	 */
	public static int[] sub(int[] ary32_1, int f1_1, int[] ary32_2, int f1_2) {

		int[] retAry32 = new int[ary32_1.length];

		int bound = StrictMath.min(f1_1, f1_2);

		long borrow = 0;
		long dif = 0;

		for (int lenMinus1 = ary32_1.length - 1, i = lenMinus1; i >= bound; i--) {

			long int64_1 = ary32_1[i] & B64va.$32_1_OF_64BIT;// important
			long int64_2 = ary32_2[i] & B64va.$32_1_OF_64BIT;// important

			if (int64_1 < (int64_2 + borrow)) {

				dif = B64va.$2POW32 + int64_1 - int64_2 - borrow;
				borrow = 1;

			} else {

				dif = int64_1 - int64_2 - borrow;
				borrow = 0;// important

			}

			// retAry32[i] = (int) (dif & $32_1_OF_64_BIT);
			retAry32[i] = (int) dif;

		}

		return retAry32;

	}

	/**
	 * 減法.<br/>
	 * To subtract.
	 */
	public static int[] subIn(int[] ary32_1, int f1_1, int[] ary32_2, int f1_2) {

		int bound = StrictMath.min(f1_1, f1_2);

		long borrow = 0;
		long dif = 0;

		for (int lenMinus1 = ary32_1.length - 1, i = lenMinus1; i >= bound; i--) {

			long int64_1 = ary32_1[i] & B64va.$32_1_OF_64BIT;// important
			long int64_2 = ary32_2[i] & B64va.$32_1_OF_64BIT;// important

			if (int64_1 < (int64_2 + borrow)) {

				dif = B64va.$2POW32 + int64_1 - int64_2 - borrow;
				borrow = 1;

			} else {

				dif = int64_1 - int64_2 - borrow;
				borrow = 0;// important

			}

			// retAry32[i] = (int) (dif & $32_1_OF_64_BIT);
			ary32_1[i] = (int) dif;

		}

		return ary32_1;

	}

}