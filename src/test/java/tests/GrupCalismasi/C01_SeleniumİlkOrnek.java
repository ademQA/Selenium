package tests.GrupCalismasi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_SeleniumİlkOrnek {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
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
    }
}
