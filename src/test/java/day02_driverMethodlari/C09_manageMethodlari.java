package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C09_manageMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");
        /*
        Ilerde wait konusunu daha genis ele alicaz
        bir sayfa acilirken , ilk basta sayfanin icerisinde bulunan elementlere gore
        bir yuklenme suresine ihtiyac vardir
        veya bir web elementinin kullanilabilmesi icin zamana ihtiyac olabilir
        implicitlyWait bize sayfanin yuklenmesi ve sayfadaki elementlere ulasim icin beklenecek
        MAXİMUM sureyi belirmele olanagi tanir
         */
        driver.close();
    }
}
