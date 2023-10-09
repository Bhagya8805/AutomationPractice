package TestPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utility.SeleniumUtil;


public class ActitimeValidations3 extends SeleniumUtil {
	
		@BeforeMethod
		public void precondition() {
			driver=setUp("chrome", "https://demo.actitime.com/login.do");	
			System.out.println("I am before method ....");
		}
		@Test(priority=1)
		public void testUsernameInputField() {
			System.out.println("TC1 is running....");
			WebElement usernameInputField=driver.findElement(By.id("username"));
			Assert.assertTrue(usernameInputField.isDisplayed(),"Either username input field not visible or locator changed");
		}
		@Test(priority=2)
		public void testCheckbox() {
			System.out.println("TC2 is running....");
			WebElement checkBox=driver.findElement(By.id("keepLoggedInCheckBox"));
			Assert.assertFalse(checkBox.isSelected(),"Either check box is already selected or not available in the page");
		}
		@Test(priority=3)
		public void testActitime_validData() {	
			System.out.println("TC3 is running....");
			typeInput(driver.findElement(By.id("username")),"admin");
			typeInput(driver.findElement(By.name("pwd")),"manager");
			clickOnElement(driver.findElement(By.id("loginButton")));
			String expectedHomePageTitle="actiTIME - Enter Time-Track";
			String actualHomePageTitle=getCurrentPageTitle("actiTIME - Enter Time-Track");
			//Assert.assertEquals(actualHomePageTitle, expectedHomePageTitle);
			Assert.assertEquals(actualHomePageTitle, expectedHomePageTitle,"Either login failed or home page title changed");
		}
		@AfterMethod
		public void postCondition() {
			driver.close();
			System.out.println("I am after method ....");
		}
	}