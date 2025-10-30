package new1;
import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2 {
	static WebDriver driver;
	
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://ksrtc.in/");
	}

	public void verifyOne() throws InterruptedException {
		driver.findElement(By.xpath("//label[@for='radio_roundtrip']")).click();
	}
	
	public void roundTrip() {
		//driver.findElement(By.xpath("//label[@for='radio_oneway']")).click();
		driver.findElement(By.xpath("//label/span[contains(text(),'One Way')]")).click();
		List<WebElement> allradio= driver.findElements(By.xpath("//div[@class='mode--wrap']//label/span"));
		for(int i=0;i<allradio.size();i++) {
			System.out.println(allradio.get(i).getText());
			allradio.get(i).click();
			System.out.println(allradio.get(i).isSelected());
			System.out.println(allradio.get(i).isDisplayed());
			System.out.println(allradio.get(i).isEnabled());
		}
	
	}
	
	public static void main(String[] args) throws InterruptedException {
		Day2 new1= new Day2();
		new1.setup();
		new1.verifyOne();
		new1.roundTrip();
	}
}
