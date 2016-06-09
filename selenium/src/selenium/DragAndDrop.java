package selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static WebDriver driver = new FirefoxDriver();

	public static void main(String[] args) throws InterruptedException {
		implicitWait(20);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://dhtmlx.com/docs/products/dhtmlxTree/");
		WebElement from = driver.findElement(By.xpath(
				".//*[@id='treebox1']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[3]/td[2]/table/tbody/tr[1]/td[4]"));
		WebElement to = driver
				.findElement(By.xpath(".//*[@id='treebox2']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]"));
		Actions builder = new Actions(driver);
		Actions dragAndDrop = builder.clickAndHold(from).moveToElement(to);
		dragAndDrop.release(to).dragAndDrop(from, to).perform();
		// mouse hoover
		driver.get("http://www.onlinestore.toolsqa.com");
		implicitWait(30);
		WebElement element = driver.findElement(By.linkText("product category"));
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		driver.findElement(By.linkText("Accessories")).click();
		driver.quit();

	}

	public static void implicitWait(int num)

	{

		driver.manage().timeouts().implicitlyWait(num, TimeUnit.SECONDS);
	}
}
