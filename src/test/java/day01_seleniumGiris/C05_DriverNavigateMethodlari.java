package day01_seleniumGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_DriverNavigateMethodlari {
    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //amazon anasayfasina gidin

        driver.get("https://amazon.com");

        //wisequarter sitesine gidin

        driver.get("https://wisequarter.com");

        //yeniden amazon sayfasina gidin
        driver.navigate().back();

        //wisequarter anasayfasina gidin
        driver.navigate().forward();

        //navigate().to() driver.get() ile ayni ozelliktedir
        driver.navigate().to("https://www.youtube.com");

        driver.navigate().refresh();
    }
}
