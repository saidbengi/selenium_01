package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_WebELementMethodlari {
    public static void main(String[] args) {

        /*
        1- amazon.com'a gidip arama kutusunu locate edin
        2- arama kutusunun tagName'inin input oldugunu test edin
        3- arama kutusunun name attribute'nun degerinin ...... oldugunu test edin
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1- amazon.com'a gidip arama kutusunu locate edin
        driver.get("https://www.amazon.com");
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));

        //  2- arama kutusunun tagName'inin input oldugunu test edin
        if (aramaKutusu.getTagName().equals("input")){
            System.out.println("arama kutusunun tagname input PASSED");
        }else{
            System.out.println("arama kutusunun tagname input degil FAİLED");
        }

        // 3- arama kutusunun name attribute'nun degerinin ...... oldugunu test edin

        if (aramaKutusu.getAttribute("name").equals("field-keywords")){
            System.out.println("name attribute testi PASSED");
        }else{
            System.out.println("name attribute testi FAİLED");
        }

        System.out.println("konum : "+aramaKutusu.getLocation());
        System.out.println("web elementin yuksekligi : "+aramaKutusu.getSize().height);
        driver.close();

        /*
        <input type="text" id="twotabsearchtextbox" value=""
        name="field-keywords" autocomplete="off" placeholder=""
        class="nav-input nav-progressive-attribute" dir="auto" tabindex="0" aria-label="Search">

        WebELementIsmi.getTagName()--> daha once locate ettigimiz bir web elementinin tagname'ni dondurur
        WebELementIsmi.getAttribute(Attribute Ismi)--> daha once locate ettigimiz bir web elementin
                                                        istedigim attribute'unun degerini dondurur
         */

    }
}
