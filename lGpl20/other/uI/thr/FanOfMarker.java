package lGpl20.other.uI.thr;

import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.text.Document;

import lGpl20.o.O;
import lGpl20.o.ery.Ery;
import lGpl20.o.str.SByN;
import lGpl20.o.thr.ThrWBox;
import lGpl20.o.time.T64;
import lGpl20.other.uI.MyAide;
import lGpl20.other.uI.MyComponenter;
import lGpl20.other.uI.MyDesktopPaneToConf;
import lGpl20.other.uI.MyStrva;
import lGpl20.prime64.Marker;
import lGpl20.prime64.Miner;
import lGpl20.prime64.Ranger;
import lGpl20.prime64.Recva;

/**
 * To monitor.<br/>
 * <br/>
 * To monitor.
 * 
 * @version 2019/04/29_10:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=fanOfMarker" >fanOfMarker.java</a>
 * 
 * @see MyMoonerMP
 * 
 * @see FanOfMarker
 */
public final class FanOfMarker extends ThrWBox<Marker> {

	private static final Class<FanOfMarker> CLASS_THIS = FanOfMarker.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	public final long N1;

	public final long N2;

	public final Recva RECVA = new Recva();

	public JProgressBar jProgressBar;

	public JTextArea jTextArea;// 繞過去, 直接打中要害: 資料結構

	protected final Document DOC;

	/**
	 * 建構方法.<br/>
	 * Constructor.
	 */
	public FanOfMarker(long n1, long n2, Marker marker) {

		N1 = n1;
		N2 = n2;

		super.box = marker;

		jProgressBar = MyComponenter.progressBarRP0;
		jTextArea = MyComponenter.jTextAreaRP0;
		DOC = MyComponenter.docRP0;

	}

	/**
	 * 回報 Marker 執行的情況.<br/>
	 * To report the proceeding of Marker.
	 */
	@Override
	public void run() {

		jTextArea.insert(MyStrva.genHeadStr().toString(), 0);

		String strTimeCost;

		int int32Percentage = 0;

		do {

			try {

				sleep(int32Duration);

			} catch (InterruptedException interruptedEx) {

				interruptedEx.printStackTrace();

			}

			int temp32Percentage = Ranger.countPercent(box.divisor, box.root2OfTailN);
			// O.l("temp32Percentage=" + temp32Percentage + O.S37 + O.S32 + CLASS_THIS);

			if (temp32Percentage > int32Percentage) {

				int32Percentage = temp32Percentage;

				jProgressBar.setValue(temp32Percentage);

			}

			strTimeCost = String.format(SByN.REGEX_FLOAT, T64.difInF32Sec(TIME64_START));
			StringBuilder str = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

			str.append(O.C32).append(SByN.f(box.divisor)).append(O.C32).append(O.C47).append(O.C32)
					.append(SByN.f(box.root2OfTailN));

			str.append(O.C32).append(O.C32).append(O.C32).append(O.C32).append(O.C32).append(strTimeCost).append(O.C115)
					.append(O.C_A_L);

			// O.l("DOC.getLength()=" + DOC.getLength() + O.S32 + CLASS_THIS);
			if ((DOC.getLength() + str.length()) > MyAide.BOUND32_TO_CLEAR_J_TEXT_AREA) {

				O.l("clear DOC.getLength()=" + SByN.f(DOC.getLength() + str.length()) + O.S32 + CLASS_THIS);

				jTextArea.setText(O.Z);

			}

			jTextArea.insert(str.toString(), 0);

		} while (box.isAlive());

		///////////////// strTimeCost//////
		strTimeCost = String.format(SByN.REGEX_FLOAT, T64.difInF32Sec(TIME64_START));
		O.l("strTimeCost1=" + strTimeCost + O.S32 + CLASS_THIS);
		///////////////// strTimeCost//////

		///////////////////////////////////// set RECVA
		RECVA.n1 = N1;
		RECVA.n2 = N2;
		RECVA.numOfThr = 1;

		RECVA.totalPrime = box.countPrimeByB32AryForCompo(N1, N2);
		RECVA.f32TimeCost = T64.difInF32Sec(TIME64_START);

		RECVA.charSequenceAsNote = new StringBuilder(O.DEF_CAPACITY32_FOR_STR).append("RP").append(SByN.pad0D2(1));
		RECVA.tempObj = O.SYS_USER_DOT_NAME;

		////////////////////////////////////////////////////////
		MyAide.checkOrReportErr(this, RECVA.totalPrime);

		////////////////////////////////////////////////////////

		///////////////// strTimeCost//////
		strTimeCost = String.format(SByN.REGEX_FLOAT, T64.difInF32Sec(TIME64_START));
		O.l("strTimeCost2=" + strTimeCost + O.S32 + CLASS_THIS);
		///////////////// strTimeCost//////

		StringBuilder strDone = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);
		strDone.append(O.C32).append(RECVA.n1).append(O.C32).append(O.C126).append(O.C32).append(SByN.f(RECVA.n2));
		strDone.append(O.C32).append(O.C32).append(O.C32).append(SByN.f(RECVA.totalPrime)).append(O.C32).append(O.C112);
		strDone.append(O.C32).append(O.C32).append(O.C32);
		strDone.append(String.format(SByN.REGEX_FLOAT, RECVA.f32TimeCost)).append(O.C32).append(O.C115).append(O.C_A_L);

		jTextArea.insert(strDone.toString(), 0);
		jProgressBar.setValue(Ranger.$100_INT32);

		////////////////////////////////////////////////////

		Ery<CharSequence> eryOfStr = MyAide.genEryOfStrForEry2DAsRowList(RECVA);

		MyAide.insertIntoEry2DAsAllRowInTable(eryOfStr);

		if ((O.IS_TO_DEV || O.IS_HIGH_MEM) && (N1 <= Miner.MIN_NAT_PRIME) && (N2 > Miner.tailPrimeInOriAryOfPrime())) {

			Miner.setOriAryOfPrime(box.retrievePrimeAry(N1, N2), CLASS_THIS);

			O.l("tailPrimeInOriAryOfPrime=" + SByN.f(Miner.tailPrimeInOriAryOfPrime()) + O.S32 + CLASS_THIS);
			O.l("currMaxIntToTest=" + SByN.f(Miner.currMaxIntToTest()) + O.S32 + CLASS_THIS);

		}

		O.l("costT=" + T64.difInF32Sec(TIME64_START) + O.S32 + CLASS_THIS);

		if (MyDesktopPaneToConf.CHECK_BOX_TO_REPEAT_MP_RP.isSelected()
				&& (++MyAide.try32OfToRP) < MyAide.BOUND32_TO_REPEAT_TO_RP) {

			try {

				sleep(int32Duration);

			} catch (InterruptedException interruptedEx) {

				interruptedEx.printStackTrace();

			}

			jProgressBar.setValue(0);

			MyAide.doMarkPrimeNRepeat(N1, N2);

		}

	}

}
