package lGpl20.other.uI;

import java.awt.Color;

import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.UIManager;

import lGpl20.o.O;
import lGpl20.o.ery.Seq;
import lGpl20.o.str.SByN;

/**
  * @version 2019/04/29_10:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=MyAide_D" >MyAide_D.java</a>
 * 
 * @see MyAide_K
 */
public abstract class MyAide_D extends MyAide_A {

	private static final Class<MyAide_D> CLASS_THIS = MyAide_D.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To format text in JTextField.<br/>
	 * To format text in JTextField.
	 */
	public static void formatTextInJTextField(JTextField... aryOfJTextField) {// MP, RP, GP

		for (int i = 0; i != aryOfJTextField.length; i++) {

			JTextField jTextField = aryOfJTextField[i];
			long int64 = SByN.df(jTextField.getText().trim());
			jTextField.setText(SByN.f(int64).toString());

		}

	}

	/**
	 * 前置動作<br/>
	 * To act before the action.
	 * 
	 * @see #actAft(long)
	 */
	public static void actBef(long numAsType) {// MP, RP, GP

		JTextField textField0 = MyComponenter.mapOfTextField.get(numAsType);
		JTextField textField1 = MyComponenter.mapOfTextField.get(numAsType + 1L);

		MyComponenter.mapOfButton.get(numAsType).setEnabled(false);

		if (numAsType <= NUM_RP_0) {// important

			if (numAsType == NUM_RP_0) {

				textField1.requestFocusInWindow();
				textField1.setEditable(false);

				// formatTextInJTextField(textField1);

			} else {

				textField0.setEditable(false);
				textField0.requestFocusInWindow();
				textField1.setEditable(false);

				// formatTextInJTextField(textField0, textField1);

			}

		}

		// textField1.selectAll();
		///////////////////////////////////////////////
		JProgressBar progrBar = MyComponenter.mapOfProgressBar.get(numAsType);

		// UIManager.put("ProgressBar.selectionForeground", Color.BLACK);
		UIManager.put("ProgressBar.selectionBackground", Color.BLACK);
		progrBar.setStringPainted(true);
		progrBar.updateUI();

	}

	/**
	 * 後置動作<br/>
	 * To act after the action.
	 * 
	 * @see #actBef(long)
	 */
	public static void actAft(long numAsType) {// MP, RP, GP

		long numAsTypePlus1 = numAsType + 1L;
		MyComponenter.mapOfJTextArea.get(numAsType).setText(O.Z);
		MyComponenter.mapOfProgressBar.get(numAsType).setValue(0);
		MyComponenter.mapOfButton.get(numAsType).setEnabled(true);

		if (numAsType <= NUM_RP_0) {// important

			if (numAsType == NUM_RP_0) {

				MyComponenter.mapOfTextField.get(numAsTypePlus1).setEditable(true);

			} else {

				MyComponenter.mapOfTextField.get(numAsType).setEditable(true);
				MyComponenter.mapOfTextField.get(numAsTypePlus1).setEditable(true);

			}

		}

		///////////////////////////////////////////////
		JProgressBar progrBar = MyComponenter.mapOfProgressBar.get(numAsType);
		UIManager.put("ProgressBar.selectionBackground", MyComponenter.COLOR_TEXT_BACKGROUND);
		progrBar.updateUI();

	}

	/**
	 * To get the param<br/>
	 * To get the param.
	 */
	public static Seq getParam(long numAsType) {

		Seq seq = new Seq();

		try {

			long n1 = SByN.df(MyComponenter.mapOfTextField.get(numAsType).getText().trim());
			long n2 = SByN.df(MyComponenter.mapOfTextField.get(numAsType + 1L).getText().trim());
			int numOfThr = Integer.parseInt(MyComponenter.mapOfButton.get(numAsType).getText());

			if (n1 > n2) {

				long temp = n1;
				n1 = n2;
				n2 = temp;

			}

			seq.a(n1);
			seq.a(n2);
			seq.a(numOfThr);

		} catch (NumberFormatException numberFormatException) {

			numberFormatException.printStackTrace();
			MyComponenter.mapOfJTextArea.get(numAsType).insert(numberFormatException.toString() + O.L, 0);

		}

		return seq;

	}

}
