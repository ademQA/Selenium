package tests.day03_WebElements_Location;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class P01 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1.Amazon Ana sayfasına gidin
        driver.get("https://www.amazon.com");
        //2.Armacubuğuna Nutella yazıp aratın
        WebElement aramaCubugu= driver.findElement(By.id("twotabsearchtextbox"));
        aramaCubugu.sendKeys("Nutellla");
        aramaCubugu.submit();
        //3.Arama sonuçlarının Nutella içerdiğini Test edin
        WebElement aramacubuguElementi=driver.findElement(By.className("sg-col-inner"));

            String actualSonuc=aramacubuguElementi.getText();
            String expectedSonuc="Nutella";
            if (actualSonuc.contains(expectedSonuc))
                System.out.println("Nutella Arama Testi PASSED");
            else
                System.out.println("Nutella Arama Testi FAİLED Gerçek Sonuc:"+actualSonuc);

        Thread.sleep(3000);
        driver.close();
        }
}
