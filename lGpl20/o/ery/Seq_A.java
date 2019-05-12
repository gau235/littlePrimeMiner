package lGpl20.o.ery;

import java.io.Serializable;

import lGpl20.o.O;

/**
 * 64 位元整數伍.<br/>
 * <br/>
 * The int64 sequence.
 * 
 * @version 2019/03/17_15:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Seq_A" >Seq_A.java</a>
 * 
 * @see Seq_C
 */
public abstract class Seq_A implements Serializable {

	private static final Class<Seq_A> CLASS_THIS = Seq_A.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 內部陣列.<br/>
	 * The inside array.
	 */
	protected long[] ary;

	/**
	 * 內部陣列的最末項的後 1 個位置.<br/>
	 * The position after the last element of the inside array.
	 */
	public int iLen = 0;

	/**
	 * 建構方法.<br/>
	 * Constructor.
	 */
	public Seq_A(long[] ary) {

		// if (ary == null || ary.length == 0){}

		this.ary = ary;

	}

}
