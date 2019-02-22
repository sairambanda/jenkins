package Maven.FormStack;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCasesPage {

	public WebDriver driver = null;
	LandingPage landingPage;
	LoginPage login;
	DashBoardPage dashBoardpage;

	@BeforeTest
	public void initialize() throws IOException{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\win10\\Documents\\Automation\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.formstack.com/");
	}
	
	@Test
	public void landingPage() {
		landingPage = PageFactory.initElements(driver, LandingPage.class);
		landingPage.clickTryitfree();
		landingPage.pricingOptions();
		landingPage.verifyPricingText();
		landingPage.ClickToggleSwitch();
		landingPage.clickBronzeoption();
		landingPage.clickLoginLink();
		
	}
	/*@Test(priority = 2)
	public void login() {
		
		login = PageFactory.initElements(driver, LoginPage.class);;
		//Assert.assertEquals(login.getPageHeader().equalsIgnoreCase("Welcome back to Formstack"), true);
		login.FsLogin("b.sairamrocks@gmail.com","Saisowji@2015");
	}
	@Test(priority = 3)
	public void dashBoardpage() throws InterruptedException {
		dashBoardpage = PageFactory.initElements(driver, DashBoardPage.class);
		//Assert.assertEquals(dashBoardpage.getPageHeader().contains("sairam"), "The user name was expected to be \"sairam\" but found \"" + dashBoardpage.getPageHeader() + "\"");
		dashBoardpage.verifyText();
		dashBoardpage.createNewform();
		Thread.sleep(3000);
		dashBoardpage.createFormname("saissssss");
		Thread.sleep(3000);
		dashBoardpage.clickOnlanguage("French");
	}*/

	@AfterSuite
	//Test cleanup
	public void TeardownTest() {
		driver.quit();
	}

}
