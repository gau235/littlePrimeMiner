package lGpl20.other.uI;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JProgressBar;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JViewport;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingUtilities;

import lGpl20.o.O;
import lGpl20.prime64.Ranger;

/**
 * @version 2019/05/02_12:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=MyComponenter_H" >MyComponenter_H
 *          .java</a>
 * 
 * @see MyComponenter_J
 */
public abstract class MyComponenter_H extends MyComponenter_C {

	private static final Class<MyComponenter_H> CLASS_THIS = MyComponenter_H.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	public final JTextField genTextField(long num) {

		JTextField textField = new JTextField();
		textField.setDoubleBuffered(true);
		textField.setHorizontalAlignment(JTextField.RIGHT);
		textField.setBackground(COLOR_TEXT_BACKGROUND);
		textField.setSelectionColor(COLOR_BACKGROUND);

		if (num == MyAide.NUM_MP_0) {

			textField.setFont(dynaFontDialog_1_40);
			// textField.setBounds(new Rectangle(5, 0, 200, 25));
			textField.setPreferredSize(DIM_TEXT_FIELD_MP0);
			textField.setText(TEXT_FOR_MP0);
			textField.setToolTipText("Input a number");
			// textField.setToolTipText("F1");

			return textField;

		}

		if (num == MyAide.NUM_MP_1) {

			textField.setFont(dynaFontDialog_1_40);
			textField.setText(TEXT_FOR_MP1);
			textField.setToolTipText("Input a number");

			return textField;

		}

		if (num == MyAide.NUM_MP_5) {

			textField.setBorder(EMPTY_BORDER);
			textField.setFont(dynaFontDialog_1_17);
			textField.setHorizontalAlignment(JTextField.CENTER);
			textField.setEditable(false);
			textField.setText(TEXT_FOR_MP5);
			textField.setOpaque(false);

			int wOfText = (int) ((float) SwingUtilities.computeStringWidth(metricOfFontDialog_1_17, TEXT_FOR_MP5) * 1.1f + 6.0f);
			int hOfText = (int) ((float) hOfFontDialog_1_17 * 1.1f + 4.0f);

			textField.setPreferredSize(new Dimension(wOfText, hOfText));

			return textField;

		}

		if (num == MyAide.NUM_RP_0) {

			textField.setFont(dynaFontDialog_1_40);
			textField.setText(TEXT_FOR_RP0);
			textField.setToolTipText("Input a number");

			return textField;

		}

		if (num == MyAide.NUM_RP_1) {

			textField.setFont(dynaFontDialog_1_40);
			textField.setPreferredSize(DIM_TEXT_FIELD_MP0);
			textField.setText(TEXT_FOR_RP1);
			textField.setToolTipText("Input a number");

			return textField;

		}

		if (num == MyAide.NUM_RP_5) {

			textField.setBorder(EMPTY_BORDER);
			textField.setFont(dynaFontDialog_1_17);
			textField.setHorizontalAlignment(JTextField.CENTER);
			textField.setEditable(false);
			textField.setText(TEXT_FOR_RP5);
			textField.setOpaque(false);

			int wOfText = (int) ((float) SwingUtilities.computeStringWidth(metricOfFontDialog_1_17, TEXT_FOR_RP5) * 1.1f + 6.0f);
			int hOfText = (int) ((float) hOfFontDialog_1_17 * 1.1f + 2.0f);

			textField.setPreferredSize(new Dimension(wOfText, hOfText));

			return textField;

		}

		if (num == MyAide.NUM_TEMP_0) {

			textField.setFont(dynaFontDialog_1_40);
			textField.setPreferredSize(DIM_TEXT_FIELD_MP0);
			// textField.setText(MyAide.MY_LOCAL_URL_FOR_SAMPLE_TO_REC);
			// textField.setToolTipText("IP of the DIY server where to send record to");

			return textField;

		}

		if (num == MyAide.NUM_TEMP_1) {

			textField.setFont(dynaFontDialog_1_40);
			// textField.setText("my note");

			return textField;

		}

		if (num == MyAide.NUM_TEMP_5) {

			textField.setBorder(EMPTY_BORDER);
			textField.setFont(dynaFontDialog_1_17);
			textField.setHorizontalAlignment(JTextField.CENTER);
			textField.setEditable(false);
			textField.setText("Temp");
			textField.setOpaque(false);

			int wOfText = (int) ((float) SwingUtilities.computeStringWidth(metricOfFontDialog_1_17, "Temp") * 1.1f + 6.0f);
			int hOfText = (int) ((float) hOfFontDialog_1_17 * 1.1f + 2.0f);

			textField.setPreferredSize(new Dimension(wOfText, hOfText));

			return textField;

		}

		if (num == MyAide.NUM_CONF_5) {

			textField.setBorder(EMPTY_BORDER);
			textField.setFont(dynaFontDialog_1_17);
			textField.setHorizontalAlignment(JTextField.CENTER);
			textField.setEditable(false);
			textField.setText(TEXT_FOR_CONF5);
			textField.setOpaque(false);

			int wOfText = (int) ((float) SwingUtilities.computeStringWidth(metricOfFontDialog_1_17, TEXT_FOR_CONF5) * 1.1f
					+ 6.0f);
			int hOfText = (int) ((float) hOfFontDialog_1_17 * 1.1f + 2.0f);

			textField.setPreferredSize(new Dimension(wOfText, hOfText));

			return textField;

		}

		if (num == MyAide.NUM_REC_5) {

			textField.setBorder(EMPTY_BORDER);
			textField.setFont(dynaFontDialog_1_17);
			textField.setHorizontalAlignment(JTextField.CENTER);
			textField.setEditable(false);
			textField.setText(TEXT_FOR_REC5);
			textField.setOpaque(false);

			int wOfText = (int) ((float) SwingUtilities.computeStringWidth(metricOfFontDialog_1_17, TEXT_FOR_REC5) * 1.1f + 6.0f);
			int hOfText = (int) ((float) hOfFontDialog_1_17 * 1.1f + 2.0f);

			textField.setPreferredSize(new Dimension(wOfText, hOfText));

			return textField;

		}

		return textField;

	}

