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

public class TaskSToringData {
	// display the information from nationality table, 
		//but display id “nationality id”, name = “nationality”
	
	String Username="syntax_hrm";
	String Password="syntaxhrm123";
	String dbUrl="jdbc:MySQL://166.62.36.207:3306/syntaxhrm_mysql";
	
	@Test
	public void getgetAndStoreData() throws SQLException {
	Connection con=DriverManager.getConnection(dbUrl, Username, Password);
	 System.out.println("DB connection is successful");
	 
	 Statement st=con.createStatement();
	 
	 ResultSet rs=st.executeQuery("Select *from ohrm_nationality");
	 
	 ResultSetMetaData rsMetaData=rs.getMetaData();
	 
	 List<Map<String,String>> listData=new ArrayList<>();
	    Map<String,String> mapData;
		
	    while(rs.next()){
			   mapData=new LinkedHashMap<>();
			   for (int i=1 ;i<=rsMetaData.getColumnCount();i++) {
				if(rsMetaData.getColumnName(i).equalsIgnoreCase("id")) {
					mapData.put("Nationality id",rs.getObject(i).toString() );  
				}else if(rsMetaData.getColumnName(i).equalsIgnoreCase("name")) {
	
					mapData.put("Nationality ",rs.getObject(i).toString() );   
				}
						
				//System.out.println(mapData);	// for one by one 	print
			   }
			   
			  listData.add(mapData); //Storing our map inside our list
		    }
		System.out.println(" inside list     ");
		  System.out.println(listData);    
		  
		}
}
