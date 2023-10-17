package OrangeHRMWEbpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.SeleniumUtility;

public class DeleteEmployeePage  extends SeleniumUtility{
	
	public DeleteEmployeePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//form/div[1]/div/div[1]/div/div[2]/div/div/input")
	private WebElement employeeInfo;
	
	@FindBy(css=".oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space")
	private WebElement searchButton;
	
	@FindBy(css=".oxd-icon-button.oxd-table-cell-action-space")
	private WebElement deleteButton;
	
	@FindBy(css=".oxd-button.oxd-button--medium.oxd-button--label-danger.orangehrm-button-margin")
	private WebElement confirmdeleteButton;
	

	

	
	
	//TODO: if you need individual object in your script dn create getter method for your private WebElement
	
	public void deleteEployee() {
	
		typeInput(employeeInfo,"Bhagyashri");
		clickOnElement(searchButton);
		clickOnElement(deleteButton);
		clickOnElement(confirmdeleteButton);

	


}
}
