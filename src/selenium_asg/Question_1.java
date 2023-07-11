package selenium_asg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Question_1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		//driver.findElement(By.linkText("Sign up")).click();
		driver.findElement(By.partialLinkText("Sign")).click();
		Thread.sleep(2000);
		
		driver.close();
	}
}
