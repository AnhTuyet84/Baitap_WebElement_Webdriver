package Lesson6_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoMethodIsDisplayed {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();//maximize trình duyệt lên
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Xét thời gian cố định

        driver.get("https://anhtester.com/");
        //Kiểm tra element có hiện thị hay ko
        boolean checkElement = driver.findElement(By.xpath("//h1[normalize-space()='Anh Tester Automation Testing']")).isDisplayed();
        System.out.println("CheckDisplayed:" + checkElement);
        //Kiểm tra button Login có hiện thị hay ko
        boolean checkLoginButton = driver.findElement(By.xpath("//a[@id='btn-login']")).isDisplayed();
        System.out.println("Check Login button displayed:" + checkLoginButton);
        Thread.sleep(1000);
        driver.quit();
    }
}
