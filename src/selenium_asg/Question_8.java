package selenium_asg;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
public class Question_8 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		
	      WebElement ac =driver.findElement(By.name("userName"));
	      Actions actions=new Actions(driver);
			Action a1=actions.moveToElement(ac)
					.moveToElement(ac)
					.click().keyDown(ac, Keys.SHIFT)
					.sendKeys("hello")
					.keyUp(ac,Keys.SHIFT)
					.contextClick()
					.build();
		    a1.perform();
		    driver.close();
	}
}
