package lGpl20.prime64;

import lGpl20.o.O;
import lGpl20.o.thr.ThrWBox;

/**
 * To mark primes.<br/>
 * <br/>
 * To mark primes.
 * 
 * @version 2017/06/27_12:28:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Marker_A" >Marker_A.java</a>
 * 
 * @see Marker_F
 */
public abstract class Marker_A extends ThrWBox<int[]> {

	private static final Class<Marker_A> CLASS_THIS = Marker_A.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * The initial divisor.<br/>
	 * The initial divisor.
	 */
	public static final long INIT_DIVISOR = 3L;

	// /**
	// * The initial integer array.<br/>
	// * The initial integer array.
	// */
	// public static final int[] INIT_B32_ARY_FOR_COMPO = { 0b0 };

	/**
	 * 找質數 minePrime 時所允許輸入最大數 .<br/>
	 * The maximum input number when mining prime.
	 */
	// public static final long $MAX_TEST_N = 137_438_953_279L;
	public static final long $MAX_TEST_N = (((long) (O.$MAX_LEN32_OF_ARY - 1)) << 6) + 63L;
	// 137,438,953,216 ok
	// 137,438,953,217
	// 137,438,953,218
	// 137,438,953,278 this
	// 137,438,953,279 this
	// 137,438,953,280

	/**
	 * The maximum total primes.<br/>
	 * The maximum total primes.
	 */
	public static final long $MAX_TOTAL_PRIME = 5_586_502_342L;

	/**
	 * The tail number.<br/>
	 * The tail number.
	 */
	public long tailN;

	public long root2OfTailN;

	/**
	 * Integer array of composite.<br/>
	 * Integer array of composite.
	 */
	// public static int[] b32AryForCompoA = INIT_B32_ARY_FOR_COMPO;
	// public static volatile int[] b32AryForCompoA;
	// public static int[] b32AryForCompoA;
	// public static int[] box;

}
