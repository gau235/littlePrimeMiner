package lGpl20.o.ery.sample;

import java.io.Serializable;

import lGpl20.o.O;
import lGpl20.o.ery.Ery;

/**
 * The Ery.<br/>
 * The Ery.
 * 
 * @version 2019/04/18_22:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP05_EryOfS" >SP05_EryOfS.java</a>
 * 
 */
public class SP05_EryOfS implements Serializable {

	private static final Class<SP05_EryOfS> CLASS_THIS = SP05_EryOfS.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	public static void main(String[] sAry) {

		// Ery<String> eryOfS = new Ery<String>();// [Ljava.lang.Object; cannot be cast to [Ljava.lang.String
		// eryOfS.a("kkk");

		Ery<String> eryOfS = new Ery<String>(O.Z);

		eryOfS.cutHead();
		eryOfS.cutTail();

		eryOfS.a("kkk");

		sAry = eryOfS.aryOfElem();

		O.l("sAry=" + sAry[0]);

	}

}
