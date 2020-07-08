package Com.HRMS.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class RetriveJobTitles {
String dbUsername="syntax_hrm";
	
	String dbPassword ="syntaxhrm123";
	
	// jdbc:drive type :hostname: port/db name
	String dbUrl="jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";
	
	
	
	//retreive all the job titles and store them in arraylist and show it in console it from arraylist
	
	
		@Test
		public void ListTask() throws SQLException {
			Connection conn=DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
			System.out.println("DB connection is successful");
			
			Statement st=conn.createStatement(); // importing from javaSql
	
			
			ResultSet rs=st.executeQuery("select *from  ohrm_job_title"); // copy the select query from SQL
			
			List<String> jobTitles= new ArrayList<>();
			while(rs.next()) {
				jobTitles.add(rs.getObject("Job_title").toString());
				
			}
			
			System.out.println(jobTitles);
			
			for (String jt:jobTitles) {
				System.out.println(jt);
				
			}
			
			rs.close();
			st.close();
			conn.close();
			
			
			
			
		
	}

}
