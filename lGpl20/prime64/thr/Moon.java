package lGpl20.prime64.thr;

import java.io.Serializable;

import lGpl20.o.O;
import lGpl20.o.thr.ThrWBox;
import lGpl20.prime64.ery.EryOfPrimeAry;

/**
 * The dash board.<br/>
 * <br/>
 * The dash board.
 * 
 * @version 2019/04/29_10:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Moon" >Moon.java</a>
 */
public class Moon implements Serializable {

	private static final Class<Moon> CLASS_THIS = Moon.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	public long intAsType;

	public long oriN1;

	public long oriN2;

	public int numOfThr;

	public int bigRange32;

	/**
	 * The array of threads to mine primes.<br/>
	 * The array of threads to mine primes.
	 */
	public ThrToMine[] aryThrMP;// Miner.ID_TO_MINE_PRIME, Miner.ID_TO_MINE_PRIME_W_1_ERY_OF_PRIME_ARY

	public EryOfPrimeAry[] aryOfEryOfPrimeAry;

	public ThrWBox<?> otherThr;

}