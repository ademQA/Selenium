package tests.day02_WebDriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverManageMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://wisequarter.com");
        Thread.sleep(3000);
        System.out.println(driver.manage().window().getSize());//(1200, 652)
        System.out.println(driver.manage().window().getPosition()); //(22, 47)
        driver.manage().window().maximize();

        driver.close();
    }
}
