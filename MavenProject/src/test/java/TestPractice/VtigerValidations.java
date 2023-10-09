package TestPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utility.SeleniumUtil;


public class VtigerValidations extends SeleniumUtil {
	@Test
	public void login() {
		WebDriver driver=setUp("Chrome","https://demo.vtiger.com/vtigercrm/index.php");
		typeInput(driver.findElement(By.id("username")),"Admin");
		typeInput(driver.findElement(By.id("password")),"admin");
		clickOnElement(driver.findElement(By.tagName("button")));
	}
	@Test(priority=1)
	public void createTask() {
		clickOnElement(driver.findElement(By.cssSelector("#appnavigator>div")));
		clickOnElement(driver.findElement(By.xpath("//span[text()=' MARKETING']")));
		clickOnElement(driver.findElement(By.xpath("//span[text()=' Leads']")));
		clickOnElement(driver.findElement(By.id("Leads_listView_basicAction_LBL_ADD_RECORD")));
		typeInput(driver.findElement(By.id("Leads_editView_fieldName_lastname")),"Joshi");
		clickOnElement(driver.findElement(By.cssSelector(".saveButton")));

		WebElement leads=driver.findElement(By.cssSelector(".text-uppercase"));
		leads.click();

	}
	@Test(priority=2)
	public void updateTask() {
		typeInput(driver.findElement(By.xpath("//th/div/input[@name='lastname']")),"Joshi");
		clickOnElement(driver.findElement(By.cssSelector(".s2-btn-text")));
		clickOnElement(driver.findElement(By.cssSelector("#Leads_listView_row_1 > td.listViewRecordActions > div > span.input > input")));
		clickOnElement(driver.findElement(By.cssSelector("#Leads_listView_massAction_LBL_EDIT > i")));
		typeInput(driver.findElement(By.id("Leads_editView_fieldName_firstname")),"Bhagyashri");
		clickOnElement(driver.findElement(By.cssSelector(".btn.btn-success.saveButton")));
		WebElement leads=driver.findElement(By.cssSelector(".text-uppercase"));
		leads.click();
	}
}