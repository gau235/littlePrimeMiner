package lGpl20.other.sample;

import java.lang.reflect.Method;

import lGpl20.comb.b64IntoB6.B64IntoB6;
import lGpl20.o.O;
import lGpl20.o.ery.Ery;

/**
 * 列出 class 內所有方法名.<br/>
 * <br/>
 * The sample to list all methods' names.
 * 
 * @version 2018/06/27_20:10:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=C105_ListAllMethodName" >
 *          C105_ListAllMethodName.java</a>
 * 
 */
public class C105_ListAllMethodName {

	public static Ery<StringBuilder> listAllMethodName(Class<?> theClass) {

		Method[] aryOfMethod = theClass.getMethods();

		Ery<StringBuilder> retEryOfStr = new Ery<StringBuilder>();

		for (int i = 0; i < aryOfMethod.length; i++) {

			retEryOfStr.a(new StringBuilder(aryOfMethod[i].toGenericString()));

		}

		return retEryOfStr;

	}

	public static void main(String[] sAry) {

		// O.l(listAllMethodName(C105_ListAllMethodName.class).toStr());
		// O.l(listAllMethodName(Strva.class).toStr());
		O.l(listAllMethodName(B64IntoB6.class).toStr());

	}

}
