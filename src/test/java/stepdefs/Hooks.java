package stepdefs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Ticker;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	public static WebDriver driver;
	public static ExtentReports report =new ExtentReports("HtmlExtentReport.html",false);
	public static ExtentTest test;
	@Before
	public void setUp(Scenario Scenario) {
		driver=new ChromeDriver();
		test=report.startTest(Scenario.getName());
		//report=new ExtentReports("", null)
	}
	@After
	public void tearDown() {
		driver.quit();
		report.endTest(test);
		report.close();
	}
}
