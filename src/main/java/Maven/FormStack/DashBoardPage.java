package Maven.FormStack;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoardPage {
	
	@FindBy(css = "#contentWrap > dashboard > div > dashboard-steps > div.dashboard__steps-head > div.dashboard__steps-head-title > span")
	WebElement pageText;
	
	@FindBy(xpath = "//p[text()='Create a New Form']")
	WebElement createForm; 
	
	@FindBy(id = "formName")
	WebElement formName;
	
	@FindBy(id = "formLanguage")
	WebElement selectLanguage;
	
	
	public void verifyText() {
		pageText.getAttribute("sairam");
	}
	public void createNewform() {
		createForm.click();;
	}
	public void createFormname(String name) {
		formName.sendKeys(name);
	}
	public void clickOnlanguage(String lang) {
		formName.sendKeys(lang);
	}
	  public void goToDashboardHome() {
		  formName.click();
	    }
	public String getPageHeader() {
		// TODO Auto-generated method stub
		return null;
	}
	


}
