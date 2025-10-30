package new1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebElement;

public class Hello {
	static WebDriver driver= new ChromeDriver();
	public void getLinks() {
     	driver.get("https://demo.guru99.com/test/newtours/");
//			
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("hello");
	}
//	driver.get("https://www.selenium.dev/downloads/");
//	
//	WebDriver driver = new ChromeDriver();
//	driver.get("https://www.selenium.dev/downloads/");
//	
//	String url = driver.getCurrentUrl();
//	System.out.println(url);
//	String expectedurl="https://www.selenium.dev/downloads/";
//	
//	if(url.equals(expectedurl)) {
//		System.out.println("Success");
//	}
//	else {
//		System.out.println("failed");
//	}
//	String title = driver.getTitle();
//	if(title.equals("Downloads | Selenium")) {
//		System.out.println("Valid");
//	}
	
		
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://demo.guru99.com/test/newtours/");
//		WebElement new1 = driver.findElement(By.name("userName"));
//		new1.sendKeys("mercury");
//		Thread.sleep(1000);
//		new1.clear();
//		Thread.sleep(1000)
//		new1.sendKeys("mercury1");
//		
//		WebElement new2 = driver.findElement(By.name("password"));
//		new2.sendKeys("mercury");
//		
//		WebElement new3 = driver.findElement(By.name("submit"));
//		new3.click();
		public static void main(String[] args) {
		Hello newtours= new Hello();
		newtours.getLinks();
		}
	}

	`	