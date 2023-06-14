package tests.day02_WebDriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C10_Odev1 {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver","src/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //1. Yeni bir package olusturalim : day01
        //2. Yeni bir class olusturalim : C03_GetMethods
        //3. Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");
        //4. Sayfa basligini(title) yazdirin
        String baslik=driver.getTitle();
        System.out.println(baslik);
        //5. Sayfa basliginin “Amazon” icerdigini test edin
        String actualTitle=driver.getTitle();
        String expectedTitle="Amazon";
        if (actualTitle.contains(expectedTitle))
        { System.out.println("Test  PASSED");}
        else
            System.out.println("Test FAİLED Gerçek Başlık:"+actualTitle);

        //6. Sayfa adresini(url) yazdirin
        String url=driver.getCurrentUrl();
        System.out.println(url);
        //7. Sayfa url’inin “amazon” icerdigini test edin.
        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="amazon";
        if (actualUrl.contains(expectedUrl))
        { System.out.println("Test  PASSED");}
        else
            System.out.println("Test FAİLED Gerçek Başlık:"+actualUrl);
        //8. Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());
        //9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin
        String actualmetin=driver.getPageSource();
        String expectedMetin="HTML";
        if (actualmetin.contains(expectedMetin))
        {
            System.out.println("Test PASSED");
        }else
        {
            System.out.println("Test FAİLED Gerçek Metin: "+actualmetin);
        }

        // 10. Sayfayi kapatin.
        driver.close();

    }
}
