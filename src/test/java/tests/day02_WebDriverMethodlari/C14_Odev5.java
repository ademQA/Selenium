package tests.day02_WebDriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C14_Odev5 {
    public static void main(String[] args) {
//1.Yeni bir class olusturalim (Homework)
        System.setProperty("Webdriver.Chrom.driver", "src/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook” oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://www.facebook.com");
        String actualTitle = driver.getTitle();
        String expectedTitle = "facebook";
        if (actualTitle.contains(expectedTitle))
            System.out.println("Title test passed");
        else
            System.out.println("Title test FAİLED  Real Title :" + actualTitle);
//3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i yazdirin.
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "facebook";
        if (actualUrl.contains(expectedUrl))
            System.out.println("Url test passed");
        else
            System.out.println("Url test FAİLED  Real Title :" + actualUrl);
//4.https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.walmart.com");
//5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String actualTitleWalmart = driver.getTitle();
        String expectedTitleWalmart = "Walmart.com";
        if (actualTitle.contains(expectedTitle))
            System.out.println("TitleWalmart test passed");
        else
            System.out.println("TitleWalmart test FAİLED  Real Title :" + actualTitleWalmart);

// 6. Tekrar “facebook” sayfasina donun
        driver.navigate().back();
//7. Sayfayi yenileyin
        driver.navigate().refresh();
//8. Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();
//9.Browser’i kapatin
        driver.close();
    }
}
