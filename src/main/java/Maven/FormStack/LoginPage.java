package Maven.FormStack;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	@FindBy(id="email")
	WebElement usernameLoc;

	@FindBy(id="password") 
	WebElement passwordLoc;

	@FindBy(id="submit") 
	WebElement submitLoc;

	@FindBy(css="h1.login-box--head")
	WebElement pageHeader;

	@FindBy(css="span.google-text")
	WebElement signInWithGoogle;

	@FindBy(css="#loginForm > div > div.login-box.login-box--marketing.col-1-2.col-centered > div > div > div > div.login-form > div > div.fs-indicators__title")
	WebElement errorTitle;


	public void FsLogin(String uname, String pass) {
		usernameLoc.sendKeys(uname);
		passwordLoc.sendKeys(pass);
		submitLoc.click();
	}
/*	public void getPageHeader() {
		pageHeader.getText();
	}*/
	public void clickForgotPasswordLink() {
		signInWithGoogle.click();
	}

	public void getLoginErrorTitle() {
		errorTitle.getText();
		System.out.println(errorTitle.getText());
	}
	public String getPageHeader() {
		// TODO Auto-generated method stub
		return null;
	}

}
