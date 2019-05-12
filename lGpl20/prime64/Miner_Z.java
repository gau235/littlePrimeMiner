package lGpl20.prime64;

import lGpl20.o.O;

/**
 * @version 2017/07/25_16:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Miner_Z" >Miner_Z.java</a>
 * 
 * @see Miner
 */
public abstract class Miner_Z extends Miner_V {

	private static final Class<Miner_Z> CLASS_THIS = Miner_Z.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * Current max n to test.<br/>
	 * Current max n to test.
	 */
	public static long currMaxIntToTest() {

		final float f32TailPrime = (float) oriAryOfPrime[oriAryOfPrime.length - 1];
		final float ansF32 = f32TailPrime * f32TailPrime;

		// O.l("ansF32=" + ansF32 + O.S32 + CLASS_THIS);
		// O.l("Ranger.$MAX_TEST_INT=" + Ranger.$MAX_TEST_INT + O.S32 + CLASS_THIS);
		// O.l(Long.MAX_VALUE + O.S32 + CLASS_THIS);

		if (ansF32 < Ranger.$MAX_TEST_INT) {

			return (long) ansF32;

		}

		return Ranger.$MAX_TEST_INT;

	}

}