package lGpl20.b32;

import java.io.Serializable;
import java.math.BigInteger;

import lGpl20.o.O;

/**
 * 本類別是使用 2 進位.<br/>
 * <br/>
 * The 2 bit digit.
 * 
 * @version 2016/10/27_07:37:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=B32va_A" >B32va_A.java</a>
 * 
 * @see B32va_C
 */
public abstract class B32va_A implements Serializable {

	private static final Class<B32va_A> CLASS_THIS = B32va_A.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 6 bits per cell.<br/>
	 * 6 bits per cell.
	 */
	public static final int $NUM_OF_BIT_PER_CELL_INT32 = 4;

	/**
	 * 6 bits per cell.<br/>
	 * 6 bits per cell.
	 */
	public static final int $4 = $NUM_OF_BIT_PER_CELL_INT32;

	/**
	 * 32<br/>
	 * 0b10_0000
	 */
	public static final int INT32_$32 = 32;

	/**
	 * 64<br/>
	 * 0b100_0000
	 */
	public static final int INT32_$64 = 64;

	/**
	 * 128<br/>
	 * 0b1000_0000
	 */
	public static final int INT32_$128 = 128;

	/**
	 * 2^11<br/>
	 * 0b1000_0000_0000
	 */
	public static final int INT32_2POW11 = 0b1000_0000_0000;

	/**
	 * 2^15<br/>
	 * 0b1000_0000_0000_0000
	 */
	public static final int INT32_2POW15 = 0b1000_0000_0000_0000;

	/**
	 * 2^23<br/>
	 * 0b1000_0000_0000_0000_0000_0000
	 */
	public static final int INT32_2POW23 = 0b1000_0000_0000_0000_0000_0000;

	/**
	 * -2^31<br/>
	 * 0b1000_0000_0000_0000_0000_0000_0000_0000
	 */
	public static final int $HEAD1_1_OF_32BIT = 0b1000_0000_0000_0000_0000_0000_0000_0000;

	// /**
	// * 0b1111<br/>
	// * 0b1111
	// */
	// public static final int $4_1_OF_32BIT = 0b1111;
	//
	// /**
	// * 0b1111_0000_0000_0000_0000_0000_0000_0000<br/>
	// * 0b1111_0000_0000_0000_0000_0000_0000_0000
	// */
	// public static final int $HEAD4_1_OF_32BIT = 0b1111_0000_0000_0000_0000_0000_0000_0000;

	/**
	 * 0b1111_1111_1111_1111_1111_1111_1111_1111<br/>
	 * 0b1111_1111_1111_1111_1111_1111_1111_1111
	 */
	public static final int $32_1_OF_32BIT = 0b1111_1111_1111_1111_1111_1111_1111_1111;

	/**
	 * 2<br/>
	 * The BigInteger 2
	 */
	public static final BigInteger BIG_INT_$2 = BigInteger.valueOf(2);

	/**
	 * The String.<br/>
	 * The String.
	 */
	public static final String STRING_32BIT_$0_W_UNDERLINE = "0000_0000_0000_0000_0000_0000_0000_0000";

	/**
	 * The String.<br/>
	 * The String.
	 */
	public static final String STRING_32BIT_$1_W_UNDERLINE = "0000_0000_0000_0000_0000_0000_0000_0001";

	/**
	 * The String.<br/>
	 * The String.
	 */
	public static final String STRING_16BIT_$0_W_UNDERLINE = "0000_0000_0000_0000";

	/**
	 * The String.<br/>
	 * The String.
	 */
	public static final String STRING_16BIT_$1_W_UNDERLINE = "0000_0000_0000_0001";

	/**
	 * The String.<br/>
	 * The String.
	 */
	public static final String STRING_32BIT_0 = "00000000000000000000000000000000";

}
