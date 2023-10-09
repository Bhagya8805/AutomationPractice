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

public class OrangeHrmPIM4 extends SeleniumUtil{
	@BeforeTest
	public void login_Orange() {

		WebDriver driver=setUp("chrome","https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		typeInput(driver.findElement(By.name("username")),"Admin");
		typeInput(driver.findElement(By.name("password")),"admin123");
		clickOnElement(driver.findElement(By.className("orangehrm-login-button")));
	}
	@BeforeMethod
	public void click_OnPIM(){

		clickOnElement(driver.findElement(By.xpath("//ul[@class='oxd-main-menu']/li[2]//span")));
	}
	@Test
	public void create_PIMUser(){
		clickOnElement(driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")));
		typeInput(driver.findElement(By.name("firstName")),"bhagya");
		typeInput(driver.findElement(By.name("lastName")),"shinde112");
		clickOnElement(driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")));

	}
	@Test(dependsOnMethods="create_PIMUser")
	public void update_PimUser() {

		typeInput(driver.findElement(By.xpath("//form/div[1]/div/div[1]/div/div[2]/div/div/input")),"bhagya");
		clickOnElement(driver.findElement(By.cssSelector(".oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space")));
		
		clickOnElement(driver.findElement(By.cssSelector(".oxd-icon.bi-pencil-fill")));
		typeInput(driver.findElement(By.name("middleName")),"Subhash");
		clickOnElement(driver.findElement(By.xpath("//form/div[2]/button")));

	}
	/*@Test(dependsOnMethods="update_PimUser")
	public void delete_PIMUser() {
		
		typeInput(driver.findElement(By.xpath("//form/div[1]/div/div[1]/div/div[2]/div/div/input")),"bhagya");
		clickOnElement(driver.findElement(By.xpath("//form/div[2]/button[2]")));


		clickOnElement(driver.findElement(By.cssSelector(".oxd-icon-button.oxd-table-cell-action-space")));
		clickOnElement(driver.findElement(By.cssSelector(".oxd-button.oxd-button--medium.oxd-button--label-danger.orangehrm-button-margin")));

	}
	/*@AfterMethod
	public void search_OnPIM() {


		typeInput(driver.findElement(By.xpath("//form/div[1]/div/div[1]/div/div[2]/div/div/input")),"bhagya");
		clickOnElement(driver.findElement(By.xpath("//form/div[2]/button[2]")));
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
	}*/

}
