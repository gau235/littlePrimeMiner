package lGpl20.o.ery;

import lGpl20.o.O;

/**
 * 32 位元整數伍.<br/>
 * The int32 sequence.
 * 
 * @version 2019/05/01_21:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Seq32" >Seq32.java</a>
 * 
 * @see Ery
 * 
 * @see Seq
 */
public class Seq32 extends Seq32_Z {

	private static final Class<Seq32> CLASS_THIS = Seq32.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 建構方法.<br/>
	 * Constructor.
	 */
	public Seq32(int... ary32) {

		super(ary32);
		iLen = ary32.length;

	}

	/**
	 * 建構方法.<br/>
	 * Constructor.
	 */
	public Seq32() {

		super(new int[Ery.DEF_LEN32]);
		iLen = 0;

	}

	@Override
	public Seq32 clone() {

		Seq32 newSeq32 = new Seq32(ary32.clone());
		newSeq32.iLen = iLen;

		return newSeq32;

	}

	/**
	 * 加 1 個項到此 32 位元整數伍末之後.<br/>
	 * To append the element to after the iLen of this.
	 */
	public Seq32 a(int int32) {

		ensureLen32(iLen + 1);
		ary32[iLen++] = int32;

		return this;

	}

	/**
	 * 加 all 個項到此 32 位元整數伍末之後.<br/>
	 * To append the all to after the iLen of this.
	 */
	public Seq32 appendAll(Seq32 otherSeq32) {

		int lenPlusOtherLen = iLen + otherSeq32.iLen;

		ensureLen32(lenPlusOtherLen);
		System.arraycopy(otherSeq32.ary32, 0, ary32, iLen, otherSeq32.iLen);

		iLen = lenPlusOtherLen;

		return this;

	}

}
