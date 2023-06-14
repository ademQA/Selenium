package tests.day02_WebDriverMethodlari;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C09_Deneme {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        WebElement name=driver.findElement(By.id("userName"));
        name.click();
        name.sendKeys("Adem");

        WebElement useremail=driver.findElement(By.id("userEmail"));
        useremail.sendKeys("ademtekinel@gmail.com");

        WebElement textArea=driver.findElement(By.id("currentAddress" ));
        textArea.sendKeys("tatlıkuyu mah");

        driver.close();
    }
}
