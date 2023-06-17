package tests.GrupCalismasi;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.WatchEvent;
import java.time.Duration;

public class C01_SeleniumİlkOrnek {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
        //0.Mahşerin 4 atlısını yazınız...
//1.https://demoqa.com/elements  adresine gidin .
        driver.get("https://demoqa.com/elements");
//2.Açılan Sayfadan "Text box"'a tıklayınız.
        driver.findElement(By.xpath("(//li[@id='item-0'])[1]")).click();
//3.Karşımıza gelen "Full Name" isimli bölüme isminizi yazdırınız.

        driver.findElement(By.xpath("//input[@placeholder='Full Name']")).sendKeys("Adem Tekin");
//4.Alt satırdaki "Email" isimli bölüme e-mail adresinizi yazdırınız.
        driver.findElement(By.cssSelector("input[type='email']")).sendKeys("aykulgalip10@gmail.com");

//5.Alt satırdaki "Current Address" bölümüne güncel adresini yazdırınız.
        driver.findElement(By.tagName("textarea")).sendKeys("TOKAT");
//6.TextArea  isminde "Adres" sözcüğünün içerip içermediğini test ediniz
        WebElement adresElement=driver.findElement(By.id("currentAddress-label"));
        String actualAdres=adresElement.getText();
        String expectedAdres="Adres";
        if (actualAdres.contains(expectedAdres))
        {
            System.out.println("Adres testi PASSED");
            driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("Buraya kadar doğru yaptığım için KENDİMİ TEBRİK ediyorum"+ Keys.ENTER);
        }
        else
        {
            System.out.println("Adres testi FAİLED");
            driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("OĞLUMU/KIZIMI Güzel Karnesinden dolayı TEBRİK ediyorum"+ Keys.ENTER);
        }
// .
//7. Eğer "Adres" sözcüğü içeriyorsa ;
//Alttaki "Permanent Adres" bölümüne "Buraya kadar doğru yaptığım için KENDİMİ TEBRİK ediyorum" yazdırın.

//Eğer içermiyorsa "OĞLUMU/KIZIMI Güzel Karnesinden dolayı TEBRİK ediyorum" yazdırın
//8.Alltaki "Submit" bölümüne gidip butonu "click" ediniz.
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#submit")).click();
        Thread.sleep(5000);
//9.Alttaki "Checks box" bölümüne gidip check box seçili olmadığını test ediniz.
        driver.findElement(By.xpath("//span[text()='Check Box']")).click();
        Thread.sleep(5000);

        Thread.sleep(3000);
        WebElement checkBox=driver.findElement(By.className("rct-checkbox"));
     //  if (driver.findElement(By.className("rct-checkbox")).isSelected())
       //    System.out.println("Test FAİLED");
      // else
       //    System.out.println("Test PAESSED");

        Thread.sleep(3000);
        if (checkBox.isSelected())
        { System.out.println("Test PAESSED");}
        else
        {  System.out.println("Test FAİLED");}
        checkBox.click();

//10.Sayfayı kapatınız.
        driver.close();
    }
}
