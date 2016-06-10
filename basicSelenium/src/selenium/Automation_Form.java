package selenium;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Automation_Form {
	public static WebDriver driver = new FirefoxDriver();

	public static void main(String[] args) {

		driver.get("http://toolsqa.com/automation-practice-form/");
		// FirstName
		WebElement fname = driver.findElement(By.cssSelector("input[name='firstname']"));
		Assert.assertTrue("FirstName is present", fname.isDisplayed());
		fname.clear();
		fname.sendKeys("Nivetha");
		// LastName
		WebElement lname = driver.findElement(By.cssSelector("input[name='lastname']"));
		Assert.assertTrue("FirstName is present", lname.isDisplayed());
		lname.clear();
		lname.sendKeys("Madhan");
		// Sex
		List<WebElement> sexRadioButton = driver.findElements(By.cssSelector("label"));
		String radioButton = sexRadioButton.get(0).getText();
		Assert.assertEquals("Sex", radioButton);
		driver.findElement(By.cssSelector("input[id='sex-1']")).click();
		// Years of Experience
		driver.findElement(By.cssSelector("input[id='exp-3']")).click();
		// Date
		driver.findElement(By.cssSelector("input[id='datepicker']")).sendKeys("06/09/2016");
		// Profession
		driver.findElement(By.cssSelector("input[id='profession-1']")).click();
		// Automation Tool
		driver.findElement(By.cssSelector("input[id='tool-2']")).click();
		// Continent
		selectDropDown("select[id='continents']", "Europe");
		// Selenium Commands
		selectDropDown("select[id='selenium_commands']", "Navigation Commands");
		driver.quit();

	}

	public static void selectDropDown(String locators, String input_value)

	{
		Select seleniumCommandsList = new Select(driver.findElement(By.cssSelector(locators)));
		seleniumCommandsList.selectByVisibleText(input_value);
	}

}
