package Com.HRMS.practice;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
public class JDBCDemo {

	// ( to find hostname,port and dbName we go to sql and click to home, then
	// click to mySqlConnection settings in homePage, there we will find hostname and portNumber,
	// we will find dbName by enetering to database we can copy database name from
	// here :.....> syntaxhrm_mysql

	String dbUsername = "syntax_hrm";
	String dbPassword = "syntaxhrm123";

	// jdbc:drive type :hostname: port/db name ...> Syntax of DataBase URL
	String dbUrl = "jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";

	@Test // this annotation “test” will execute the case

	public void abc() throws SQLException {

//1. Create a connection to the Database

		Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);// import Connection from javaSQL
		System.out.println("DB connection is successful");
		System.out.println(conn); // I added
//2. Create Statement

		Statement st = conn.createStatement(); // importing from javaSql

//3. Execute Queries

		ResultSet rs = st.executeQuery("select * from hs_hr_employees");
		// System.out.println(rs); // I added

// 4. Process Results / get values from resultSet	
		rs.next();// return us boolean if there is next data
		System.out.println(rs.next());

		String firstName = rs.getString("emp_firstname"); // we pass column name " emp_firstname " in method

		System.out.println(firstName);
		rs.next();

		String firstname2 = rs.getObject("emp_firstname").toString();
		System.out.println(firstname2);

		// we will use while loop because we dont know how many times we will loop
		String allData;
		while (rs.next()) {
			// allData=rs.getObject("Emp_firstname").toString(); not case sensetive we can
			// use capital letter or lower case / Emp_firstname"
			allData = rs.getObject("emp_firstname").toString();
			System.out.println(allData);

//5- Close Connection     (Bridge) between eclipse and  database Why we close connection why we need close //memory leakage maybe? 

//			rs.close();
//			st.close();
//			conn.close();	
		}

	}

//retreive all the job titles and store them in arraylist and show it in console it from arraylist
	@Test
	public void ListTask() throws SQLException {
		Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		System.out.println("DB connection is successful");

		Statement st = conn.createStatement(); // importing from javaSql

		ResultSet rs = st.executeQuery("select *from  ohrm_job_title");

		List<String> jobTitles = new ArrayList<>();
		while (rs.next()) {
			jobTitles.add(rs.getObject("Job_title").toString());

		}
		System.out.println(jobTitles);

		for (String jt : jobTitles) {
			System.out.println(jt);
		}
		rs.close();
		st.close();
		conn.close();
	}
}
