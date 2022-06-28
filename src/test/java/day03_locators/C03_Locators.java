package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_Locators {
    public static void main(String[] args) {

        //1. Bir class oluşturun: LoginTest
        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        //a. http://a.testaddressbook.com adresine gidiniz.
        //b. Sign in butonuna basin
        //c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        //d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        //i. Username : testtechproed@gmail.com
        //ii. Password : Test1234!
        //e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        //f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        //3. Sayfada kac tane link oldugunu bulun

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("https://a.testaddressbook.com");
        WebElement ayar2 =driver.findElement(By.id("details-button"));
        ayar2.click();
        WebElement ayar =driver.findElement(By.id("proceed-link"));
        ayar.click();
        //b. Sign in butonuna basin
       WebElement signInLinki= driver.findElement(By.id("sign-in"));
       signInLinki.click();
        //c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement mail= driver.findElement(By.id("session_email"));
        WebElement password= driver.findElement(By.id("session_password"));
        WebElement button = driver.findElement(By.name("commit"));
        //d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        mail.sendKeys("testtechproed@gmail.com");
        password.sendKeys("Test1234!");
        button.click();
        //e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        WebElement actualKullaniciAdiElementi= driver.findElement(By.className("navbar-text"));
        System.out.println(actualKullaniciAdiElementi.getText());
        String expectedMail="testtechproed@gmail.com";
        if (expectedMail.equals(actualKullaniciAdiElementi.getText())){
            System.out.println("Expected kullanici testi PASSED");
        }else {
            System.out.println("Expected kullanici testi FAILED");
        }// bir webElementinin uzerinde ne yazdigini gormek
        // istersek webElementi.getText() kullaniriz


        //f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).

        WebElement adressesELementi=driver.findElement(By.linkText("Addresses"));
        WebElement signOutElementi=driver.findElement(By.linkText("Sign out"));
        if (adressesELementi.isDisplayed()){
            System.out.println("adresses testi PASSED");
        }else{
            System.out.println("adresses testi FAİLED");
        }
        if (signOutElementi.isDisplayed()){
            System.out.println("sign out testi PASSED");
        }else{
            System.out.println("sign out testi FAİlED");
        }

        //3. Sayfada kac tane link oldugunu bulun

        List<WebElement>linklerListesi=driver.findElements(By.tagName("a"));
        System.out.println("sayfadaki link sayisi : "+linklerListesi.size());

        // linkleri yazdiralim

        for (WebElement each: linklerListesi) {
            System.out.println(each.getText());
        }

        driver.close();





    }
}
