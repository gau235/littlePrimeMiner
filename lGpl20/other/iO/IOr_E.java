package lGpl20.other.iO;

import java.io.Closeable;
import java.io.IOException;

import lGpl20.o.O;

/**
 * @version 2014/07/06_06:24:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=IOr_E" >IOr_E.java</a>
 * 
 * @see IOr_N
 */
public abstract class IOr_E extends IOr_C {

	private static final Class<IOr_E> CLASS_THIS = IOr_E.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 關閉所有 Closeable.<br/>
	 * To close all.
	 * 
	 * @throws IOException
	 */
	public static void closeAll(Closeable... aryOfCloseable) throws IOException {

		for (Closeable closeable : aryOfCloseable) {

			if (closeable != null) {

				closeable.close();

			}

		}

	}

}