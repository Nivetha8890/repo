package selenium;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import pages.FormPage;

public class Form {
	public static WebDriver driver;

	FormPage page = PageFactory.initElements(driver, FormPage.class);

	@BeforeClass
	public static void openBrowser() {
		driver = new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterClass
	public static void closeBrowser() {
		driver.quit();
	}

	@Test
	public void validScenario() {
		page.enterFirstName("Madhan");
		page.enterLastName("Nivetha");
		page.genderRadioButtonClick();
		page.clickExperience();
		page.enterDate("06/06/2016");
		page.clickProfession();
		page.clickAutomation();
		page.selectContinentsDropDown("Europe");
		page.selectSeleniumCommand("Navigation Commands");

	}

	@Test
	public void inValidScenario() {
		page.enterFirstName("@£$@£$");
		page.enterLastName("@£$@£");
		page.genderRadioButtonClick();
		page.clickExperience();
		page.enterDate("06/06/2016");
		page.clickProfession();
		page.clickAutomation();
		page.selectContinentsDropDown("Europe");
		page.selectSeleniumCommand("Navigation Commands");

	}

}
