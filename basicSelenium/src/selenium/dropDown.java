package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://toolsqa.com/automation-practice-form/");
		Select contiDropDown = new Select(driver.findElement(By.id("continents")));
		contiDropDown.selectByIndex(1);
		Thread.sleep(2000);
		contiDropDown.selectByVisibleText("Africa");
		List<WebElement> element = contiDropDown.getOptions();
		int iSize = element.size();
		for(int i=0;i<iSize;i++)
		{
			String svalue= element.get(i).getText();
			System.out.println(svalue);
		
           if(svalue.equals("Asia"))
           {
        	   contiDropDown.selectByIndex(i);
           }
           break;
		}
	Thread.sleep(2000);
	driver.quit();	
	}

}
