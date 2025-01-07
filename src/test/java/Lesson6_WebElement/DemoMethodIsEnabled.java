package Lesson6_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoMethodIsEnabled {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();//maximize trình duyệt lên
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Xét thời gian cố định

        driver.get("https://angular-reactive-forms-zvzqvd.stackblitz.io/");
        //Kiểm tra element có hiện thị hay ko
        driver.findElement(By.xpath("//span[normalize-space()='Run this project']")).click();
        Thread.sleep(1000);

        boolean checkSubmitButton = driver.findElement(By.xpath("//button[normalize-space()='Submit']")).isEnabled();
        System.out.println("Check Submit button enabled:" + checkSubmitButton);
        //Kiểm tra button Login có hiện thị hay ko
        boolean checkHackedButton = driver.findElement(By.xpath("//button[normalize-space()='\"Hacked\" Submit button']")).isEnabled();
        System.out.println("Check Login button displayed:" + checkHackedButton);
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("client@demo.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("riseDemo");

        boolean checkSubmitButtonAfter = driver.findElement(By.xpath("//button[normalize-space()='Submit']")).isEnabled();
        System.out.println("Check Submit button enabled:" + checkSubmitButtonAfter);
        Thread.sleep(1000);
        driver.quit();
    }
}
