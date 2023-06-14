package tests.day03_WebElements_Location;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_AmazonAramaTesti {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Amazon Ana sayfasına gidin
        driver.get("https://www.amazon.com");
        WebElement aramaKutusuElementi=driver.findElement(By.id("twotabsearchtextbox"));
        //Armacubuğuna Nutella yazıp aratın
        aramaKutusuElementi.sendKeys("Nutella");
        aramaKutusuElementi.submit();
        //Arama sonuçlarının Nutella içerdiğini Test edin
        WebElement aramaSonucElementi=driver.findElement(By.className("sg-col-inner"));
        System.out.println(aramaSonucElementi.getText());

        String expectedIcerik = "Nutella";
        String actualSonucYazisi = aramaSonucElementi.getText();

        if(actualSonucYazisi.contains(expectedIcerik)){
            System.out.println("Nutella arama testi PASSED");
        }else {
            System.out.println("Nutella arama testi FAILED");
        }

        Thread.sleep(2000);
        driver.close();

    }
}
