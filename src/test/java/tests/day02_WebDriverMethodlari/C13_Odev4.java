package tests.day02_WebDriverMethodlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C13_Odev4 {
    public static void main(String[] args) {
        // 1. Yeni bir Class olusturalim.C07_ManageWindowSet
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 2. Amazon sayfasına gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");

        // 3. Sayfanin konumunu ve boyutlarini yazdirin
        Point position = driver.manage().window().getPosition();
        Dimension size = driver.manage().window().getSize();
        System.out.println("Sayfa Konumu: " + position);
        System.out.println("Sayfa Boyutu: " + size);

        // 4. Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        Dimension desiredSize = new Dimension(100, 800);
        Point desiredPosition = new Point(10, 30);
        driver.manage().window().setSize(desiredSize);
        driver.manage().window().setPosition(desiredPosition);

        // 5. Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        Point currentPosition = driver.manage().window().getPosition();
        Dimension currentSize = driver.manage().window().getSize();

        if (currentPosition.equals(desiredPosition) && currentSize.equals(desiredSize)) {
            System.out.println("Sayfa istenen konum ve boyuta geldi.");
        } else {
            System.out.println("Sayfa istenen konum ve boyuta gelmedi.");
        }

        // 6. Sayfayi kapatin
        driver.quit();
    }
}