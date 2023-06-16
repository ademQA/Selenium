package tests.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P02 {
    public static void main(String[] args) throws InterruptedException {
         //. .Exercise2...
        //1-Driver oluşturalim
        WebDriver driver=new ChromeDriver();
        //2-Java class'imiza chnomedriver.exet i tanitalim
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver");
        //3-Driver'in tum ekranı kaplamasini saglayalim
        driver.manage().window().fullscreen();
        //4-Driverla sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini söyleyelim.
        // Eger oncesinde sayfa Yüklenirse, beklemeyi bıraksın.
        Thread.sleep(10000);
        //5-"https://www.otto.de" adresine gidelim
        driver.get("https://www.otto.de");
        //6-BU web adresinin sayfa basligini (title) ve adres (url)ini alalim
        String actualTitle= driver.getTitle();
        String actualUrl= driver.getCurrentUrl();
        //7-Title ve url inin "0TT0" kelimesinin içerip icermedigini kontrol edelim
        String expectedTitle="0TT0";
        String expectedUrl="0TT0";
        if (actualTitle.contains(expectedTitle))
            System.out.println("Title Test PASSED");
        else System.out.println("Title Test FAİLED");

        if (actualUrl.contains(expectedUrl))
            System.out.println("Url Test PASSED");
        else System.out.println("Url Test FAİLED");

        //8-Ardindan "https://wisequarter.com/" adresine gidip
        driver.get("https://wisequarter.com/");
        //9-BU adresin basligini alalim ve "Quarter" kelimesini icenip icermedigini kontrol edelim
        String actualTitleWQ=driver.getTitle();
        String expectedTitleWQ="Quarter";
        if (actualTitleWQ.contains(expectedTitleWQ))
            System.out.println("WQTitle Test PASSED");
        else System.out.println("WQTitle Test FAİLED");
        //10-Bir onceki web sayfamiza geri donelim
        driver.navigate().back();
        //11-Sayfayı yenileyelim
        driver.navigate().refresh();
        //12-Daha sonra web sayfamiza tekrar donelim ve oldugumuuz sayfayi kapatalim
        driver.navigate().forward();
        //13- En son adim olarak butun sayfalarimizi kapatmis olalim
        driver.close();
        driver.quit();
    }
}
