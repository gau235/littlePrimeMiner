package lGpl20.prime64.thr;

import lGpl20.o.O;
import lGpl20.o.str.SByN;
import lGpl20.o.thr.ThrWBox;
import lGpl20.o.time.T64;
import lGpl20.prime64.Marker;
import lGpl20.prime64.Ranger;

/**
 * 監測 Marker 執行緒, 監測工作中的執行緒.<br/>
 * The thread to peek at Marker.
 * 
 * @version 2019/04/22_17:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=ThrToPeekAtMarker" >ThrToPeekAtMarker.
 *          java</a>
 * 
 */
public class ThrToPeekAtMarker extends ThrWBox<Marker> {

	private static final Class<ThrToPeekAtMarker> CLASS_THIS = ThrToPeekAtMarker.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 建構方法.<br/>
	 * Constructor.
	 */
	public ThrToPeekAtMarker(Marker marker) {

		box = marker;

	}

	@Override
	public void run() {

		int int32Percentage = 0;

		do {

			try {

				sleep(int32Duration);

			} catch (InterruptedException interruptedEx) {

				interruptedEx.printStackTrace();

			}

			int temp32Percentage = Ranger.countPercent(box.divisor, box.root2OfTailN);
			// O.l("temp32Percentage=" + temp32Percentage + O.S37 + O.S32 + CLASS_THIS);

			if (temp32Percentage > int32Percentage) {

				int32Percentage = temp32Percentage;
				O.l("percentage=" + temp32Percentage + O.S37);

			}

		} while (box.isAlive());

		O.l("box.tailN=" + SByN.f(box.tailN) + O.S32 + CLASS_THIS);

		final long totalPrime = box.countPrimeByB32AryForCompo(1L, box.tailN);

		StringBuilder str = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

		str.append(O.C32).append(1).append(O.C32).append(O.C126).append(O.C32).append(SByN.f(box.tailN));
		str.append(O.C32).append(O.C32).append(O.C32);
		str.append(SByN.f(totalPrime)).append(O.C32).append(O.C112).append(O.C32).append(O.C32).append(O.C32);
		str.append(T64.difInF32Sec(TIME64_START)).append(O.C32).append(O.C115).append(O.C_A_L);

		str.append("100").append(O.C37).append(O.C_A_L);

		O.l(str);

	}

}
