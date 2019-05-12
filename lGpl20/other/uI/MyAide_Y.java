package lGpl20.other.uI;

import lGpl20.o.O;
import lGpl20.other.uI.thr.MyThrToSaveMP;
import lGpl20.other.uI.thr.MyThrToSaveRP;

/**
 * @version 2017/10/15_04:28:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=MyAide_Y" >MyAide_Y.java</a>
 * 
 * @see MyAide_Z
 */
public abstract class MyAide_Y extends MyAide_W {

	private static final Class<MyAide_Y> CLASS_THIS = MyAide_Y.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 執行按下 save 動作.<br/>
	 * To do the save method.
	 */
	public static void doSave(long numAsType) {

		if (numAsType == NUM_MP_3) {

			myThrToSaveMP = new MyThrToSaveMP();
			myThrToSaveMP.start();

		}

		if (numAsType == NUM_RP_3) {// "MyComponenter.buttonRP3.isEnabled()=false

			myThrToSaveRP = new MyThrToSaveRP();
			myThrToSaveRP.start();

		}

	}

}
