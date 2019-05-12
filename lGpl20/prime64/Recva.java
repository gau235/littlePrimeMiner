package lGpl20.prime64;

import java.io.Serializable;

import lGpl20.o.O;

/**
 * The record.<br/>
 * <br/>
 * The record.
 * 
 * @version 2017/08/23_18:50:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Recva" >Recva.java</a>
 */
public class Recva implements Serializable {

	private static final Class<Recva> CLASS_THIS = Recva.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	public long n1;

	public long n2;

	public int numOfThr;

	public long totalPrime;

	public float f32TimeCost;

	public CharSequence charSequenceAsNote = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

	public Object tempObj = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

}