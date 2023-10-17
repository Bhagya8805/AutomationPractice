package SauceDemoTestScripts;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utility.SeleniumUtility;
import SauceDemoWebPages.*;
public class TestScripts extends SeleniumUtility{


	WebDriver driver;
	SauceDemoLoginPage getLoginPage;
	SauceDemo_DashboardPage getdashboardPage;
	SauceDemo_CartPage getCartPage;
	CheckOutInfoPage getInfoPage;
	FinishPage getfinishclick;
	CompletePage backhome;

	@BeforeTest
	public void precondition() {
		driver=setUp("chrome", "https://www.saucedemo.com/inventory.html");
		getLoginPage=new SauceDemoLoginPage(driver);
		getdashboardPage=new SauceDemo_DashboardPage(driver);
		getCartPage=new SauceDemo_CartPage(driver);
		getInfoPage=new CheckOutInfoPage(driver);
		getfinishclick =new FinishPage(driver);
		backhome=new CompletePage(driver);
		getLoginPage.loginApplication("standard_user", "secret_sauce");		
	}
	
		@Test
		public void addProductToCart() {
			getdashboardPage.cartProduct();
			getCartPage.checkOut();
			getInfoPage.continueButton("Bhagyashri", "Shinde", "412307");
			getfinishclick.finishClick();
			backhome.backToHome();
		}
		
		@AfterTest
		public void postCondition() {
			cleanUp();
		}
}

