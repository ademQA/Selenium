package tests.day02_WebDriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C08_DriverNavigation {
    public static void main(String[] args) {
        //1. Yeni bir package olusturalim : day01
        //2. Yeni bir class olusturalim : C03_GetMethods
        //3. Amazon sayfasina gidelim. https://www.amazon.com/
        //4. Sayfa basligini(title) yazdirin
        //5. Sayfa basliginin “Amazon” icerdigini test edin
        //6. Sayfa adresini(url) yazdirin
        //7. Sayfa url’inin “amazon” icerdigini test edin.
        //8. Sayfa handle degerini yazdirin
        //9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin 10. Sayfayi kapatin.

        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        //3. Amazon sayfasina gidelim. https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");
        //4. Sayfa basligini(title) yazdirin
        String title = driver.getTitle();
        System.out.println(title);

        //5. Sayfa basliginin “Amazon” icerdigini test edin
        String actualResult = title;
        String expectedResult = "Amazon";
        if (title.contains(expectedResult)) {
            System.out.println("TitleTest PASSED");
        } else {
            System.out.println("TitleTest FAİLED");
        }

        //6. Sayfa adresini(url) yazdirin
        String url = driver.getCurrentUrl();
        System.out.println(url);

        //7. Sayfa url’inin “amazon” icerdigini test edin.
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "amazon";
        if (actualUrl.contains(expectedUrl)) {
            System.out.println("TestUrl PASSED");
        } else {
            System.out.println("TestUrl FAİLED" + actualUrl);
        }

        //8. Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());

        //9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin
        String actualText=driver.getPageSource();
        String expectedText="alisveris";
        if (actualText.contains(expectedText))
        {
            System.out.println("TestHTML PASSED");
        }else
        {
            System.out.println("TestHTML FAİLED");
        }

        // 10. Sayfayi kapatin.

        driver.close();

    }
}
