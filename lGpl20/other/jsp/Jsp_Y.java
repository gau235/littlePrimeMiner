package lGpl20.other.jsp;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import lGpl20.o.ery.Ery;
import lGpl20.o.keyNVal.Int32NObj;
import lGpl20.other.iO.IOr;

/**
 * @version 2017/08/20_07:47:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Jsp_Y" >Jsp_Y.java</a>
 * 
 * @see Jsp_Z
 */
public abstract class Jsp_Y extends Jsp_W {

	private static final Class<Jsp_Y> CLASS_THIS = Jsp_Y.class;

	protected static final long serialVersionUID = genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To cacheClassInsOfDbDriver.<br/>
	 * To cacheClassInsOfDbDriver.
	 * 
	 * @throws SecurityException
	 * @throws NoSuchMethodException
	 * @throws InvocationTargetException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public static void cacheClassInsOfDbDriver(Object appOrSessionObj, String key, String nameOfDriverOfDb)
			throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {

		synchronized (KEY_TO_SYN) {

			Class<?> classAppOrSessionObj = appOrSessionObj.getClass();
			Method methodToGetAttribute = classAppOrSessionObj.getMethod(NAME_METHOD_GET_ATTRITUBE, String.class);
			Method methodToSetAttribute = classAppOrSessionObj.getMethod(NAME_METHOD_SET_ATTRITUBE, String.class, Object.class);

			Object returnedObj = methodToGetAttribute.invoke(appOrSessionObj, key);

			if (returnedObj == null) {

				methodToSetAttribute.invoke(appOrSessionObj, key, Class.forName(nameOfDriverOfDb));

				l("setAttribute=" + key + S32 + appOrSessionObj);

			}

		}

	}

	/**
	 * Is timeout out of the duration I have fucking forbidden you?<br/>
	 * Is timeout out of the duration I have fucking forbidden you?
	 * 
	 * @see #STRING_T64_OF_PREVIOUS_ACCESS
	 * 
	 * @throws SecurityException
	 * @throws NoSuchMethodException
	 * @throws InvocationTargetException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public static boolean isTimeoutAftPreviousAccess(Object appOrSessionObj, long numOfMillisec) throws NoSuchMethodException,
			SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Class<?> classAppOrSessionObj = appOrSessionObj.getClass();
		Method methodToGetAttribute = classAppOrSessionObj.getMethod(NAME_METHOD_GET_ATTRITUBE, String.class);
		Long t64PreviousAccess = (Long) methodToGetAttribute.invoke(appOrSessionObj, STRING_T64_OF_PREVIOUS_ACCESS);

		if (t64PreviousAccess == null) {

			return true;

		}

		return ((System.currentTimeMillis() - t64PreviousAccess.longValue()) > numOfMillisec);

	}

	/**
	 * To cacheInEryFromFile.<br/>
	 * To cacheInEryFromFile.
	 * 
	 * @throws InvocationTargetException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws SecurityException
	 * @throws NoSuchMethodException
	 * @throws IOException
	 */
	@SuppressWarnings("unchecked")
	public static Ery<Int32NObj<byte[]>> cacheInEryFromFile(String nameOfFileAsKeyForDisk, Object appOrSessionObj,
			String keyForToCache) throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, IOException {

		synchronized (KEY_TO_SYN) {

			Class<?> classAppOrSessionObj = appOrSessionObj.getClass();

			Method methodToGetAttribute = classAppOrSessionObj.getMethod(NAME_METHOD_GET_ATTRITUBE, String.class);
			Method methodToSetAttribute = classAppOrSessionObj.getMethod(NAME_METHOD_SET_ATTRITUBE, String.class, Object.class);

			Object objForFile = methodToGetAttribute.invoke(appOrSessionObj, keyForToCache);

			if (objForFile != null) {

				l(nameOfFileAsKeyForDisk + S32 + "already in cache" + S32 + CLASS_THIS);

				return (Ery<Int32NObj<byte[]>>) objForFile;

			}

			// not in cache
			File file = new File(nameOfFileAsKeyForDisk);
			Ery<Int32NObj<byte[]>> ery = IOr.cacheFileInEry(file);

			methodToSetAttribute.invoke(appOrSessionObj, keyForToCache, ery);
			l(nameOfFileAsKeyForDisk + S32 + "not in cache, but setAttribute ok" + S32 + CLASS_THIS);

			return ery;

		}

	}

	// /**
	// * To cacheInEryFromFile.<br/>
	// * To cacheInEryFromFile.
	// *
	// * @throws IOException
	// */
	// @SuppressWarnings("unchecked")
	// public static Ery<Int32NObj<byte[]>> cacheInEryFromFile(String sOfFile, javax.servlet.ServletContext app, String key)
	// throws IOException {
	//
	// synchronized (KEY_TO_SYN) {
	//
	// Object objForFile = app.getAttribute(key);
	// if (objForFile != null) {
	//
	// l(sOfFile + S32 + "already in cache" + S32 + CLASS_THIS);
	//
	// return (Ery<Int32NObj<byte[]>>) objForFile;
	//
	// }
	//
	// // not in cache
	// File file = new File(sOfFile);
	// Ery<Int32NObj<byte[]>> ery = IOr.cacheFileInEry(file);
	//
	// app.setAttribute(key, ery);
	// l(sOfFile + S32 + "not in cache, but setAttribute ok" + S32 + CLASS_THIS);
	//
	// return ery;
	//
	// }
	//
	// }

}