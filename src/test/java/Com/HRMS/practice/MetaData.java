package Com.HRMS.practice;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class MetaData {

	String dbUsername = "syntax_hrm";

	String dbPassword = "syntaxhrm123";

	// jdbc:drive type :hostname: port/db name
	String dbUrl = "jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";

	@Test
	public void dbMetaData() throws SQLException {

		Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);

		DatabaseMetaData dbMetaData = conn.getMetaData();// it will return us meta data

		String driverName = dbMetaData.getDriverName();

		String dbVersion = dbMetaData.getDatabaseProductVersion();
		String dbProductName = dbMetaData.getDatabaseProductName();
		String dbStringFunctions = dbMetaData.getStringFunctions();
		String dbURL = dbMetaData.getURL();
		String dbUserName = dbMetaData.getUserName();
		Object dbSQLStateType = dbMetaData.getSQLStateType();
	
System.out.println("Driver name is "+ driverName);// buradaki bazi bilgileri manuel olarak mySQL workbench te sol alt tarafta Object info ve yaninda Session yazan yerden bulabiliyoruz 
System.out.println("DataBase name is " +dbVersion);
System.out.println("Product Name is "+dbProductName);
System.out.println("db String Functions is "+dbStringFunctions);
System.out.println("dbURL is "+dbURL);
System.out.println("db UserName is "+dbUserName);
System.out.println("db SQL State Type is "+dbSQLStateType);
	}

	// query - display all the info about employee whose emp_number is 14688
	@Test
	public void rsMetaData() throws SQLException {
// 1-create connection
		Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);

// 2- create statement 
		Statement st = conn.createStatement();

//3. Execute Queries
		ResultSet rs = st.executeQuery("select * from hs_hr_employees where emp_number=14688 ");

// 4. Process Results
		ResultSetMetaData rsMetadata = rs.getMetaData();

		int colNumbers = rsMetadata.getColumnCount();
		// rsMetadata.// burada cikan methodlari dene

		System.out.println(colNumbers);
		String colName1 = rsMetadata.getColumnName(1);
		System.out.println(colName1);

		for (int i = 1; i <= colNumbers; i++) {
			String ColNames = rsMetadata.getColumnName(i);
			System.out.println(ColNames);
		}
		for (int i = 1; i <= colNumbers; i++) {
			System.out.println(rsMetadata.getColumnType(i));		
		}
		for (int i = 1; i <= colNumbers; i++) {	
			System.out.println(rsMetadata.getColumnTypeName(i));	
		}
		for (int i = 1; i <= colNumbers; i++) {	
			System.out.println(rsMetadata.getTableName(i));
			System.out.println(rsMetadata.isNullable(i));
			System.out.println(rsMetadata.isWritable(i));
			
		}
		for (int i = 1; i <= colNumbers; i++) {	
			System.out.println(rsMetadata.isNullable(i));
		}
		for (int i = 1; i <= colNumbers; i++) {	
			System.out.println(rsMetadata.isWritable(i));
			
		}
	}
}
//HW get the resultSet metadata store it in the arraylist and retrieve it from
			// arraylist
			// also get column type name get the table names
			// we can use any tables we want
