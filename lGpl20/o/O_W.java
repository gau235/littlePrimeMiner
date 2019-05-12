package lGpl20.o;

import java.lang.management.ManagementFactory;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @version 2019/04/25_11:50:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=O_W" >O_W.java</a>
 * 
 * @see O_Y
 */
public abstract class O_W extends O_V {

	private static final Class<O_W> CLASS_THIS = O_W.class;

	protected static final long serialVersionUID = genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * The ThreadLocalRandom object.<br/>
	 * The ThreadLocalRandom object.
	 */
	public static final ThreadLocalRandom THR_LOCAL_RANDOM = ThreadLocalRandom.current();

	/**
	 * The max size of the arrays.<br/>
	 * The max size of the arrays.
	 */
	public static final int $MAX_LEN32_OF_ARY = 2_147_483_645;

	/**
	 * The default max CPU threads (cores).<br/>
	 * The default max CPU threads (cores).
	 */
	public static final int $MAX_QTY_OF_CPU_INT32 = 100;

	/**
	 * The runtime object.<br/>
	 * The runtime object.
	 */
	public static final Runtime RUNTIME = Runtime.getRuntime();

	/**
	 * The default max CPU threads (cores).<br/>
	 * The default max CPU threads (cores).
	 */
	public static final int $AVAILABLE_CPU_INT32 = RUNTIME.availableProcessors();

	/**
	 * 列出系統核心數, 由多到少遞減.<br/>
	 * To int[] of number of processor threads in descending order.
	 */
	public static int[] genAry32OfQtyOfCpu() {// must be less than 100 cores

		final int defPiece = 10;

		int countOfCpu = $AVAILABLE_CPU_INT32;

		if (countOfCpu == 1) {

			return new int[] { 1 };

		}

		if (countOfCpu > $MAX_QTY_OF_CPU_INT32) {

			countOfCpu = $MAX_QTY_OF_CPU_INT32;

		}

		final int[] ary32 = new int[defPiece];

		final int stepAkaGap = countOfCpu / defPiece + 1;
		int iAsThr = countOfCpu - stepAkaGap;
		int index = 0;

		for (; iAsThr > 0; iAsThr = iAsThr - stepAkaGap) {

			ary32[index++] = iAsThr;

		}

		if (ary32[index - 1] > 1) {

			ary32[index] = 1;

		}

		return trimTailAll0(ary32);

	}

	/**
	 * 列出系統核心數, 由多到少遞減.<br/>
	 * To int[] of number of processor threads in descending order.
	 */
	public static final int[] ARY32_OF_QTY_OF_CPU = genAry32OfQtyOfCpu();

	/**
	 * The OS bean.<br/>
	 * The OS bean.
	 */
	public static final Object OBJ_AS_OS_BEAN = ManagementFactory.getOperatingSystemMXBean();

	// /**
	// * The CPU usage.<br/>
	// * The CPU usage.
	// */
	// public static float cpuUsageInF32() {
	//
	// float cpuUsageInF32 = (float) (OS_BEAN.getProcessCpuLoad());
	// float cpuUsageInF32 = (float) ((OperatingSystemMXBean) O.OBJ_AS_OS_BEAN).getSystemLoadAverage();

	// l("cpuUsageInF32=" + cpuUsageInF32 + S32 + CLASS_THIS);
	// // return (int) (cpuLoadInF64);
	// return cpuUsageInF32;
	//
	// }

}
