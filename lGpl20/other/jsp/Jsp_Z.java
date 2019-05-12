package lGpl20.other.jsp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.TreeMap;

import lGpl20.o.ery.Ery;
import lGpl20.o.str.S;

/**
 * @version 2019/04/24_21:50:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=Jsp_Z" >Jsp_Z.java</a>
 * 
 * @see Jsp
 */
public abstract class Jsp_Z extends Jsp_Y {

	private static final Class<Jsp_Z> CLASS_THIS = Jsp_Z.class;

	protected static final long serialVersionUID = genInt64AsId(CLASS_THIS.getCanonicalName());

	/**
	 * To insert data into table.<br/>
	 * To insert data into table.
	 * 
	 * @throws SQLException
	 */
	public static boolean insertIntoTable(Connection conn, String nameOfTable, TreeMap<String, String> mapOfParam)
			throws SQLException {

		S str = new S();// important
		str.a("INSERT INTO" + S32 + nameOfTable + S40);

		Ery<String> eryOfKey = new Ery<String>(mapOfParam.keySet());

		for (int i = 0, lenMinus1 = eryOfKey.len() - 1; i <= lenMinus1; i++) {

			String key = eryOfKey.at(i);

			if (i < lenMinus1) {

				str.a(key + S44);

			} else {

				str.a(key);

			}

		}

		str.a(S41 + "VALUES" + S40 + S39);// important

		for (int i = 0, lenMinus1 = eryOfKey.len() - 1; i <= lenMinus1; i++) {

			String key = eryOfKey.at(i);
			String value = mapOfParam.get(key);

			if (i < lenMinus1) {

				str.a(value + S39 + S44 + S39);

			} else {

				str.a(value + S39);

			}

		}

		str.a(S41);// important

		// l(str);

		try (Statement statement = conn.createStatement();) {

			return statement.execute(str.str.toString());

		}

	}

	/**
	 * From MapOfParam to arg.<br/>
	 * From MapOfParam to arg.
	 * 
	 * @throws SQLException
	 */
	public static PreparedStatement toPreparedStatementToInsert(Connection conn, String nameOfTable, Ery<String> eryOfParam)
			throws SQLException {

		S str = new S();// important
		str.a("INSERT INTO" + S32 + nameOfTable + S40);

		for (int i = 0, lenMinus1 = eryOfParam.len() - 1; i <= lenMinus1; i++) {

			String key = eryOfParam.at(i);

			if (i < lenMinus1) {

				str.a(key + S44);

			} else {

				str.a(key);

			}

		}

		str.a(S41 + "VALUES" + S40);

		for (int i = 0, lenMinus1 = eryOfParam.len() - 1; i <= lenMinus1; i++) {

			if (i < lenMinus1) {

				str.a(S63 + S44);

			} else {

				str.a(S63);

			}

		}

		str.a(S41);// important

		// l(str);

		return conn.prepareStatement(str.str.toString());

	}

	/**
	 * To delete data before.<br/>
	 * To delete data before.
	 * 
	 * @throws SQLException
	 */
	public static boolean delDataBef(Connection conn, String tableName, String colName, String stringbound) throws SQLException {

		try (Statement statement = conn.createStatement();) {

			String sql = "DELETE FROM " + tableName + " WHERE " + colName + " < '" + stringbound + "'";
			// l("sql=" + sql + S32 + CLASS_THIS);

			return statement.execute(sql);

		}

	}

}