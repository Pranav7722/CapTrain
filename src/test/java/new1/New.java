//This is for working with the dropdowns

package new1;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class New {
	static WebDriver driver;
	public void click() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		driver.manage().window().maximize();
		driver.manage().w		//driver.findElement(By.xpath("//a[normalize-space()='Flights']")).click();
		//driver.findElement(By.linkText("Flights")).click();
		
		WebElement dept = driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select slect= new Select(dept);
		slect.selectByIndex(3);
		Thread.sleep(1000);
		slect.selectByValue("Acapulco");
		Thread.sleep(1000);
		slect.selectByContainsVisibleText("Paris");
		
		
		for(WebElement e:slect.getOptions()) {
			if(e.getText().equals("Paris")) {
				//slect.selectByValue(e.getText());
			}	
		}
		
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		New now = new New();
		now.click();
	}
}

