package selenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class navigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://DemoQA.com");

		String s = driver.getCurrentUrl();
		System.out.println(s);
		System.out.println("clicking registration");
		driver.findElement(By.xpath(".//*[@id='menu-item-374']")).click();
		System.out.println("clicking back");
		driver.navigate().back();
		System.out.println("clicking forward");
		driver.navigate().forward();
		System.out.println("navigating to main page");
		driver.navigate().to("http://www.DemoQA.com");
		System.out.println("refreshing the page");
		driver.navigate().refresh();
		// navigating to automation practice form
		driver.navigate().to("http://toolsqa.com/automation-practice-form/");
		// typing the name
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Nivi");

		driver.findElement(By.name("lastname")).sendKeys("Madhan");
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();

		driver.findElement(By.partialLinkText("Partial ")).click();
		System.out.println("partial link test is done");
		String st = driver.findElements(By.tagName("submit")).toString();
		System.out.println(st);
		driver.findElement(By.linkText("Link Test")).click();
		System.out.println(" link test is done");
		List<WebElement> sexRadioButton = driver.findElements(By.cssSelector("input[name='sex']"));
		//List  oRadioButton = driver.findElements(By.name("toolsqa"));
		sexRadioButton.get(1).click();
		System.out.println("quitting the page");
		driver.quit();
	}

}
