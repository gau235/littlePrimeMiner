package lGpl20.o.thr;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import lGpl20.o.O;

/**
 * To command.<br/>
 * <br/>
 * To command.
 * 
 * @version 2017/04/02_05:00:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=ThrToCmd" >ThrToCmd.java</a>
 * 
 */
public class ThrToCmd extends Thread {

	private static final Class<ThrToCmd> CLASS_THIS = ThrToCmd.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * The String array for the commands.<br/>
	 * The String array for the commands.
	 */
	public final String[] S_ARY_FOR_CMD;

	/**
	 * To construct.<br/>
	 * To construct.
	 */
	public ThrToCmd(String[] sAryForCmd) {

		S_ARY_FOR_CMD = sAryForCmd;

	}

	@Override
	public void run() {

		try {

			ProcessBuilder cmdProcessBuilder = new ProcessBuilder(S_ARY_FOR_CMD);
			Process cmdProcess = cmdProcessBuilder.start();

			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(cmdProcess.getInputStream()));

			String line;

			while ((line = bufferedReader.readLine()) != null) {

				O.l(line);

			}

			cmdProcess.destroy();

		} catch (Throwable throwable) {

			throwable.printStackTrace();

		}

	}

}
