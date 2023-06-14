package tests.day02_WebDriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C16_Odev6 {
    public static void main(String[] args) {
        //1. Yeni bir class olusturun (TekrarTesti)
        System.setProperty("Webdriver.Chrom.driver","src/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını
        //doğrulayın (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.get("https://www.youtube.com");
        String actualTitle= driver.getTitle();
        String expectedTitle="Youtube";
        if (actualTitle.contains(expectedTitle))
            System.out.println("test passed");
        else
            System.out.println("test FAİLED ...Gerçek Title:"+actualTitle);
        //3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa
        //doğru URL'yi yazdırın.
        String actualUrl= driver.getCurrentUrl();
        String expectedUrl="youtube";
        if (actualUrl.contains(expectedUrl))
            System.out.println("Url test passed");
        else
            System.out.println("Url test FAİLED ...Gerçek Title:"+actualUrl);
        //4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.get("https://www.amazon.com");
        //5. Youtube sayfasina geri donun
        driver.navigate().back();
        // 6. Sayfayi yenileyin
        driver.navigate().refresh();
        //7. Amazon sayfasina donun
        driver.navigate().forward();
        //8. Sayfayi tamsayfa yapin
        driver.manage().window().maximize();
        //9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa doğru başlığı(Actual Title) yazdırın.
        String actualTitleAmazon= driver.getTitle();
        String expectedTitleAmazon="Amazon";
        if (actualTitleAmazon.contains(expectedTitleAmazon))
            System.out.println("Amazontest passed");
        else
            System.out.println("Amazontest FAİLED ...Gerçek Title:"+actualTitleAmazon);
        //10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru URL'yi yazdırın
        String actualUrlAmazon= driver.getCurrentUrl();
        String expectedUrlAmazon="https://www.amazon.com/";
        if (actualUrlAmazon.equals(expectedUrlAmazon))
            System.out.println("AmazonUrl test passed");
        else
            System.out.println("AmazonUrl test FAİLED ...Gerçek Title:"+actualUrlAmazon);
        //11.Sayfayi kapatin
        driver.close();
    }
}
