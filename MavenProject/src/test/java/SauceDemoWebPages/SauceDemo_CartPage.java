package SauceDemoWebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.SeleniumUtility;

public class SauceDemo_CartPage extends SeleniumUtility {
	
	public SauceDemo_CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

	/*@FindBy(css="#item_4_title_link > div")
	private WebElement actualcartProductName1;

	@FindBy(css="item_0_title_link>div")
	private WebElement actualcartProductName2;*/
	
	@FindBy(id="checkout")
	private WebElement checkOut;
	
	//TODO: if you need individual object in your script dn create getter method for your private WebElement
	
	public void checkOut() {
	
		clickOnElement(checkOut);
		//String cartproduct1=getTextFromElement(actualcartProductName1);
		//String cartProduct2=getTextFromElement(actualcartProductName2);
	}
}
