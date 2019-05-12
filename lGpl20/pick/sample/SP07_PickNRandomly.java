package lGpl20.pick.sample;

import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.o.O;
import lGpl20.pick.Pickva;

/**
 * To pick n Randomly.<br/>
 * <br/>
 * To pick n Randomly.
 * 
 * @version 2018/11/13_16:30:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP07_PickNRandomly" >SP07_PickNRandomly.
 *          java</a>
 * 
 */
public class SP07_PickNRandomly {

	private static final Class<SP07_PickNRandomly> CLASS_THIS = SP07_PickNRandomly.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	public static void main(String[] sAry) throws Throwable {

		int n = 5;
		int allOfN = 30;

		long b64IntoB6 = Pickva.pickRandomly(allOfN, n);

		O.l(B64IntoB6.toStrByValInB6Cell(b64IntoB6));

	}

}
