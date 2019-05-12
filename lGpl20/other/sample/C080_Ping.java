package lGpl20.other.sample;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;

import lGpl20.o.O;
import lGpl20.o.time.T64;
import lGpl20.other.iO.IOr;

/**
 * To ping.<br/>
 * <br/>
 * To ping.
 * 
 * @version 2018/10/19_18:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=C080_Ping" >C080_Ping.java</a>
 * 
 */
public class C080_Ping {

	public static final String[] S_ARY_FOR_CMD_TO_PING = new String[] { "cmd.exe", "/C", "ping", "briian.com" };

	public static final Path PATH_TO_LOG = Paths.get("O:/log.txt");

	public static void main(String[] sAry) throws Throwable {

		int numOfTry = 50_000;
		int durationBetweenThr = 2_600;

		ProcessBuilder cmdProcessBuilder;
		Process cmdProcess;
		for (int i = 0; i < numOfTry; i++) {

			O.l("i=" + i);

			cmdProcess = O.RUNTIME.exec("ping briian.com");

			// cmdProcessBuilder = new ProcessBuilder(S_ARY_FOR_CMD_TO_PING);
			// cmdProcess = cmdProcessBuilder.start();

			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(cmdProcess.getInputStream()));

			String line;

			while ((line = bufferedReader.readLine()) != null) {

				line = line.trim();
				// O.l(line.length());
				// O.l(line.equals(O.Z));
				// O.l(line.equals(O.S0));

				if (line.equals(O.Z)) {

					continue;

				}

				if (!line.startsWith("Ping briian.com")) {

					O.l(T64.timeStr() + line + O.L);
					IOr.appendCharSeqToFile(T64.timeStr() + line + O.L, PATH_TO_LOG);

				} else {

					break;

				}

				// O.l(line);

			}

			cmdProcess.destroy();

			Thread.sleep(durationBetweenThr);

		}

	}

}