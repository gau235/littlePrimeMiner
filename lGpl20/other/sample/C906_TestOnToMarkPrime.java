package lGpl20.other.sample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import lGpl20.o.O;
import lGpl20.o.str.S;
import lGpl20.o.str.SByN;
import lGpl20.o.time.T64;
import lGpl20.other.iO.IOr;
import lGpl20.other.jsp.Jsp;
import lGpl20.other.uI.MyAide;
import lGpl20.prime64.Marker;

/**
 * The test on to mark primes.<br/>
 * <br/>
 * The test on to mark primes.
 * 
 * @version 2017/07/07_10:50:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=C906_TestOnToMarkPrime" >
 *          C906_TestOnToMarkPrime.java</a>
 * 
 */
public class C906_TestOnToMarkPrime extends Thread {

	private static final Class<C906_TestOnToMarkPrime> CLASS_THIS = C906_TestOnToMarkPrime.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	public Marker marker = new Marker(1L);

	@Override
	public void run() {

		final long N1 = 1L;
		final long N2 = 3_037_000_507L;

		for (int i = 0; i != 20; i++) {

			O.l("i=" + i + O.S32 + CLASS_THIS);

			marker = new Marker(N2);
			marker.start();

			try {

				marker.join();

			} catch (InterruptedException interruptedEx) {

				interruptedEx.printStackTrace();

			}

			final long totalPrime = marker.countPrimeByB32AryForCompo(N1, N2);

			////////////////////////////////////////////////////////
			if (totalPrime != 146_144_319L) {// constant

				S errS = new S();
				errS.lineWr = Jsp.L;

				errS.l(T64.toTimeStr() + O.S32 + CLASS_THIS);
				errS.l("N1=" + SByN.f(N1));
				errS.l("N2=" + SByN.f(N2));
				errS.l("totalPrime=" + SByN.f(totalPrime));
				errS.l("Marker.b32AryForCompoA.length=" + SByN.f(marker.box.length));

				final long ans2 = marker.countPrimeByB32AryForCompo(N1, N2);
				errS.l("ans2=" + SByN.f(ans2));

				// int get0Or1InB32AryForCompo = marker.get0Or1InB32AryForCompo(1_934_397_729L);
				// errS.l("get0Or1InB32AryForCompo=" + get0Or1InB32AryForCompo);

				O.l(errS);

				MyAide.sendHttpErr(errS.str, O.Z);

				if (!O.IS_LINUX) {

					//////////////////////////////////////

					try {

						MyAide.defPathOfDirToSaveMP = Paths.get("C:/temp");// fuck
						Files.createDirectories(MyAide.defPathOfDirToSaveMP);
						O.l("defPathOfDirToSaveMP=" + MyAide.defPathOfDirToSaveMP + O.S32 + O.S32 + O.S32 + CLASS_THIS);

					} catch (IOException iOException) {

						iOException.printStackTrace();
						return;

					}

					Path pathOfFile = MyAide.defPathOfDirToSaveMP.resolve(SByN.genPadded0Str("temp", ".txt", 3).toString());

					try {

						IOr.newDirNFile(pathOfFile);

					} catch (Throwable throwable) {

						throwable.printStackTrace();

					}

					//////////////////////////////////////
					IOr.saveB32AryOfCompoToFile(marker, N1, N2, pathOfFile);

				}

			}
			////////////////////////////////////////////////////////

			System.gc();

		}

	}

	public static void main(String[] sAry) throws Throwable {

		new C906_TestOnToMarkPrime().run();

	}

}