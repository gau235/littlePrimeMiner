package lGpl20.other.uI;

import java.beans.PropertyVetoException;
import java.io.Serializable;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.SwingUtilities;

import lGpl20.o.O;

/**
 * 我的桌面面板.<br/>
 * The DesktopPane for InternalFrame.
 * 
 * @version 2019/05/02_12:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=MyDesktopPaneForInFrame" >
 *          MyDesktopPaneForInFrame.java</a>
 * 
 */
public class MyDesktopPaneForInFrame extends JDesktopPane implements Serializable {

	private static final Class<MyDesktopPaneForInFrame> CLASS_THIS = MyDesktopPaneForInFrame.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	protected final JInternalFrame IN_FRAME = new JInternalFrame(O.Z, true, false, true, true);

	protected static final int W_TEXT_MP3 = (int) ((float) SwingUtilities
			.computeStringWidth(MyComponenter.metricOfFontDialog_1_24, MyAide.TEXT_TO_SAVE) * 1.2F + 40.0F);

	protected static final int DEF_W = (int) ((float) W_TEXT_MP3 * 1.2F + 6.0F);

	/**
	 * 建構方法.<br/>
	 * Constructor.
	 */
	public MyDesktopPaneForInFrame(MyComponenter myClubOfComponent, long num0) {

		// O.l("W_TEXT_MP3=" + W_TEXT_MP3 + O.S32 + CLASS_THIS);
		// O.l("MyComponenter.hOfFontDialog_1_20Plus5=" + MyComponenter.hOfFontDialog_1_20Plus5 + O.S32 + CLASS_THIS);

		final long theNum3 = num0 + 3L;
		final long theNum4 = num0 + 4L;

		int x = 5;
		int y = 10;

		int myH = (int) ((float) MyComponenter.hOfFontDialog_1_22 * 1.2F + 4.0F);
		int yGap = myH + 5;

		setLayout(null);
		setBorder(MyComponenter.EMPTY_BORDER);
		setBackground(MyComponenter.COLOR_BACKGROUND);
		setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);// important

		if (num0 <= MyAide.NUM_RP_0) {

			// JTextField textField3 = new JTextField();

			y += yGap;

			JButton button3 = new JButton();

			button3.setFont(MyComponenter.dynaFontDialog_1_24);
			button3.setDoubleBuffered(true);
			// button3.setBackground(MyComponenter.COLOR_BACKGROUND);
			button3.setOpaque(false);
			button3.setText(MyAide.TEXT_TO_SAVE);
			button3.setToolTipText("to save .txt in the default dir");
			button3.setBounds(x, y, W_TEXT_MP3, myH);
			y += yGap;

			JButton button4 = new JButton();

			button4.setFont(MyComponenter.dynaFontDialog_1_24);
			button4.setDoubleBuffered(true);
			// button3.setBackground(MyComponenter.COLOR_BACKGROUND);
			button4.setOpaque(false);
			button4.setText(MyAide.TEXT_TO_ESC);
			button4.setToolTipText("stop saving then open the default dir");
			button4.setBounds(x, y, W_TEXT_MP3, myH);
			y += yGap;

			// clubOfComponent.MAP_OF_TEXT_FIELD.put(theNum3, textField3);
			myClubOfComponent.MAP_OF_BUTTON.put(theNum3, button3);
			myClubOfComponent.MAP_OF_BUTTON.put(theNum4, button4);

			IN_FRAME.setLayout(null);
			// IN_FRAME.add(textFeld4);
			IN_FRAME.add(button3);
			IN_FRAME.add(button4);

			// IN_FRAME.setBorder(MyComponenter.EMPTY_BORDER);
			// IN_FRAME.setBorder(new EmptyBorder(1, 2, 1, 2));
			IN_FRAME.setDoubleBuffered(true);
			IN_FRAME.setBackground(MyComponenter.COLOR_BACKGROUND);
			IN_FRAME.setBounds(0, 0, DEF_W, y + yGap);
			// IN_FRAME.setPreferredSize(new Dimension(200, 200));
			// IN_FRAME.setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);//no such method
			IN_FRAME.setVisible(true);
			IN_FRAME.setMaximizable(false);

			try {

				IN_FRAME.setSelected(true);

			} catch (PropertyVetoException propertyVetoException) {

				propertyVetoException.printStackTrace();

			}

			add(IN_FRAME);

		}

	}

}
