package OrangeHRMWEbpages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.SeleniumUtility;

public class UpdateEmployeeDetailsPage  extends SeleniumUtility{
	
	public UpdateEmployeeDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	
	@FindBy(name="middleName")
	private WebElement MiddleName;

	
	@FindBy(xpath="//form/div[2]/button")
	private WebElement saveButton;
	
	
	//TODO: if you need individual object in your script dn create getter method for your private WebElement
	
	public void updateEployeeinfo(String middleName) {
	
	

		typeInput(MiddleName,middleName);
		clickOnElement(saveButton);
			
		}

}
