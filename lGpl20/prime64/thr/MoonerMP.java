package lGpl20.prime64.thr;

import lGpl20.o.O;
import lGpl20.o.str.SByN;
import lGpl20.o.thr.ThrWBox;
import lGpl20.o.time.T64;
import lGpl20.prime64.ery.EryOfPrimeAry;

/**
 * 監測用執行緒, 監測工作中的執行緒.<br/>
 * The thread to peek.
 * 
 * @version 2019/04/21_14:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=MoonerMP" >MoonerMP.java</a>
 * 
 * @see ThrToMine
 */
public class MoonerMP extends ThrWBox<Moon> {

	private static final Class<MoonerMP> CLASS_THIS = MoonerMP.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 建構方法.<br/>
	 * Constructor.
	 */
	public MoonerMP(Moon moon) {

		box = moon;

	}

	@Override
	public void run() {

		ThrToMine[] aryThrMP = box.aryThrMP;
		EryOfPrimeAry headEryOfPrimeAry = box.aryOfEryOfPrimeAry[0];

		do {

			try {

				sleep(int32Duration);

			} catch (InterruptedException interruptedEx) {

				interruptedEx.printStackTrace();

			}

			if (headEryOfPrimeAry.len() != 0) {

				StringBuilder str = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);
				str.append("len=" + SByN.f(headEryOfPrimeAry.len())).append(O.C32).append(CLASS_THIS).append(O.C_A_L);
				str.append("tailP=" + SByN.f(headEryOfPrimeAry.tailPrime())).append(O.C32).append(CLASS_THIS).append(O.C_A_L);

				O.l(str);

			}

		} while (Thrva.headAlive(aryThrMP) != null);

		headEryOfPrimeAry = EryOfPrimeAry.mergeAllEryOfPrimeAry(box.aryOfEryOfPrimeAry);
		headEryOfPrimeAry.sort();// fuck
		box.aryOfEryOfPrimeAry[0] = headEryOfPrimeAry;// fuck

		O.l(SByN.f(headEryOfPrimeAry.totalPrime()).append(O.C32).append(O.C112).append(O.C32).append(CLASS_THIS).append(O.C_A_L)
				.append(T64.difInF32Sec(TIME64_START)).append(O.C32).append(O.C115).append(O.C32).append(CLASS_THIS));

	}

}
