package selenium_asg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagramsign {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/div/div/div[1]/section/main/article/div[2]/div[2]/span/p/a/span")).click();
		driver.findElement(By.linkText("Sign up")).click();
		Thread.sleep(2000);
		 WebElement mnumber=driver.findElement(By.name("emailOrPhone"));
		 WebElement name=driver.findElement(By.name("fullName"));
		 WebElement usernamE=driver.findElement(By.name("username"));
		 WebElement pass=driver.findElement(By.name("password"));
		 Thread.sleep(2000);
		 if (mnumber.isDisplayed() && mnumber.isEnabled()) {
			mnumber.sendKeys("9081812583");
		}
		 Thread.sleep(2000);
		 if (name.isDisplayed() && name.isEnabled()) {
			name.sendKeys("riddhi.....");
		}
		 Thread.sleep(2000);
		 if (usernamE.isDisplayed() && usernamE.isEnabled()) {
			usernamE.sendKeys("tester");
		}
		 Thread.sleep(2000);
		 if (pass.isDisplayed() && pass.isEnabled()) {
			pass.sendKeys("*********");
		}
		 Thread.sleep(2000);
		 driver.close();
		 
	}
}
