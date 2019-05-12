package lGpl20.other.iO.sample;

import java.nio.file.Paths;

import lGpl20.o.O;
import lGpl20.other.iO.IOr;

/**
 * 行列互換.<br/>
 * Row to column.
 * 
 * @version 2019/04/19_20:30:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP32_ReadNMergeSomeSInto1Row" >
 *          SP32_ReadNMergeSomeSInto1Row.java</a>
 * 
 * @see SP31_ReadNSplit1RowToSAry
 * 
 * @see SP32_ReadNMergeSomeSInto1Row
 * 
 * @see SP34_ReadFromPathNSortAsDecimal
 */
public class SP32_ReadNMergeSomeSInto1Row {

	public static void main(String[] sAry) throws Throwable {

		StringBuilder str = IOr.readNMergeSomeSInto1Row(Paths.get("C:/temp/a.txt"), O.L.toString(), O.S44);
		O.l(str);

	}

}
