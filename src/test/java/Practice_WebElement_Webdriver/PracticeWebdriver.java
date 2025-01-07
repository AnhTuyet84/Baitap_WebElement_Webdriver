package Practice_WebElement_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class PracticeWebdriver {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");
        Thread.sleep(1000);

        Cookie cookie = new Cookie("sp_session", "0ae19b85f99dfab2f067376d6163d48112aa688d");
        driver.manage().addCookie(cookie);
        Thread.sleep(1000);
        //gọi hàm refresh
        driver.navigate().refresh();
        System.out.println(driver.manage().getCookieNamed("sp_session").getValue());
        Thread.sleep(3000);
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
        System.out.println(html.contains("https://crm.anhtester.com/admin/projects"));
        Thread.sleep(1000);
        //get list menu with findElements method
        List<WebElement> listMenu = driver.findElements(By.xpath("//ul[@id='side-menu']/li"));
        for (int i=0; i< listMenu.size(); i++ ) {
            System.out.println(listMenu.get(i).getText());
        }
        driver.findElement(By.xpath("//span[normalize-space()='Projects']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@data-title='Gantt']/preceding-sibling::a")).click();
        Thread.sleep(1000);

        driver.quit();
    }
}
