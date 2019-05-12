package lGpl20.other.uI;

import java.nio.file.Path;

import lGpl20.o.O;
import lGpl20.o.ery.Ery;
import lGpl20.other.iO.IOr;

/**
 * @version 2019/04/25_21:00:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=MyAide_U" >MyAide_U.java</a>
 * 
 * @see MyAide_W
 */
public abstract class MyAide_U extends MyAide_N {

	private static final Class<MyAide_U> CLASS_THIS = MyAide_U.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To write data of Ery2D as row lists to rec.csv.<br/>
	 * To write data of Ery2D as row lists to rec.csv.
	 */
	public static void writeDatumToFile() {

		if (ery2DAsAllRowInTable.len() == 0) {

			return;

		}

		StringBuilder str = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		final int nCol = ery2DAsAllRowInTable.at(0).len();
		// O.l("nCol=" + nCol + O.S32 + CLASS_THIS);
		Ery<Ery<CharSequence>> revEry = ery2DAsAllRowInTable.genRevEry(0, ery2DAsAllRowInTable.len());
		Ery<CharSequence> tempEryOfCharSequence;

		for (int i = 0, nRow = revEry.len(); i != nRow;) {

			for (int iSmall = 0; iSmall != nCol; iSmall++) {

				tempEryOfCharSequence = revEry.at(i);
				str.append(tempEryOfCharSequence.at(iSmall)).append(O.C59);

			}

			if (++i != nRow) {

				str.append(O.C_A_L);

			}

		}

		O.l(CLASS_THIS);
		O.l(str);
		O.l(CLASS_THIS);

		//////////////////////////
		Path pathOfFile = MyAide.defPathOfDirToSaveMP.resolve(MY_TXT_FILE_FULL_NAME_TO_REC);

		try {

			IOr.newDirNFile(pathOfFile);

		} catch (Throwable throwable) {

			throwable.printStackTrace();

		}

		//////////////////////////

		// IOr.appendCharSeqToFile(str, pathOfFile);
		IOr.writeCharSeqToFile(str, pathOfFile);

	}

}
