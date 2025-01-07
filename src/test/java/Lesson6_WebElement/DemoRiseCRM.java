package Lesson6_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoRiseCRM {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();//maximize trình duyệt lên
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Xét thời gian cố định

        driver.get("https://rise.fairsketch.com/signin");
        Thread.sleep(1000); //xác thực hàm sleep bằng cách click chuột phải add exeption
        driver.findElement(By.xpath("//input[@id='email']")).clear();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("client@demo.com");
        driver.findElement(By.xpath("//input[@id='password']")).clear();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("riseDemo");
        //driver.findElement(By.xpath("//span[@aria-checked='true']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();

        Thread.sleep(2000);
        driver.quit();
    }
}
