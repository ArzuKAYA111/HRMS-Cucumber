package Com.hrmsCucmbr.Utils;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;
import org.openqa.selenium.support.ui.WebDriverWait;

import Com.HRMS.testbase.PageInitializer;
                               // TO SEE ALL METHODS  CNTRL  +  O 
public class CommonMethods extends PageInitializer {

/** 1-
 * 	Method That clears and Send Keys to All Text Boxes
 * @param element
 * @param text
 */
		
public static void sendText(WebElement element, String text) {
			
	
	
			element.clear();
			element.sendKeys(text);

		}


/** 2-
 * Method checks if radio/checkbox is enabled and click radio button or check boxes 
 * @param radioOrcheckbox
 * @param value
 */
public static void clickRadioOrCheckbox(List<WebElement> radioOrcheckbox,String value) {
	
	String actualValue;
	
	for(WebElement el:radioOrcheckbox) {
		actualValue=el.getAttribute("value").trim();
		if(actualValue.equals(value)) {
			el.click();
			break;
		}
	}
	
}









/**3-
 * This method gets the table row values
 * @param element
 */
public static void Tablerows(List<WebElement> element) {
	
	List<WebElement> rows = element;

	Iterator<WebElement> it = rows.iterator();

	while (it.hasNext()) {//Loop through rows while there is next element
	String	rowText = it.next().getText();//go to the next element and get text of it.
	
		System.out.println(rowText);
	}
}


/**4-
 * this method gets the table colms values
 * @param element
 */
	public static  void Tablecolms(List<WebElement> element) {
  
	List<WebElement> cols = element;
	
	//retrieve the elements of cols list
	for (WebElement col : cols) {
	String colText=col.getText();//get text of each cell.
		System.out.println(colText);
	}}
	
	public void handlingTable(List<WebElement> rows ,List<WebElement> cols ) {
		
//	List<WebElement> rows = driver.findElements(By.xpath("//div[contains(@class, 'su-table')]/table/tbody/tr"));
//	int rowNums = rows.size();
//	System.out.println("Total row number is " + rowNums);
//
//	List<WebElement> cols = driver.findElements(By.xpath("//div[contains(@class, 'su-table')]/table/tbody/tr[1]/td"));
//	int colNums = cols.size();
//	System.out.println("Total number of cols is " + colNums);

	for (int i = 1; i <= rows.size(); i++) {
		for (int j = 1; j <= cols.size(); j++) {
			WebElement cellData = driver.findElement(By.xpath("//div[contains(@class, 'su-table')]/table/tbody/tr[" + i + "]/td[" + j + "]"));
			String cellDataText = cellData.getText();
			//System.out.println(cellDataText);
			
			if(j == 2) {
				System.out.println("colmnTwo.."+cellDataText);
			}
		}
		System.out.println("....");
	}
	}
	
	
	
	
	
	
	
	
	
	
	
//	public void clickTableElement(String expectedElement, List<WebElement> tableData) {
//		boolean flag = false;
//		while (!flag) {
//			for (int i = 1; i < tableData.size(); i++) {
//				String cellData = tableData.get(i - 1).getText();
//				if (cellData.equals(expectedElement)) {
//					flag = true;
//					BaseClass.driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + i + "]/td[3]/a")).click();
//					break;
//				}
//			}

	
	
	
	
	
	
	
	
	

/**5-
 * Method that check Drop Down if a specific text is there and then select it
 * @param element
 * @param textToSelect
 */
public static void selectDdValue(WebElement element,String textToSelect) {
	
	try {// To eliminate exception we used try catch block We wrote our logic in try catch block 
		
	Select select=new Select(element);
	List<WebElement> options=select.getOptions();
	 
	for(WebElement el:options) {
		
		if(el.getText().equals(textToSelect)) {
			select.selectByVisibleText(textToSelect);
			break;
		}
      }
		
	}catch(UnexpectedTagNameException e) {
		e.printStackTrace();
		
	}
}
/**6-
 * Method that check Drop down if a specific index is there and then select it
 * @param element
 * @param index
 */
//public static void selectDdValue(WebElement element, int index)	{
//	
//	try {// To eliminate exception we used try catch block We wrote our logic in try catch block 
//		
//		Select select=new Select(element);
//		int size = select.getOptions().size();
//		
//			if(size>index) {
//				select.selectByIndex(index);
//		}
//			
//		}catch(UnexpectedTagNameException e) {
//			e.printStackTrace();
//		
//		}
//}


public static void selectDdValue(WebElement element, int index)	{//  Benim Yaptigim Drop Down By index methodu
	
	try {// To eliminate exception we used try catch block We wrote our logic in try catch block 
		
		Select select=new Select(element);
		int size = select.getOptions().size(); 
		List<WebElement> optionsindx=select.getOptions();
		
		for (int i=1; i<=size;i++) {                       
			
			if (index<=optionsindx.size()) {
				select.selectByIndex(index);
				break;
			}
		}
		
		}catch(UnexpectedTagNameException e) {
			e.printStackTrace();
		
		}
}
// HM try to create method ByValue
/**7-
 *Method that check Drop down if a specific Value  is there and then select it Select Drop Down By Value 
 * @param element
 * @param value
 */
public static void selectDdByValue(WebElement element,String value) {// bu methodu ben yaptim Select Drop Down By Value 
	
	try {
		
	Select select=new Select(element);
	List<WebElement> options=select.getOptions();
	 
	for(WebElement el:options) {
		
		if(el.getText().equals(value)) {
			select.selectByValue("value");
			break;
		}
      }
		
	}catch(UnexpectedTagNameException e) {
		e.printStackTrace();
		
	}
}




/**8-
 * methods that accept alerts and catches exception if alert is not present
 */

public static void acceptAlert() {
	
	try {
	Alert  alert = driver.switchTo().alert();
	alert.accept();
	
}catch(NoAlertPresentException e) {
	e.printStackTrace();
}

}
/**9-
 * methods that dismiss alerts and catches exception if alert is not present
 * @return
 */
public static void dismissAlert() {
	try {
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
	}catch(NoAlertPresentException e) {
		e.getStackTrace();
	}
}
/**10-
 * methods that get text of  alert and catches exception if alert is not present
 * @return
 */
public static String getAlertText() {
	String alertText=null;
	try {
		Alert alert=driver.switchTo().alert();
		alertText=alert.getText();
	}catch(NoAlertPresentException e) {
		e.getStackTrace();
	}
	return alertText;
}
/**11-
 * methods that get text of  alert and catches exception if alert is not present
 * @return
 */

