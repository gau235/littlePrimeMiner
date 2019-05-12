package lGpl20.other.sample;

import java.io.File;

import lGpl20.o.O;
import lGpl20.prime64.Ranger;

/**
 * To get free space of disk.<br/>
 * <br/>
 * To get free space of disk.
 * 
 * @version 2017/06/20_12:57:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=C132_ShowFreeSpaceOfDisk" >
 *          C132_ShowFreeSpaceOfDisk.java</a>
 * 
 */
public class C132_ShowFreeSpaceOfDisk {

	public static void main(String[] sAry) throws Throwable {

		File[] aryOfRoot = File.listRoots();

		long all = 0L;
		if (aryOfRoot != null && aryOfRoot.length > 0) {

			for (File fRoot : aryOfRoot) {

				O.l("root=" + fRoot);
				long theFree = fRoot.getFreeSpace();
				all += theFree;

				O.l("freeSpace=" + theFree / Ranger.$2POW30 + "G");

			}

		}

		O.l("all=" + all / Ranger.$2POW30 + "G");

	}

}