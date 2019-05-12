package lGpl20.prime64.thr;

import java.io.Serializable;

import lGpl20.o.O;
import lGpl20.o.thr.ThrWBox;

/**
 * 本類別處理執行緒的人; 幫忙找質數的人處理執行緒 <br/>
 * <br/>
 * To initial and to pack threads.<br/>
 * The aid to Miner.
 * 
 * @version 2019/04/22_14:30:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Thrva_A" >Thrva_A.java</a>
 * 
 * @see Thrva_J
 */
public abstract class Thrva_A implements Serializable {

	private static final Class<Thrva_A> CLASS_THIS = Thrva_A.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * The number of threads to share 1 EryOfPrimeAry.<br/>
	 * The number of threads to share 1 EryOfPrimeAry.
	 */
	public static final int INT32_OF_THR_TO_SHARE_1_ERY_OF_PRIME_ARY = 4;

	/**
	 * The number of threads to share 1 Adder32.<br/>
	 * The number of threads to share 1 Adder32.
	 */
	public static final int INT32_OF_THR_TO_SHARE_1_ADDER32 = 8;

	/**
	 * The empty thread.<br/>
	 * The empty thread.
	 */
	public static final Thread THR0 = new Thread();

	/**
	 * The empty ThrWBox.<br/>
	 * The empty ThrWBox.
	 */
	public static final ThrWBox<?> THR_W_BOX0 = new ThrWBox<Object>();

}