package mainclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.ebay.pageobjects.BuyPageObjects3;

public class Buy3 {

private static WebDriver driver;

@Test
public static void BuyTest() throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\yerram.prakash\\Downloads\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.ebay.com/");

	ExtentReports extent=new ExtentReports();
	ExtentHtmlReporter spark=new ExtentHtmlReporter("//C:\\Users\\yerram.prakash\\eclipse-main assessment\\Ebay\\reportprakash123.html");
	extent.attachReporter(spark);
	ExtentTest test=extent.createTest("Verify the Buy module functionality");

BuyPageObjects3 buyPageObj = new BuyPageObjects3 (driver);

		buyPageObj.clickBuyButton();
		buyPageObj.clickSportingGoodsButton();
		buyPageObj.clickSportsTradingCardsAndAccessoriesButton();
		
		driver.close();
		extent.flush();
}
public static WebDriver getDriver() {
	return driver;
}

public static void setDriver(WebDriver driver) {
	Buy3.driver = driver;
}
}