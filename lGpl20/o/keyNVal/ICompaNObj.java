package lGpl20.o.keyNVal;

/**
 * 本介面可比較介面與泛型物件.<br/>
 * 以 1 個可比較介面為 key, 以泛型物件為 value.<br/>
 * <br/>
 * The comparable object attached to a generic type object.
 * 
 * @version 2014/07/03_20:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=ICompaNObj" >ICompaNObj.java</a>
 * 
 */
public interface ICompaNObj<At0 extends Comparable<? super At0>, At1> {

	/**
	 * 取得此可比較介面與泛型物件的可比較介面.<br/>
	 * To return the Comparable object of this CompaNObj.
	 */
	public abstract At0 at0();

	/**
	 * 取得此可比較介面與泛型物件的泛型物件.<br/>
	 * To return the generic type object of this CompaNObj.
	 */
	public abstract At1 at1();

	/**
	 * 把此可比較介面與泛型物件轉成字串建立者.<br/>
	 * To convert this to StringBuilder.
	 */
	public abstract StringBuilder toStr();

}
