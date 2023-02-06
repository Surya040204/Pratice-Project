package mainclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.ebay.pageobjects.HelpPageObjects3;

public class Help3 {

private static WebDriver driver;

@Test
public static void HelpTest() {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\yerram.prakash\\Downloads\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.ebay.com/");

	ExtentReports extent=new ExtentReports();
	ExtentHtmlReporter spark=new ExtentHtmlReporter("//C:\\Users\\yerram.prakash\\eclipse-main assessment\\Ebay\\reportprakash.html");
	extent.attachReporter(spark);
	ExtentTest test=extent.createTest("Verify the help and contact functionality");

HelpPageObjects3 helpPageObj = new HelpPageObjects3(driver);


		helpPageObj.clickHelpAndContactButton();
		helpPageObj.setTextInSearchBox("Get help with a hacked account");

		driver.close();
		extent.flush();
}

public static WebDriver getDriver() {
	return driver;
}
public static void setDriver(WebDriver driver) {
	Help3.driver = driver;   }
}
		