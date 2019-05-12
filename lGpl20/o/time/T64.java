package lGpl20.o.time;

import lGpl20.o.O;

/**
 * 時間轉毫秒數.<br/>
 * <br/>
 * The time in 64 bit millisecond.
 * 
 * @version 2014/06/14_14:37:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=T64" >T64.java</a>
 * 
 */
public abstract class T64 extends Time64 {

	private static final Class<T64> CLASS_THIS = T64.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

}
