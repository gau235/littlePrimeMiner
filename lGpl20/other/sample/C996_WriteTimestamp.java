package lGpl20.other.sample;

import java.nio.file.Path;
import java.nio.file.Paths;

import lGpl20.o.O;
import lGpl20.o.time.T64;
import lGpl20.other.iO.IOr;

/**
 * To update the time stamp.<br/>
 * <br/>
 * To update the time stamp.
 * 
 * @version 2018/03/23_12:48:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=C996_WriteTimestamp" >C996_WriteTimestamp
 *          .java</a>
 * 
 */
public class C996_WriteTimestamp {

	public static void main(String[] sAry) throws Throwable {

		Path pathOfFile = Paths.get("C:/temp/O.java");
		String sCode = IOr.readStrFrom(pathOfFile).toString();
		int index = sCode.indexOf("STRING_UPDATED_TIME");
		O.l("oldCode=" + O.L + sCode);

		String sTime = sCode.substring(index + 23, index + 52);

		O.l("oldTime=" + sTime);
		// O.l("indexOf=" + sCode.indexOf(sTime));
		sCode = sCode.replace(sTime, T64.toTimeStrWMilliSecWGmt());
		// sCode = sCode.replaceFirst("pub", "fff");// can not work with '+' in the string
		// O.l(sCode);

		sTime = sCode.substring(index + 23, index + 52);
		O.l("newTime=" + sTime);

		IOr.writeCharSeqToFile(sCode, pathOfFile);

		sCode = IOr.readStrFrom(pathOfFile).toString();

		// O.l(sCode);

	}

}