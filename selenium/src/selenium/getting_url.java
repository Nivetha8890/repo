package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getting_url {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.uk");
		//driver.navigate().to("https://www.google.co.uk");     //navigate
		String i = driver.getCurrentUrl();
		System.out.println(i);
		String s = driver.getPageSource();   //page source
		//System.out.println(s);
		driver.navigate().forward();
		driver.quit();
	}
}
