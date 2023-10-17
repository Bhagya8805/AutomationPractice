package SauceDemoWebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.SeleniumUtility;
public class SauceDemo_DashboardPage extends SeleniumUtility{
	
	public SauceDemo_DashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	private WebElement productOne;
	
	
	@FindBy(css="#item_4_title_link > div")
	private WebElement cartProductName1;
	
	@FindBy(id="add-to-cart-sauce-labs-bike-light")
	private WebElement productTwo;
	
	@FindBy(css="#item_0_title_link > div")
	private WebElement cartProductName2;

	@FindBy(className="shopping_cart_link")
	private WebElement cartProduct;


	
	//TODO: if you need individual object in your script dn create getter method for your private WebElement
	
	public void cartProduct() {
		clickOnElement(productOne);
		clickOnElement(productTwo);
		String product1=getTextFromElement(cartProductName1);
		String product2=getTextFromElement(cartProductName2);
		
		clickOnElement(cartProduct);
		
		
	}
}