package lGpl20.other.iO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import lGpl20.o.O;
import lGpl20.o.ery.Aryva;
import lGpl20.o.str.SByN;
import lGpl20.prime64.GuessFromGauss;
import lGpl20.prime64.Ranger;

/**
 * @version 2017/08/10_21:04:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=IOr_Z" >IOr_Z.java</a>
 * 
 * @see IOr
 */
public abstract class IOr_Z extends IOr_W {

	private static final Class<IOr_Z> CLASS_THIS = IOr_Z.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 每多少個就 read.<br>
	 * The bound to flush when reading.
	 */
	public static final int BOUND_TO_FLUSH_WHEN_TO_READ_INT32 = Ranger.$2POW20_INT32 << 2;

	/**
	 * 讀取 myPrimeFile.txt 找最大質數.<br>
	 * To read the max prime from myPrimeFile.txt.
	 */
	public static long readPrimeAtFirstLineFrom(File file) throws IOException {

		try (FileInputStream fileIn = new FileInputStream(file);
				InputStreamReader inReader = new InputStreamReader(fileIn, StandardCharsets.UTF_8);
				BufferedReader bufReader = new BufferedReader(inReader);) {

			String s = bufReader.readLine();

			long int64 = Long.parseLong(s.substring(0, s.indexOf(O.S44)));

			return int64;

		}

	}

	/**
	 * 讀取 myPrimeFile.txt 並轉成 EryOfPrimeAry .<br>
	 * To read myPrimeFile.txt file and to convert to long[].
	 */
	public static long[] readFileNConvertToAryOfPrime(File file) throws IOException {

		long theMaxPrime = readPrimeAtFirstLineFrom(file);

		try (FileInputStream fileIn = new FileInputStream(file);
				InputStreamReader inReader = new InputStreamReader(fileIn, StandardCharsets.UTF_8);
				BufferedReader bufReader = new BufferedReader(inReader);) {

			long[] tempAry = new long[(int) (GuessFromGauss.guessTotalPrime(1, theMaxPrime) / 3 * 4)];// fuck

			String tempString;
			String[] sAry;

			for (int index = tempAry.length - 1; (tempString = bufReader.readLine()) != null;) {

				sAry = tempString.split(O.S44);

				for (int i = 0; i < sAry.length; i++) {

					long int64 = Long.parseLong(sAry[i]);

					if (index % BOUND_TO_FLUSH_WHEN_TO_READ_INT32 == 0) {

						O.l(SByN.f(int64) + O.S32 + CLASS_THIS);

					}

					tempAry[index--] = int64;

				}

			}

			return Aryva.removeHeadAll0(tempAry);

		}

	}

}