package tests.day03_WebElements_Location;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_Locators {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //1- Bir test class’i olusturun ilgili ayarlari yapin
        //2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com");
        //3- Category bolumundeki elementleri locate edin
        List<WebElement>catagoriElementleriList=driver.findElements(By.className("panel-heading"));
        //4- Category bolumunde 3 element oldugunu test edin
        int expectedKategoriSayisi=3;
        int actualKategoriSayisi=catagoriElementleriList.size();

        if (expectedKategoriSayisi==actualKategoriSayisi)
            System.out.println("Kategori testi PASSED");
        else
            System.out.println("Kategori testi FAİLED");
        //5- Category isimlerini yazdirin
        for (WebElement eachElement:catagoriElementleriList) {
            System.out.println(eachElement.getText());
        }
        System.out.println(catagoriElementleriList);
        //6- Sayfayi kapatin
        Thread.sleep(3000);
        driver.close();
    }
}
