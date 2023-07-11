package selenium_asg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLoginTest {
	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.instagram.com/");
			 Thread.sleep(4000);
			WebElement username =driver.findElement(By.xpath("//input[@name='username']"));  
			if (username.isDisplayed() && username.isEnabled()) {
				username.sendKeys("1234567898");
			}
			  Thread.sleep(3000);
			  
			WebElement pass =driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input"));
			if (pass.isDisplayed()&& pass.isEnabled()) {
				pass.sendKeys("hell0Testerrrrr");
			}
			
			
		  
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@ type='submit']")).click();
			Thread.sleep(5000);
			driver.close();


			
		}
}
