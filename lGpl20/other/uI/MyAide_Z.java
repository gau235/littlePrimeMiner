package lGpl20.other.uI;

import java.nio.file.Path;

import lGpl20.o.O;
import lGpl20.o.str.S;
import lGpl20.o.str.SByN;
import lGpl20.o.time.T64;
import lGpl20.other.iO.IOr;
import lGpl20.other.jsp.Jsp;
import lGpl20.other.uI.thr.FanOfMarker;
import lGpl20.prime64.Miner;

/**
 * @version 2018/03/27_11:17:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=MyAide_Z" >MyAide_Z.java</a>
 * 
 * @see MyAide
 */
public abstract class MyAide_Z extends MyAide_Y {

	private static final Class<MyAide_Z> CLASS_THIS = MyAide_Z.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 回報 Marker 執行的情況.<br/>
	 * To report the proceeding of Marker.
	 */
	public static void checkOrReportErr(FanOfMarker fanOfMarker, final long totalPrime) {

		if (fanOfMarker.N1 <= 2L && fanOfMarker.N2 == Miner.$MAX_INT_TO_GROW_ORI_ARY_OF_PRIME) {

			if (totalPrime != Miner.$MAX_LEN32_OF_ORI_ARY_OF_PRIME) {
				// if (totalPrime == Miner.$MAX_LEN32_OF_ORI_ARY_OF_PRIME) {

				S errS = new S();
				errS.lineWr = Jsp.L;

				errS.l(T64.toTimeStr() + O.S32 + CLASS_THIS);
				errS.l("N1=" + SByN.f(fanOfMarker.N1));
				errS.l("N2=" + SByN.f(fanOfMarker.N2));
				errS.l("totalPrime=" + SByN.f(totalPrime));
				errS.l("box.length=" + SByN.f(fanOfMarker.box.box.length));
				errS.l("timeCost=" + T64.difInF32Sec(fanOfMarker.TIME64_START));

				final long ans2 = fanOfMarker.box.countPrimeByB32AryForCompo(fanOfMarker.N1, fanOfMarker.N2);
				errS.l("ans2=" + SByN.f(ans2));

				int get0Or1InB32AryForCompo = fanOfMarker.box.get0Or1InB32AryForCompo(1_934_397_729L);// not a prime
				errS.l("get0Or1InB32AryForCompo=" + get0Or1InB32AryForCompo);

				MyAide.sendHttpErr(errS.str, O.Z);

				//////////////////////////////////////

				Path pathOfFile = MyAide.defPathOfDirToSaveMP.resolve(SByN.genPadded0Str("temp", ".txt", 3).toString());

				try {

					IOr.newDirNFile(pathOfFile);

				} catch (Throwable throwable) {

					throwable.printStackTrace();

				}

				//////////////////////////////////////

				IOr.saveB32AryOfCompoToFile(fanOfMarker.box, fanOfMarker.N1, fanOfMarker.N2, pathOfFile);

			}

		}

	}

}
