package lGpl20.other.uI;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.beans.PropertyVetoException;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import lGpl20.o.O;
import lGpl20.o.thr.ThrToCmd;

/**
 * My JDesktopPane to configure.<br/>
 * <br/>
 * My JDesktopPane to configure.
 * 
 * @version 2017/08/19_19:20:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=MyDesktopPaneToConf" >MyDesktopPaneToConf
 *          .java</a>
 * 
 */
public class MyDesktopPaneToConf extends JDesktopPane implements MouseListener {

	private static final Class<MyDesktopPaneToConf> CLASS_THIS = MyDesktopPaneToConf.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * The String array for the commands.<br/>
	 * The String array for the commands.
	 */
	public static final String[] S_ARY_FOR_CMD_TO_DEL = new String[] { "cmd.exe", "/C", "RMDIR", "/S", "/Q",
			MyAide.sDefDirToSaveMP };

	/**
	 * The String array for the commands.<br/>
	 * The String array for the commands.
	 */
	public static final String[] S_ARY_FOR_CMD_TO_VIEW = new String[] { "cmd.exe", "/C", "START", MyAide.sDefDirToSaveMP };

	protected static final JInternalFrame IN_FRAME = new JInternalFrame(O.Z, true, false, false, false);

	protected static int i = 0;

	protected static final String TEXT_FOR_SAMPLE = Integer.toString(++i) + ". Del the default dir for saved file";

	public static final JTextField TEXT_FIELD_FOR_DEF_DIR_TO_SAVE = new JTextField();

	public static final JButton BUTTON_TO_DEL_DIR = new JButton(TEXT_FOR_SAMPLE);

	public static final JButton BUTTON_TO_VIEW_DIR = new JButton(Integer.toString(++i) + ". View the default dir for saved file");

	public static final JCheckBox CHECK_BOX_TO_REPEAT_MP_RP = new JCheckBox(Integer.toString(++i) + ". Repeat working (MP, RP)");

	public static final JButton BUTTON_TO_WRITE_TO_REC_DOT_CSV = new JButton(Integer.toString(++i) + ". Write data to rec.csv");

	protected static final int W_TEXT_FOR_SAMPLE = (int) ((float) SwingUtilities
			.computeStringWidth(MyComponenter.metricOfFontDialog_1_24, TEXT_FOR_SAMPLE) * 1.2f + 4.0f);

	protected static final int DEF_W = (int) ((float) W_TEXT_FOR_SAMPLE * 1.1f + 10.0f);

	/**
	 * 建構方法.<br/>
	 * Constructor.
	 */
	public MyDesktopPaneToConf() {

		int x = 20;
		int y = 5;

		int myH = (int) ((float) MyComponenter.hOfFontDialog_1_22 * 1.2f + 4.0f);
		int yGap = myH + 5;

		setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);// fuck
		setLayout(null);
		setBorder(MyComponenter.EMPTY_BORDER);
		setDoubleBuffered(true);
		setBackground(MyComponenter.COLOR_BACKGROUND);
		// setBackground(Color.RED);
		// setBounds(110, 5, 2000, 2000);
		// setMinimumSize(new Dimension(MyComponenter.int32Width - 40, MyComponenter.int32Height - 222));// fuck

		IN_FRAME.setLayout(null);
		IN_FRAME.setDoubleBuffered(true);
		// IN_FRAME.setBorder(MyComponenter.EMPTY_BORDER);

		IN_FRAME.setBackground(MyComponenter.COLOR_BACKGROUND);

		// IN_FRAME.setMaximumSize(new Dimension(DEF_W, DEF_HEIGHT + 30));
		// IN_FRAME.setMaximizable(false);
		// IN_FRAME.setPreferredSize(new Dimension(200, 200));
		// IN_FRAME.setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);//no such method
		// IN_FRAME.setClosable(false);

		// IN_FRAME.setTitle(O.STRING_UPDATED_TIME);
		IN_FRAME.setToolTipText(CLASS_THIS.toString());
		IN_FRAME.setVisible(true);

		try {

			IN_FRAME.setSelected(true);

		} catch (PropertyVetoException propertyVetoException) {

			propertyVetoException.printStackTrace();

		}

		TEXT_FIELD_FOR_DEF_DIR_TO_SAVE.setBounds(x, y, W_TEXT_FOR_SAMPLE, myH);
		TEXT_FIELD_FOR_DEF_DIR_TO_SAVE.setFont(MyComponenter.dynaFontDialog_1_24);
		TEXT_FIELD_FOR_DEF_DIR_TO_SAVE.setDoubleBuffered(true);
		TEXT_FIELD_FOR_DEF_DIR_TO_SAVE.setBackground(MyComponenter.COLOR_TEXT_BACKGROUND);
		TEXT_FIELD_FOR_DEF_DIR_TO_SAVE.setText(MyAide.sDefDirToSaveMP);
		TEXT_FIELD_FOR_DEF_DIR_TO_SAVE.setToolTipText("The dir to save file");
		TEXT_FIELD_FOR_DEF_DIR_TO_SAVE.setBorder(MyComponenter.EMPTY_BORDER);
		TEXT_FIELD_FOR_DEF_DIR_TO_SAVE.setEditable(false);
		IN_FRAME.add(TEXT_FIELD_FOR_DEF_DIR_TO_SAVE);