	public void fillMapOfTextField(long from, long to) {

		for (long num = from; num <= to; num += MyAide.NUM_STEP) {

			MAP_OF_TEXT_FIELD.put(num, genTextField(num));
			MAP_OF_TEXT_FIELD.put(num + 1L, genTextField(num + 1L));
			// MAP_OF_TEXT_FIELD.put(num + 3L, genTextField(num + 3L));// no need
			MAP_OF_TEXT_FIELD.put(num + 5L, genTextField(num + 5L));

		}

	}

	public JButton genButton(long num) {

		JButton button = new JButton();
		button.setOpaque(false);
		button.setFont(dynaFontDialog_1_40);

		if ((num & 0b1L) == 0L) {

			if (num == MyAide.NUM_MP_0) {

				button.setToolTipText("Right click to set threads");

			}

			if (num == MyAide.NUM_RP_0) {

				button.setText("1");
				button.setToolTipText("MyClubOfComponent.buttonRP0");

			}

			if (num == MyAide.NUM_TEMP_0) {

				button.setText("u");

			}

			button.setPreferredSize(DIM_BIG_BUTTON);

		} else {

			button.setToolTipText(MyAide.TEXT_TO_ESC);
			// button.setPreferredSize(DIM_BIG_BUTTON);

		}

		return button;

	}

	public void fillMapOfButton(long from, long to) {

		for (long num = from; num <= to; num += MyAide.NUM_STEP) {

			MAP_OF_BUTTON.put(num, genButton(num));
			MAP_OF_BUTTON.put(num + 1L, genButton(num + 1L));

		}

	}

	public JProgressBar genProgressBar(long num) {

		JProgressBar progrBar = new JProgressBar(0, Ranger.$100_INT32);
		// progrBar.setBounds(0, int32Height - 46, int32Width - 5, 14);
		progrBar.setPreferredSize(new Dimension(int32Width - 4, 24));
		// progrBar.setFont(dynaFontDialog_1_16);

		// O.l("progrBar.getUI()=" + ((BasicProgressBarUI) progrBar.getUI()).getSelectionBackground() + O.S32 + CLASS_THIS);

		progrBar.setStringPainted(true);
		progrBar.setBorderPainted(false);
		progrBar.setBackground(COLOR_TEXT_BACKGROUND);
		progrBar.setForeground(Color.BLACK);
		progrBar.setBorder(EMPTY_BORDER);
		progrBar.setDoubleBuffered(true);

		if (num == MyAide.NUM_TEMP_0) {

			progrBar.setToolTipText("The percent of primes we had, according to the init max prime");

		}

		return progrBar;

	}

