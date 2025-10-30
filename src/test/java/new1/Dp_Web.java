package new1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
 
 
public class Dp_Web {
	WebDriver driver;
	Screen screen = new Screen();
 
	@Parameters({ "browser" })
	@BeforeClass
	public void launch(String browser) {
		driver = screen.setup(browser);
	} 
	
	@Parameters({ "url" })
	@Test
	public void f(String url) {
		driver.get(url);
	}
 
	@Test (dataProvider="dp2")
	public void login(String uname, String pas) {
 
		WebElement username = driver.findElement(By.xpath("//input[@name='userName']"));
 
		username.sendKeys(uname);
 
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
 
		pass.sendKeys(pas);
 
		WebElement submit = driver.findElement(By.xpath("//input[@name='submit']"));
		submit.click();
 
//		WebElement sc = driver.findElement(By.xpath("//h3[normalize-space()='Login Successfully']"));
//
//		Assert.assertEquals(sc.getText(), "Login Successfully");
	}
 
	@DataProvider
	public Object[][] dp2() {
		return new Object[][] { { "Hello", "a" }, { "Hi", "b" }, { "Who", "c" }, { "mercury", "mercury" } };
	}
}
 
