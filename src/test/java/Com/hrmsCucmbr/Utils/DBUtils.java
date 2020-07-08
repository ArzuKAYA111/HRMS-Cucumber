package Com.hrmsCucmbr.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtils {
	
	private static Connection conn;
	private static Statement  st;
	private static ResultSet rs;
	
/**
 * this method will eatablish a connection with Db/DataBase	
 */
public static void getConnection() {
	try {
		Connection conn=DriverManager.getConnection(ConfigsReader.getProperty("dbUrl"),
				                                   ConfigsReader.getProperty("dbUsername"), 
				                                   ConfigsReader.getProperty("dbPassword") );
	} catch (SQLException e) {
		e.printStackTrace();
	}
}

/**
 * this method will close the connection with Db/DataBase	
 */
public static void closeConnection() {
	
	try {
		if (rs!=null) {
		rs.close();
		}
		
		if (st!=null) {
			st.close();
			}
		
		if (conn !=null) {
			conn.close();
			}
		
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
}


/**
 *    // buna Java Docs deniyormus methodlarin  puspose lari yaziliyor co-workerlar an;asin diye 
 */
}
