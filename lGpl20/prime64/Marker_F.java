package lGpl20.prime64;

import lGpl20.o.O;

/**
 * @version 2017/07/07_10:14:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Marker_F" >Marker_F.java</a>
 * 
 * @see Marker_J
 */
public abstract class Marker_F extends Marker_A {

	private static final Class<Marker_F> CLASS_THIS = Marker_F.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * The divisor as marker.<br/>
	 * The divisor as marker.
	 */
	public long divisor = INIT_DIVISOR;

	/**
	 * To get the mark.<br/>
	 * To get the mark.
	 */
	public int get0Or1InB32AryForCompo(long int64) {

		int q = (int) (int64 >>> 6);
		// int rDiv2 = ((int) (int64 & 0b11_1111L)) >>> 1;// r=2 or r=3, the pos is 1
		int rDiv2 = (((int) int64) & 0b11_1111) >>> 1;// r=2 or r=3, the pos is 1

		// b32AryForCompo[q], the first position from right hand side is 0
		return (box[q] >>> rDiv2) & 0b1;

	}

	/**
	 * To mark.<br/>
	 * To mark.
	 */
	public void mark1InB32AryForCompo(long int64) {

		int q = (int) (int64 >>> 6);
		// int rDiv2 = ((int) (int64 & 0b11_1111L)) >>> 1;// r=2 or r=3, the pos is 1
		int rDiv2 = (((int) int64) & 0b11_1111) >>> 1;// r=2 or r=3, the pos is 1

		// b32AryForCompo[q], the first position from right hand side is 0
		box[q] = box[q] | (0b1 << rDiv2);// for CPU performance

	}

	/**
	 * To mark.<br/>
	 * To mark.
	 */
	public void mark0InB32AryForCompo(long int64) {

		int q = (int) (int64 >>> 6);
		// int rDiv2 = ((int) (int64 & 0b11_1111L)) >>> 1;// r=2 or r=3, the pos is 1
		int rDiv2 = (((int) int64) & 0b11_1111) >>> 1;// r=2 or r=3, the pos is 1

		// b32AryForCompo[q], the first position from right hand side is 0
		// b32AryForCompo[q] = b32AryForCompo[q] ^ (0b1 << rDiv2);
		box[q] = box[q] & (~(0b1 << rDiv2));

	}

}
