package lGpl20.other.iO.sample;

import java.nio.file.Paths;

import lGpl20.o.O;
import lGpl20.other.iO.IOr;

/**
 * 輸入與輸出.<br/>
 * <br/>
 * To input and to output.
 * 
 * @version 2019/04/19_19:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP29_InputOutput" >SP29_InputOutput.java
 *          </a>
 * 
 */
public class SP29_InputOutput {

	public static void main(String[] sAry) throws Throwable {

		StringBuilder str = IOr.readStrFrom(Paths.get("D:/Test.java"));

		O.l(str);

	}

}
