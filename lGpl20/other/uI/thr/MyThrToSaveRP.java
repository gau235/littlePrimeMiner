package lGpl20.other.uI.thr;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import lGpl20.o.O;
import lGpl20.o.time.T10;
import lGpl20.other.iO.IOr;
import lGpl20.other.uI.MyAide;
import lGpl20.other.uI.MyComponenter;
import lGpl20.prime64.thr.Thrva;

/**
 * 存檔.<br/>
 * <br/>
 * To save.
 * 
 * @version 2019/05/02_12:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=MyThrToSaveRP" >MyThrToSaveRP.java </a>
 * 
 * @see MyThrToSaveMP
 */
public class MyThrToSaveRP extends Thread {

	private static final Class<MyThrToSaveMP> CLASS_THIS = MyThrToSaveMP.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	@Override
	public void run() {

		// O.l("here=" + CLASS_THIS);

		if (Thrva.headAlive(MyAide.fanOfMarker) != null) {

			O.l("do not save when isAlive()" + O.S32 + CLASS_THIS);

			return;

		}

		//////////////////////////////////////

		Path pathOfFile = Paths.get(MyAide.sDefDirToSaveMP + File.separatorChar + MyAide.MY_FILE_BASENAME
				+ T10.timeStr().replace(3, 4, O.S95) + O.S46 + MyAide.TXT_FILENAME_EXTENSION);

		try {

			IOr.newDirNFile(pathOfFile);

		} catch (Throwable throwable) {

			throwable.printStackTrace();

			return;

		}

		//////////////////////////////////////

		IOr.saveB32AryOfCompoToFile(MyAide.fanOfMarker.box, MyAide.fanOfMarker.N1, MyAide.fanOfMarker.N2, pathOfFile);

		O.l("save OK=" + pathOfFile + O.S32 + O.S32 + O.S32 + CLASS_THIS);
		MyComponenter.buttonRP3.setText(MyAide.TEXT_DONE_AFT_TO_SAVE);

		return;

	}

}