		y += yGap;
		BUTTON_TO_DEL_DIR.setBounds(x, y, W_TEXT_FOR_SAMPLE, myH);
		BUTTON_TO_DEL_DIR.setFont(MyComponenter.dynaFontDialog_1_24);
		BUTTON_TO_DEL_DIR.setDoubleBuffered(true);
		// BUTTON_TO_DEL.setForeground(MyComponenter.COLOR_TEXT_BACKGROUND);
		// BUTTON_TO_DEL.setBackground(MyComponenter.COLOR_BACKGROUND);
		BUTTON_TO_DEL_DIR.setOpaque(false);
		BUTTON_TO_DEL_DIR.setToolTipText(MyAide.sDefDirToSaveMP);
		BUTTON_TO_DEL_DIR.addMouseListener(this);
		IN_FRAME.add(BUTTON_TO_DEL_DIR);

		y += yGap;
		y += yGap;
		BUTTON_TO_VIEW_DIR.setBounds(x, y, W_TEXT_FOR_SAMPLE, myH);
		BUTTON_TO_VIEW_DIR.setFont(MyComponenter.dynaFontDialog_1_24);
		BUTTON_TO_VIEW_DIR.setDoubleBuffered(true);
		BUTTON_TO_VIEW_DIR.setOpaque(false);
		BUTTON_TO_VIEW_DIR.setToolTipText(MyAide.sDefDirToSaveMP);
		BUTTON_TO_VIEW_DIR.addMouseListener(this);
		IN_FRAME.add(BUTTON_TO_VIEW_DIR);

		y += yGap;
		CHECK_BOX_TO_REPEAT_MP_RP.setBounds(x, y, W_TEXT_FOR_SAMPLE, myH);
		CHECK_BOX_TO_REPEAT_MP_RP.setFont(MyComponenter.dynaFontDialog_1_24);
		CHECK_BOX_TO_REPEAT_MP_RP.setDoubleBuffered(true);
		CHECK_BOX_TO_REPEAT_MP_RP.setBackground(MyComponenter.COLOR_TEXT_BACKGROUND);
		IN_FRAME.add(CHECK_BOX_TO_REPEAT_MP_RP);

		y += yGap;
		BUTTON_TO_WRITE_TO_REC_DOT_CSV.setBounds(x, y, W_TEXT_FOR_SAMPLE, myH);
		BUTTON_TO_WRITE_TO_REC_DOT_CSV.setFont(MyComponenter.dynaFontDialog_1_24);
		BUTTON_TO_WRITE_TO_REC_DOT_CSV.setDoubleBuffered(true);
		BUTTON_TO_WRITE_TO_REC_DOT_CSV.setOpaque(false);
		// BUTTON_TO_WRITE_TO_REC_DOT_CSV.setBackground(MyComponenter.COLOR_TEXT_BACKGROUND);
		BUTTON_TO_WRITE_TO_REC_DOT_CSV.setToolTipText(MyAide.sDefDirToSaveMP);
		BUTTON_TO_WRITE_TO_REC_DOT_CSV.addMouseListener(this);
		IN_FRAME.add(BUTTON_TO_WRITE_TO_REC_DOT_CSV);

		y += yGap;
		IN_FRAME.setBounds(100, 5, DEF_W, y + yGap);
		add(IN_FRAME);

	}

	@Override
	public void mouseClicked(MouseEvent mouseEvent) {

	}

	@Override
	public void mouseEntered(MouseEvent mouseEvent) {

	}

	@Override
	public void mouseExited(MouseEvent mouseEvent) {

	}

	@Override
	public void mousePressed(MouseEvent mouseEvent) {

	}

	@Override
	public void mouseReleased(MouseEvent mouseEvent) {

		Object source = mouseEvent.getSource();

		if (source == BUTTON_TO_DEL_DIR) {

			int retInt32OfDialog = JOptionPane.showConfirmDialog(null, "Delete the dir?", "Delete", JOptionPane.YES_NO_OPTION);

			if (retInt32OfDialog == JOptionPane.YES_OPTION) {

				O.l("del" + O.S32 + MyAide.sDefDirToSaveMP + O.S32 + O.S32 + O.S32 + CLASS_THIS);

				new ThrToCmd(S_ARY_FOR_CMD_TO_DEL).start();

			}

			return;

		}

		if (source == BUTTON_TO_VIEW_DIR) {

			new ThrToCmd(S_ARY_FOR_CMD_TO_VIEW).start();

			return;

		}

		if (source == BUTTON_TO_WRITE_TO_REC_DOT_CSV) {

			MyAide.writeDatumToFile();

			return;

		}

	}

}
