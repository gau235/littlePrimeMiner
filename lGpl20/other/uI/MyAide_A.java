package lGpl20.other.uI;

import java.io.Serializable;
import java.nio.file.Path;

import lGpl20.o.KeyToSyn;
import lGpl20.o.O;
import lGpl20.o.ery.Ery;
import lGpl20.other.uI.thr.FanOfMarker;
import lGpl20.prime64.Marker;
import lGpl20.prime64.Miner;
import lGpl20.prime64.Ranger;
import lGpl20.prime64.thr.Moon;
import lGpl20.prime64.thr.Thrva;

/**
 * My aide.<br/>
 * My aide.
 * 
 * @version 2019/05/02_12:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=MyAide_A" >MyAide_A.java</a>
 * 
 * @see MyAide_D
 */
public abstract class MyAide_A extends Miner {

	private static final Class<MyAide_A> CLASS_THIS = MyAide_A.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	private static long i = 0L;

	public static final long NUM_STEP = 8L;

	public static final long NUM_MP_0 = (i++) * NUM_STEP;// left TextField
	public static final long NUM_MP_1 = NUM_MP_0 + 1L;// right TextField
	public static final long NUM_MP_3 = NUM_MP_0 + 3L;// save
	public static final long NUM_MP_4 = NUM_MP_0 + 4L;// stop saving
	public static final long NUM_MP_5 = NUM_MP_0 + 5L;// the tabbedPane's tab

	public static final long NUM_RP_0 = (i++) * NUM_STEP;// left TextField
	public static final long NUM_RP_1 = NUM_RP_0 + 1L;// right TextField
	public static final long NUM_RP_3 = NUM_RP_0 + 3L;
	public static final long NUM_RP_4 = NUM_RP_0 + 4L;
	public static final long NUM_RP_5 = NUM_RP_0 + 5L;// the tabbedPane's tab

	public static final long NUM_TEMP_0 = (i++) * NUM_STEP;// left TextField; the temp
	public static final long NUM_TEMP_1 = NUM_TEMP_0 + 1L;// right TextField
	public static final long NUM_TEMP_5 = NUM_TEMP_0 + 5L;// the tabbedPane's tab

	public static final long NUM_CONF_0 = (i++) * NUM_STEP;// left TextField
	public static final long NUM_CONF_1 = NUM_CONF_0 + 1L;// right TextField
	public static final long NUM_CONF_3 = NUM_CONF_0 + 3L;
	public static final long NUM_CONF_5 = NUM_CONF_0 + 5L;// the tabbedPane's tab

	public static final long NUM_REC_0 = (i++) * NUM_STEP;// left TextField
	public static final long NUM_REC_1 = NUM_REC_0 + 1L;// right TextField
	public static final long NUM_REC_3 = NUM_REC_0 + 3L;
	public static final long NUM_REC_5 = NUM_REC_0 + 5L;// the tabbedPane's tab

	public static Ery<Ery<CharSequence>> ery2DAsAllRowInTable = new Ery<Ery<CharSequence>>();

	public static final String S_TEMP_DIR = "temp";// for MP and GP

	public static String sDefDirToSaveMP;// for MP and GP

	public static Path defPathOfDirToSaveMP;// for MP and GP

	public static Moon moonMP; // mineWThrW1EryOfPrimeAry(1L, 1L, 1);

	public static Marker myMarker;

	public static FanOfMarker fanOfMarker;

	public static Thread myThrToSaveMP = Thrva.THR0;// MyAide.myThrToSaveMP.isAlive()

	public static Thread myThrToSaveRP = Thrva.THR0;

	public static Thread myThrToShowCpuMemUsage;

	/**
	 * 內建的物件, 用於多執行緒的存取控制.<br/>
	 * For synchronizing.
	 */
	protected static final Serializable KEY_TO_SYN = new KeyToSyn();

	// public static final int BOUND32_TO_CLEAR_J_TEXT_AREA = Ranger.$2POW20_INT32 * 2000;
	public static final int BOUND32_TO_CLEAR_J_TEXT_AREA = Ranger.$2POW20_INT32 * 80;

	/**
	 * @see #try32OfToMP
	 */
	public static final int BOUND32_TO_REPEAT_TO_MP = 100;

	/**
	 * @see #try32OfToRP
	 */
	public static final int BOUND32_TO_REPEAT_TO_RP = 100;

	public static final int BOUND32_TO_CLEAR_REC = BOUND32_TO_REPEAT_TO_MP + BOUND32_TO_REPEAT_TO_RP + 100;

	/**
	 * @see #BOUND32_TO_REPEAT_TO_MP
	 */
	public static int try32OfToMP;// only 1 round while repeating

	/**
	 * @see #BOUND32_TO_REPEAT_TO_RP
	 */
	public static int try32OfToRP;// only 1 round while repeating

	public static final String TEXT_TO_ESC = "Esc";

	public static final String TEXT_TO_SAVE = "Save";

	public static final String TEXT_DONE_AFT_TO_SAVE = "Done";

	/**
	 * 主檔名.<br/>
	 * The base name of the file.
	 */
	public static final String MY_FILE_BASENAME = "p";

	/**
	 * 副檔名.<br/>
	 * The extension name of the TXT file.
	 */
	public static final String TXT_FILENAME_EXTENSION = "txt";

	/**
	 * 檔名.<br/>
	 * The file name of the TXT file.
	 */
	public static final String MY_TXT_FILE_FULL_NAME_TO_REC = "rec.csv";

	/**
	 * The URL to record error.<br/>
	 * The URL to record error.
	 */
	public static final String MY_URL_TO_REC_ERR = "http://c64.tw/w20/o/recErr.jsp";

}
