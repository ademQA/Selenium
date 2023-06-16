package tests.day03_WebElements_Location;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class P02 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // 1.amazon anasayfaya gidelim
        driver.get("https://amazon.com");
        // 2.arama kutusuna Nutella yazip aratalim
        WebElement aramaButonu= driver.findElement(By.id("twotabsearchtextbox"));
        aramaButonu.sendKeys("Nutella");
        aramaButonu.submit();
        // 3.gosterilen urun resimlerinin 10'dan fazla oldugunu test edin
        List<WebElement>urunResimList=driver.findElements(By.xpath("//span[@class=\"a-size-base-plus a-color-base a-text-normal\"]"));
        if (urunResimList.size()>10)
            System.out.println("Resim Test PASSED Total Sayı:"+urunResimList.size());
        else
            System.out.println("Resim Test FAİLED Total Sayı:"+urunResimList.size());

        // 4.urun ismini yazdirin ve ismin Nutella icerdigini test edin
        String urunIsim=urunResimList.get(3).getText();
        System.out.println(urunIsim);
        if (urunIsim.contains("Nutella"))
            System.out.println("Urun isim Test PASSED");
        else
            System.out.println("Urun isim Test FAİLED");
        Thread.sleep(3000);
        driver.close();

    }
}
