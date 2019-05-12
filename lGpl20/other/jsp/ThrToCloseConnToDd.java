package lGpl20.other.jsp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import lGpl20.o.O;

/**
 * 本類別關閉資料庫連線的執行緒.<br/>
 * <br/>
 * The thread to close database connection.
 * 
 * @version 2015/05/01_07:47:00<br/>
 *          <a target="_blank" href="http://c64.tw/w20/o/searchDataOfSrc.jsp?nameOfClass=ThrToCloseConnToDd" >ThrToCloseConnToDd
 *          .java</a>
 * 
 */
public class ThrToCloseConnToDd extends Thread {

	private static final Class<ThrToCloseConnToDd> CLASS_THIS = ThrToCloseConnToDd.class;

	protected static final long serialVersionUID = O.genInt64AsId(CLASS_THIS.getCanonicalName());

	private final ResultSet RESULT_SET;

	private final Statement STATEMENT;

	private final Connection CONNECTION;

	/**
	 * 關閉連線.<br/>
	 * To close connection.
	 */
	public static void close(ResultSet resultSet, Statement statement, Connection conn) throws Throwable {

		if (resultSet != null && !resultSet.isClosed()) {

			resultSet.close();

		}

		if (statement != null && !statement.isClosed()) {

			statement.close();

		}

		if (conn != null && !conn.isClosed()) {

			conn.close();

		}

	}

	/**
	 * 關閉連線.<br/>
	 * To close.
	 */
	public static void close(Statement statement, Connection conn) throws Throwable {

		close(null, statement, conn);

	}

	/**
	 * 建構方法.<br/>
	 * Constructor.
	 */
	public ThrToCloseConnToDd(ResultSet resultSet, Statement statement, Connection conn) {

		RESULT_SET = resultSet;
		STATEMENT = statement;
		CONNECTION = conn;

	}

	/**
	 * 建構方法.<br/>
	 * Constructor.
	 */
	public ThrToCloseConnToDd(Statement statement, Connection conn) {

		this(null, statement, conn);

	}

	@Override
	public void run() {

		try {

			close(RESULT_SET, STATEMENT, CONNECTION);
			// O.l("to close" + O.S32 + CLASS_THIS);

		} catch (Throwable throwable) {

			throwable.printStackTrace();

		}

	}

}