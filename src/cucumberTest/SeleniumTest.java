package cucumberTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dmarroquin\\Documents\\QA\\chromedriver.exe");
		driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         //Launch the Online Store Website
        driver.get("http://www.store.demoqa.com");
        driver.findElement(By.xpath(".//*[@id='account']/a")).click();
         // Find the element that's ID attribute is 'log' (Username)
        driver.findElement(By.id("log")).sendKeys("testuser_1"); 
        // Find the element that's ID attribute is 'pwd' (Password)
        driver.findElement(By.id("pwd")).sendKeys("Test@123");
        driver.findElement(By.id("login")).click();
        // Print a Log In message to the screen
        System.out.println("Login Successfully");
        // Find the element that's ID attribute is 'account_logout' (Log Out)
        driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
        // Print a Log In message to the screen
        System.out.println("LogOut Successfully");
        // Close the driver
        driver.quit();	
	}

}
