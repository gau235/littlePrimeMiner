package lGpl20.other.uI.thr;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import lGpl20.o.O;
import lGpl20.o.time.T10;
import lGpl20.other.iO.IOr;
import lGpl20.other.uI.MyAide;
import lGpl20.other.uI.MyComponenter;
import lGpl20.prime64.ery.EryOfPrimeAry;

/**
 * 存檔.<br/>
 * <br/>
 * To save.
 * 
 * @version 2019/05/02_09:50:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=MyThrToSaveMP" >MyThrToSaveMP.java</a>
 * 
 * @see MyThrToSaveRP
 */
public class MyThrToSaveMP extends Thread {

	private static final Class<MyThrToSaveMP> CLASS_THIS = MyThrToSaveMP.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	@Override
	public void run() {

		if (MyAide.moonMP.otherThr.isAlive()) {

			O.l("do not save when isAlive()" + O.S32 + CLASS_THIS);

			return;

		}

		EryOfPrimeAry bigEryOfPrimeAry = MyAide.moonMP.aryOfEryOfPrimeAry[0];// after merging

		if (bigEryOfPrimeAry.len() == 0) {

			O.l("do not save when bigEryOfPrimeAry.size()=" + bigEryOfPrimeAry.len() + O.S32 + CLASS_THIS);
			// MyComponenter.buttonMP3.setEnabled(true);

			return;

		}

		//////////////////////////////////////

		// String sShortFileName = "aaa.txt";

		String sShortFileName = MyAide.MY_FILE_BASENAME + T10.timeStr().replace(3, 4, O.S95) + O.S46
				+ MyAide.TXT_FILENAME_EXTENSION;

		Path pathOfFile = Paths.get(MyAide.sDefDirToSaveMP + File.separatorChar + sShortFileName);

		try {

			IOr.newDirNFile(pathOfFile);

		} catch (Throwable throwable) {

			throwable.printStackTrace();

			return;

		}

		//////////////////////////////////////

		IOr.saveEryOfPrimeAryToFile(bigEryOfPrimeAry, pathOfFile);

		O.l("save OK=" + pathOfFile + O.S32 + O.S32 + O.S32 + CLASS_THIS);
		MyComponenter.buttonMP3.setText(MyAide.TEXT_DONE_AFT_TO_SAVE);

		return;

	}

}