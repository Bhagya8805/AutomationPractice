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

public class Assignment extends SeleniumUtil{
	@BeforeTest
	public void precondition() {
		driver=setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
		typeInput(driver.findElement(By.name("username")),"Admin");
		typeInput(driver.findElement(By.name("password")),"admin123");
		clickOnElement(driver.findElement(By.className("orangehrm-login-button")));

	}

	@BeforeMethod
	public void click_PIM() {
		clickOnElement(driver.findElement(By.xpath("//ul/li[2]/a")));

	}
	@Test
	public void createPimUser(){
		//Create User

		clickOnElement(driver.findElement(By.xpath("//div/div[2]/div[1]/button")));


		clickOnElement(driver.findElement(By.xpath("//div[1]/div[2]/div[2]/div/label/span")));
		typeInput(driver.findElement(By.xpath("//input[@name=\"firstName\"]")),"Bhagyashri");
		typeInput(driver.findElement(By.xpath("//input[@name=\"lastName\"]")),"Shinde");
		typeInput(driver.findElement(By.xpath("//form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input")),"Shri@1234");
		typeInput(driver.findElement(By.xpath("//form/div[1]/div[2]/div[4]/div/div[1]/div/div[2]/input")),"Shinde@123");
		typeInput(driver.findElement(By.xpath("//form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input")),"Shinde@123");
		clickOnElement(driver.findElement(By.xpath("//form/div[2]/button[2]")));

		waitUntilElementIsVisible(driver.findElement(By.cssSelector(".oxd-toast-content oxd-toast-content--success")));

	}
/*	@Test
	public void UpdatePimUser() {



		//Update Details

		clickOnElement(driver.findElement(By.xpath("//div[2]/div/div/div[9]/div/button[2]")));
		typeInput(driver.findElement(By.name("middleName")),"Subhash");
		clickOnElement(driver.findElement(By.xpath("//form/div[2]/button")));

	}*/
	@Test
	public void DeletePimUser() {
		//Delete Details

		clickOnElement(driver.findElement(By.xpath("//div[9]/div/button[1]/i")));
		clickOnElement(driver.findElement(By.xpath("//div[3]/button[2]")));

	}
	@AfterMethod
	public void click_onSearch() {
	
		clickOnElement(driver.findElement(By.xpath("//ul/li[2]/a")));

		typeInput(driver.findElement(By.xpath("//form/div[1]/div/div[1]/div/div[2]/div/div/input")),"Bhagyashri");
		clickOnElement(driver.findElement(By.xpath("//form/div[2]/button[2]")));
		clickOnElement(driver.findElement(By.xpath("//div[2]/div/div/div[1]/div/div/label/span/i")));

	}
	@AfterTest
	public void close() {
		driver.close();
	}
}
