package Lesson7_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.lang.model.element.Element;
import java.time.Duration;
import java.util.List;

public class DemoFindElementsListMenu {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");
        Thread.sleep(1000);
        //dùng xpath tương đối
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        Thread.sleep(1000);

        //get list menu with findElements method
        List<WebElement> listMenu = driver.findElements(By.xpath("//ul[@id='side-menu']/li"));
        for (int i=0; i< listMenu.size(); i++ ) {
            System.out.println(listMenu.get(i).getText());
        }
        Thread.sleep(1000);
        driver.quit();
    }
}
