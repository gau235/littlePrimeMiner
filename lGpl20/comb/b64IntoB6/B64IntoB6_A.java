package lGpl20.comb.b64IntoB6;

import java.io.Serializable;

import lGpl20.o.O;

/**
 * To make a 64-bit long divide into every 6-bit cell.<br/>
 * The first index of cell from the right hand side is 0.
 * 
 * @version 2019/04/16_18:00:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=B64IntoB6_A" >B64IntoB6_A.java</a>
 * 
 * @see B64IntoB6_B
 */
public abstract class B64IntoB6_A implements Serializable {

	private static final Class<B64IntoB6_A> CLASS_THIS = B64IntoB6_A.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 6 bits per cell.<br/>
	 * 6 bits per cell.
	 */
	public static final int $NUM_OF_BIT_PER_CELL_INT32 = 6;

	/**
	 * 6 bits per cell.<br/>
	 * 6 bits per cell.
	 */
	public static final int $6 = $NUM_OF_BIT_PER_CELL_INT32;

	/**
	 * 6 bits per cell.<br/>
	 * 6 bits per cell.
	 */
	public static final int $TOTAL_CELL_INT32 = 10;

	/**
	 * max value per cell.<br/>
	 * max value per cell.
	 */
	public static final int $MAX_INT32_IN_CELL = 63;

	/**
	 * 0b11_1111<br/>
	 * 0b11_1111
	 */
	public static final int $6_1_OF_32BIT = 0b11_1111;

	/**
	 * 0b11_1111<br/>
	 * 0b11_1111
	 */
	public static final int MASK32 = $6_1_OF_32BIT;

	/**
	 * 0b0000_000000_000000_000000_000000_000000_000000_000000_000000_000000_111111L.<br/>
	 */
	public static final long MASK1TO_6 = 0b0000_000000_000000_000000_000000_000000_000000_000000_000000_000000_111111L;

	/**
	 * 0b0000_000000_000000_000000_000000_000000_000000_000000_000000_111111_000000L.<br/>
	 */
	public static final long MASK7TO_12 = 0b0000_000000_000000_000000_000000_000000_000000_000000_000000_111111_000000L;

	/**
	 * 0b0000_000000_000000_000000_000000_000000_000000_000000_111111_000000_000000L.<br/>
	 */
	public static final long MASK13TO_18 = 0b0000_000000_000000_000000_000000_000000_000000_000000_111111_000000_000000L;

	/**
	 * 0b0000_000000_000000_000000_000000_000000_000000_111111_000000_000000_000000L.<br/>
	 */
	public static final long MASK19TO_24 = 0b0000_000000_000000_000000_000000_000000_000000_111111_000000_000000_000000L;

	/**
	 * 0b0000_000000_000000_000000_000000_000000_111111_000000_000000_000000_000000L.<br/>
	 */
	public static final long MASK25TO_30 = 0b0000_000000_000000_000000_000000_000000_111111_000000_000000_000000_000000L;

	/**
	 * 0b0000_000000_000000_000000_000000_111111_000000_000000_000000_000000_000000L.<br/>
	 */
	public static final long MASK31TO_36 = 0b0000_000000_000000_000000_000000_111111_000000_000000_000000_000000_000000L;

	/**
	 * 0b0000_000000_000000_000000_111111_000000_000000_000000_000000_000000_000000L.<br/>
	 */
	public static final long MASK37TO_42 = 0b0000_000000_000000_000000_111111_000000_000000_000000_000000_000000_000000L;

	/**
	 * 0b0000_000000_000000_111111_000000_000000_000000_000000_000000_000000_000000L.<br/>
	 */
	public static final long MASK43TO_48 = 0b0000_000000_000000_111111_000000_000000_000000_000000_000000_000000_000000L;

	/**
	 * 0b0000_000000_111111_000000_000000_000000_000000_000000_000000_000000_000000L.<br/>
	 */
	public static final long MASK49TO_54 = 0b0000_000000_111111_000000_000000_000000_000000_000000_000000_000000_000000L;

	/**
	 * 0b0000_111111_000000_000000_000000_000000_000000_000000_000000_000000_000000L.<br/>
	 */
	public static final long MASK55TO_60 = 0b0000_111111_000000_000000_000000_000000_000000_000000_000000_000000_000000L;

	/**
	 * The base char array.<br/>
	 * The base char array.
	 */
	public static char[] genCharAryOf$() {

		final int lenOfCharAryOf$ = 64;

		char[] charAryOf$ = new char[lenOfCharAryOf$];

		for (int i = 0; i != lenOfCharAryOf$; i++) {

			charAryOf$[i] = O.C36;

		}

		return charAryOf$;

	}

	/**
	 * The base char array.<br/>
	 * The base char array.
	 */
	public static final char[] CHAR_ARY_OF_$ = genCharAryOf$();

}