		public static void SendAlertText(String text) {
			try {
				Alert alert= driver.switchTo().alert();
				alert.sendKeys(text);
				
			}
			catch(NoAlertPresentException e) {
				e.printStackTrace();
		}
		}
	/**12-
	 * method that is  used to switch to Frame by name or id 
	 * @param nameOrid
	 */
	public static void switchToFrame(String nameOrid) {
		try {
			
			driver.switchTo().frame(nameOrid);	
		}catch(NoSuchFrameException e) {
			e.getStackTrace();
		}
		
	}
	/**13-
	 * method that is  used to switch to Frame by WebElement
	 * @param nameOrid
	 */
	public static void  switchToFrame(WebElement element) {
try {
			
			driver.switchTo().frame(element);	
		}catch(NoSuchFrameException e) {
			e.getStackTrace();
		}

	}
	/** 14- 
	 * method that is  used to switch to Frame by index
	 * @param nameOrid
	 */
	public static void  switchToFrame(int index) {
		try {
					
					driver.switchTo().frame(index);	
				}catch(NoSuchFrameException e) {
					e.getStackTrace();
				}

			}
	/**15
	 * Method switches focus to child window
	 */
	public static void switchToChildWindow() {
	
	String mainWindow=driver.getWindowHandle();
	
	Set<String >windows=driver.getWindowHandles();
	
	for (String window :windows) {
		
		if (!window.equals(mainWindow)) {
			
			driver.switchTo().window(window);
			break;
			
		}
	}
}
	
	
	
	
	/**16-
	 * Methods for EXplicit Wait
	 * @return wait
	 */
	public static WebDriverWait getWaitObject() {
		WebDriverWait wait=new WebDriverWait(driver,Constants.EXPLICIT_WAIT_TIME);
	
		return wait;
	}
	
	
	
	/**17-
	 * 
	 * @param element
	 * @return 
	 */
	
	public static WebElement WaitForClickability(WebElement element) {
	
	return getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
		
	}
	/**
	 * 18-
	 * Wait for element to visibility
	 * 
	 * @param element
	 * @return
	 */
	
	public static WebElement waitForVisibilityOfElemet(WebElement element) {
		
		return getWaitObject().until(ExpectedConditions.visibilityOf(element));
		
	}

	
	/**19-
	 * 
	 * @param element
	 */
	public static void click(WebElement element) {
	
	getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
	WaitForClickability(element);
	element.click();
	}
	/**20-
	 * 
	 * @return js
	 */
	public static JavascriptExecutor getJSObject() {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		return js;
	}
	
