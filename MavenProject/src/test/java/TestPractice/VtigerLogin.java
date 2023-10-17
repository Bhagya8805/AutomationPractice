package TestPractice;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utility.ExcelUtility;
import Utility.SeleniumUtil;

public class VtigerLogin extends SeleniumUtil{
	String appUrl;
	String userName;
	String password;
	static int row=1;
	static String expectecTitle;
	static String actualTitle;
	@BeforeMethod
	public void getData() {
		appUrl=ExcelUtility.getCellValue(".\\src\\test\\resources\\Book1.xlsx", "Sheet1", row, 0);
		userName=ExcelUtility.getCellValue(".\\src\\test\\resources\\Book1.xlsx", "Sheet1", row, 1);
		password=ExcelUtility.getCellValue(".\\src\\test\\resources\\Book1.xlsx", "Sheet1", row, 2);
		expectecTitle=ExcelUtility.getCellValue(".\\src\\test\\resources\\Book1.xlsx", "Sheet1", row, 3);
	}
	@Test
	public void testActitimeLogin() {
			setUp("chrome", appUrl);	
			typeInput(driver.findElement(By.id("username")), userName);
			typeInput(driver.findElement(By.name("password")), password);
			clickOnElement(driver.findElement(By.tagName("button")));
			actualTitle=getCurrentPageTitle();
			Assert.assertEquals(actualTitle, "vtiger");
	}
	@AfterMethod
	public void cleanUp1() {
		ExcelUtility.updateExcelContent(".\\src\\test\\resources\\Book1.xlsx", "Sheet1", row, 4,actualTitle);
		if(actualTitle.equals("actiTIME - Enter Time-Track")) {
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\Book1.xlsx", "Sheet1", row, 5,"Passed");
		}else {
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\Book1.xlsx", "Sheet1", row, 5,"failed");
		}
		cleanUp1();
		++row;
	}
}
