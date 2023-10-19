package OrangeHRMWEbpages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import Utility.SeleniumUtility;

public class UpdateEmployeeDetailsPage  extends SeleniumUtility{
	
	public UpdateEmployeeDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	
	@FindBy(css="div.orangehrm-tabs > div:nth-child(6) > a")
	private WebElement job;
	
	@FindBy(css="div:nth-child(2) > div > div > div.oxd-select-text--after > i")
	private WebElement jobTitle;

	@FindBys(@FindBy(css=".oxd-select-dropdown.--positon-bottom>div"))
	private List<WebElement> jobElements;
	
	@FindBy(css="button[type='submit']")
	private WebElement saveButton;
	
	
	//TODO: if you need individual object in your script dn create getter method for your private WebElement
	
	public void updateEployeeinfo(String jobtitle) {

		
		clickOnElement(job);
		clickOnElement(jobTitle);
		clickOnElement(jobElements.get(2));
		clickOnElement(saveButton);
		}

}
