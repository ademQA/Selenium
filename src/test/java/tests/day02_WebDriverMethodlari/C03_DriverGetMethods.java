package tests.day02_WebDriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_DriverGetMethods {
    public static void main(String[] args) throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://wisequarter.com");
        Thread.sleep(3000);
        System.out.println(driver.getTitle());  //Wise Quarter Course – Deliver more than expected
        String baslik=driver.getTitle();
        if (baslik.contains("Wise"))
        {
            System.out.println("Title testi passed");
        }else
        {
            System.out.println("Title wise içermiyor, test failed ");
        }

        //Url 'nin http://wisequarter.com olduğunu test edin

        String expectedUrl="http://wisequarter.com";
        String actualUrl=driver.getCurrentUrl();
        if (expectedUrl.contains(actualUrl))
        {
            System.out.println("Url testi passed");
        }else
        {
            System.out.println("Url Testi Failed, Actual Url:"+actualUrl);
        }

        System.out.println(driver.getPageSource());

        System.out.println(driver.getWindowHandles()); //[F400F785F6B92FC9547A62514E2E9150]
        System.out.println(driver.getWindowHandles());  //


        driver.close();

    }
}
