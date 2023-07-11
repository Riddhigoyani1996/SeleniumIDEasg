package selenium_asg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Question_11 {

	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void login() throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys("ravidankhara@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("**********");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(1000);
		
	}
	@AfterTest
	public void teardown() {
		driver.close();
	}

}
