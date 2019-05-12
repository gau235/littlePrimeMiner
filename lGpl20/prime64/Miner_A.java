package lGpl20.prime64;

import java.io.Serializable;

import lGpl20.o.O;
import lGpl20.prime64.ery.EryOfPrimeAry;

/**
 * 本类别抽象找质数的人, 是我造质数卵时最先写的类别.<br/>
 * 耗能量的质数卵, 我当初发明它是要找出初数和末数间所有的质数, 我无意间用它测试电脑效能.<br/>
 * 我觉得武功愈高, 佛法也要愈高; 所以我开放原始码.<br/>
 * 我更有人性.<br/>
 * <br/>
 * 质数卵设计的取舍:<br/>
 * 1. 人性 (阴暗面)<br/>
 * 2. 生创力<br/>
 * 3. 结构 (建构, 简单和容易改动, 容易维护)<br/>
 * 4. 退场机制, 有上台就得有下台<br/>
 * 5. 执行效能<br/>
 * 
 * 11. 思想方面: 人类因为有梦想而伟大, 人类因为认识自己的有限, 认识自己的渺小, 因为去认识自己而伟大<br/>
 * 12. 思想方面: 武功愈高, 佛法也要愈高<br/>
 * <br/>
 * 找质数的人找质数是去抓内建的质数阵列内的质数来检验你输入的数是否为质数, 所以内建的质数阵列内含质数要连续, 且够大.<br/>
 * <br/>
 * The first class I wrote in this program.<br/>
 * This program is Little Sequence Prime64 Miner Escapable (LSPME), version prime64LGPL20;<br/>
 * and is used to mine the primes less than 64 bit integer on your personal computer.<br/>
 * If you want to develop the more martial, you will need more Buddhism.<br/>
 * 
 * @version 2019/04/22_17:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Miner_A" >Miner_A.java</a>
 * 
 * @see EryOfPrimeAry
 * 
 * @see Miner_C
 */
public abstract class Miner_A implements Serializable {

	private static final Class<Miner_A> CLASS_THIS = Miner_A.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 最小的自然質數 2.<br/>
	 * The minimum nature prime 2 .
	 */
	public static final long MIN_NAT_PRIME = 2L;

	/**
	 * 內建的較小質數陣列.<br/>
	 * The inside little origin array of prime.
	 */
	public static final int[] ORI_ARY32_OF_ODD_PRIME_239 = { 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67,
			71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193,
			197, 199, 211, 223, 227, 229, 233, 239 };

	/**
	 * 找質數的人初始化時會找 1 ~ $INIT_END_OF_ORI_ARY_OF_PRIME_INT32 的質數.<br/>
	 * The tail prime of origin array of prime.
	 */
	public static final int $INIT_TAIL_PRIME_OF_ORI_ARY_OF_PRIME_INT32 = 55_109;

	/**
	 * 找質數的人初始化時會找 1 ~ $INIT_END_OF_ORI_ARY_OF_PRIME_INT32 的質數.<br/>
	 * 用來裝這些質數的陣列的長度.<br/>
	 * The length of origin array of prime.
	 */
	public static final int $COUNT32_OF_PRIME_LESS_OR_EQUAL_INIT_TAIL_PRIME = 5_601;

}
