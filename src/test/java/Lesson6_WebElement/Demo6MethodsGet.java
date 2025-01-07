package Lesson6_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo6MethodsGet {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();//maximize trình duyệt lên
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Xét thời gian cố định

        driver.get("https://crm.anhtester.com/admin/authentication");
        Thread.sleep(1000);
        //header login
        String headerLogin = driver.findElement(By.xpath("//h1[normalize-space()='Login']")).getText();
        System.out.println(headerLogin);
        String tagNameHTML = driver.findElement(By.xpath("//h1[normalize-space()='Login']")).getTagName();
        System.out.println(tagNameHTML);

        //Get CSSvalue, lấy màu sắc, font size
        String backgroundColor = driver.findElement(By.xpath("//button[normalize-space()='Login']")).getCssValue("background-color");
        String Color = driver.findElement(By.xpath("//button[normalize-space()='Login']")).getCssValue("color");
        String fontSize = driver.findElement(By.xpath("//button[normalize-space()='Login']")).getCssValue("font-size");
        String fontWeight = driver.findElement(By.xpath("//button[normalize-space()='Login']")).getCssValue("font-weight");

        System.out.println(backgroundColor);
        System.out.println(Color);
        System.out.println(fontSize);
        System.out.println(fontWeight);
        //get size of Login button
        Dimension dimension = driver.findElement(By.xpath("//button[normalize-space()='Login']")).getSize();
        System.out.println("Height " + dimension.getHeight());
        System.out.println("Weight " + dimension.getWidth());
        //get location of Login button
        Point point = driver.findElement(By.xpath("//button[normalize-space()='Login']")).getLocation();
        System.out.println("Height " + point.getX());
        System.out.println("Weight " + point.getY());
        //getattribute
        driver.get("https://crm.anhtester.com/admin/authentication");
        Thread.sleep(2000);
        //dùng xpath tương đối
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='password']")).submit();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[normalize-space()='Customers']")).click();
        Thread.sleep(1000);
        //search
        driver.findElement(By.xpath("//input[@class='form-control input-sm']")).sendKeys("CMC Global");
        Thread.sleep(1000);
        //click chọn customer
        driver.findElement(By.xpath("(//a[normalize-space()='CMC Global'])[1]")).click();
        Thread.sleep(1000);
        //get giá trị của company, trong thẻ input mặc định giá trị nằm trong thẻ value
        String companyName = driver.findElement(By.xpath("//input[@id='company']")).getAttribute("value");
        System.out.println(companyName);
        String vatNumber = driver.findElement(By.xpath("//input[@id='vat']")).getAttribute("value");
        System.out.println(vatNumber);
        Thread.sleep(1000);
        driver.quit();
    }
}
