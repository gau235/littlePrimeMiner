package lGpl20.pick.sample;

import lGpl20.o.O;
import lGpl20.pick.Pickva;

/**
 * To pick.<br/>
 * <br/>
 * To pick.
 * 
 * @version 2019/03/25_21:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP05_PickRandomlyByAry32" >SP05_PickRandomlyByAry32.
 *          java</a>
 */
public class SP05_PickRandomlyByAry32 {

	public static void main(String[] sAry) {

		// int[] ary32 = Ary32va.genAscAry32From1(5);
		int[] ary32 = new int[] { 1, 2, 3, 4, 4, 5, 7 };
		O.l(ary32);

		O.l();
		O.l(Pickva.pickNRandomlyFrom(ary32, 2));

	}

}
