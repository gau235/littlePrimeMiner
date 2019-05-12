package lGpl20.other.iO.sample;

import java.nio.file.Paths;

import lGpl20.o.O;
import lGpl20.other.iO.IOr;

/**
 * 行列互換.<br/>
 * Row to column.
 * 
 * @version 2019/05/08_16:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP31_ReadNSplit1RowToSAry" >
 *          SP31_ReadNSplit1RowToSAry.java</a>
 * 
 * @see SP31_ReadNSplit1RowToSAry
 * 
 * @see SP32_ReadNMergeSomeSInto1Row
 * 
 * @see SP34_ReadFromPathNSortAsDecimal
 */
public class SP31_ReadNSplit1RowToSAry {

	public static void main(String[] sAry) throws Throwable {

		//such as:
		// String aaa = "A,B,C,D,E,F,G,H,I";
		// sAry = aaa.split(",");
		//
		// O.l("sAry=");
		// O.l(sAry);
		
		sAry = IOr.readNSplit1RowToSAry(Paths.get("C:/temp/a.txt"), O.S44);
		O.l(sAry);

	}

}
