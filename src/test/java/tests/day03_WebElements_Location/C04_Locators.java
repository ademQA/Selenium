package tests.day03_WebElements_Location;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C04_Locators {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Amazon anasayfaya gidin
        driver.get("https://www.amazon.com.tr");
        //arama kutusunun yanındaki today's deals linkini tıklayın
        WebElement todaysDealsElemeti=driver.findElement(By.linkText("Günün Fırsatları"));
        todaysDealsElemeti.click();
        //acılan sayfada ilk ürünü tıklayın
        List<WebElement>urunElementleriListesi=driver.findElements(By.className("DealGridItem-module__dealItemContent_1vFddcq1F8pUxM8dd9FW32"));
        urunElementleriListesi.get(0).click();
        Thread.sleep(2000);
        driver.close();


    }
}
