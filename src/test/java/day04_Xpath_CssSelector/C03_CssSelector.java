package day04_Xpath_CssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_CssSelector {
    public static void main(String[] args) throws InterruptedException {

        /*
        1 ) Bir class oluşturun : Locators_css
        2 ) Main method oluşturun ve aşağıdaki görevi tamamlayın.
        a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        b. Locate email textbox
        c. Locate password textbox ve
        d. Locate signin button
        e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
        i. Username : testtechproed@gmail.com
        ii. Password : Test1234!
        NOT: cssSelector kullanarak elementleri locate ediniz.

         */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in");

        //b. Locate email textbox
        // WebElement mailBox=driver.findElement(By.cssSelector("input[type='email']"));
        WebElement mailBox=driver.findElement(By.cssSelector("#session_email"));

        //c. Locate password textbox ve
        // WebElement passwordBox=driver.findElement(By.cssSelector("input[type='password']"));
        WebElement passwordBox=driver.findElement(By.cssSelector("#session_password"));

        //  d. Locate signin button
       // WebElement signBox=driver.findElement(By.cssSelector("input[type='submit']"));
        WebElement signBox=driver.findElement(By.cssSelector("input[value='Sign in']"));

        // e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın

        mailBox.sendKeys("testtechproed@gmail.com");
        passwordBox.sendKeys("Test1234!");
        signBox.click();

        Thread.sleep(2000);

        driver.close();






    }
}