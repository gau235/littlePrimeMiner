package lGpl20.other;

import lGpl20.o.O;
import lGpl20.o.str.SByN;

/**
 * @version 2017/03/21_14:45:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Coder_Z" >Coder_Z.java</a>
 * 
 * @see Coder
 */
public abstract class Coder_Z extends Coder_A {

	private static final Class<Coder_Z> CLASS_THIS = Coder_Z.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 剪掉註解.<br/>
	 * To delete the comment.
	 */
	public static StringBuilder delComment(StringBuilder strSourceCode) {

		int index1;
		int indexOfPublicClass = strSourceCode.indexOf(STRING_LOWER_CASE_PUBLIC_CLASS);

		if (indexOfPublicClass < 0) {

			indexOfPublicClass = strSourceCode.indexOf(STRING_LOWER_CASE_PUBLIC_ABSTRACT_CLASS);

		}

		if (indexOfPublicClass < 0) {

			indexOfPublicClass = strSourceCode.indexOf(STRING_LOWER_CASE_PUBLIC_FINAL_CLASS);

		}

		while ((index1 = strSourceCode.indexOf(STRING_COMMENT_FROM)) >= 0 && index1 < indexOfPublicClass) {

			int index2 = strSourceCode.indexOf(STRING_COMMENT_TO);

			// O.l("index1=" + index1 + O.S32 + CLASS_THIS);
			// O.l("index2=" + index2 + O.S32 + CLASS_THIS);

			if (index1 < index2) {

				strSourceCode.replace(index1, index2 + 2, O.Z);

			} else {

				break;

			}

		}

		return strSourceCode;

	}

	/**
	 * To delNameOfPackage.<br/>
	 * To delNameOfPackage.
	 */
	public static StringBuilder delNameOfPackage(StringBuilder strSourceCode) {

		int indexOfPackage = strSourceCode.indexOf(STRING_LOWER_CASE_PACKAGE);

		if (indexOfPackage < 0 || indexOfPackage > 10) {// fuck

			return strSourceCode;

		}

		int indexOfSemicolon = strSourceCode.indexOf(O.S59);

		return strSourceCode.delete(indexOfPackage, indexOfSemicolon + 1);

	}

