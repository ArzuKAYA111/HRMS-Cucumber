package Com.hrmsCucmbr.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/**
 *    // buna Java Docs deniyormus methodlarin  puspose lari yaziliyor co-workerlar an;asin diye 
 */
public class DBUtils {
	
	private static Connection conn;
	private static Statement  st;
	private static ResultSet rs;
	private static List<Map<String,String>> listData;
/**
 * this method will eatablish a connection with Db/DataBase	
 */
public static void getConnection() {
	try {
		 conn=DriverManager.getConnection(ConfigsReader.getProperty("dbUrl"),ConfigsReader.getProperty("dbUsername"), ConfigsReader.getProperty("dbPassword") );
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
/**
 * This method will execute the query and store the data inside the list of maps 
 * by the given sql query
 * 
 * @param sqlQuery
 * @retur   <....List<Map<String,String>> listData  / retuns us data list
 */

public static List<Map<String,String>> storeDataFromDB(String sqlQuery){
	
	try {
		getConnection();
		st=conn.createStatement();
		rs=st.executeQuery(sqlQuery);
		ResultSetMetaData rsMetaData=rs.getMetaData();
		 listData=new ArrayList<>();
		 
		while(rs.next()) {
			Map<String,String> mapData=new LinkedHashMap<>();
			for (int i=1 ; i<=rsMetaData.getColumnCount();i++) {
				mapData.put(rsMetaData.getColumnName(i), rs.getObject(i).toString());
			}
			listData.add(mapData);
		}
		
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	return listData; 
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
