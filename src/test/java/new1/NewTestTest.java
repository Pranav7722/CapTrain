package new1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.*;

import junit.framework.Assert;

public class NewTestTest {
//This checks if the test cases is successfully executed or not
  @Test
  public void f() {
	  String s1="java";
	  String s2="Java";
	  if(s1.equals(s2)) {
		  System.out.println("Valid");
	  }
	  else {
		  System.out.println("Invalid");
	  	}
	  System.out.println("Ended");
  }
  
 //This check for the successfull validation
  
  @Test
  public void Tc2() {
	  String s1="Java";
	  String s2="java";
	  Assert.assertEquals(s1, s2,"please check the inputs");
	  System.out.println("Ended");
  }
  
  @Test
  public void Tc3() {
	  String s1="Java";
	  String s2="java";
	  SoftAssert a = new SoftAssert();
	  a.assertEquals(s1, s2,"please check the inputs");
	  System.out.println("Ended");
	  a.assertAll();
  }
  
  @Test
  public void Tc4() {
	  String s1="java";
	  String s2="java";
	  Assert.assertEquals(s1, s2,"please check the inputs");
	  System.out.println("Ended");
	  Assert.assertFalse("check the condition",4==5);
	  Assert.assertTrue(4==5);
  }
  
  @Test
  public void Tc5() {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/");
	  Assert.assertEquals(driver.getTitle(), "Welcome: Mercury Tours");
	  
	  WebElement unm=driver.findElement(By.name("userName"));
		unm.sendKeys("mercury");
		
		WebElement pwd=driver.findElement(By.name("password"));
		pwd.sendKeys("mercur");
		

		WebElement submit= driver.findElement(By.name("submit"));
		submit.click();
		
		WebElement ref=driver.findElement(By.xpath("//h3[normalize-space()='Login Successfully']"));
		System.out.println(ref.getText());
		Assert.assertEquals(ref.getText(), "Login Successfully");
  }
  

}
