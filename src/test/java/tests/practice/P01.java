package tests.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P01 {
    public static void main(String[] args) throws InterruptedException {

        //....Exercise-1:...
        //1. Create a new class with main method
        //2. Set Path
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver");
        //3. Create a chrome driver
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //4. Maximize window
        driver.manage().window().fullscreen();
        //5. Open google home page https://www.google.com
        driver.get("https://www.google.com");
        //6. On the same class,navigate to amazon home page https://www.amazon.com and navigate back to google
        driver.get("https://www.amazon.com");
        driver.navigate().back();
        //7. Wait about 4 sn
        Thread.sleep(4000);
        //8. Navigate forward to amazon
        driver.navigate().forward();
        //9. Refresh page
        driver.navigate().refresh();
        //10. Close / quit the browser
        driver.close();
        //11. And Last step print "All is well" on console
        System.out.println("All is well");

    }
}
