package Com.HRMS.practice;

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

import org.junit.Test;

public class enhanceDataStoring {
	String Username="syntax_hrm";
	String Password="syntaxhrm123";
	String dbUrl="jdbc:MySQL://166.62.36.207:3306/syntaxhrm_mysql";
	
	@Test 
	public void storeData() throws SQLException {
		
	Connection conn=DriverManager.getConnection(dbUrl,Username,Password);
		Statement st=conn.createStatement();
		String query="select* from ohrm_language";
		
		ResultSet rs=st.executeQuery(query);
		ResultSetMetaData rsMetaDeata=rs.getMetaData();
		List<Map<String, String>> listData=new ArrayList<>();
		Map<String, String> mapData;
	                                          	
		
		 while(rs.next()){                       //While loop is for rows amd for loop for columns
			   mapData=new LinkedHashMap<>();
			   for (int i=1 ;i<=rsMetaDeata.getColumnCount();i++) {
				   mapData.put(rsMetaDeata.getColumnName(i), rs.getObject(i).toString());
		
	}
			   listData.add(mapData);	   			   	   
   }
	System.out.println(listData);	 
	
     }
}
	
	

