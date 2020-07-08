package Com.HRMS.practice;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class Recap {
	String Username="syntax_hrm";
	String Password="syntaxhrm123";
	String dbUrl="jdbc:MySQL://166.62.36.207:3306/syntaxhrm_mysql";
	@Test
	public void getConnected() throws SQLException {
	Connection con=DriverManager.getConnection(dbUrl, Username, Password);
	 System.out.println("DB connection is successful");
	 
	 DatabaseMetaData dbMetaData=con.getMetaData();
	String daDriverName= dbMetaData.getDriverName();
	String dbName= dbMetaData.getDatabaseProductName();
	System.out.println("Driver Name "+daDriverName);
	System.out.println("dbName "+dbName);
	
	
	Statement st=con.createStatement();
	
	ResultSet rs=st.executeQuery("Select * from ohrm_skill");
	
	ResultSetMetaData rsMetaData=rs.getMetaData();
	int colCount=rsMetaData.getColumnCount();
	System.out.println(colCount);
	
	for(int i=1 ; i<=colCount; i++) {
		System.out.println("Column name "+ i + " is "+ rsMetaData.getColumnName(i));
		
	}
	
	
	while(rs.next()) {
		String name = rs.getObject("name").toString();
		String id = rs.getObject("id").toString();
		System.out.println(id+" =  "+name);
	}
	
	
	
	 rs.close();
	   st.close();
	   con.close();
	
	
	
	
	
}}
