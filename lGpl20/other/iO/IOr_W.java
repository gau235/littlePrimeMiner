package lGpl20.other.iO;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import lGpl20.o.O;
import lGpl20.prime64.Marker;
import lGpl20.prime64.Ranger;
import lGpl20.prime64.ery.EryOfPrimeAry;

/**
 * @version 2018/10/30_11:00:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=IOr_W" >IOr_W.java</a>
 * 
 * @see IOr_Z
 */
public abstract class IOr_W extends IOr_U {

	private static final Class<IOr_W> CLASS_THIS = IOr_W.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 每 1 列 10 質數, 每 2 個質數用逗點分隔.<br/>
	 * The number of primes per line.
	 */
	public static final int NUM_OF_PRIME_PER_LINE_INT32 = 10;

	/**
	 * 每多少個就 flush.<br/>
	 * The bound to flush.
	 */
	public static final int BOUND_TO_FLUSH_INT32 = Ranger.$2POW10_INT32;

	/**
	 * 把質數隊伍存檔到 myPrimeFile.txt.<br/>
	 * 每一列 10 質數, 每 2 個質數用逗點分隔.<br/>
	 * To save the myPrimeFile object to the myPrimeFile.txt.
	 */
	public static void saveEryOfPrimeAryToFile(EryOfPrimeAry eryOfPrimeAry, Path pathOfFile) {

		try (BufferedWriter bufW = Files.newBufferedWriter(pathOfFile, StandardCharsets.UTF_8, StandardOpenOption.WRITE);) {

			StringBuilder str = null;

			long[] primeAry;

			int countOfIndexInLine = 0;// fuck

			O.l("bef EryOfPrimeAry size=" + eryOfPrimeAry.len() + O.S32 + CLASS_THIS);

			boolean isToBreak = false;
			for (int theTo = eryOfPrimeAry.len(); !isToBreak; theTo = theTo - BOUND_TO_FLUSH_INT32) {

				int theFrom = theTo - BOUND_TO_FLUSH_INT32;

				if (theFrom < 0) {

					theFrom = 0;
					isToBreak = true;

				}

				O.l("theFrom=" + theFrom + O.S32 + CLASS_THIS);
				O.l("theSize=" + theTo + O.S32 + CLASS_THIS);

				primeAry = eryOfPrimeAry.mergeIn1Ary(theFrom, theTo);// fuck
				O.l("aft mergeIn1Ary len=" + primeAry.length + O.S32 + CLASS_THIS);

				str = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);
				for (int i = primeAry.length - 1; i >= 0; i--) {

					str.append(primeAry[i]).append(O.C44);

					if (++countOfIndexInLine == NUM_OF_PRIME_PER_LINE_INT32) {

						countOfIndexInLine = 0;

						str.append(O.C_A_L);

					}

				}

				bufW.write(str.toString());// first to write then to flush
				bufW.flush();

			}

		} catch (IOException iOException) {

			iOException.printStackTrace();

		}

	}

	/**
	 * 把質數隊伍存檔到 myPrimeFile.txt.<br/>
	 * 每一列 10 質數, 每 2 個質數用逗點分隔.<br/>
	 * To save the EryOfPrimeAry object to the myPrimeFile.txt.
	 */
	public static void saveEryOfPrimeAryToFile(long[] aryOfPrime, Path pathOfFile) {

		try (BufferedWriter bufW = Files.newBufferedWriter(pathOfFile, StandardCharsets.UTF_8, StandardOpenOption.WRITE);) {

			StringBuilder str = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

			for (int i = aryOfPrime.length - 1, countOfIndexInLine = 0, countToFlush = 0; i >= 0; i--) {

				str.append(aryOfPrime[i]).append(O.C44);

				if (++countOfIndexInLine == NUM_OF_PRIME_PER_LINE_INT32) {

					countOfIndexInLine = 0;
					str.append(O.C_A_L);

					if (++countToFlush == BOUND_TO_FLUSH_INT32) {

						countToFlush = 0;

						bufW.write(str.toString());
						bufW.flush();
						str = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

					}

				}

			}

			bufW.write(str.toString());// first to write then to flush
			bufW.flush();

		} catch (IOException iOException) {

			iOException.printStackTrace();

		}

	}

	/**
	 * 把質數隊伍存檔到 myPrimeFile.txt.<br/>
	 * 每一列 10 質數, 每 2 個質數用逗點分隔.<br/>
	 * To save the EryOfPrimeAry object to the myPrimeFile.txt.
	 */
	public static void saveB32AryOfCompoToFile(Marker marker, long n1, long n2, Path pathOfFile) {

		try (BufferedWriter bufW = Files.newBufferedWriter(pathOfFile, StandardCharsets.UTF_8, StandardOpenOption.WRITE);) {

			if ((n2 > Ranger.$2) && (((int) n2) & 0b1) == 0) {

				n2--;// fuck

			}

			long myN1 = n1;
			if (n1 < Ranger.$3) {

				myN1 = Ranger.$3;

			}

			long myN2 = n2;

			StringBuilder str = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);// fuck

			for (int countOfIndexInLine = 0, countToFlush = 0; myN2 >= myN1; myN2 = myN2 - Ranger.$2) {

				if (marker.get0Or1InB32AryForCompo(myN2) == 0) {

					str.append(myN2).append(O.C44);

					if (++countOfIndexInLine == NUM_OF_PRIME_PER_LINE_INT32) {

						countOfIndexInLine = 0;
						str.append(O.C_A_L);

						if (++countToFlush == BOUND_TO_FLUSH_INT32) {

							countToFlush = 0;

							bufW.write(str.toString());
							bufW.flush();
							
							str = new StringBuilder(O.DEF_CAPACITY32_FOR_STR);

						}

					}

				}

			}

			if (n2 >= Ranger.$2 && n1 <= Ranger.$2) {

				str.append(Ranger.$2_INT32).append(O.C44);// for the prime 2

			}

			bufW.write(str.toString());// first to write then to flush
			bufW.flush();

		} catch (IOException iOException) {

			iOException.printStackTrace();

		}

	}

}