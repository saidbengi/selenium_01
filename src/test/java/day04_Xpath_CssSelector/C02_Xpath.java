package day04_Xpath_CssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Xpath {
    public static void main(String[] args) throws InterruptedException {

        /*
        <img class="s-image" src="https://m.media-amazon.com/images/I/61yMfCA1LeL._AC_UY218_.jpg"
        srcset="https://m.media-amazon.com/images/I/61yMfCA1LeL._AC_UY218_.jpg 1x,
        https://m.media-amazon.com/images/I/61yMfCA1LeL._AC_UY327_FMwebp_QL65_.jpg 1.5x,
        https://m.media-amazon.com/images/I/61yMfCA1LeL._AC_UY436_FMwebp_QL65_.jpg 2x,
        https://m.media-amazon.com/images/I/61yMfCA1LeL._AC_UY545_FMwebp_QL65_.jpg 2.5x,
        https://m.media-amazon.com/images/I/61yMfCA1LeL._AC_UY654_FMwebp_QL65_.jpg 3x"
        alt="Sponsored Ad - DRIFT MANIAC Single Chainring Bike Crank Arm Set 52/42T 170mm 130BCD
        Crankset Square Taper for City Folding..." data-image-index="1"
        data-image-load="" data-image-latency="s-product-image" data-image-source-density="1">
         */
 /*
        1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        2- Add Element butonuna basin
        3- Delete butonu’nun gorunur oldugunu test edin
        4- Delete tusuna basin
        5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin

         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //  1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        // 2- Add Element butonuna basin
        Thread.sleep(3000);
        // driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
        // driver.findElement(By.xpath("//button[text()='Add Element']")).click();
        driver.findElement(By.xpath("//*[text()='Add Element']")).click();
        // addButonu.click(); bu da olur ama bunun icin webelement olustulucak

        // 3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButonu= driver.findElement(By.xpath("//button[@class='added-manually']"));
        if (deleteButonu.isDisplayed()){
            System.out.println("Delete butonu PASSED");
        }else{
            System.out.println("Delete butonu FAİLED");
        }

        //  4- Delete tusuna basin
        Thread.sleep(3000);
        deleteButonu.click();

        //  5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement title=driver.findElement(By.xpath("//h3"));

        if (title.isDisplayed()){
            System.out.println("Title PASSED");
        }else {
            System.out.println("Title FAİLED");
        }

        Thread.sleep(3000);
        driver.close();
    }



    }

