package bridge;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public class customer {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();  // Maximize browser window
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions act = new Actions(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Open login page
        driver.get("https://demo.lcsbridge.com/customer/list");

        // Login process
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email"))).sendKeys("rishikesh@glaubetech.com");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))).sendKeys("Qq111111");
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
        js.executeScript("arguments[0].click();", loginButton);

        int customerCount = 5;  // Number of customers to create

        for (int i = 1; i <= customerCount; i++) {
            System.out.println("Creating Customer " + i + "...");

            // Click "New Customer" button
            WebElement newCustomer = wait.until(ExpectedConditions.elementToBeClickable(By.id("new")));
            js.executeScript("arguments[0].click();", newCustomer);

            // Enter Customer Name
            WebElement nameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));
            String randomName = "Rishi" + new Random().nextInt(10000);
            nameField.sendKeys(randomName);
            System.out.println("Entered customer name: " + randomName);
            Thread.sleep(500);

            // Enter Notifying Person
            WebElement notifyPerson = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("notifying-person")));
            String notifyRandomName = "Notify" + new Random().nextInt(10000);
            notifyPerson.sendKeys(notifyRandomName);
            System.out.println("Entered notify name: " + notifyRandomName);

            // Click Contact Tab
            WebElement contactTab = wait.until(ExpectedConditions.elementToBeClickable(By.id("base-tab2")));
            js.executeScript("arguments[0].click();", contactTab);

            // Enter Address
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("address-1"))).sendKeys("123 Main Street, New York, NY 10001");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("city"))).sendKeys("Brooklyn");
            Thread.sleep(1000);

         // Click the country dropdown
            WebElement country = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"contact\"]/div[2]/div[6]/div/div/button")));
            js.executeScript("arguments[0].click();", country);

            // Select the first country option dynamically
            WebElement countrySelect = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[contains(@class,'dropdown-menu')]//a")));
            js.executeScript("arguments[0].click();", countrySelect);


            // Click Communication Tab
            WebElement communicationTab = wait.until(ExpectedConditions.elementToBeClickable(By.id("base-tab3")));
            js.executeScript("arguments[0].click();", communicationTab);

            // Enter Email ID
            WebElement emailId = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"contact-row\"]/div/div[1]/div/div/input")));
            String randomMail = "Rishi" + new Random().nextInt(10000) + "@glaubetech.com";
            emailId.sendKeys(randomMail);
            System.out.println("Generated Email: " + randomMail);

            // Click Sales Tab
            WebElement salesTab = wait.until(ExpectedConditions.elementToBeClickable(By.id("base-tab4")));
            js.executeScript("arguments[0].click();", salesTab);

         // Click the salesman dropdown
            WebElement salesman = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='sales-row']/div[1]/div/div/button")));
            js.executeScript("arguments[0].click();", salesman);

            // Select the first available salesman option dynamically
            WebElement salesmanSelect = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[contains(@class,'dropdown-menu')]//a")));
            js.executeScript("arguments[0].click();", salesmanSelect);


            // Click Save Button
            WebElement saveButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("submit")));
            saveButton.click();
            System.out.println("Customer " + i + " created successfully!");
            Thread.sleep(5000);

            // Ensure page refreshes before next iteration
            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("new")));
        }

        // Close browser
        System.out.println("All customers created successfully!");
        driver.quit();
    }
}