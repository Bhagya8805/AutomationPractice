package GoogleWebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Utility.SeleniumUtility;

public class GoogleSearchPage extends SeleniumUtility {

	public GoogleSearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String searchedPageTitle() {
		return getCurrentTitleOfApplication();
	}
}