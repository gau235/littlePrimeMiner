package lGpl20.b32;

import lGpl20.o.O;

/**
 * @version 2018/11/01_12:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=B32va_M" >B32va_M.java</a>
 * 
 * @see B32va_V
 */
public abstract class B32va_M extends B32va_J {

	private static final Class<B32va_M> CLASS_THIS = B32va_M.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To distribute by ary32.<br/>
	 * To distribute by ary32.
	 */
	public static int[] distributeOverAry32OnBit(int b32As2Pow) {

		int[] ary32 = new int[Integer.bitCount(b32As2Pow)];

		int mask32 = 0b1;
		int temp32;
		int i = 0;

		do {

			temp32 = b32As2Pow & mask32;

			if (temp32 != 0b0) {

				ary32[i++] = mask32;

			}

		} while ((mask32 = mask32 << 1) <= b32As2Pow);

		return ary32;

	}

	/**
	 * toB32As2PowByAry32.<br/>
	 * toB32As2PowByAry32.
	 */
	public static int toB32As2PowByAry32(int[] ary32) {

		int b32As2PowFromAry32 = ary32[0];
		for (int i = 1; i != ary32.length; i++) {

			b32As2PowFromAry32 = b32As2PowFromAry32 | ary32[i];

		}

		return b32As2PowFromAry32;

	}

	/**
	 * To difference with exclusive or.<br/>
	 * To difference with exclusive or.
	 */
	public static int diffByB32As2Pow(int powOf2, int[] otherAry32) {// exclusive or

		// note:
		// 0b1 << 2 - 0b1 equals to 0b1 << (2 - 0b1)
		int b32FromOtherAry32 = otherAry32[0];
		for (int i = 1; i != otherAry32.length; i++) {

			b32FromOtherAry32 = b32FromOtherAry32 | otherAry32[i];

		}

		// O.l("b32FromOtherAry32=" + toStrIn8Bit(b32FromOtherAry32) + O.S32 + CLASS_THIS);
		int b32From2Pow = (0b1 << powOf2) - 0b1;// if powOf2 were 4, b32From2Pow is 0b111
		// O.l("b32From2Pow=" + toStrIn8Bit(b32From2Pow) + O.S32 + CLASS_THIS);
		int retB32 = b32FromOtherAry32 ^ b32From2Pow;// exclusive or
		// O.l("retB32=" + toStrIn8Bit(retB32) + O.S32 + CLASS_THIS);
		return retB32;

	}

}
