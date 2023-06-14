package tests.day02_WebDriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
//1.Yeni bir class olusturalim (Homework)
//2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook” oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
//3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i yazdirin.
//4.https://www.walmart.com/ sayfasina gidin.
//5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
//6. Tekrar “facebook” sayfasina donun
//7. Sayfayi yenileyin
//8. Sayfayi tam sayfa (maximize) yapin
//9.Browser’i kapatin
public class C07_DriverNavigationMethodOrnek {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        driver.navigate().to("https://www.facebook.com");

        String actualTitle=driver.getTitle();
        String expectedTitle="facebook";
        if (actualTitle.equals(expectedTitle))
        {
            System.out.println("TestTitle is PASSED");
        }
        else
        {
            System.out.println("TestTitle is FAİLED, Real Title is:"+actualTitle);
        }

        driver.navigate().to("https://www.facebook.com");
        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="facebook.com";


        if (actualUrl.contains(expectedUrl)){
            System.out.println("Test is PASSED");
        }else
        {
            System.out.println("Test is FAİLLED Real title is:"+actualUrl);
        }

        driver.navigate().to("https://www.walmart.com");
        actualTitle=driver.getTitle();
        String epectedTitle="Walmart.com";
        if (actualTitle.equals(expectedTitle))
        {
            System.out.println("WalmartTestTitle is PASSED");
        }
        else
        {
            System.out.println("Walmart TestTitle is FAİLED, Real Title is:"+actualTitle);
        }

        driver.navigate().back();
        driver.navigate().refresh();
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.close();


    }
}
