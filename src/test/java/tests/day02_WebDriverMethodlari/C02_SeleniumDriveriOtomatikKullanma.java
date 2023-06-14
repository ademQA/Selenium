package tests.day02_WebDriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class C02_SeleniumDriveriOtomatikKullanma {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        Thread.sleep(3000);
        driver.get("http://www.amazon.com");
        driver.get("http://www.google.com");
        driver.close();
    }
}
