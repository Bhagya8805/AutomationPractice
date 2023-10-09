package TestPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class OrangeHrmPIM2 extends SeleniumUtil{
	@BeforeTest
	public void login_Orange() {

		WebDriver driver=setUp("chrome","https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		typeInput(driver.findElement(By.name("username")),"Admin");
		typeInput(driver.findElement(By.name("password")),"admin123");
		clickOnElement(driver.findElement(By.className("orangehrm-login-button")));
	}
	@BeforeMethod
	public void login_CreatePimUser(){
		//Create User
		clickOnElement(driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li[2]//span")));
		clickOnElement(driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")));
		typeInput(driver.findElement(By.name("firstName")),"bhagya");
		typeInput(driver.findElement(By.name("lastName")),"shinde112");
		clickOnElement(driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")));

	}
	@Test(priority=1)
	public void UpdatePimUser() {
	
		

		//Update Details
		clickOnElement(driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li[2]//span")));

		typeInput(driver.findElement(By.xpath("//form/div[1]/div/div[1]/div/div[2]/div/div/input")),"bhagya");
		clickOnElement(driver.findElement(By.xpath("//form/div[2]/button[2]")));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		clickOnElement(driver.findElement(By.cssSelector(".oxd-icon.bi-pencil-fill")));
		typeInput(driver.findElement(By.name("middleName")),"Subhash");
		clickOnElement(driver.findElement(By.xpath("//form/div[2]/button")));

	}
	@Test(priority=2)
	public void UpdatePimUser2() {
	
		

		//Update Details
		clickOnElement(driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li[2]//span")));

		typeInput(driver.findElement(By.xpath("//form/div[1]/div/div[1]/div/div[2]/div/div/input")),"bhagya");
		clickOnElement(driver.findElement(By.xpath("//form/div[2]/button[2]")));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		clickOnElement(driver.findElement(By.cssSelector(".oxd-icon.bi-pencil-fill")));
		typeInput(driver.findElement(By.name("middleName")),"Subhash");
		clickOnElement(driver.findElement(By.xpath("//form/div[2]/button")));

	}
	@AfterMethod
	public void DeletePimUser() {
		//Delete Details
		clickOnElement(driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li[2]//span")));
		typeInput(driver.findElement(By.xpath("//form/div[1]/div/div[1]/div/div[2]/div/div/input")),"bhagya");
		clickOnElement(driver.findElement(By.xpath("//form/div[2]/button[2]")));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		clickOnElement(driver.findElement(By.cssSelector(".oxd-icon-button.oxd-table-cell-action-space")));
		clickOnElement(driver.findElement(By.cssSelector(".oxd-button.oxd-button--medium.oxd-button--label-danger.orangehrm-button-margin")));

	}
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
	
}
