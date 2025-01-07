import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.time.Duration;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {
        //để trong hàm main
        //khai báo 1 driver để điều khiển 1 trình duyệt
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //thời gian tối đa để truy xuất implement là 10s
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Open browser
        driver.get("https://cms.anhtester.com/login");
        Thread.sleep(2000);
        //Input email and password
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        Thread.sleep(2000);
        //close browser
        driver.quit();

    }
}
