package selenium_asg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class FacebookBasic {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("ravidankhara@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("pass")).sendKeys("****************");
		Thread.sleep(2000);
		WebElement shoW=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/div/a/div/div"));
		if (shoW.isDisplayed()) {
			shoW.click();
		}
		Thread.sleep(2000);
		WebElement hidE= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/div/a/div/div"));
		if (hidE.isDisplayed()) {
			hidE.click();
		}
		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
		
		Actions actions =new Actions(driver);
		WebElement buttton =driver.findElement(By.xpath("//*[@id=\"pageFooter\"]/ul/li[12]/a"));
		Action a1=actions.moveToElement(buttton).build();
		a1.perform();
		
		Thread.sleep(3000);
		
	}
}
