package tests.day04_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_xpath {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        //2- Add Element butonuna basin
        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
        //3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButonElementi= driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));
        if (deleteButonElementi.isDisplayed())
            System.out.println("Test Delete Buton PASSED");
        else
            System.out.println("Test Delete Buton FİLED");
        //4- Delete tusuna basin
        deleteButonElementi.click();
        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveYaziElementi=driver.findElement(By.tagName("h3"));
        if (addRemoveYaziElementi.isDisplayed())
            System.out.println("Test addRemove yazı PASSED");
        else
            System.out.println("Test addRemove yazı FİLED");
        Thread.sleep(2000);
        driver.close();

    }
}
