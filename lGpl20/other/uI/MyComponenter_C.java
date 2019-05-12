package lGpl20.other.uI;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Toolkit;

import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import lGpl20.o.O;

/**
 * 本類別用來收集一些 swing 元件.<br/>
 * <br/>
 * To generate some java swing components.
 * 
 * @version 2017/08/08_19:07:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=MyComponenter_C" >MyComponenter_C
 *          .java</a>
 * 
 * @see MyComponenter_H
 */
public abstract class MyComponenter_C extends MyComponenter_A {

	private static final Class<MyComponenter_C> CLASS_THIS = MyComponenter_C.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	protected static final Container TEMP_CONTAINER = new Container();

	public static final Font TEMP_FONT_DIALOG_1_24 = new Font(Font.DIALOG, 1, 24);

	public static final FontMetrics TEMP_METRIC_OF_FONT_DIALOG_1_24 = TEMP_CONTAINER.getFontMetrics(TEMP_FONT_DIALOG_1_24);

	public static final Color COLOR_BACKGROUND = new Color(0xB0DDF2);// 0xFFAACC, 0xC0FFCC

	public static final Color COLOR_TEXT_BACKGROUND = new Color(0xC8DDF2);
	// 0xCCDEF3, MetalTabbedPaneUI.paintTabBackground

	public static final EmptyBorder EMPTY_BORDER = new EmptyBorder(0, 0, 0, 0);

	public static Font dynaFontDialog_1_17 = TEMP_FONT_DIALOG_1_24;// MP5

	public static Font dynaFontDialog_1_24 = TEMP_FONT_DIALOG_1_24;// rec

	public static Font dynaFontDialog_1_40 = TEMP_FONT_DIALOG_1_24;// =new Font(Font.DIALOG, 1, 28);// big textField

	public static final Dimension DIM_TEXT_FIELD_MP0 = new Dimension(220, 46);

	public static final Dimension DIM_BIG_BUTTON = new Dimension(71, 46);

	public static final String TEXT_FOR_MP0 = "1";

	// public static final String TEXT_FOR_MP1 = SByN.f(Ranger.$MAX_INT_TO_GROW_ORI_ARY_OF_PRIME / 100L).toString();
	public static final String TEXT_FOR_MP1 = "123,456,789";

	public static final String TEXT_FOR_MP5 = "MinePrime";

	public static final String TEXT_FOR_RP0 = "1";

	public static final String TEXT_FOR_RP1 = "123,456,789";

	public static final String TEXT_FOR_RP5 = "MarkPrime";// retrieve prime

	public static final String TEXT_FOR_CONF5 = "Conf";

	public static final String TEXT_FOR_REC5 = "Rec";

	public static FontMetrics metricOfFontDialog_1_17 = TEMP_METRIC_OF_FONT_DIALOG_1_24;

	public static FontMetrics metricOfFontDialog_1_24 = TEMP_METRIC_OF_FONT_DIALOG_1_24;

	protected static int hOfFontDialog_1_17;

	protected static int hOfFontDialog_1_22;

	public static Dimension genDimOfScreen() {// for Linux

		try {

			return Toolkit.getDefaultToolkit().getScreenSize();

		} catch (Throwable throwable) {

			throwable.printStackTrace();

		}

		return new Dimension(1280, 800);

	}

	public static final Dimension DIM_OF_SCREEN = genDimOfScreen();

	public static final float W_SCREEN_FLOAT32 = (float) DIM_OF_SCREEN.getWidth();

	public static final float H_SCREEN_FLOAT32 = (float) DIM_OF_SCREEN.getHeight();

	public static final int W_SCREEN = (int) W_SCREEN_FLOAT32;

	public static final int H_SCREEN = (int) H_SCREEN_FLOAT32;

	protected static int int32Width;

	protected static int int32Height;

	protected static MyDesktopPaneToConf myDesktopPaneToConf;

	protected static JTable tableToRec;

}
