package tests.day03_WebElements_Location;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P04 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //1.Amazon anasayfaya gidin
        //2.arama kutusunun yanındaki today's deals linkini tıklayın
        //3.acılan sayfada ilk ürünü tıklayın

    }
}
