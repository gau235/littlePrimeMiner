package lGpl20.b32;

import lGpl20.b64.B64va;
import lGpl20.o.O;

/**
 * @version 2018/10/11_17:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Ary32va_K" >Ary32va_K.java</a>
 * 
 * @see Ary32va_Z
 */
public abstract class Ary32va_K extends Ary32va_C {

	private static final Class<Ary32va_K> CLASS_THIS = Ary32va_K.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 乘法.<br/>
	 * To multiply.
	 */
	public static int[] mul(int[] ary32_1, int indexFirst1_1, int[] ary32_2, int indexFirst1_2, int[] tempAry32) {

		int lenM1_1 = ary32_1.length - 1;
		int lenM1_2 = lenM1_1;
		int lenM1R = lenM1_1;

		int bound1 = StrictMath.max(indexFirst1_1, 0);
		int bound2 = StrictMath.max(indexFirst1_2, 0);

		for (int i2 = lenM1_2, iTemp = 0; i2 >= bound2; i2--, iTemp++) {

			int iRetAry32 = lenM1R - iTemp;// important

			long int64_2 = ary32_2[i2] & B64va.$32_1_OF_64BIT;// important
			long carry = 0;

			for (int i1 = lenM1_1; i1 >= bound1; i1--, iRetAry32--) {

				// O.l("iRetAry32=" + iRetAry32);

				long int64_1 = ary32_1[i1] & B64va.$32_1_OF_64BIT;// important
				long int64old = tempAry32[iRetAry32] & B64va.$32_1_OF_64BIT;// important
				long prod64 = int64_1 * int64_2 + int64old + carry;

				// O.l("int64_1=" + int64_1);
				// O.l("int64_2=" + int64_2);
				// O.l("int64old=" + int64old);

				tempAry32[iRetAry32] = (int) prod64;// no need (int) (prod64& $32_1_OF_64_BIT);

				carry = (prod64 >>> B32va.INT32_$32);// important

			}
			// O.l("========");

			// if (carry != 0 && iRetAry32 >= 0) {
			if (carry != 0) {

				// O.l("here=" + iRetAry32);
				// O.l("here=" + new Int256(ary32_1).toBigInteger() + "," + new Int256(ary32_2).toBigInteger());
				tempAry32[iRetAry32] = (int) carry;

			}

			// O.l("mul3=" + Arrays.toString(retAry32));

		}

		return tempAry32;

	}

	/**
	 * 乘法.<br/>
	 * To multiply.
	 */
	public static int[] mul(int[] ary32_1, int indexFirst1_1, int[] ary32_2, int indexFirst1_2) {

		int[] retAry32 = new int[ary32_1.length];

		int lenM1_1 = ary32_1.length - 1;
		int lenM1_2 = lenM1_1;
		int lenM1R = lenM1_1;

		int bound1 = StrictMath.max(indexFirst1_1, 0);
		int bound2 = StrictMath.max(indexFirst1_2, 0);

		for (int i2 = lenM1_2, iTemp = 0; i2 >= bound2; i2--, iTemp++) {

			int iRetAry32 = lenM1R - iTemp;// important

			long int64_2 = ary32_2[i2] & B64va.$32_1_OF_64BIT;// important
			long carry = 0;

			for (int i1 = lenM1_1; i1 >= bound1; i1--, iRetAry32--) {

				// O.l("iRetAry32=" + iRetAry32);

				long int64_1 = ary32_1[i1] & B64va.$32_1_OF_64BIT;// important
				long int64old = retAry32[iRetAry32] & B64va.$32_1_OF_64BIT;// important
				long prod64 = int64_1 * int64_2 + int64old + carry;

				// O.l("int64_1=" + int64_1);
				// O.l("int64_2=" + int64_2);
				// O.l("int64old=" + int64old);

				retAry32[iRetAry32] = (int) prod64;// no need (int) (prod64& $32_1_OF_64_BIT);

				carry = (prod64 >>> B32va.INT32_$32);// important

			}
			// O.l("========");

			// if (carry != 0 && iRetAry32 >= 0) {
			if (carry != 0) {

				// O.l("===here=" + iRetAry32);
				// O.l("===here==" + new Int256(ary32_1).toBigInteger()+","+new Int256(ary32_2).toBigInteger());
				retAry32[iRetAry32] = (int) carry;

			}

			// O.l("mul3=" + Arrays.toString(retAry32));

		}

		return retAry32;

	}

}