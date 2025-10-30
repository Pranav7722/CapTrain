package new1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
public class groups_demo {
	@Test(groups= {"function"})
	public void A() {
		System.out.println("A");
	}
 
	@Test(groups= {"function","reg"})
	public void B() {
		System.out.println("B");
	}
 
	@Test(groups= {"reg"})
	public void F() {
		System.out.println("F");
	}
 
	@Test(groups= {"function"})
	public void D() {
		System.out.println("D");
	}
 
	@Test (groups= {"function","reg"})
	public void E() {
		System.out.println("E");
	}
 
	@Test(groups= {"function"})
	public void C() {
		System.out.println("C");
	}
}