package lGpl20.o.thr;

import java.io.Serializable;

import lGpl20.o.O;

/**
 * The thread with box.<br/>
 * The thread with box.
 * 
 * @version 2019/05/01_16:50:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=ThrWBox" >ThrWBox.java</a>
 * 
 */
public class ThrWBox<TypeForBox> extends Thread implements Serializable {

	@SuppressWarnings("rawtypes")
	private static final Class<ThrWBox> CLASS_THIS = ThrWBox.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 類別被建立的時間.<br/>
	 * The start time .
	 */
	public final long TIME64_START = System.currentTimeMillis();

	/**
	 * 執行緒的作用資料.<br/>
	 * The box inside for data.
	 */
	public TypeForBox box;

	/**
	 * 監測間隔時間.<br/>
	 * The sleep duration for this thread.
	 */
	protected int int32Duration = 300;

}