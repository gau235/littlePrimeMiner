package lGpl20.other.sample;

import java.util.Map;
import java.util.TreeMap;

import lGpl20.o.O;
import lGpl20.o.ery.Ery;
import lGpl20.other.iO.IOr;

/**
 * To check code.<br/>
 * <br/>
 * To check code.
 * 
 * @version 2018/05/22_15:40:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=C921_CheckCodeInClass" >
 *          C921_CheckCodeInClass.java</a>
 * 
 */
public class C921_CheckCodeInClass {

	public static void main(String[] sAry) throws Throwable {

		TreeMap<String, StringBuilder> mapOfSrc = null;

		String regToIn = O.Z;
		// String regToEx = O.L;
		String regToEx = "sample";

		try {

			String stringRootDir = "./src/lGpl20";
			StringBuilder str = IOr.listSubFileNDir(stringRootDir, regToIn, regToEx);
			String[] sAryForFilePath = str.toString().split(O.LINE_SEPARATOR);

			Ery<String> myEry = new Ery<String>();

			for (String s : sAryForFilePath) {

				if (s.endsWith(".java")) {

					myEry.a(s);

				}

			}

			mapOfSrc = IOr.loadSourceCodeNDelComment(myEry.toGenericAry(O.S_ARY0));

		} catch (Exception exception1) {

			exception1.printStackTrace();

		}

		int count = 0;
		for (Map.Entry<String, StringBuilder> entry : mapOfSrc.entrySet()) {

			String name = entry.getKey();
			String sCode = entry.getValue().toString();

			++count;
			try {

				int i1 = sCode.indexOf(name);
				int i2 = sCode.indexOf(name, i1 + 1);

				String sub = sCode.substring(i1 - 15, i2 + name.length() * 2 + 21);
				// O.l("sub=" + sub);

				String aClassa = "<" + name + ">";
				if (sub.indexOf(aClassa) < 0) {

					O.l(count + " name=" + name);
					O.l("XXXXXXXXXXXXXXXXXXXXX=" + name);
					continue;

				}

				if (sub.indexOf(aClassa) < 0) {

					O.l(count + " name=" + name);
					O.l("XXXXXXXXXXXXXXXXXXXXX=" + name);
					continue;

				}

				int sub1 = sub.indexOf(name);
				if (sub1 < 0) {

					O.l(count + " name=" + name);
					O.l("XXXXXXXXXXXXXXXXXXXXX=" + name);
					continue;

				}

				int sub2 = sub.indexOf(name, sub1 + 1);
				if (sub2 < 0) {

					O.l(count + " name=" + name);
					O.l("XXXXXXXXXXXXXXXXXXXXX=" + name);
					continue;

				}

				int sub3 = sub.indexOf(name, sub2 + 1);
				if (sub3 < 0) {

					O.l(count + " name=" + name);
					O.l("XXXXXXXXXXXXXXXXXXXXX=" + name);
					continue;

				}

				int aaa = sub.indexOf("CLASS_THIS", 1);
				if (aaa < 0) {

					O.l(count + " name=" + name);
					O.l("XXXXXXXXXXXXXXXXXXXXX=" + name);
					continue;

				}

			} catch (Exception e) {

				O.l("XXXXXXXXXXXXXXXXXXXXX=" + name);
				continue;

			}

		}

	}

}
