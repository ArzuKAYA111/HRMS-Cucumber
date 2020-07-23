package Com.HRMS.testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import Com.hrmsCucmbr.Utils.ConfigsReader;
import Com.hrmsCucmbr.Utils.Constants;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass { // Create testClass In different Package to see if we test in other package we
							// need to import this class
	public static WebDriver driver;


	public static WebDriver setUp() {
		// create reader path to property file

		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");
         ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);
        
         String headless=ConfigsReader.getProperty("headless"); // we add ' headless =true ' in config
        
         switch (ConfigsReader.getProperty("browser").toLowerCase()) {
		case "chrome":

			WebDriverManager.chromedriver().setup();
			ChromeOptions cOptions=new ChromeOptions();
			
			if(headless.equalsIgnoreCase("true")){        //   we add this cOption parts for using Jenkins 
			cOptions.setHeadless(true);
			driver=new ChromeDriver(cOptions);
			
			}else{                      
				driver=new ChromeDriver(cOptions);// bunu buraya koyduktan sonra browser acilmadan code calisiyor test yaparken 
			                                     // This is ChromeBrowser Headless mode 
				                                 // we can write like cOptions codes for other repositories instead of ChromeOptions cOptions=new ChromeOptions(); we will use 
	}                                           //FirefoxOptions fOptions=new FirefoxOptions(); sonradan tamamla
			driver = new ChromeDriver();
			break;

		case "firefox":
WebDriverManager.firefoxdriver().setup();
			
			driver = new FirefoxDriver();
			break;
		default:

			throw new RuntimeException("Browser is not supported");
		}

		driver.manage().window().maximize();// we added to do page full
		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);

		driver.get(ConfigsReader.getProperty("url"));

		// initialize all page objects as part of setup
		PageInitializer.initialize();

		return driver;
	}

	public static void tearDown() {// To close page

		if (driver != null) {
			driver.quit();
		}
	}
}
