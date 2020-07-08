package Com.HRMS.practice;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class MetaDataPractice {
//needed informations
String Username="syntax_hrm";
String Password="syntaxhrm123";	
// DbUrl= jdbc:driver Type://hostname:port/database Name

String dbUrl="jdbc:MySQL://166.62.36.207:3306/syntaxhrm_mysql";



@Test
public void metaData() throws SQLException {
//1-Create Conecction /Make a connection to the DataBase
	//to make connection use DriverManager Class getConnection() method 
	
	Connection con= DriverManager.getConnection(dbUrl, Username, Password);
//	System.out.println("DB connection is successful");
//for DataBaseMetaData we do not need to create other steps like create statement etc.
//	After connection we can create DataBaseMetaData object base on connection
	
	DatabaseMetaData dbMetDat=con.getMetaData();
//now I can get information about my database	
	
//	System.out.println("Are all tables Selectable :: "+ dbMetDat.allTablesAreSelectable());
//	System.out.println("Database Major Version is :: "+ dbMetDat.getDatabaseMajorVersion());
//	System.out.println("Database Minor Version is :: "+ dbMetDat.getDatabaseMinorVersion());
//	System.out.println("Database Product Name is :: "+ dbMetDat.getDatabaseProductName());
//	System.out.println("Database Product Version is :: "+ dbMetDat.getDatabaseProductVersion());
//	System.out.println("Database Driver Name is :: "+ dbMetDat.getDriverName());
//	System.out.println("Database Driver Version is :: "+ dbMetDat.getDriverVersion());
//	System.out.println("JDBC Major Version is :: "+ dbMetDat.getJDBCMajorVersion());
//	System.out.println("Database Max Connections are ::"+ dbMetDat.getMaxConnections());
//	System.out.println("SQL State Type is :: "+ dbMetDat.getSQLStateType());
//	System.out.println("Database Url is :: "+ dbMetDat.getURL());
//	System.out.println("Database User Name is :: "+ dbMetDat.getUserName());
//	System.out.println("Database Connection is :: "+ dbMetDat.getConnection());
//	System.out.println("Database Table Types are :: "+ dbMetDat.getTableTypes());
//	System.out.println("Database does support UnionAll :: "+ dbMetDat.supportsUnionAll());
	
	//con.close();
	//System.out.println("connection is closed");
	
}

// now practice ResultSetMetaData

@Test 
public void ResultSetMetaData() throws SQLException {
	// I closed connection so I will start from beginning (create Connction)
	
//1- Create Conecction /Make a connection to the DataBase
	Connection con=DriverManager.getConnection(dbUrl, Username, Password);
    System.out.println("DB connection is successful");

//2- Create Statement 
	Statement st=con.createStatement(); 
	
//3- Execute Queries
	
	String query="Select* from hs_hr_emp_dependents";
	ResultSet rs=st.executeQuery(query);
	
// 4- Process Results / Get Values from result set
	
	String allDatas;
	while(rs.next()){
		allDatas=rs.getObject("ed_name").toString();
		System.out.println(allDatas);
		
	}
	
	java.sql.ResultSetMetaData rsMetData=rs.getMetaData();
	int colCount=rsMetData.getColumnCount();
	System.out.println("There are "+ colCount +" columns in table ");
	
	
	for (int i=1;i<=colCount; i++) {
		
		System.out.println("Column Name " +i +"= "+rsMetData.getColumnName(i));	
	}
	
   for (int i=1;i<=colCount; i++) {
	
		System.out.println("Column type " +i +"= "+rsMetData.getColumnType(i));	
		
	}

   for (int i=1;i<=colCount; i++) {
		
	System.out.println("Column Table Name " +i +"= "+rsMetData.getTableName(i));	
	
}
 //5-Close Connection
   rs.close();
   st.close();
   con.close();
   
}




}
