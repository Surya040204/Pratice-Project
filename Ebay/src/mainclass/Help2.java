package mainclass;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.ebay.pageobjects.HelpPageObjects2;
//import com.ebay.pageobjects.SigninPageObjects;

public class Help2 {

	//declaring the variables globally
	static ExtentHtmlReporter spark;	
	static ExtentReports extent;
	static ExtentTest test;
	private static WebDriver driver;
	static String browser = "Chrome";
@Test
public static void HelpTest() {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\yerram.prakash\\Downloads\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	//opening the Url
	driver.get("https://www.ebay.com/");
	//object creation for the report
	 extent=new ExtentReports();
	//setting path for the extent report
	 spark=new ExtentHtmlReporter("//C:\\Users\\yerram.prakash\\eclipse-main assessment\\Ebay\\reportprakash.html");
	extent.attachReporter(spark);
	 test=extent.createTest("Verify the help and contact functionality");

HelpPageObjects2 helpPageObj = new HelpPageObjects2(driver);
//Clicking on HelpAndContact button
		helpPageObj.clickHelpAndContactButton();
		//Entering in the text box
		helpPageObj.setTextInSearchBox("Get help with an item that hasn't arrived");
				
		driver.close();
		//To erase any previous data on the report and create a new report.
		extent.flush();
}

public static WebDriver getDriver() {
	return driver;
}
public static void setDriver(WebDriver driver) {
	Help2.driver = driver;
}
}