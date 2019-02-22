package Maven.FormStack;


import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.Test;

public class LandingPage {

	WebDriver driver;

	@FindBy(id = "site-links__button")
	WebElement trtItfree;

	@FindBy(xpath = "//*[@id='navigation']/li[7]/a")
	WebElement pricing;

	@FindBy(css = "h2.fbds-headline.fbds-headline-large")
	WebElement pricingText;

	@FindBy(css = "#top-toggle > div > div > div > div > label")
	WebElement toggleSwitch;

	@FindBy(css = "#plan-table > div:nth-child(1) > div.fbds-column-table__button > a")
	WebElement bronzeOption;

	@FindBy(css = "a[rel='nofollow']")
	WebElement loginLink;

	public  LandingPage(WebDriver driver) {

		this.driver = driver;
	}
	public void clickTryitfree() {
		
		trtItfree.click();
		driver.navigate().back();
	}
	public void pricingOptions() {
		
		pricing.click();
	}
	public void verifyPricingText(){
		
		String userName = pricingText.getText();
		System.out.println(pricingText.getText());
	}
	public void ClickToggleSwitch() {
		
		toggleSwitch.click();
	}

	public void clickBronzeoption() {
		
		bronzeOption.click();
		int numberOfwindows = driver.getWindowHandles().size();

		System.out.println(numberOfwindows);
		Set<String> allWindows = driver.getWindowHandles();
		ArrayList<String> tabs = new ArrayList<String>(allWindows);

	/*	driver.switchTo().window(tabs.get(2));

		driver.close();

		driver.switchTo().window(tabs.get(1));

		driver.close();*/

		driver.navigate().to("https://www.formstack.com");

		System.out.println("the title of the window is:" + driver.getTitle());
	}

	public void clickLoginLink() {

		loginLink.click();
	}
	
	








}

