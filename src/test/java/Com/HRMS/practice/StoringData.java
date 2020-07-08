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

import org.junit.Ignore;
import org.junit.Test;

public class StoringData {
	String Username="syntax_hrm";
	String Password="syntaxhrm123";
	String dbUrl="jdbc:MySQL://166.62.36.207:3306/syntaxhrm_mysql";
	
	@Test
	public void getAndStoreData() throws SQLException {
	Connection con=DriverManager.getConnection(dbUrl, Username, Password);
	 System.out.println("DB connection is successful");
	 
	 Statement st=con.createStatement();
	 
	 ResultSet rs=st.executeQuery("Select id,name,country_code from ohrm_location");
	 
	    List<Map<String,String>> listOfData=new ArrayList<>();
	    Map<String,String> mapData;//=new LinkedHashMap<>();// burada initialize yapip iceride yapmazsak map e overriding yapacak ve en son yaptigini id=40 olanin bilgilerini hepsine basacak
	                                                      //Basically we want same key but different values so we need to initialize  
	    while(rs.next()){
		   mapData=new LinkedHashMap<>();// we initialize inside loop because we want to create  a new  map for each unique key
		   mapData.put("Location id", rs.getObject("id").toString());
		   mapData.put("Office name", rs.getObject("name").toString());
		   mapData.put("Country code", rs.getObject("Country_code").toString());
		   listOfData.add(mapData); //Storing our map inside our list
	   System.out.println(mapData);
	    }
	
	  System.out.println(listOfData);    
	  rs.close();
	  st.close();
	  con.close();
	}
	//we can use @Ignore before @Test for the first test in order to disable/ignore the test.// bu ne demek dene ve anla 
	
	
	@Test
	public void retrieveAndStoreDataEnhanced() throws SQLException {
		System.out.println("***********  Second Test Starting ************");
	Connection con=DriverManager.getConnection(dbUrl, Username, Password);
	 System.out.println("DB connection is successful");
	 
	 Statement st=con.createStatement();
	 
	 ResultSet rs=st.executeQuery("Select * from ohrm_job_title");
	
	ResultSetMetaData rsMetaData=rs.getMetaData();
	
	List<Map<String,String>> listData=new ArrayList<>();
    Map<String,String> mapData;

    while(rs.next()){
		   mapData=new LinkedHashMap<>();
		   for (int i=1 ;i<=rsMetaData.getColumnCount();i++) {
			   mapData.put(rsMetaData.getColumnName(i),rs.getObject(i).toString() ); 
			  // System.out.println(mapData);  
			   
		   }
		   
		  listData.add(mapData); //Storing our map inside our list
	    }
	System.out.println("     ");
	  System.out.println(listData);    
	  
	}
    
    
}
	

