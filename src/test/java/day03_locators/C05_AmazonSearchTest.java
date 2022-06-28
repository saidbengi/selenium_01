package day03_locators;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C05_AmazonSearchTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        /*
        1. Bir class oluşturun : AmazonSearchTest
        2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        a.web sayfasına gidin. https://www.amazon.com/
        b. Search(ara) “city bike”
        c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        d. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
         */

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // a.web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com");

        // b. Search(ara) “city bike”
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Iphone");
        WebElement arama=driver.findElement(By.id("nav-search-submit-button"));
        arama.click();

        //  c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        List<WebElement>istenenELementListesi=driver.findElements(By.className("sg-col-inner"));
        WebElement sonucYazisiElementi=istenenELementListesi.get(0);
        System.out.println(sonucYazisiElementi.getText());
        //d. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        List<WebElement>urunResimleriList=driver.findElements(By.className("s-image"));
        WebElement ilkUrunResmi=urunResimleriList.get(0);
        ilkUrunResmi.click();

        driver.close();


    }
}
