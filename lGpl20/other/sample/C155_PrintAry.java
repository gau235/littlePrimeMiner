package lGpl20.other.sample;

import lGpl20.o.O;
import lGpl20.o.ery.Ery;
import lGpl20.o.ery.Seq;
import lGpl20.o.ery.Seq32;

/**
 * To print the array.<br/>
 * <br/>
 * To print the array.
 * 
 * @version 2018/10/15_00:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=C155_PrintAry" >C155_PrintAry.java</a>
 * 
 */
public class C155_PrintAry {

	public static void main(String[] sAry) throws Throwable {

		Ery<String> ery = new Ery<>("C");

		ery.a("a");
		ery.a("HAHA");
		ery.a("D");

		// ery.addAll(otherEry);
		// ery.aryOfElem();

		O.l(ery.toStr());
		O.l("==========");

		Seq seq = new Seq();
		seq.a(5);
		seq.a(5);
		seq.a(7);

		O.l(seq.toStr());
		O.l("==========");

		Seq32 seq32 = new Seq32();
		seq32.a(15);
		seq32.a(5);
		seq32.a(75);

		O.l(seq32.toStr());
		O.l("==========");

		O.l(new int[] { 52, 3, 8 });

	}

}