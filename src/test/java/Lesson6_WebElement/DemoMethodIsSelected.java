package Lesson6_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoMethodIsSelected {
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
        driver.findElement(By.xpath("//span[normalize-space()='Tasks']")).click();
        //Click add new Customer dùng xpath tương đối
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[normalize-space()='New Task']")).click();
        Thread.sleep(2000);
        boolean checkCheckboxBillable = driver.findElement(By.xpath("//input[@id='task_is_billable']")).isSelected();
        System.out.println("Check Billable checkbox selected:" + checkCheckboxBillable);
        Thread.sleep(1000);
        //click vào checkbox sau đó kiểm tra lại
        driver.findElement(By.xpath("//input[@id='task_is_billable']")).click();
        boolean checkCheckboxBillableAfter = driver.findElement(By.xpath("//input[@id='task_is_billable']")).isSelected();
        System.out.println("Check Billable checkbox selected:" + checkCheckboxBillableAfter);
        Thread.sleep(1000);

        driver.quit();
    }
}
