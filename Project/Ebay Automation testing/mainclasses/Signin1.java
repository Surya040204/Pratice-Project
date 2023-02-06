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
import com.ebay.pageobjects.SigninPageObjects1;

public class Signin1 {

private static WebDriver driver;

@Test
public void sign_inTest() throws IOException, InterruptedException{

System.setProperty("webdriver.chrome.driver", "C:\\Users\\yerram.prakash\\Downloads\\chromedriver_win32\\chromedriver.exe");
ExtentReports extent=new ExtentReports();
ExtentHtmlReporter spark=new ExtentHtmlReporter("//C:\\Users\\yerram.prakash\\eclipse-main assessment\\Ebay\\reportSignin1.html");
extent.attachReporter(spark);
ExtentTest test=extent.createTest("Verify the Signing in functionality");// here we have to give of extent report
   String excelPath = "C:\\main assessment\\Ebay\\data1\\Testdata.xlsx.xlsx";
   XSSFWorkbook workbook=new XSSFWorkbook(excelPath);
   XSSFSheet sheet=workbook.getSheet("Sheet1");
   
   int rowcount=sheet.getPhysicalNumberOfRows();
   String[][] data1=new String[4][4];
   System.out.println(rowcount);
   
   for(int i=1;i<rowcount-1;i++)
   {
   data1[i][0]=sheet.getRow(i).getCell(0).getStringCellValue();
   System.out.println(data1[i][0]);
   
   data1[i][1]=sheet.getRow(i).getCell(1).getStringCellValue();
   System.out.println(data1[i][1]);
   
   data1[i][2]=sheet.getRow(i).getCell(2).getStringCellValue();
   System.out.println(data1[i][2]);
   
   data1[i][3]=sheet.getRow(i).getCell(3).getStringCellValue();
   System.out.println(data1[i][3]);
   
   driver = new ChromeDriver();
   driver.get("https://www.ebay.com/");
   System.out.println("Title is:"+driver.getTitle());

SigninPageObjects1 signInPageObj = new SigninPageObjects1(driver);

        signInPageObj.clickSignInButton();
        signInPageObj.clickCreateanAccountButton();
        signInPageObj.clickPersonalAccountButton();
        signInPageObj.setTextInfirstname(data1[i][0]);
        signInPageObj.setTextInlastname(data1[i][1]);
        signInPageObj.setTextInEmail(data1[i][2]);
        signInPageObj.setTextInPassword(data1[i][3]);
        
        driver.close(); 
}
   extent.flush();
}
public static WebDriver getDriver() {
	return driver;
}
public static void setDriver(WebDriver driver) {
	Signin1.driver = driver;
}
} 











