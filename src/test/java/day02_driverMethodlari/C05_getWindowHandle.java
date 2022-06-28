package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_getWindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        System.out.println(driver.getWindowHandle());
        // CDwindow-DC8A03F799B811FB66F2A1B6E2FC98C3 benzersiz olarak acildigi window'a ait hashcode'unu verir


    }
}
