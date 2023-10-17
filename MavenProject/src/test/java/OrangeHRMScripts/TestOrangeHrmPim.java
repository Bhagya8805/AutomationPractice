package OrangeHRMScripts;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import OrangeHRMWEbpages.*;


public class TestOrangeHrmPim extends Utility.SeleniumUtility{
	OrangeHRM_LoginPage getLoginPage;
	HomePage getHomePage;
	OrangeHRM_PIMPage getPimHomePage;
	AddEmployeePage getAddEmployeePage;
	@BeforeMethod
	public void precondition() {
		WebDriver driver=setUp("chrome", "https://opensource-demo.orangehrmlive.com/");
		getLoginPage=new OrangeHRM_LoginPage(driver);
		getHomePage=new HomePage(driver);
		getPimHomePage=new OrangeHRM_PIMPage(driver);
		getAddEmployeePage=new AddEmployeePage(driver);
		getLoginPage.loginInOrangeHrmApplication("Admin", "admin123");
		getHomePage.clickOnPIM();
	}
	@Test
	public void createPIM() {
		getPimHomePage.clickOnAddButton();
		getAddEmployeePage.createEmployee("Bhagyashri", "Shinde", 3399);
		getHomePage.clickOnPIM();
		getPimHomePage.searchCreatedEmployee(3399);
	
	}
	@Test(dependsOnMethods="createPIM")
	public void editPIM() {
		getHomePage.clickOnPIM();
		getPimHomePage.searchCreatedEmployee(3399);
		getPimHomePage.editCreatedEmployee("Subhash");
	}
	
	@Test(dependsOnMethods="createPIM")
	public void deletePIM() {
		getHomePage.clickOnPIM();
		getPimHomePage.searchCreatedEmployee(3399);
		getPimHomePage.deleteCreatedEmployee();
		
	}
	@AfterMethod
	public void postcondition() {
		getHomePage.logout();
		cleanUp();
	}
}