package Lesson5_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoXpathRelative {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");
        Thread.sleep(2000);
       //dùng xpath tương đối
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        Thread.sleep(2000);
        //Checkbox Remember me
        driver.findElement(By.xpath("//label[normalize-space()='Remember me']")).click();
        Thread.sleep(2000);
        //Click Login
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        //Click Customer dùng xpath tương đối
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[normalize-space()='Customers']")).click();
        //Click add new Customer dùng xpath tương đối
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[normalize-space()='New Customer']")).click();
        Thread.sleep(2000);
        //close browser
        driver.quit();
    }
}
