package lGpl20.other.sample;

import lGpl20.b32.eqDiv.Fr64;
import lGpl20.o.O;

/**
 * 分數運算.<br/>
 * <br/>
 * An easy test for fraction.
 * 
 * @version 2017/10/14_12:53:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=C251_Fraction" >C251_Fraction</a>
 * 
 * @see C254_Fraction
 */
public class C251_Fraction {

	public static void main(String[] sAry) throws Throwable {

		Fr64 f1 = new Fr64("1/2");
		Fr64 f2 = new Fr64("1/3");

		Fr64 f3 = f1.add(f2);

		O.l(f3);

	}

}