package lGpl20.o.ery;

import lGpl20.o.O;

/**
 * 64 位元整數伍.<br/>
 * <br/>
 * The int64 sequence.
 * 
 * @version 2019/03/18_09:00:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Seq" >Seq.java</a>
 * 
 * @see Ery
 */
public class Seq extends Seq_Z {

	private static final Class<Seq> CLASS_THIS = Seq.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 建構方法.<br/>
	 * Constructor.
	 */
	public Seq(long... ary) {

		super(ary);
		iLen = ary.length;

	}

	/**
	 * 建構方法.<br/>
	 * Constructor.
	 */
	public Seq() {

		super(new long[Ery.DEF_LEN32]);
		iLen = 0;

	}

	@Override
	public Seq clone() {

		Seq newSeq = new Seq(ary.clone());
		newSeq.iLen = iLen;

		return newSeq;

	}

	/**
	 * 加 1 個項到此 64 位元整數伍末之後.<br/>
	 * To append the element to after the iLen of this.
	 */
	public Seq a(long int64) {

		ensureLen32(iLen + 1);
		ary[iLen++] = int64;

		return this;

	}

	/**
	 * 加 all 個項到此 64 位元整數伍末之後.<br/>
	 * To append the all to after the iLen of this.
	 */
	public Seq appendAll(Seq otherSeq) {

		int lenPlusOtherLen = iLen + otherSeq.iLen;// we do not syn otherEry's KEY_TO_SYN

		ensureLen32(lenPlusOtherLen);
		System.arraycopy(otherSeq.ary, 0, ary, iLen, otherSeq.iLen);

		iLen = lenPlusOtherLen;

		return this;

	}

}