	/**21-
	 * 
	 * @param element
	 */
	public static void  jsClick(WebElement element){
		getJSObject().executeScript("arguments[0].click();", element);
	}
	
	/**22-
	 * 
	 * @param element
	 */
	public static void scrollToElement(WebElement element) {
		getJSObject().executeScript("arguments[0].scrollIntoView(true);", element);
	
	
}
	/**23-
	 * Method that will scroll the page down based on the passed pixel parameters
	 * @param pixel
	 */
	public static void scrollDown(int pixel) {
		getJSObject().executeScript("window.scrollBy(0,"+pixel+")");
	}
	
		/**24-
		 *  Method that will scroll the page up based on the passed pixel parameters
		 * @param pixel
		 */
		public static void scrollUp(int pixel) {
			getJSObject().executeScript("window.scrollBy(0,-"+pixel+")");
			
		}
		
		/**25-
		 * This Method will take a screenshot
		 * 
		 * @param filename
		 */
		public static byte[] takeScreenshot(String filename) {
			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[] picBytes=ts.getScreenshotAs(OutputType.BYTES);
			
			
			
			File file = ts.getScreenshotAs(OutputType.FILE);
			String destinationFile=Constants.SCREENSHOT_FILEPATH + filename+ getTimeStemp()+ ".png";
			
			try {
				FileUtils.copyFile(file, new File(destinationFile));
			} catch (Exception ex) {
				System.out.println("Cannot take screenshot!");
			}
			return picBytes;
		}
		
 public static String getTimeStemp() {
	Date date=new Date();
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
	
	return sdf.format(date.getTime());
	
}
		
		
		
		/**26-
		 * method wait for specific seconds
		 * @param second
		 * @throws InterruptedException
		 */
	public static void wait(int second) {
	
			try {
				Thread.sleep(second*1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}					

	
	}
	
/**-
 * method gets data from exel and store into list of map
 */
//	public static void fromExcelToMap() {
//		
//		
//	String filePath = System.getProperty("user.dir") + "\\src\\test\\resources\\Excel\\HRMSdata.xlsx";
//	
//	FileInputStream fis;
//	
//	try {
//		fis = new FileInputStream(filePath);
//	} catch (FileNotFoundException e) {
//		
//		e.printStackTrace();
//	}
//
//	 Workbook book;
//	try {
//		book = new XSSFWorkbook(fis);
//	} catch (IOException e) {
//		
//		e.printStackTrace();
//	}
//	Sheet sheet = book.getSheet("Sheet1");
//	
//	int rows=sheet.getPhysicalNumberOfRows();
//	int cols =sheet.getRow(0).getLastCellNum();
//	
//	List<Map<String, String>> listMap=new ArrayList<>();
//	
//	for(int r=1; r<rows; r++) {
//		
//		Map<String, String> map=new LinkedHashMap<>();
//		
//		for(int c=0; c<cols; c++) {
//			
//			String key=sheet.getRow(0).getCell(c).toString();
//			String value=sheet.getRow(r).getCell(c).toString();
//			map.put(key, value);
//		}
//		
//		listMap.add(map);	
//	}
//	System.out.println(listMap);
//
//}
	
	/**
	 * meyhod reads excel file data 
	 * 
	 */
//	public static void readExel() {
//		
//
//		String filePath = System.getProperty("user.dir") + "\\src\\test\\resources\\Excel\\HRMSdata.xlsx";
//
//		FileInputStream fis;
//		try {
//			fis = new FileInputStream(filePath);
//		} catch (FileNotFoundException e) {
//			
//			e.printStackTrace();
//		}
//
//		// get an Object of Workbook type
//		Workbook book;
//		try {
//			book = new XSSFWorkbook(fis);
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
//		Sheet sheet = book.getSheet("Sheet1");
//
//		// need to find numbers or rows
//		int rows = sheet.getPhysicalNumberOfRows();
//		
//System.out.println(rows);
//
//		// find number of columns
//		int cols = sheet.getRow(0).getLastCellNum();  
//		
//System.out.println(cols);
//
//		// get data from all rows and all columns
//		for (int r = 0; r < rows; r++) {// iterates over rows
//			for (int c = 0; c < cols; c++) {// iterates over cols
//				String cellVal = sheet.getRow(r).getCell(c).toString();
//				
//				System.out.print(cellVal + "  ");
//			}
//			System.out.println();
//			System.out.println();
//		}
//	}
//		
//		
	
	
	
	
	
	
	
}

