package lGpl20.other.iO.sample;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;

import lGpl20.comb.filter.CompaForSAsDecimal;
import lGpl20.o.O;
import lGpl20.other.iO.IOr;

/**
 * To read and sort.<br/>
 * To read and sort.
 * 
 * @version 2019/04/19_20:30:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP34_ReadFromPathNSortAsDecimal" >
 *          SP34_ReadFromPathNSortAsDecimal.java</a>
 * 
 * @see SP31_ReadNSplit1RowToSAry
 * 
 * @see SP32_ReadNMergeSomeSInto1Row
 * 
 * @see SP34_ReadFromPathNSortAsDecimal
 */
public class SP34_ReadFromPathNSortAsDecimal {

	/**
	 * 比較器.<br/>
	 * The Comparator to sort.
	 */
	public static final CompaForSAsDecimal COMPA_FOR_S_AS_DECIMAL = new CompaForSAsDecimal();

	public static void main(String[] sAry) throws Throwable {

		StringBuilder retStr = IOr.readStrFrom(Paths.get("C:/temp/a.txt"));

		sAry = O.splitNTrimAll(retStr.toString(), O.L.toString());

		// Arrays.sort(sAry, COMPA_FOR_S_AS_DECIMAL);
		Arrays.sort(sAry, Collections.reverseOrder(COMPA_FOR_S_AS_DECIMAL));

		O.l(sAry);

	}

}
