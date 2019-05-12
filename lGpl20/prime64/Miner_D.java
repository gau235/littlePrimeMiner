package lGpl20.prime64;

import lGpl20.o.O;

/**
 * @version 2017/06/14_22:07:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Miner_D" >Miner_D.java</a>
 * 
 * @see Miner_G
 */
public abstract class Miner_D extends Miner_C {

	private static final Class<Miner_D> CLASS_THIS = Miner_D.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 內建的質數陣列.<br/>
	 * The inside origin array of prime.
	 */
	protected static long[] oriAryOfPrime = initByOriAry32OfOddPrime239();

	/**
	 * 執行擴充質數隊伍的最大值.<br/>
	 * The maximum number to grow the EryOfPrimeAry.
	 */
	public static final long $MAX_INT_TO_GROW_ORI_ARY_OF_PRIME = 3_037_000_507L;// 3,037,000,499

	/**
	 * The max length of oriAryOfPrime.<br/>
	 * The max length of oriAryOfPrime.
	 */
	public static final int $MAX_LEN32_OF_ORI_ARY_OF_PRIME = 146_144_319;

	public static final long ID_TO_MINE_PRIME = O.genInt64AsId("ID_TO_MINE_PRIME");

	public static final long ID_TO_MINE_PRIME_W_1_ERY_OF_PRIME_ARY = O.genInt64AsId("ID_TO_MINE_PRIME_W_1_ERY_OF_PRIME_ARY");

}