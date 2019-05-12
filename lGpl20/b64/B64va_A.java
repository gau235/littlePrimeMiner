package lGpl20.b64;

import java.io.Serializable;

import lGpl20.o.O;

/**
 * 本類別是使用 2 進位.<br/>
 * <br/>
 * The 2 bit digit.
 * 
 * @version 2016/10/27_07:07:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=B64va_A" >B64va_A.java</a>
 * 
 * @see B64va_C
 */
public abstract class B64va_A implements Serializable {

	private static final Class<B64va_A> CLASS_THIS = B64va_A.class;

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
	 * -2^63<br/>
	 * 0b1000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000L;
	 */
	public static final long $HEAD1_1_OF_64BIT = 0b1000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000L;

	/**
	 * 2^32-1<br/>
	 * 0b1111_1111_1111_1111_1111_1111_1111_1111L
	 */
	public static final long $32_1_OF_64BIT = 0b1111_1111_1111_1111_1111_1111_1111_1111L;

	/**
	 * 0b1111_1111_1111_1111_1111_1111_1111_1111_0000_0000_0000_0000_0000_0000_0000_0000L<br/>
	 * 0b1111_1111_1111_1111_1111_1111_1111_1111_0000_0000_0000_0000_0000_0000_0000_0000L
	 */
	public static final long $HEAD32_1_OF_64BIT = 0b1111_1111_1111_1111_1111_1111_1111_1111_0000_0000_0000_0000_0000_0000_0000_0000L;

	/**
	 * 0b1111L<br/>
	 * 0b1111L
	 */
	public static final long $4_1_OF_64BIT = 0b1111L;

	/**
	 * 0b1111_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000L<br/>
	 * 0b1111_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000L
	 */
	public static final long $HEAD4_1_OF_64BIT = 0b1111_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000L;

	/**
	 * 2^32<br/>
	 * 0b1_0000_0000_0000_0000_0000_0000_0000_0000L
	 */
	public static final long $2POW32 = 0b1_0000_0000_0000_0000_0000_0000_0000_0000L;

	/**
	 * The String.<br/>
	 * The String.
	 */
	public static final String STRING_64BIT_$0_W_UNDERLINE = "0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000";

	/**
	 * The String.<br/>
	 * The String.
	 */
	public static final String STRING_64BIT_$1_W_UNDERLINE = "0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0001";

}
