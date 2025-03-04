package bridge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\glaub\\Downloads\\chrome-win64_new\\chrome-win64\\chromedriver.exe");

     	WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();  // Maximize browser window

     	//loginpage
        driver.get("https://demo.lcsbridge.com/login");
        // Locate the username and password fields using XPath
        WebElement usernameField = driver.findElement(By.xpath("//input[@name='email']")); 
        WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));
        // Enter login credentials
        usernameField.sendKeys("rishikesh1@glaubetech.com");
        passwordField.sendKeys("Qq111111");
        // Click the login button using XPath
        WebElement loginButton = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", loginButton);
        Thread.sleep(1000); // Wait for the scroll action
        loginButton.click();
	}

}
