package selenium_asg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class NewtourRegisterPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		
		driver.findElement(By.name("firstName")).sendKeys("Devil");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='lastName']")).sendKeys("sdadsdddx");
		Thread.sleep(1000);
		driver.findElement(By.name("phone")).sendKeys("12345676543");
		Thread.sleep(1000);
		driver.findElement(By.id("userName")).sendKeys("test1@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("address1")).sendKeys("sdfdsdj1234ejn45645r");
		Thread.sleep(1000);
		driver.findElement(By.name("city")).sendKeys("surat");
		Thread.sleep(1000);
		driver.findElement(By.name("state")).sendKeys("gujarat");
		Thread.sleep(1000);
		driver.findElement(By.name("postalCode")).sendKeys("395010");
		Thread.sleep(1000);
		WebElement county=driver.findElement(By.name("country"));
		Select select=new Select(county);
		select.selectByValue("AMERICAN SAMOA");
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("test1@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("**************");
		Thread.sleep(1000);
		driver.findElement(By.name("confirmPassword")).sendKeys("2345654345654356");
		Thread.sleep(1000);
		
		driver.close();
	}
}
