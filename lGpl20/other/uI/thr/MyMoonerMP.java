package lGpl20.other.uI.thr;

import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.text.Document;

import lGpl20.o.O;
import lGpl20.o.ery.Ery;
import lGpl20.o.keyNVal.Int64NObj;
import lGpl20.o.str.SByN;
import lGpl20.o.thr.ThrWBox;
import lGpl20.o.time.T64;
import lGpl20.other.uI.MyAide;
import lGpl20.other.uI.MyComponenter;
import lGpl20.other.uI.MyDesktopPaneToConf;
import lGpl20.other.uI.MyStrva;
import lGpl20.prime64.Ranger;
import lGpl20.prime64.Recva;
import lGpl20.prime64.ery.EryOfPrimeAry;
import lGpl20.prime64.thr.Moon;
import lGpl20.prime64.thr.Thrva;

/**
 * 本類別質數隊伍迷.<br/>
 * The fan to peek the EryOfPrimeAry.
 * 
 * @version 2019/05/01_08:30:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=MyMoonerMP" >MyMoonerMP.java</a>
 *
 * @see MyMoonerMP
 * 
 * @see FanOfMarker
 */
public class MyMoonerMP extends ThrWBox<Moon> {

	private static final Class<MyMoonerMP> CLASS_THIS = MyMoonerMP.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	protected final long N2_MINUS_N1;

	public JProgressBar jProgressBar;

	public JTextArea jTextArea;

	public Document doc;

	protected final Recva RECVA = new Recva();

	/**
	 * 建構方法.<br/>
	 * Constructor.
	 */
	public MyMoonerMP(Moon moon) {

		box = moon;

		N2_MINUS_N1 = moon.oriN2 - moon.oriN1;

		jTextArea = MyComponenter.jTextAreaMP0;
		doc = MyComponenter.docMP0;

		jProgressBar = MyComponenter.progressBarMP0;

		MyStrva.tempJTextArea = MyComponenter.jTextAreaMP0;// fuck

		MyStrva.isToShowEveryPrime = !MyDesktopPaneToConf.CHECK_BOX_TO_REPEAT_MP_RP.isSelected();

	}

	public void setValueOfProgrBar(long currN) {

		try {

			int int32Percentage = Ranger.countPercent(currN, box.oriN1, N2_MINUS_N1);

			// O.l(currN);
			// O.l(int32Percentage + O.S37);

			jProgressBar.setValue(int32Percentage);

		} catch (ArithmeticException arithmeticEx) {

			arithmeticEx.printStackTrace();

			// PROGRESS_BAR.setValue(0);

		}

	}

	/**
	 * 回報 minePrime 方法對 EryOfPrimeAry 作用的情況 .<br/>
	 * To report the influence on EryOfPrimeAry during the minePrime method proceeding.
	 */
	@Override
	public void run() {

		jTextArea.setText(O.Z);// for to repeat
		jTextArea.insert(MyStrva.genHeadStr().toString(), 0);

		EryOfPrimeAry headEryOfPrimeAry = box.aryOfEryOfPrimeAry[0];

		long int64ForPercentage = 0L;

		do {

			// O.l("boundToCleatText=" + boundToCleatText + O.S32 + CLASS_THIS);

			try {

				sleep(int32Duration);

			} catch (InterruptedException interruptedEx) {

				interruptedEx.printStackTrace();

			}

			Int64NObj<StringBuilder> tailPrimeNStrToShow = MyStrva.getTailPrimeNStrToShowFromAryOfEryOfPrimeAry(box.aryOfEryOfPrimeAry,
					T64.difInF32Sec(TIME64_START));

			long tempTailPrime = tailPrimeNStrToShow.at0();
			StringBuilder str = tailPrimeNStrToShow.at1();

			if (tempTailPrime > int64ForPercentage) {

				int64ForPercentage = tempTailPrime;
				setValueOfProgrBar(int64ForPercentage);

			}

			// O.l("DOC.getLength()=" + DOC.getLength() + O.S32 + CLASS_THIS);
			if ((doc.getLength() + str.length()) > MyAide.BOUND32_TO_CLEAR_J_TEXT_AREA) {

				O.l("clear DOC.getLength()=" + SByN.f(doc.getLength() + str.length()) + O.S32 + CLASS_THIS);

				jTextArea.setText(O.Z);

			}

			jTextArea.insert(str.toString(), 0);

		} while ((headEryOfPrimeAry.indexViewed + 1 < headEryOfPrimeAry.len()) || (Thrva.headAlive(box.aryThrMP) != null));

		// ////////////////////////// the last time to insert
		// Int64NObj<StringBuilder> tailPrimeNStrToShow = MyStrva.getTailPrimeNStrToShowFromThrva(true, thrva,
		// T64.difInF32Sec(TIME64_START));
		//
		// long tempTailPrime = tailPrimeNStrToShow.at0();
		// StringBuilder str = tailPrimeNStrToShow.at1();
		//
		// if (tempTailPrime > tempPrimeForPercentage) {
		//
		// tempPrimeForPercentage = tempTailPrime;
		// setValueOfProgrBar(tempPrimeForPercentage);
		//
		// }
		//
		// J_TEXT_AREA.insert(str.toString(), 0);
		// ////////////////////////////////
		EryOfPrimeAry bigEryOfPrimeAry = EryOfPrimeAry.mergeAllEryOfPrimeAry(box.aryOfEryOfPrimeAry);// for to save
		bigEryOfPrimeAry.sort();
		box.aryOfEryOfPrimeAry[0] = bigEryOfPrimeAry;

		RECVA.totalPrime = EryOfPrimeAry.totalPrime(bigEryOfPrimeAry);
		RECVA.f32TimeCost = T64.difInF32Sec(TIME64_START);

		setValueOfProgrBar(-1);

		///////////////////////////////////// set RECVA

		RECVA.n1 = box.oriN1;
		RECVA.n2 = box.oriN2;
		RECVA.numOfThr = box.numOfThr;

		RECVA.charSequenceAsNote = new StringBuilder(O.DEF_CAPACITY32_FOR_STR).append("MP").append(SByN.pad0D2(box.numOfThr));

		RECVA.tempObj = O.SYS_USER_DOT_NAME;

		/////////////////////////////////////////////////

		Ery<CharSequence> eryOfStr = MyAide.genEryOfStrForEry2DAsRowList(RECVA);

		MyAide.insertIntoEry2DAsAllRowInTable(eryOfStr);

		jTextArea.insert(MyStrva.genAllThrTerminatedStr((StringBuilder) eryOfStr.at(0), (StringBuilder) eryOfStr.at(1),
				(StringBuilder) eryOfStr.at(3), (StringBuilder) eryOfStr.at(4)).toString(), 0);

		if (MyDesktopPaneToConf.CHECK_BOX_TO_REPEAT_MP_RP.isSelected()
				&& (++MyAide.try32OfToMP) < MyAide.BOUND32_TO_REPEAT_TO_MP) {

			try {

				sleep(int32Duration);

			} catch (InterruptedException interruptedEx) {

				interruptedEx.printStackTrace();

			}

			setValueOfProgrBar(0);

			MyAide.doMinePrimeNRepeat(box.oriN1, box.oriN2, box.numOfThr);

		}

	}

}
