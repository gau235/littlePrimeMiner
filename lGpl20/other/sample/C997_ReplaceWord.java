package lGpl20.other.sample;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import lGpl20.o.O;
import lGpl20.other.iO.IOr;

/**
 * To replace.<br/>
 * To replace.
 * 
 * @version 2019/04/27_12:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=C997_ReplaceWord" >C997_ReplaceWord
 *          .java</a>
 * 
 */
public class C997_ReplaceWord {

	public static void main(String[] sAry) throws Throwable {

		// Path from = Paths.get("C:/e44/w/w20/src/lGpl20/other/jsp/Jsp_D.java");
		// Path to = Paths.get("C:/temp/Jsp_D.java");
		// Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);

		Path pathOfPasswordFile = Paths.get("C:/password.txt");

		Path pathOfFile = Paths.get("C:/temp/Jsp_D.java");
		String sCode = IOr.readStrFrom(pathOfFile).toString();

		int index = sCode.indexOf("LOGIN_PASSWORD");
		// O.l("oldCode=" + O.L + sCode);

		String password = sCode.substring(index + 17, index + 22);

		O.l("password=" + password);

		String newPassword = IOr.readStrFrom(pathOfPasswordFile).toString().split("=")[1];

		sCode = sCode.replace(password, "\"" + newPassword + "\"");

		O.l("sCode=" + sCode);

		IOr.writeCharSeqToFile(sCode, pathOfFile);

		// O.x();

	}

}