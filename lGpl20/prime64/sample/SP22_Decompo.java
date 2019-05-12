package lGpl20.prime64.sample;

import lGpl20.o.O;
import lGpl20.prime64.Miner;

/**
 * 找質數.<br/>
 * <br/>
 * To decomposite a number.
 * 
 * @version 2018/04/08_11:30:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=SP22_Decompo" >SP22_Decompo.java</a>
 * 
 */
public class SP22_Decompo {

	public static void main(String[] sAry) throws Throwable {

		Object obj = "51;100";

		String[] newSAry = obj.toString().trim().split(";"); // the text field

		for (int i = 0; i < newSAry.length; i++) {

			long int64 = Long.parseLong(newSAry[i].trim());

			O.l(int64 + "=" + Miner.decompoNRetStr(int64));

		}

	}

}