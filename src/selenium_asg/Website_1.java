package selenium_asg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Website_1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://phptravels.com/demo/");
		
		WebElement fristname=driver.findElement(By.name("first_name"));
		WebElement lastname=driver.findElement(By.xpath("//*[@name='last_name']"));
		WebElement bussinessname=driver.findElement(By.name("business_name"));
		WebElement email=driver.findElement(By.name("email"));
//		driver.findElement(By.id("demo")).click();
		
		if (fristname.isDisplayed() && fristname.isEnabled()) {
			fristname.sendKeys("hello");
		}
		Thread.sleep(1000);
		
		if (lastname.isDisplayed() && lastname.isEnabled()) {
			lastname.sendKeys("demoo");
		}Thread.sleep(1000);
		if (bussinessname.isDisplayed() && bussinessname.isEnabled()) {
			bussinessname.sendKeys("i have nothing to bussiness");
		}Thread.sleep(1000);
		if (email.isDisplayed() && email.isEnabled()) {
			email.sendKeys("demo1@gamil.com");
		}
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id='demo']")).click();
	}

}
