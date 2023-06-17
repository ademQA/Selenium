package tests.day03_WebElements_Location;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class P03 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //1- Bir test class’i olusturun ilgili ayarlari yapin
        //2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com/ ");

        //3- Category bolumundeki elementleri locate edin
        List<WebElement>kategoriElement=driver.findElements(By.className("panel-heading"));

        //4- Category bolumunde 3 element oldugunu test edin
        if (kategoriElement.size()==3)
            System.out.println("Kategori Test PASSED");
        else
            System.out.println("Kategori Test FAİLED");
        //5- Category isimlerini yazdirin
        for (WebElement eachKategori:kategoriElement) {
            System.out.println(eachKategori.getText());
        }

        //6- Sayfayi kapatin
        Thread.sleep(3000);
        driver.close();
    }
}
