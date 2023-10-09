package TestPractice;

import org.testng.annotations.Test;

import Utility.SeleniumUtil;

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
public class Sample  extends SeleniumUtil{
	@BeforeTest
	public void openUrl() {
		driver= setUp("chrome","https://opensource-demo.orangehrmlive.com/");
		typeInput(driver.findElement(By.name("username")),"Admin");
		typeInput(driver.findElement(By.name("password")),"admin123");
		clickOnElement(driver.findElement(By.className("orangehrm-login-button")));
	}
	@BeforeMethod
	public void clickOnPIM() {
		clickOnElement(driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li[2]//span")));
	}
	@Test
	public void CreatePIM(){
		clickOnElement(driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")));
		typeInput(driver.findElement(By.name("firstName")),"bhagya");
		typeInput(driver.findElement(By.name("lastName")),"shinde12");
		clickOnElement(driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")));

	}


	public void deletePIM() {
		
		clickOnElement(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[9]/div/button[1]/i")));
		clickOnElement(driver.findElement(By.cssSelector(".oxd-button--label-danger.orangehrm-button-margin")));
	}
	@AfterMethod
	
	public void click_onSearch() {
		
		clickOnElement(driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li[2]//span")));
		

		typeInput(driver.findElement(By.xpath("//form/div[1]/div/div[1]/div/div[2]/div/div/input")),"bhagya");
		clickOnElement(driver.findElement(By.xpath("//form/div[2]/button[2]")));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		//clickOnElement(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[1]/div/div/label/span/i")));

	}
	@AfterTest
	public void close() {
		driver.close();
	}
}



