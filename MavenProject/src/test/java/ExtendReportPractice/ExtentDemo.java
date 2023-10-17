package ExtendReportPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentDemo {
static ExtentTest test;
static ExtentReports report;
@BeforeClass
public void startTest() {
	report=new ExtentReports(".\\ExtentReport\\ExtentReportResults.html");
	test=report.startTest("ExtentDemo");
}
@Test
public void demo() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in");
	if(driver.getTitle().equals("Google")) {
		test.log(LogStatus.PASS, "Navigated to url");
	}
	else {
		test.log(LogStatus.FAIL, "Failed");
	}
}
@AfterClass
public void endTest() {
	report.endTest(test);
	report.flush();
}
}
