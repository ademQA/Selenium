package tests.GrupCalismasi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;
public class C03_MuhammetHoca {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("wepdriver.chrome.driver","src/resources/chromedriver_win32.zip");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // ChromeDriver kullanarak, trenyol sayfasina gidin
        driver.navigate().to("https://www.trendyol.com");

        System.out.println(driver.getTitle());

        // ve sayfa basliginin (title) “trendyol” oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.

        String actualTitle= driver.getTitle();


        if (actualTitle.equals("trendyol")){
            System.out.println("passed");
        } else {
            System.out.println("failed");
        }

        // Nike elementinin gorunurlugunu test edin ve  elemente basin

        WebElement nikeElementi = driver.findElement(By.xpath("//span[text()=\"Nike\"]"));

        Thread.sleep(2000);

        if (nikeElementi.isDisplayed()){
            System.out.println("Passed");

        }else System.out.println("failed");

        nikeElementi.click(); // elemente bas
        Thread.sleep(4000);

        //fıyat sekmesının acılması

        driver.findElement(By.xpath("//div[@class=\"fltr-cntnr-ttl\" and text()=\"Fiyat\"]")).click();

        Thread.sleep(3000);

        // 0 -350 arasi fiyat suzulmesi
        driver.findElement(By.xpath("(//div[text()=\"0 TL - 350 TL\"])[1]")).click();
        Thread.sleep(2000);

        // filtrelenen fiyatlarin hepsinin list icine alinmasi

        List<WebElement> nikeList = driver.findElements(By.xpath("//div[@class=\"p-card-wrppr with-campaign-view\"]"));

        //listede 9. siradaki elementin bilgilerinin gosterilmesi
        System.out.println(nikeList.get(9).getText());


        driver.close();


    }
}
