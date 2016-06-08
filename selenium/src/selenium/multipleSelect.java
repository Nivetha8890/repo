package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class multipleSelect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://toolsqa.com/automation-practice-form/");
		Select seleniumMultipleDropDown = new Select(driver.findElement(By.id("selenium_commands")));
		
		seleniumMultipleDropDown.selectByIndex(0);
		Thread.sleep(2000);
		seleniumMultipleDropDown.deselectByIndex(0);
		
		seleniumMultipleDropDown.selectByVisibleText("Navigation Commands");
		Thread.sleep(2000);
		seleniumMultipleDropDown.deselectByVisibleText("Navigation Commands");
		Thread.sleep(2000);
		
		List<WebElement> element = seleniumMultipleDropDown.getOptions();
		int osize = element.size();
		for(int i=0 ;i<osize; i++)
		{
			String value = element.get(i).getText();
			System.out.println(value);
			seleniumMultipleDropDown.selectByIndex(i);
			Thread.sleep(2000);
		}
		
		seleniumMultipleDropDown.deselectAll();
		Thread.sleep(2000);
		driver.quit();
	}

}
