package lGpl20.other.sample;

import lGpl20.o.O;
import lGpl20.o.str.Strva;

/**
 * 列出 java 系統基本參數.<br/>
 * <br/>
 * To print java system properties.
 * 
 * @version 2014/10/25_23:37:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=C130_PrintJvmProperty" >
 *          C130_PrintJvmProperty.java</a>
 * 
 */
public class C130_PrintJvmProperty {

	public static void main(String[] sAry) throws Throwable {

		O.l(Strva.toStrWLineWr(System.getProperties(), O.L));

	}

}