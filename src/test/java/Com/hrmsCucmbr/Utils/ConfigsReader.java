package Com.hrmsCucmbr.Utils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigsReader {

	public static Properties prop;
	/**
	 * This method will read properties file
	 * 
	 * @param filePath
	 */
	
	public static void readProperties(String filePath) { // create a method to read properties file

                                                         // Write logic part to read properties file and add try catch blocks for exceptions	
try {
	FileInputStream fis = new FileInputStream(filePath);
	
	prop = new Properties();
	
	prop.load(fis);
	
    fis.close();
            
	} catch (FileNotFoundException e) {
	      e.printStackTrace();

    } catch (IOException e) {
      e.printStackTrace();
}	}
                                                         // Create a method to get values 
	/**
	 * This method will return value of specified key
	 * @param  String key
	 * @return String value
	 */
public static String  getProperty(String key) {
	
//Write logic part to get keys 
	
	return prop.getProperty(key);
	
}

	
}