	/**
	 * To getNameOfClass.<br/>
	 * To getNameOfClass.
	 */
	public static String getNameOfClass(StringBuilder strSourceCode) {

		int indexOfPublicClass = strSourceCode.indexOf(STRING_LOWER_CASE_PUBLIC_CLASS);

		if (indexOfPublicClass >= 0) {

			int indexOfStrExtends = strSourceCode.indexOf(STRING_LOWER_CASE_EXTENDS);

			int indexOfStrImplements = strSourceCode.indexOf(STRING_LOWER_CASE_IMPLEMENTS);

			int indexOfLeftBraces = strSourceCode.indexOf(O.S123);// Left braces

			int index = indexOfLeftBraces;

			if (indexOfStrExtends > 0 && indexOfStrExtends < indexOfLeftBraces) {

				index = indexOfStrExtends;

			} else if (indexOfStrImplements > 0 && indexOfStrImplements < indexOfLeftBraces) {

				index = indexOfStrImplements;

			}

			// "public" + O.S32 + "class" =11, space=1
			String nameOfOnlyClass = strSourceCode.substring(indexOfPublicClass + 11 + 1 + 1, index);

			int indexOfLessThan = nameOfOnlyClass.indexOf(O.S60);
			int indexOfGreatThan = nameOfOnlyClass.indexOf(O.S62);

			if (indexOfLessThan > 0 /* && indexOfGreatThan > indexOfLessThan */) {

				nameOfOnlyClass = nameOfOnlyClass.substring(0, indexOfLessThan);

			}

			return nameOfOnlyClass.trim();

		} else if ((indexOfPublicClass = strSourceCode.indexOf(STRING_LOWER_CASE_PUBLIC_ABSTRACT_CLASS)) >= 0) {

			int indexOfStrExtends = strSourceCode.indexOf(STRING_LOWER_CASE_EXTENDS);

			int indexOfStrImplements = strSourceCode.indexOf(STRING_LOWER_CASE_IMPLEMENTS);

			int indexOfLeftBraces = strSourceCode.indexOf(O.S123);// Left braces

			int index = indexOfLeftBraces;

			if (indexOfStrExtends > 0 && indexOfStrExtends < indexOfLeftBraces) {

				index = indexOfStrExtends;

			} else if (indexOfStrImplements > 0 && indexOfStrImplements < indexOfLeftBraces) {

				index = indexOfStrImplements;

			}

			// "public" + O.S32 + "abstract" + O.S32+ "class"=19, space=1
			String nameOfOnlyClass = strSourceCode.substring(indexOfPublicClass + 19 + 1 + 1, index);

			int indexOfLessThan = nameOfOnlyClass.indexOf(O.S60);
			int indexOfGreatThan = nameOfOnlyClass.indexOf(O.S62);

			if (indexOfLessThan > 0 /* && indexOfGreatThan > indexOfLessThan */) {

				nameOfOnlyClass = nameOfOnlyClass.substring(0, indexOfLessThan);

			}

			return nameOfOnlyClass.trim();

		} else if ((indexOfPublicClass = strSourceCode.indexOf(STRING_LOWER_CASE_PUBLIC_FINAL_CLASS)) >= 0) {

			int indexOfStrExtends = strSourceCode.indexOf(STRING_LOWER_CASE_EXTENDS);

			int indexOfStrImplements = strSourceCode.indexOf(STRING_LOWER_CASE_IMPLEMENTS);

			int indexOfLeftBraces = strSourceCode.indexOf(O.S123);// Left braces

			int index = indexOfLeftBraces;

			if (indexOfStrExtends > 0 && indexOfStrExtends < indexOfLeftBraces) {

				index = indexOfStrExtends;

			} else if (indexOfStrImplements > 0 && indexOfStrImplements < indexOfLeftBraces) {

				index = indexOfStrImplements;

			}

			// "public" + O.S32 + "final" + O.S32+ "class"=16, space=1
			String nameOfOnlyClass = strSourceCode.substring(indexOfPublicClass + 16 + 1 + 1, index);

			int indexOfLessThan = nameOfOnlyClass.indexOf(O.S60);
			int indexOfGreatThan = nameOfOnlyClass.indexOf(O.S62);

			if (indexOfLessThan > 0 /* && indexOfGreatThan > indexOfLessThan */) {

				nameOfOnlyClass = nameOfOnlyClass.substring(0, indexOfLessThan);

			}

			return nameOfOnlyClass.trim();

		} else if ((indexOfPublicClass = strSourceCode.indexOf(STRING_LOWER_CASE_PUBLIC_INTERFACE)) >= 0) {

			int indexOfStrExtends = strSourceCode.indexOf(STRING_LOWER_CASE_EXTENDS);

			int indexOfStrImplements = strSourceCode.indexOf(STRING_LOWER_CASE_IMPLEMENTS);

			int indexOfLeftBraces = strSourceCode.indexOf(O.S123);// Left braces

			int index = indexOfLeftBraces;

			if (indexOfStrExtends > 0 && indexOfStrExtends < indexOfLeftBraces) {

				index = indexOfStrExtends;

			} else if (indexOfStrImplements > 0 && indexOfStrImplements < indexOfLeftBraces) {

				index = indexOfStrImplements;

			}

			// "public" + O.S32 + "interface"=15, space=1
			String nameOfOnlyClass = strSourceCode.substring(indexOfPublicClass + 15 + 1 + 1, index);

			int indexOfLessThan = nameOfOnlyClass.indexOf(O.S60);
			int indexOfGreatThan = nameOfOnlyClass.indexOf(O.S62);

			if (indexOfLessThan > 0 /* && indexOfGreatThan > indexOfLessThan */) {

				nameOfOnlyClass = nameOfOnlyClass.substring(0, indexOfLessThan);

			}

			return nameOfOnlyClass.trim();

		} else if ((indexOfPublicClass = strSourceCode.indexOf(STRING_LOWER_CASE_PUBLIC_ABSTRACT_INTERFACE)) >= 0) {

			int indexOfStrExtends = strSourceCode.indexOf(STRING_LOWER_CASE_EXTENDS);

			int indexOfStrImplements = strSourceCode.indexOf(STRING_LOWER_CASE_IMPLEMENTS);

			int indexOfLeftBraces = strSourceCode.indexOf(O.S123);// Left braces

			int index = indexOfLeftBraces;

			if (indexOfStrExtends > 0 && indexOfStrExtends < indexOfLeftBraces) {

				index = indexOfStrExtends;

			} else if (indexOfStrImplements > 0 && indexOfStrImplements < indexOfLeftBraces) {

				index = indexOfStrImplements;

			}

			// "public" + O.S32 + "abstract" + O.S32+ "interface"=23, space=1
			String nameOfOnlyClass = strSourceCode.substring(indexOfPublicClass + 23 + 1 + 1, index);

			int indexOfLessThan = nameOfOnlyClass.indexOf(O.S60);
			int indexOfGreatThan = nameOfOnlyClass.indexOf(O.S62);

			if (indexOfLessThan > 0 /* && indexOfGreatThan > indexOfLessThan */) {

				nameOfOnlyClass = nameOfOnlyClass.substring(0, indexOfLessThan);

			}

			return nameOfOnlyClass.trim();

		}

		return O.Z;

	}

