package lGpl20.o;

/**
 * @version 2019/04/15_18:50:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=O_L" >O_L.java</a>
 * 
 * @see O_M
 */
public abstract class O_L extends O_J {

	private static final Class<O_L> CLASS_THIS = O_L.class;

	protected static final long serialVersionUID = genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 切掉 String[] 陣列末的多個 null.<br/>
	 * To cut the nulls in the tail of the String array.<br/>
	 */
	public static String[] removeTailAllNull(String[] sAry) {

		int lenMinus1 = sAry.length - 1;

		if (lenMinus1 >= 0 && sAry[lenMinus1] == null) {

			int indexNotInt32Max = lenMinus1 - 1;

			for (; indexNotInt32Max >= 0; indexNotInt32Max--) {

				if (sAry[indexNotInt32Max] != null) {

					break;

				}

			}

			if (indexNotInt32Max == lenMinus1) {

				return sAry;

			}

			int tempLen = indexNotInt32Max + 1;

			String[] retSAry = new String[tempLen];

			System.arraycopy(sAry, 0, retSAry, 0, tempLen);

			return retSAry;

		}

		return sAry;// do not remove anything

	}

	/**
	 * To trim all string in array of string.<br/>
	 * To trim all string in array of string.
	 */
	public static String[] splitNTrimAll(String s, String regexToSplit) {

		String[] sAry = s.split(regexToSplit);

		String[] retSAry = new String[sAry.length];

		String tempS;
		for (int i = 0, iRet = 0; i != sAry.length;) {

			tempS = sAry[i++];

			if (tempS == null || O.Z.equals(tempS = tempS.trim())) {

				// O.l("tempS=" + tempS + O.S32 + CLASS_THIS);
				continue;

			}

			retSAry[iRet++] = tempS;

		}

		return removeTailAllNull(retSAry);

	}

}
