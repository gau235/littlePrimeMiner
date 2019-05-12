package lGpl20.comb.wDup;

import lGpl20.o.O;
import lGpl20.o.str.Strva;
import lGpl20.shareWXyz.ShWGo;

/**
 * @version 2019/03/08_21:50:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=DatToShW" >DatToShW.java</a>
 *
 * @see PWDup
 */
public class DatToShW extends DatToShW_A {

	private static final Class<DatToShW> CLASS_THIS = DatToShW.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To add then to append.<br/>
	 * To add then to append.
	 */
	public void addAftPassToInEx(long[] aryOfB64IntoB6) {

		StringBuilder tempStr;
		for (int i = 0; i != aryOfB64IntoB6.length; i++) {

			tempStr = ShWGo.toRowStrAftToH(aryOfB64IntoB6[i], 0, distinctSortedByValSAry);
			// O.l(tempStr + O.S32 + CLASS_THIS);

			if (matcherIn.reset(tempStr).find() && (!matcherEx.reset(tempStr).find())) {

				if (total32++ < Strva.int32MaxRowForHtml) {

					retStr.append(total32).append(prefix).append(tempStr).append(lineWr);

				}

			}

		}

	}

}
