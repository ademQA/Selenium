package tests.day04_xpath;
//0.Mahşerin 4 atlısını yazınız...
//1.https://demoqa.com/elements  adresine gidin .
//2.Açılan Sayfadan "Text box"'a tıklayınız.
//3.Karşımıza gelen "Full Name" isimli bölüme isminizi yazdırınız.
//4.Alt satırdaki "Email" isimli bölüme e-mail adresinizi yazdırınız.
//5.Alt satırdaki "Current Address" bölümüne güncel adresini yazdırınız.
//6.TextArea  isminde "Adres" sözcüğünün içerip içermediğini test ediniz.
//7. Eğer "Adres" sözcüğü içeriyorsa ;
//Alttaki "Permanent Adres" bölümüne "Buraya kadar doğru yaptığım için KENDİMİ TEBRİK ediyorum" yazdırın.
//Eğer içermiyorsa "OĞLUMU/KIZIMI Güzel Karnesinden dolayı TEBRİK ediyorum" yazdırın
//8.Alltaki "Submit" bölümüne gidip butonu "click" ediniz.
//9.Alttaki "Checks box" bölümüne gidip check box seçili olmadığını test ediniz.
//10.Sayfayı kapatınız.


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;

public class C05_Ornek01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1.https://demoqa.com/elements  adresine gidin .
        driver.get("https://demoqa.com/elements ");

        //2.Açılan Sayfadan "Text box"'a tıklayınız.
        driver.findElement(By.id("item-0")).click();

        //3.Karşımıza gelen "Full Name" isimli bölüme isminizi yazdırınız.
        WebElement fullNameTextBox=driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        fullNameTextBox.sendKeys("Adem Tekinel");

        //4.Alt satırdaki "Email" isimli bölüme e-mail adresinizi yazdırınız.
        WebElement emailTextBox= driver.findElement(By.cssSelector("input[type='email']"));
        emailTextBox.sendKeys("ademit@gmail.com");

        //5.Alt satırdaki "Current Address" bölümüne güncel adresini yazdırınız.
        List<WebElement> currentAdressTextArea= driver.findElements(By.tagName("textarea"));
        WebElement textarea1=currentAdressTextArea.get(0);
        textarea1.sendKeys("Kocaeli");
        Thread.sleep(2000);

        //6.TextArea  isminde "Adres" sözcüğünün içerip içermediğini test ediniz.
        WebElement textAreaText= driver.findElement(By.xpath("//label[text()='Current Address']"));
        String actualText= textAreaText.getText();
        System.out.println(actualText);
        String expectedText="Adres";
        WebElement textarea2=currentAdressTextArea.get(1);
        if (actualText.contains(expectedText)){
            System.out.println("Current Text Test PASSED");

            textarea2.sendKeys("Buraya kadar doğru yaptığım için KENDİMİ TEBRİK ediyorum");
        }
        else
        {System.out.println("Current Text Test FAİLED");
            textarea2.sendKeys("OĞLUMU/KIZIMI Güzel Karnesinden dolayı TEBRİK ediyorum");
        }
        Thread.sleep(2000);

        //7. Eğer "Adres" sözcüğü içeriyorsa ;
        //Alttaki "Permanent Adres" bölümüne "Buraya kadar doğru yaptığım için KENDİMİ TEBRİK ediyorum" yazdırın.
        //Eğer içermiyorsa "OĞLUMU/KIZIMI Güzel Karnesinden dolayı TEBRİK ediyorum" yazdırın

        //8.Alltaki "Submit" bölümüne gidip butonu "click" ediniz.
        driver.findElement(By.id("submit")).click();
        Thread.sleep(2000);

        //9.Alttaki "Checks box" bölümüne gidip check box seçili olmadığını test ediniz.
       driver.findElement(By.xpath("//span[text()='Check Box']")).click();
        WebElement checkBox= driver.findElement(By.className("rct-checkbox"));
        //checkBox.click();

        if (checkBox.isSelected())
            System.out.println("Check Box Test FAİLED");
        else
            System.out.println("Check Box Test PASSED");

        //10.Sayfayı kapatınız.
        Thread.sleep(3000);
        driver.close();
    }
}
