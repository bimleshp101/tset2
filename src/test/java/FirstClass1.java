import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirstClass1 {

	@Test
	public void openBrowser() throws InterruptedException{
		
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://www.google.co.in/");
	Thread.sleep(4000);
	}
}
