package Practice_WebElement_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class PracticeWebElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();//maximize trình duyệt lên
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Xét thời gian cố định

        driver.get("https://crm.anhtester.com/admin/authentication");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        //Click Customer dùng xpath tương đối
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[normalize-space()='Customers']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[normalize-space()='New Customer']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[normalize-space()='Customer Details']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='company']")).sendKeys("TMA Solution");
        driver.findElement(By.xpath("//input[contains(@id,'vat')]")).sendKeys("245626781");
        driver.findElement(By.xpath("//input[contains(@id,'phonenumber')]")).sendKeys("095626780");
        driver.findElement(By.xpath("//input[contains(@id,'website')]")).sendKeys("https://abc.com.vn");
        driver.findElement(By.xpath("//button[@data-id='groups_in[]']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@id='bs-select-1-29']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@data-id='default_currency']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@id='bs-select-2-1']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@data-id='default_language']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@id='bs-select-3-21']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("TPHCM");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("TPHCM");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='state']"));
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='zip']"));
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@data-id='country']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@id='bs-select-4-243']")).click();
        Thread.sleep(1000);

        //Billing & Shipping tab
        driver.findElement(By.xpath("//a[normalize-space()='Billing & Shipping']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//textarea[@id='billing_street']")).sendKeys("Tran Huu Trang");
        driver.findElement(By.xpath("//input[@id='billing_city']")).sendKeys("TPHCM");
        driver.findElement(By.xpath("//input[@id='billing_state']"));
        driver.findElement(By.xpath("//input[@id='billing_zip']"));
        driver.findElement(By.xpath("//button[@data-id='billing_country']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@id='bs-select-5-243']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//textarea[contains(@id,'shipping_street')]")).sendKeys("Tran Huu Trang");
        driver.findElement(By.xpath("//input[contains(@id,'shipping_city')]")).sendKeys("TPHCM");
        driver.findElement(By.xpath("//input[contains(@id,'shipping_state')]"));
        driver.findElement(By.xpath("//input[contains(@id,'shipping_zip')]"));
        driver.findElement(By.xpath("//button[@data-id='shipping_country']"));
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@data-id='shipping_country']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@id='bs-select-6-243']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//button[normalize-space()='Save'])[2]")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
