package lGpl20.other.iO;

import java.nio.file.Files;
import java.nio.file.Path;

import lGpl20.o.O;

/**
 * @version 2018/03/27_11:17:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=IOr_C" >IOr_C.java</a>
 * 
 * @see IOr_E
 */
public abstract class IOr_C extends IOr_A {

	private static final Class<IOr_C> CLASS_THIS = IOr_C.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To new dir and files.<br/>
	 * To new dir and files.
	 */
	public static void newDirNFile(Path pathOfFile) throws Throwable {

		Files.createDirectories(pathOfFile.getParent());
		Files.createFile(pathOfFile);

	}

}