	public void fillMapOfProgressBar(long from, long to) {

		for (long num = from; num <= to; num += MyAide.NUM_STEP) {

			MAP_OF_PROGRESS_BAR.put(num, genProgressBar(num));

		}

	}

	public JTextArea genJTextArea(long num) {

		JTextArea jTextArea = new JTextArea();
		jTextArea.setEditable(false);
		jTextArea.setDoubleBuffered(true);
		jTextArea.setFont(dynaFontDialog_1_40);
		jTextArea.setBackground(COLOR_TEXT_BACKGROUND);
		jTextArea.setSelectionColor(COLOR_BACKGROUND);
		jTextArea.setBorder(EMPTY_BORDER);
		// jTextArea.setLineWrap(true);
		// jTextArea.setWrapStyleWord(true);

		if (num == MyAide.NUM_MP_0) {

			StringBuilder str = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);
			str.append(O.C_A_L);
			str.append("please click top right button then run");
			str.append(O.C_A_L);

			jTextArea.setText(str.toString());

		}

		if (num == MyAide.NUM_RP_0) {

			// jTextArea.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
			// jTextArea.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
			// jTextArea.setAlignmentX(JTextArea.RIGHT_ALIGNMENT);

			// jTextArea.setFont(FONT_DIALOG_1_22);

			StringBuilder str = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);
			str.append("Warning:");
			str.append(O.C_A_L);
			str.append("The high temperature caused by running");
			str.append(O.C_A_L);
			str.append("this program will harm your computer.");
			str.append(O.C_A_L);
			str.append("You need to stop this program every");
			str.append(O.C_A_L);
			str.append("30 minutes to cool down your computer.");
			str.append(O.C_A_L);

			jTextArea.setText(str.toString());

		}

		if (num == MyAide.NUM_TEMP_0) {

			jTextArea.setEditable(true);

			StringBuilder str = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);
			str.append(O.C118);
			str.append(O.STRING_UPDATED_TIME);
			str.append(O.C_A_L);
			str.append(O.C32).append(O.C32).append(O.C32).append(O.C32).append("you may write something here:");
			str.append(O.C_A_L);

			jTextArea.setText(str.toString());

		}

		return jTextArea;

	}

	public void fillMapOfJTextArea(long from, long to) {

		for (long num = from; num <= to; num += MyAide.NUM_STEP) {

			MAP_OF_J_TEXT_AREA.put(num, genJTextArea(num));
			// MAP__OF_J_TEXT_AREA.put(num + 1L, genTextArea(num + 1L));

		}

	}

	public JScrollPane genScrollPane(long num) {

		JScrollPane scrollPane = new JScrollPane();

		scrollPane.setBorder(EMPTY_BORDER);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.getHorizontalScrollBar().setBackground(COLOR_BACKGROUND);
		scrollPane.setDoubleBuffered(true);
		// scrollPane.setMinimumSize(new Dimension(int32Width - 120, int32Height - 200));// fuck

		JScrollBar verticalBar = scrollPane.getVerticalScrollBar();
		verticalBar.setDoubleBuffered(true);
		verticalBar.setBackground(COLOR_BACKGROUND);
		verticalBar.setBorder(EMPTY_BORDER);

		if (num == MyAide.NUM_REC_0) {

			// O.l("genScrollPane=" + tableToRec + O.S32 + CLASS_THIS);
			// scrollPane.setMinimumSize(new Dimension(0, 0));// fuck

			JViewport viewport = new JViewport();
			viewport.setBackground(COLOR_TEXT_BACKGROUND);

			scrollPane.setColumnHeader(viewport);

			JButton cornerButton = new JButton();// nothing but for show
			cornerButton.setOpaque(false);
			cornerButton.setPreferredSize(new Dimension(4, 4));

			scrollPane.setCorner(ScrollPaneConstants.UPPER_RIGHT_CORNER, cornerButton);
			scrollPane.setViewportView(tableToRec);
			// scrollPane.getViewport().setBackground(COLOR_TEXT_BACKGROUND);

			return scrollPane;

		}

		scrollPane.setViewportView(MAP_OF_J_TEXT_AREA.get(num));

		return scrollPane;

	}

	public void fillMapOfScrollPane(long from, long to) {

		for (long num = from; num <= to; num += MyAide.NUM_STEP) {

			if (num != MyAide.NUM_CONF_0) {

				MAP_OF_SCROLL_PANE.put(num, genScrollPane(num));

			}

		}

	}

}
