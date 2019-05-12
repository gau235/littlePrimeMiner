package lGpl20.prime64;

import java.io.Serializable;

import lGpl20.o.O;

/**
 * 本類別區間計算娃, 計算出每一次要找質數的區間有多長.<br/>
 * To calculate the range (a number) for mine prime program.
 * 
 * @version 2019/04/21_11:00:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Ranger_A" >Ranger_A.java</a>
 * 
 * @see Ranger_R
 */
public abstract class Ranger_A implements Serializable {

	private static final Class<Ranger_A> CLASS_THIS = Ranger_A.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	public static final long TYPE_ADD = O.genInt64AsId("TYPE_ADD");

	public static final long TYPE_SUB = O.genInt64AsId("TYPE_SUB");

	public static final long TYPE_MUL = O.genInt64AsId("TYPE_MUL");

	/**
	 * 自然數 2<br/>
	 * Nature number 2
	 */
	public static final long $2 = 2L;

	/**
	 * 自然數 3.<br/>
	 * Nature number 3.
	 */
	public static final long $3 = 3L;

	/**
	 * 自然數 2<br/>
	 * Nature number 2
	 */
	public static final int $2_INT32 = 2;

	/**
	 * 自然數 3<br/>
	 * Nature number 3
	 */
	public static final int $3_INT32 = 3;

	/**
	 * 64 位元整數 10<br/>
	 * 10
	 */
	public static final int $10_INT32 = 10;

	/**
	 * 64 位元整數 10<br/>
	 * 10
	 */
	public static final long $10 = 10L;

	/**
	 * 64 位元整數 100<br/>
	 * 100
	 */
	public static final int $100_INT32 = 100;

	/**
	 * 64 位元整數 100<br/>
	 * 100
	 */
	public static final long $100 = 100L;

	/**
	 * 255<br/>
	 */
	public static final int $2POW8_MINUS1_INT32 = 0b1111_1111;

	/**
	 * 1,024<br/>
	 */
	public static final int $2POW10_INT32 = 0b100_0000_0000;

	/**
	 * 1,024<br/>
	 */
	public static final long $2POW10 = 0b100_0000_0000L;

	/**
	 * 1,048,576<br/>
	 */
	public static final int $2POW20_INT32 = 0b1_0000_0000_0000_0000_0000;

	/**
	 * 1,048,576<br/>
	 */
	public static final long $2POW20 = 0b1_0000_0000_0000_0000_0000L;

	/**
	 * 1,073,741,824<br/>
	 */
	public static final long $2POW30 = 0b100_0000_0000_0000_0000_0000_0000_0000L;

	/**
	 * 1,099,511,627,776<br/>
	 */
	public static final long $2POW40 = 0b1_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000L;

	/**
	 * 1,125,899,906,842,624<br/>
	 */
	public static final long $2POW50 = 0b100_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000L;

	/**
	 * 1,152,921,504,606,846,976<br/>
	 */
	public static final long $2POW60 = 0b1_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000L;

	/**
	 * 2,147,483,647<br/>
	 * 0b111_1111_1111_1111_1111_1111_1111_1111L
	 */
	public static final long $2POW31_MINUS1 = 0b111_1111_1111_1111_1111_1111_1111_1111L;

	/**
	 * 找質數時所允許輸入最小數.<br/>
	 * The minimum input number when mining prime.
	 */
	public static final int $MIN_TEST_INT32 = 1;

	/**
	 * 找質數時所允許輸入最小數.<br/>
	 * The minimum input number when mining prime.
	 */
	public static final long $MIN_TEST_INT = 1L;

	/**
	 * 3,037,000,499<br/>
	 * Math.sqrt(Long.MAX_VALUE) &gt; this
	 */
	public static final long $ROOT2_OF_2POW63_MINUS1 = 3_037_000_499L;

	/**
	 * 最小 range.<br/>
	 * The minimum range.
	 */
	public static final int $MIN_RANGE32_TO_MINE_PRIME = 10;

	/**
	 * 最大 range.<br/>
	 * The maximum range.
	 */
	public static final int $MAX_RANGE32_TO_MINE_PRIME = 4_000_000;

	/**
	 * 找質數的執行緒去找質數情況下的 big range.<br/>
	 * The big range for ThrToMinePrime.
	 */
	public static final int $MAX_BIG_RANGE32_FOR_THR_TO_MINE_PRIME = 8_000_000;

	/**
	 * 找質數的執行緒去找質數情況下的 big range.<br/>
	 * The big range for ThrToMinePrime.
	 */
	public static final int $MIN_BIG_RANGE32_FOR_THR_TO_MINE_PRIME = 40;

	/**
	 * 找質數數目的執行緒去找質數數目情況下的 big range for ThrToCountPrime.<br/>
	 * The big range for ThrToCountPrime to count prime.
	 */
	public static final int $MAX_BIG_RANGE32_FOR_THR_TO_COUNT_PRIME = 8_000_000;

	/**
	 * 找質數數目的執行緒去找質數數目情況下的 big range.<br/>
	 * The big range for ThrToMinePrime.
	 */
	public static final int $MIN_BIG_RANGE32_FOR_THR_TO_COUNT_PRIME = 40;

	/**
	 * 每次找質數時的運算當量.<br/>
	 * The amount of computing (every second?).
	 * 
	 * @see GuessFromGauss#guessTotalPrimeNRetInt32(long, long)
	 */
	public static final int $INT32_OF_TO_ACCESS_ARY_N_MOD = 36_000_000;

	/**
	 * 找質數 minePrime 時所允許輸入最大數.<br/>
	 * The maximum input number when mining prime.
	 */
	// public static final long $MAX_TEST_INT = 9_223_372_036_854_775_806L; // Long.MAX_VALUE-1
	public static final long $MAX_TEST_INT = Long.MAX_VALUE
			- GuessFromGauss.bigRange32ForThrToMinePrime(Long.MAX_VALUE / 10 * 9) * O.$MAX_QTY_OF_CPU_INT32 - 1;

	public static final long $MAX_PRIME_LESS_THAN_2POW63 = 9_223_372_036_854_775_783L;

}
