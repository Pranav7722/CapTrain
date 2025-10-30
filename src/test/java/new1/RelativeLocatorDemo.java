package new1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
 
public class RelativeLocatorDemo {
	public static void main(String args[]) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		WebElement pass= driver.findElement(By.name("password"));
		pass.sendKeys("mercury");
		WebElement user= driver.findElement(RelativeLocator.with(By.tagName("input")).above(pass));
		user.sendKeys("mercury");
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(pass)).click();

	}
 
}