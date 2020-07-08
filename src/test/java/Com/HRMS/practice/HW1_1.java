package Com.HRMS.practice;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
public class HW1_1 {
	// HW get the resultSet metadata store it in the arraylist and retrieve it from arraylist 
    // also get column type name get the table names  // we can use any tables we want 
	String dbUserName="syntax_hrm";
	String dbPassword ="syntaxhrm123";
	String dbUrl="jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";
@Test 
	public void rsMetaData() throws SQLException {
//1- create connection
		Connection con=DriverManager.getConnection( dbUrl, dbUserName, dbPassword);
// 2- create Statement 
		Statement st=con.createStatement();
// 3- Execute Queries 
		ResultSet rs=st.executeQuery("select * from ohrm_nationality where name like 'A%'  ");
// 4 Process Results 
		ResultSetMetaData rsMetadata= rs.getMetaData();
	
		String TabName=rsMetadata.getTableName(1);
		System.out.println("Table name :: " + TabName);
		
		int colType = rsMetadata.getColumnType(1);
		System.out.println("column Type "+ colType);
		
		int colNumber=rsMetadata.getColumnCount();
		System.out.println("column number:: " +colNumber);
		
		for ( int i= 1 ; i<=colNumber; i++){
		
		String ColNames=rsMetadata.getColumnName(i);
		System.out.println("column name :"+ColNames);
}	                                                                                                    System.out.println("           ");
// 1 way  retreive array list
		List<String> languages = new ArrayList<>();
		
		while (rs.next()) {
			
			languages.add(rs.getObject("name").toString());
		}
	
	System.out.println(languages);
	                                                                                                  System.out.println("           ");
// 2 way retreive one by one 
	
	for (String langNames:languages) {
		System.out.println(langNames);
	}
	// 5- Close Connection 
				rs.close();
				st.close();
				con.close(); 
}}
