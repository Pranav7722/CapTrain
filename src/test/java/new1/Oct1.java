package new1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.text.*;
 
import java.util.*;
public class Oct1 {
	WebDriver driver;
	@Parameters({"browser"})
	@BeforeClass
	public WebDriver launch(String browser) {
		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
 
		case "edge":
			System.setProperty("webdriver.edge.driver", "C:\\Users\\pranavm\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
			break;
 
		default:
			System.out.println("Broswer not found");
 
		}
		//driver.get(url);
		return driver;
	}
	
	@Parameters({"url"})
	@Test
	public void loginTc(String url) {
		driver.get(url);

	}
	@AfterClass
	public void tearDown() {	
		Date d = new Date();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
		String s = df.format(d);
			File x = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File y=new File(".\\src\\test\\java\\" + s + ".png");
			try {
				FileUtils.copyFile(x, y);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}