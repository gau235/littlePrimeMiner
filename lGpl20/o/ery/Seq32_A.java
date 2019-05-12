package lGpl20.o.ery;

import java.io.Serializable;

import lGpl20.o.O;

/**
 * 32 位元整數伍.<br/>
 * <br/>
 * The int32 sequence.
 * 
 * @version 2019/05/01_21:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Seq32_A" >Seq32_A.java</a>
 * 
 * @see Seq32_C
 */
public abstract class Seq32_A implements Serializable {

	private static final Class<Seq32_A> CLASS_THIS = Seq32_A.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 內部陣列.<br/>
	 * The inside array.
	 */
	protected int[] ary32;

	/**
	 * 內部陣列的最末項的後 1 個位置.<br/>
	 * The position after the last element of the inside array.
	 */
	public int iLen = 0;

	/**
	 * 建構方法.<br/>
	 * Constructor.
	 */
	public Seq32_A(int[] ary32) {

		this.ary32 = ary32;

	}

}
