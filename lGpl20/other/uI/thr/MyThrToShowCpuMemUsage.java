package lGpl20.other.uI.thr;

import lGpl20.o.O;
import lGpl20.o.str.SByN;
import lGpl20.o.thr.ThrWBox;
import lGpl20.other.uI.Main;

/**
 * The thread to show CPU and memory usage.<br/>
 * <br/>
 * The thread to show CPU and memory usage.
 * 
 * @version 2019/04/25_11:30:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=MyThrToShowCpuMemUsage" >
 *          MyThrToShowCpuMemUsage.java</a>
 * 
 */
public class MyThrToShowCpuMemUsage extends ThrWBox<Object> {

	private static final Class<MyThrToShowCpuMemUsage> CLASS_THIS = MyThrToShowCpuMemUsage.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * The CPU usage.<br/>
	 * The CPU usage.
	 */
	public static StringBuilder strCpuPercent() {

		float cpuUsageInF32 = (float) (((com.sun.management.OperatingSystemMXBean) O.OBJ_AS_OS_BEAN).getProcessCpuLoad());

		// float cpuUsageInF32 = (float) ((OperatingSystemMXBean) O.OBJ_AS_OS_BEAN).getSystemLoadAverage();

		return SByN.pad0D2((int) (100F * cpuUsageInF32)).append(O.C37);

	}

	@Override
	public void run() {

		// MyComponenter.progressBarTemp0.setStringPainted(true);

		super.int32Duration = 100;

		while (true) {

			try {

				sleep(int32Duration);

			} catch (InterruptedException interruptedEx) {

				interruptedEx.printStackTrace();

			}

			StringBuilder str = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);
			str.append("CPU").append(O.C61).append(strCpuPercent()).append(O.C32).append(O.C32).append(O.C32);

			// long tailPrime = Miner.tailPrimeInOriAryOfPrime();

			str.append("MEM").append(O.C61).append(SByN.f(O.dirtiedMem())).append(O.C32).append("of").append(O.C32)
					.append(SByN.f(O.allMem())).append(O.C32).append("MB");

			Main.mainFrame.setTitle(str.toString());

		}

	}

}
