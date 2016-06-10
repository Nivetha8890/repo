package selenium;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class windowHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
	    driver.get("http://toolsqa.com/automation-practice-switch-windows/");
	    String handle =  driver.getWindowHandle();
	    System.out.println(handle);
	    driver.findElement(By.xpath(".//*[@id='content']/p[3]/button")).click();
	    Set handles = driver.getWindowHandles();
	    System.out.println(handles);
	    
	    Thread.sleep(2000);
	    for(String handle1:driver.getWindowHandles())
	    {
	    driver.switchTo().window(handle1);
	    System.out.println(handle1);
	    
	    driver.close();
	    }
	    driver.get("http://toolsqa.com/automation-practice-switch-windows/");
	    
	    driver.findElement(By.name("Alert Box"));
	    Alert alert = driver.switchTo().alert();
	    Thread.sleep(2000);
	    alert.accept();
	    Thread.sleep(2000);
	    driver.quit();
	}

}
