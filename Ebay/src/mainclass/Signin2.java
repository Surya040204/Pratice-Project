package mainclass;


import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.ebay.pageobjects.SigninPageObjects2;

public class Signin2 {

	//declaring the variables globally
	static ExtentHtmlReporter spark;	
	static ExtentReports extent;
	static ExtentTest test;
	private static WebDriver driver;
	static String browser = "Chrome";

@Test
public static void Sign_inTest() throws IOException, InterruptedException{

System.setProperty("webdriver.chrome.driver", "C:\\Users\\yerram.prakash\\Downloads\\chromedriver_win32\\chromedriver.exe");        
//object creation for the report
 extent=new ExtentReports();
//setting path for the extent report
 spark=new ExtentHtmlReporter("//C:\\Users\\yerram.prakash\\eclipse-main assessment\\Ebay\\reportprakash.html");
extent.attachReporter(spark);
 test=extent.createTest("Verify the Business Account functionality ");

String excelPath = "C:\\main assessment\\Ebay\\data1\\Testdata.xlsx.xlsx";
XSSFWorkbook workbook=new XSSFWorkbook(excelPath);
XSSFSheet sheet=workbook.getSheet("Sheet2");

//path of data from the excel the sheet
int rowcount=sheet.getPhysicalNumberOfRows();
String[][] data1=new String[4][3];
System.out.println(rowcount);

for(int i=1;i<rowcount-1;i++)
{
data1[i][0]=sheet.getRow(i).getCell(0).getStringCellValue();
System.out.println(data1[i][0]);

data1[i][1]=sheet.getRow(i).getCell(1).getStringCellValue();
System.out.println(data1[i][1]);

data1[i][2]=sheet.getRow(i).getCell(2).getStringCellValue();
System.out.println(data1[i][2]);

  		 driver = new ChromeDriver();
  		//opening the Url
  		 driver.get("https://www.ebay.com/");
  		 System.out.println("Title is:"+driver.getTitle());
   		 SigninPageObjects2 signInPageObj = new SigninPageObjects2(driver);

   	//Clicking on SignIn button
        signInPageObj.clickSignInButton();
      //Clicking on CreateanAccount button
        signInPageObj.clickCreateanAccountButton();
        //Clicking on BusinessAccount button
        signInPageObj.clickBusinessAccountButton();
        //Getting data from excel
        signInPageObj.setTextInbusinessname(data1[i][0]);
        //Getting data from excel
        signInPageObj.setTextInbusinessEmail(data1[i][1]);
        //Getting data from excel
        signInPageObj.setTextInbusinessPassword(data1[i][2]);
        //Clicking on Register button
        signInPageObj.clickRegister();
        
        driver.close(); 
}
//To erase any previous data on the report and create a new report.
        extent.flush();
}

public static WebDriver getDriver() {
	return driver;
}

public static void setDriver(WebDriver driver) {
	Signin2.driver = driver;
}

}