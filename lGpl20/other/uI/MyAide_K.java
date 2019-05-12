package lGpl20.other.uI;

import java.awt.Component;

import javax.swing.JTextField;

import lGpl20.o.O;
import lGpl20.other.uI.thr.MyMoonerMP;
import lGpl20.prime64.thr.Thrva;

/**
 * @version 2019/04/29_11:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=MyAide_K" >MyAide_K.java</a>
 * 
 * @see MyAide_L
 */
public abstract class MyAide_K extends MyAide_D {

	private static final Class<MyAide_K> CLASS_THIS = MyAide_K.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To stop.<br/>
	 * To stop.
	 */
	@SuppressWarnings("deprecation")
	public static void stopNClear(Component component) {

		if (component == MyComponenter.buttonMP1) {

			O.l("begin stopNClearMP" + O.S32 + CLASS_THIS);

			MyDesktopPaneToConf.CHECK_BOX_TO_REPEAT_MP_RP.setSelected(false);

			if (moonMP != null) {// first time

				MyMoonerMP myMoonerMP = (MyMoonerMP) moonMP.otherThr;

				myMoonerMP.jProgressBar = null;// fuck
				myMoonerMP.jTextArea = null;// fuck
				myMoonerMP.doc = null;// fuck

				myMoonerMP.stop();

				Thrva.stopAllAlive(moonMP.aryThrMP);

			}

			JTextField textField0 = MyComponenter.mapOfTextField.get(NUM_MP_0);
			JTextField textField1 = MyComponenter.mapOfTextField.get(NUM_MP_0 + 1L);

			formatTextInJTextField(textField0, textField1);
			actAft(NUM_MP_0);

			O.l("end stopNClearMP" + O.S32 + CLASS_THIS);

			return;

		}

		if (component == MyComponenter.buttonRP1) {

			O.l("begin stopNClearRP" + O.S32 + CLASS_THIS);

			MyDesktopPaneToConf.CHECK_BOX_TO_REPEAT_MP_RP.setSelected(false);

			fanOfMarker.jProgressBar = null;// fuck
			fanOfMarker.jTextArea = null;// fuck
			fanOfMarker.stop();

			myMarker.box = null;// here is a bug? to make sure to stop
			myMarker.stop();

			JTextField textField0 = MyComponenter.mapOfTextField.get(NUM_RP_0);
			JTextField textField1 = MyComponenter.mapOfTextField.get(NUM_RP_0 + 1L);

			formatTextInJTextField(textField0, textField1);
			actAft(NUM_RP_0);

			O.l("end stopNClearRP" + O.S32 + CLASS_THIS);

			return;

		}

	}

}
