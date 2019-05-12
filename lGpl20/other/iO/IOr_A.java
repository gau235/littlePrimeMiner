package lGpl20.other.iO;

import java.io.File;
import java.io.Serializable;

import lGpl20.o.O;

/**
 * 本類別檔案讀寫娃.<br/>
 * To input and to output.
 * 
 * @version 2014/07/06_06:24:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=IOr_A" >IOr_A.java</a>
 * 
 * @see IOr_C
 */
public abstract class IOr_A implements Serializable {

	private static final Class<IOr_A> CLASS_THIS = IOr_A.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 取主檔名.<br/>
	 * To get the main name of the file.
	 */
	public static String getFileMainName(File file) {

		String newName = file.getName();

		int lastIndex = newName.lastIndexOf(O.C46);

		if (lastIndex >= 0) {

			newName = newName.substring(0, lastIndex);

		}

		return newName;

	}

	/**
	 * 取副檔名.<br/>
	 * To get the extension name of the file.
	 */
	public static String getFileExtName(File file) {

		String newName = file.getName();

		int lastIndex = newName.lastIndexOf(O.C46);

		if (lastIndex >= 0) {

			newName = newName.substring(lastIndex);

		}

		return newName;

	}

}