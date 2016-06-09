package selenium;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assertion {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://tfl.gov.uk/");
		String actualText = driver.findElement(By.cssSelector(".section-style")).getText().toUpperCase();
		Assert.assertEquals("PLAN A JOURNEY", actualText);
		System.out.println("Result" + actualText);
		System.out.println("assertion executed");
		WebElement element = driver.findElement(By.cssSelector(".logo"));
		Assert.assertTrue("is displayed", element.isDisplayed());
		System.out.println("assertion true is executed");
		driver.quit();
	}

}
