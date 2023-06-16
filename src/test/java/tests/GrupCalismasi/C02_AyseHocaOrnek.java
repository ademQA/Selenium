package tests.GrupCalismasi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_AyseHocaOrnek {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
        //1- https://www.youtube.com adresine git

        driver.get("https://www.youtube.com");

        //2- arama cubugunu tanımlayalım

        WebElement aramaCubuguElementi = driver.findElement(By.xpath("//input[@id=\"search\"]"));

        //3- Arama çubuğuna "ahmet bulutluoz" yaz ve giris yapin.

        aramaCubuguElementi.sendKeys("ahmet bulutluoz");
        aramaCubuguElementi.submit();


        //4- Abone butonunda "abone ol" text inin görünürlügunu test et

        WebElement aboneOlButonuElementi = driver.findElement(By.xpath("//*[@aria-label=\"Abone ol\"]"));
        if (aboneOlButonuElementi.isDisplayed()){
            System.out.println("cok ayip etmissiniz");
            //5- abone degilsen submit ol

            aboneOlButonuElementi.click();

            WebElement emailSubmitElementi = driver.findElement(By.xpath("//input[@id=\"identifierId\"]"));
            emailSubmitElementi.sendKeys("aysenur.algul34@gmail.com");
            Thread.sleep(3000);

            WebElement sonrakiButon1Element = driver.findElement(By.xpath("//span[text()=\"Sonraki\"]"));
            sonrakiButon1Element.click();
            Thread.sleep(5000);

            // otomasyon programı oldugu için giriş yapılamadi.
        } else {
            System.out.println("Aferin.. dogru yoldasin!!");
        }

        //6- Brouser i kapat
        driver.close();
    }
}
