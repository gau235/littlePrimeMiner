package lGpl20.other.uI;

import java.awt.Font;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import lGpl20.o.O;
import lGpl20.o.str.SByN;
import lGpl20.other.uI.thr.MyThrToShowCpuMemUsage;
import lGpl20.prime64.Miner;

/**
 * 本類別是主程式進入點.<br/>
 * The main method of this program.
 * 
 * @version 2019/05/02_12:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Main" >Main.java</a>
 * 
 */
public class Main extends MyComponenter {

	private static final Class<Main> CLASS_THIS = Main.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	protected static final String S_RATE_TO_ZOOM_EQ = "rateToZoom=";

	public static JFrame mainFrame;

	/**
	 * To initial for the developer.<br/>
	 * To initial for the developer.
	 */
	public static void initToDev() {

		if (O.IS_TO_DEV) {

			// MyComponenter.textFieldMP1.setText(SByN.f(Miner.$MAX_INT_TO_GROW_ORI_ARY_OF_PRIME / 10L).toString());
			// MyComponenter.textFieldRP1.setText(SByN.f(Miner.$MAX_INT_TO_GROW_ORI_ARY_OF_PRIME / 10L).toString());

			MyComponenter.textFieldMP1.setText(SByN.f(Miner.$MAX_INT_TO_GROW_ORI_ARY_OF_PRIME / 100L).toString());
			MyComponenter.textFieldRP0.setText(SByN.f(2).toString());
			MyComponenter.textFieldRP1.setText(SByN.f(Miner.$MAX_INT_TO_GROW_ORI_ARY_OF_PRIME / 10L).toString());

		}

	}

	/**
	 * 使用者接觸到的 UI, 也是主程式進入點.<br/>
	 * The main UI of this program.
	 */
	public static void main(String[] sAry) {

		float rateToZoom = 1.0F;
		if (sAry.length > 0) {

			String sTemp = sAry[0].replace(S_RATE_TO_ZOOM_EQ, O.Z);
			rateToZoom = Float.parseFloat(sTemp);

		}

		////////////////////////////////////////////////
		O.l("rateToZoom=" + rateToZoom + O.S32 + CLASS_THIS);

		// todo: 17.0f change to 17.0F; [0-9].[0-9]f
		dynaFontDialog_1_17 = new Font(Font.DIALOG, 1, (int) (17.0F * rateToZoom));// MP5
		dynaFontDialog_1_24 = new Font(Font.DIALOG, 1, (int) (24.0F * rateToZoom));// rec
		dynaFontDialog_1_40 = new Font(Font.DIALOG, 1, (int) (33.0F * rateToZoom));// big textField

		metricOfFontDialog_1_17 = TEMP_CONTAINER.getFontMetrics(dynaFontDialog_1_17);
		hOfFontDialog_1_17 = metricOfFontDialog_1_17.getAscent() + metricOfFontDialog_1_17.getDescent();

		metricOfFontDialog_1_24 = TEMP_CONTAINER.getFontMetrics(dynaFontDialog_1_24);
		hOfFontDialog_1_22 = metricOfFontDialog_1_24.getAscent() + metricOfFontDialog_1_24.getDescent();

		int32Width = (int) (W_SCREEN_FLOAT32 * rateToZoom * 0.9F / 1.40F);
		int32Height = (int) (H_SCREEN_FLOAT32 * rateToZoom * 0.9F / 1.40F);
		O.l("int32Width=" + int32Width + O.S32 + "int32Height=" + int32Height + O.S32 + CLASS_THIS);
		////////////////////////////////////////////////

		O.l("Version" + O.S32 + O.STRING_VERSION + O.S32 + O.STRING_UPDATED_TIME + O.S32 + CLASS_THIS);

		MyAide.defPathOfDirToSaveMP = Paths.get(O.Z).toAbsolutePath().resolve(MyAide.S_TEMP_DIR);

		try {

			Files.createDirectories(MyAide.defPathOfDirToSaveMP);
			O.l("defPathOfDirToSaveMP=" + MyAide.defPathOfDirToSaveMP + O.S32 + O.S32 + O.S32 + CLASS_THIS);

		} catch (IOException iOException) {

			iOException.printStackTrace();
			return;

		}

		MyAide.sDefDirToSaveMP = MyAide.defPathOfDirToSaveMP.toString();// fuck

		new MyComponenter();

		initToDev();

		mainFrame = new JFrame();

		mainFrame.setSize(int32Width + 12, int32Height + 50);

		mainFrame.setBackground(COLOR_BACKGROUND);
		mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		// mainFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		mainFrame.setContentPane(tabbedPane);
		// mainFrame.getRootPane().setBorder(EMPTY_BORDER);

		mainFrame.setLocation((W_SCREEN - int32Width) / 2, (H_SCREEN - int32Height) / 4);
		// mainFrame.setResizable(false);
		mainFrame.setVisible(true);

		textFieldMP0.requestFocusInWindow();
		textFieldMP0.selectAll();

		MyAide.myThrToShowCpuMemUsage = new MyThrToShowCpuMemUsage();
		MyAide.myThrToShowCpuMemUsage.setDaemon(true);
		MyAide.myThrToShowCpuMemUsage.start();

	}

}
