package mainclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.ebay.pageobjects.DealsPageObjects2;

public class Deals2  {

private static WebDriver driver;

@Test
public static void dealsTest() {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\yerram.prakash\\Downloads\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.ebay.com/");

	ExtentReports extent=new ExtentReports();
	ExtentHtmlReporter spark=new ExtentHtmlReporter("//C:\\Users\\yerram.prakash\\eclipse-main assessment\\Ebay\\reportprakash123.html");
	extent.attachReporter(spark);
	ExtentTest test=extent.createTest("Verify the Daily Deals functionality");

DealsPageObjects2 dealsPageObj = new DealsPageObjects2 (driver);

		dealsPageObj.clickDailyDealsButton();
		dealsPageObj.clickTechButton();		
		driver.close();
		extent.flush();
}

public static WebDriver getDriver() {
	return driver;
}
public static void setDriver(WebDriver driver) {
	Deals2.driver = driver;  }
}
		