	/**
	 * 從原始碼取得 package 名稱字串.<br/>
	 * To get the name of the package from source code.
	 */
	public static String getNameOfPackage(StringBuilder strSourceCode) {

		int indexOfPackage = strSourceCode.indexOf(STRING_LOWER_CASE_PACKAGE);

		if (indexOfPackage < 0 || indexOfPackage > 10) {// fuck

			return O.Z;

		}

		int indexOfSemicolon = strSourceCode.indexOf(O.S59);

		// package=6, space=1
		String nameOfPackage = strSourceCode.substring(indexOfPackage + 6 + 1 + 1, indexOfSemicolon);

		return nameOfPackage.trim();

	}

	/**
	 * 從原始碼取得 version 名稱字串.<br/>
	 * To get the version from source code.
	 */
	public static String getVersionOfSourceCode(StringBuilder strSourceCode) {

		int indexOfAtVersion = strSourceCode.indexOf(STRING_AT_LOWER_CASE_VERSION);

		if (indexOfAtVersion < 0) {// fuck

			return O.Z;

		}

		try {

			// @version=6, space=1
			String stringVersion = strSourceCode.substring(indexOfAtVersion + 6 + 1 + 1, indexOfAtVersion + 6 + 1 + 1 + 20);

			return stringVersion.trim();

		} catch (IndexOutOfBoundsException indexOutOfBoundsException) {

			indexOutOfBoundsException.printStackTrace();
			return O.Z;

		}

	}

	/**
	 * To getNameOfPackageNClass.<br/>
	 * To getNameOfPackageNClass.
	 */
	public static String[] getNameOfPackageNClass(StringBuilder strSourceCode) {

		String[] sAry = new String[3];

		String nameOfClass = getNameOfClass(strSourceCode);
		String nameOfPackage = getNameOfPackage(strSourceCode);
		// String stringVersion = getVersionOfSourceCode(strSourceCode);

		sAry[0] = nameOfClass;
		sAry[1] = nameOfPackage;

		if (O.Z.equals(nameOfPackage)) {

			sAry[2] = nameOfClass;

		} else {

			sAry[2] = nameOfPackage + O.S46 + nameOfClass;

		}

		// sAry[3] = stringVersion;

		return sAry;

	}

	/**
	 * To insertNameOfPackageWTimestamp.<br/>
	 * To insertNameOfPackageWTimestamp.
	 */
	public static StringBuilder insertNameOfPackageWTimestamp(StringBuilder strSourceCode, long timestamp) {

		String nameOfPackageWTimestamp = STRING_LOWER_CASE_PACKAGE + O.S32 + O.S112 + SByN.pad0D3(timestamp) + O.S59;
		return strSourceCode.insert(0, nameOfPackageWTimestamp);

	}

}
