package new1;

//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//import org.testng.annotations.*;
//
//public class Oct {
//  @Test
//  public void tc1() {
//	  System.out.println("tc called");
//  }
//  
//  @BeforeMethod
//  public void beforeMethod() {
//	  System.out.println("Before method");
//  }
//  
//  @AfterMethod
//  public void afterMethod() {
//	  System.out.println("after  method");
//  }
//  
//  @BeforeClass
//  public void beforeClass() {
//	  System.out.println("Before Class");
//  }
//  
//  @AfterClass
//  public void afterClass() {
//	  System.out.println("after class");
//  }
//  
//  @BeforeTest
//  public void beforeTest() {
//	  System.out.println("before test");
//  }
//  
//  @AfterTest
//  public void afterTest() {
//	  System.out.println("after test");
//  }
//  
//  @BeforeSuite
//  public void beforeSuite() {
//	  System.out.println("before suite");
//  }
//  
//  @AfterSuite
//  public void afterSuite() {
//	  System.out.println("after suite");
//  }
//}



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Oct {
	WebDriver driver;

	@Test(priority=0)
	public void login() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://demo.guru99.com/test/newtours/",
				"You have navigated to a wrong website");

		WebElement username = driver.findElement(By.xpath("//input[@name='userName']"));

		username.sendKeys("mercury");

		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));

		pass.sendKeys("mercury");

		WebElement submit = driver.findElement(By.xpath("//input[@name='submit']"));
		submit.click();

		WebElement sc = driver.findElement(By.xpath("//h3[normalize-space()='Login Successfully']"));

		Assert.assertEquals(sc.getText(), "Login Successfully");

	}
	
	@Test(priority=1)
	public void check() {
		WebElement so=driver.findElement(By.linkText("SIGN-OFF"));
		Assert.assertTrue(so.isDisplayed());
	}

	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
	}
	
	@AfterClass
	public void close() {
		driver.close();
	}
	

}
