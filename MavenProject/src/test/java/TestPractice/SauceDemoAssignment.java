package TestPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utility.SeleniumUtil;

public class SauceDemoAssignment extends SeleniumUtil{
	@Test(priority=0)
	public void loginToSauceDemo() {
		//1.login into application by fetching username and password from UI
		driver=setUp("chrome", "https://www.saucedemo.com/inventory.html");
		typeInput(driver.findElement(By.id("user-name")),"standard_user");
		typeInput(driver.findElement(By.id("password")),"secret_sauce");
		clickOnElement(driver.findElement(By.id("login-button")));

	}

	@Test(priority=1)
	public void addProductToCart() {

		//2.add product into cart and keep there names for future validation
		//3.click on cart
		//4.validate product names with step-2
		//5. click on checkout


		String addedProductName1=driver.findElement(By.cssSelector("#item_4_title_link>.inventory_item_name")).getText();
		String addedProductName2=driver.findElement(By.cssSelector("#item_0_title_link>.inventory_item_name")).getText();
		clickOnElement(driver.findElement(By.id("add-to-cart-sauce-labs-backpack")));
		clickOnElement(driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")));
		clickOnElement(driver.findElement(By.className("shopping_cart_link")));

		String cartProductName1=driver.findElement(By.cssSelector("#item_4_title_link>div")).getText();
		String cartProductName2=driver.findElement(By.cssSelector("#item_0_title_link>div")).getText();
		
		
		//System.out.println("Validation Of product1: "+addedProductName1.equals(cartProductName1));
		Assert.assertEquals(addedProductName1, cartProductName1,"Cart product missmathced");
		//System.out.println("Validation Of product2: "+addedProductName2.equals(cartProductName2));
		Assert.assertEquals(addedProductName2, cartProductName2,"Cart product missmathced");

		clickOnElement(driver.findElement(By.id("checkout")));


	}
	@Test(priority=2)
	public void enterNameAndZipcode() {

		//6. enter name and zipcode
		//7. click on continue button
		//8. click on finish
		typeInput(driver.findElement(By.id("first-name")),"Bhagyashri");
		typeInput(driver.findElement(By.id("last-name")),"Shinde");
		typeInput(driver.findElement(By.id("postal-code")),"412307");

		clickOnElement(driver.findElement(By.id("continue")));
		clickOnElement(driver.findElement(By.id("finish")));
	}


	@Test(priority=3)
	public void validateSuccessMessage() {

		//9. validate success msg
		//10. click on home button and validate home page*/
		String expectedSuccesfulMsg="Thank you for your order!";
		String actualSuccesfulMsg=driver.findElement(By.cssSelector(".complete-header")).getText();
		
		Assert.assertEquals(expectedSuccesfulMsg, actualSuccesfulMsg,"Order not placed");
		//System.out.println("Validation Of Succesful msg: "+expectedSuccesfulMsg.equals(actualSuccesfulMsg));
		clickOnElement(driver.findElement(By.cssSelector(".btn.btn_primary.btn_small")));
		
		String expectedHomepageTitle="Swag Labs";
		String actualHomePageTitle=driver.getTitle();
	
		Assert.assertEquals(expectedHomepageTitle, actualHomePageTitle,"Succesfully back to home page");
		//System.out.println("Validation Of HomePage: "+expectedHomepageTitle.equals(actualHomePageTitle));
	}
}
