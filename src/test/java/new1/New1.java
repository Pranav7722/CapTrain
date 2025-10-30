package new1;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.AWTException;
import java.awt.Toolkit;
import java.io.*;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.*;
import java.util.NoSuchElementException;
public class New1 {
	static WebDriver driver;
	Actions action;
	WebDriverWait wait;
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/?zx=1760427269501&no_sw_cr=1");
		
		//WebElement e =driver.findElement(By.className("gLFyf"));
		//e.sendKeys("Java",Keys.ENTER);
		
		//driver.navigate().back();
		
		File x = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File y=new File(".\\src\\test\\java\\img.png");
		try {
			FileUtils.copyFile(x, y);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String setup1() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/?zx=1760427269501&no_sw_cr=1");
		Date dt=new Date();
		SimpleDateFormat df= new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
		String s= df.format(dt);
		return s;
	}
	
		public void setup3() throws InterruptedException {
			
			driver = new ChromeDriver();
			driver.get("https://ksrtc.in/");
			
//			 driver.findElement(By.xpath(
//			 "//div[@class='tab-busBooking']//div[@class='search-onward']//div[@class='input-bottom-box']"
//			 )).click();
//			 driver.findElement(By.xpath("//a[normalize-space(		)='15']")).click();
			
//			JavascriptExecutor js =(JavascriptExecutor)driver;
//			js.executeScript("scroll(0,+700)");
			
			driver.findElement(By.xpath("//input[@id='departDate']")).click();
			List<WebElement> dts =driver.findElements(By.xpath("//div[@id='ui-datepicker-div']"));
			for(int i=0;i<dts.size();i++) {
				List<WebElement> alldts = driver.findElements(By.xpath("//div[@id='ui-datepicker-div']"));
				alldts.get(i).click();
				
				driver.findElement(By.xpath("//input[@id='departDate']")).click();
			}
			
		}
		
		public void setup4()
		{
			driver = new ChromeDriver();
			driver.get("https://ksrtc.in/");
			driver.findElement(By.xpath("//div[@id='corover-close-btn']")).click();
			
			driver.findElement(By.xpath("//div[@id='submitSearch']")).click();
			driver.switchTo().alert().accept();
			
		}
		
		public void setup5() {
			driver = new ChromeDriver();
			driver.get("https://online-clipboard.online/send-file-online/");
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("scroll(0,+400)");
			
			driver.findElement(By.xpath("//input[@id='file']")).click();	
		}
		
		public void setup6() {
			//StringSelection s  = new StringSelection("Location of the file in desktop");
			//Toolkit.getDefaultToolkit()
			
			driver = new ChromeDriver();
			driver.get("https://www.w3schools.com/");
			String id = driver.getWindowHandle();
			System.out.println(id);
			driver.findElement(By.xpath("//a[normalize-space()='PYTHON']")).click();
			JavascriptExecutor js = (JavascriptExecutor)driver;
			//The below line is for scrolling until u get to the point try it yourself
			js.executeScript("arguments[0].scrollIntoView(true)",	driver.findElement(By.xpath("//div[@class='w3-example']/h3[text()='Example']")));
			driver.findElement(By.xpath("//div[@class='w3-example']/a[text()='Try it Yourself »']")).click();
			// Since the driver is in the parent page it cannot switch to the child page and click on the run button
			//So we have a unique id for each window, there are two types of window parent and child, so we store all the id of the window in the set and if it is not equal to parent we click on the run button
			Set<String> allwin = driver.getWindowHandles();
			for(String w:allwin) {
				if(w.matches(id)) {
					
				}
				else {
					driver.switchTo().window(w);
					driver.findElement(By.xpath("//div[@class='w3-bar']/button[@id='runbtn']")).click();
				}
			}
			}
		
		public void setup7() {
			driver = new ChromeDriver();
			driver.get("https://jqueryui.com/droppable/");
			JavascriptExecutor js = (JavascriptExecutor)driver;
			action = new Actions(driver);
			
			WebElement framee = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
			driver.switchTo().frame(framee);
			WebElement e1= driver.findElement(By.id("draggable"));
			WebElement e2=driver.findElement(By.id("droppable"));
			//action.dragAndDrop(e1, e2).perform();
			//Here u will mention the coordinates to drop
			action.dragAndDropBy(e1, e2.getLocation().getX(), e2.getLocation().getY()).perform();
			String text=e2.getText();
			if(text.equals("Dropped!")) {
				System.out.println("Dropped");
			}
			else {
				System.out.println("Not dropped");
			}
			
			
		}
		
		public void setup8(){
			driver = new ChromeDriver();
			driver.get("https://demo.guru99.com/test/newtours/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			WebElement unm=driver.findElement(By.name("userName"));
			unm.sendKeys("mercury");
			
			WebElement pwd=driver.findElement(By.name("password11"));
			pwd.sendKeys("mercury");
			
			WebElement submit= driver.findElement(By.name("submit"));
			submit.click();
			
		}
		
		public void setup9(){
			driver = new ChromeDriver();
			driver.get("https://demo.guru99.com/test/newtours/");
			wait=new WebDriverWait(driver,Duration.ofSeconds(5));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			
			try {
			WebElement unm=driver.findElement(By.name("userName"));
			unm.sendKeys("mercury");
			
			wait.until(ExpectedConditions.attributeToBe(By.name("password"),"name","password"));
			
			WebElement pwd=driver.findElement(By.name("password"));
			pwd.sendKeys("mercury");
			
			WebElement submit= driver.findElement(By.name("submit"));
			wait.until(ExpectedConditions.numberOfElementsToBe(By.name("submit"),3));
			submit.click();
			}
			catch(NoSuchElementException e) {
				
			}
			
		}
		
	public static void main(String[] args){
		New1 n = new New1();
		n.setup9();
	}

}
