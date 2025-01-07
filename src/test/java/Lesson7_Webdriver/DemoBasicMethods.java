package Lesson7_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DemoBasicMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Navigate to a page
        driver.navigate().to("http://anhtester.com");
        driver.findElement(By.xpath("//a[@id='btn-login']")).click();
        Thread.sleep(1000);
// Điều hướng về lịch sử trang trước đó
        driver.navigate().back();
        Thread.sleep(1000);
// Làm mới trang hiện tại
        driver.navigate().refresh();
        Thread.sleep(1000);
// Điều hướng đến trang tiếp sau
        driver.navigate().forward();
        Thread.sleep(1000);
// Get the title of the page
        String title = driver.getTitle();
// Get the current URL
        String url = driver.getCurrentUrl();
// Get the current page HTML source
        String html = driver.getPageSource();
        System.out.println(title);
        System.out.println(url);
        System.out.println(html);
        System.out.println(html.contains("Kiến thức Tester"));
        Thread.sleep(1000);
        driver.quit();
    }
}
