package Lesson7_Webdriver;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoAdvanceCookie {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Đặt thời gian chời ngầm định cho tất cả các element (đơn vị Giây)
// Ví dụ thiết lập 10 giây cho tất cả
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//Thiết lập thời gian chờ Load page xong mới thao tác (tối đa 30s)
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

        driver.get("https://crm.anhtester.com/admin/authentication");
        //add advance cookie
        //khởi tạo đối tượng cookie
        Cookie cookie = new Cookie("sp_session", "0ae19b85f99dfab2f067376d6163d48112aa688d");
        driver.manage().addCookie(cookie);
        Thread.sleep(1000);
        //gọi hàm refresh
        driver.navigate().refresh();
        System.out.println(driver.manage().getCookieNamed("sp_session").getValue());
        Thread.sleep(3000);
        driver.quit();
    }
}
