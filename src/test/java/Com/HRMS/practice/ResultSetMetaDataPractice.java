package Com.HRMS.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class ResultSetMetaDataPractice {
	//needed informations
	String Username="syntax_hrm";
	String Password="syntaxhrm123";	
	// DbUrl= jdbc:driver Type://hostname:port/database Name

	String dbUrl="jdbc:MySQL://166.62.36.207:3306/syntaxhrm_mysql";
	@Test 
	public void ResultSetMetaData() throws SQLException {
		// I closed connection so I will start from beginning (create Connction)
		
	//1- Create Conecction /Make a connection to the DataBase
		Connection con=DriverManager.getConnection(dbUrl, Username, Password);
	    System.out.println("DB connection is successful");

	//2- Create Statement 
		Statement st=con.createStatement(); 
		
	//3- Execute Queries
		
		String query="select emp_firstname,emp_lastname,job_title\r\n" + 
				" from hs_hr_employees emp left join ohrm_job_title jt\r\n" + 
				" on emp.job_title_code= jt.id\r\n" + 
				" order by emp_lastname";
		ResultSet rs=st.executeQuery(query);
		
	// 4- Process Results / Get Values from result set
		
		String allDatas;
		while(rs.next()){
			allDatas=rs.getObject("emp_firstname").toString();
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
	}





	}


