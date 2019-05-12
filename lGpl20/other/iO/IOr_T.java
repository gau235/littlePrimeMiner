package lGpl20.other.iO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import lGpl20.o.O;
import lGpl20.o.ery.Ery;
import lGpl20.o.keyNVal.Int32NObj;

/**
 * @version 2018/10/16_10:30:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=IOr_T" >IOr_T.java</a>
 * 
 * @see IOr_U
 */
public abstract class IOr_T extends IOr_R {

	private static final Class<IOr_T> CLASS_THIS = IOr_T.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * 解壓縮.<br/>
	 * 不支援中文檔案名稱, 不支援中文內容.<br/>
	 * To unzip.
	 */
	public static void unzip(String sZipFile, String sOutputDir) throws IOException {

		final int size32OfBuff = 2048;
		byte[] byteAry = new byte[size32OfBuff];

		try (ZipFile zipFile = new ZipFile(sZipFile, StandardCharsets.UTF_8);) {

			Enumeration<? extends ZipEntry> allZEntry = zipFile.entries();

			while (allZEntry.hasMoreElements()) {

				ZipEntry zEntry = allZEntry.nextElement();

				String sFileOrDir = zEntry.getName();

				Path pFileOrDir = Paths.get(sOutputDir, sFileOrDir);
				File fileOrDir = pFileOrDir.toFile();

				// O.l("fileOrDir=" + fileOrDir.getAbsoluteFile() + O.S32 + CLASS_THIS);

				if (zEntry.isDirectory()) {

					// O:/temp/jre/COPYRIGHT
					fileOrDir.mkdirs();// todo: need improve

					// Files.createDirectories(pFileOrDir);

					// File parentOfFileOrDir = fileOrDir.getParentFile();
					// O.l("parentOfFileOrDir=" + parentOfFileOrDir.getAbsoluteFile() + O.S32 + CLASS_THIS);

					// when exists
					fileOrDir.setReadable(true, false);
					fileOrDir.setWritable(true, false);
					fileOrDir.setExecutable(true, false);

					continue;

				} else {// it will be dir/file

					File parentOfFileOrDir = fileOrDir.getParentFile();

					// if (parentOfFileOrDir != null) {}

					// create all non exists folders else you get FileNotFoundException
					parentOfFileOrDir.mkdirs();

					// when exists
					parentOfFileOrDir.setReadable(true, false);
					parentOfFileOrDir.setWritable(true, false);
					parentOfFileOrDir.setExecutable(true, false);

				}

				try (BufferedInputStream bufIn = new BufferedInputStream(zipFile.getInputStream(zEntry));) {

					try (FileOutputStream fileOut = new FileOutputStream(fileOrDir);
							BufferedOutputStream bufOut = new BufferedOutputStream(fileOut);) {

						int len32;
						while ((len32 = bufIn.read(byteAry)) > 0) {

							bufOut.write(byteAry, 0, len32);

						}

						bufOut.flush();// first to write then to flush

					}

					// when exists
					fileOrDir.setReadable(true, false);
					fileOrDir.setWritable(true, false);
					fileOrDir.setExecutable(true, false);

				}

			}

		}

	}

	/**
	 * To cache the file.<br/>
	 * To cache the file.
	 */
	public static Ery<Int32NObj<byte[]>> cacheFileInEry(File f) throws IOException {

		final int SIZE_OF_BUFFER = 4096;

		Ery<Int32NObj<byte[]>> ery = new Ery<Int32NObj<byte[]>>();
		try (FileInputStream fileIn = new FileInputStream(f);
				BufferedInputStream bufIn = new BufferedInputStream(fileIn, SIZE_OF_BUFFER);) {

			byte[] bAry;
			int len;

			while ((len = bufIn.read(bAry = new byte[SIZE_OF_BUFFER])) > 0) {

				Int32NObj<byte[]> int32NObj = new Int32NObj<byte[]>(len, bAry);
				ery.a(int32NObj);

			}

			return ery;

		}

	}

}