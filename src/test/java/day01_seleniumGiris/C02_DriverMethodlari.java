package day01_seleniumGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {
    public static void main(String[] args) throws InterruptedException {

        /*
           jar dosyalarini yukleyerek Selenium u kullanilir hale getirdik
           ancak her bir class in hangi browser ile calismasini istiyorsak o browser ile ilgili driver i
           class da tanimlamamiz lazim


         */

        System.setProperty("Webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        // https:// zorunlu ancak www zorunlu degil

        driver.get("https://wisequarter.com");

        Thread.sleep(3000);

        driver.close();
    }
}
