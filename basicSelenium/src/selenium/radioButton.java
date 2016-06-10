package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class radioButton {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new FirefoxDriver();
    driver.get("http://toolsqa.com/automation-practice-form/");
    List<WebElement> sexRadioButton = driver.findElements(By.name("sex"));
   boolean rvalue = sexRadioButton.get(0).isSelected();
   if(rvalue == true)
   {
	   sexRadioButton.get(1).click();
	   
   }
   else
   {
	   sexRadioButton.get(0).click();
   }
   
   //third radio button
   WebElement thirdRadioButton = driver.findElement(By.id("exp-2"));
   thirdRadioButton.click();
   
   //check box
   List<WebElement> automationCheckBox =  driver.findElements(By.cssSelector("input[name='profession']"));
   int asize = automationCheckBox.size();
   //String as = Automation Tester;
   for(int i=0;i<asize;i++)
   {
   String cvalue = automationCheckBox.get(i).getAttribute("value");
   if(cvalue == "Automation Tester")
   {
	   automationCheckBox.get(i).click();
   }
 break;
 
   }
   
   //
   Thread.sleep(2000);
   
   driver.quit();
	}
}
