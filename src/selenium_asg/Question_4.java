package selenium_asg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		
	   WebElement button1=driver.findElement(By.id("vfb-7-1"));
	   WebElement button2=driver.findElement(By.id("vfb-7-2"));
	   WebElement button3=driver.findElement(By.id("vfb-7-3"));
	   
	   button1.click();
	   Thread.sleep(1000);
	   button2.click();
	   Thread.sleep(1000);
	   button3.click();
	   Thread.sleep(1000);
	   
	   driver.close();
	   
	   
	}
}
