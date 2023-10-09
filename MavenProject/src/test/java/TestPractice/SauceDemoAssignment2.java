package TestPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utility.SeleniumUtil;

public class SauceDemoAssignment2 extends SeleniumUtil{
	@Test(priority=0)
	public void loginToSauceDemo() {
		//1.login into application by fetching username and password from UI
		driver=setUp("chrome", "https://www.saucedemo.com/inventory.html");
		typeInput(driver.findElement(By.id("user-name")),"standard_user");
		typeInput(driver.findElement(By.id("password")),"secret_sauce");
		//clickOnElement(driver.findElement(By.id("login-button")));
System.out.println(driver.findElement(By.cssSelector("#login_credentials>h4")).getAttribute("h4"));
	}

	
}
