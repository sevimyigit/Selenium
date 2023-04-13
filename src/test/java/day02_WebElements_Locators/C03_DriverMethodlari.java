package day02_WebElements_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_DriverMethodlari {
    public static void main(String[] args) {
        //Yeni bir class olusturalim (Homework)
        //ChromeDriver kullanarak, facebook sayfasina gidin
        System.setProperty("Webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.facebook.com");
        // ve sayfa basliginin (title) “facebook” oldugunu dogrulayin (verify),
        // degilse dogru basligi yazdirin.
        String expectedTitle="facebook";
        String actualTitle=driver.getTitle();
        if (expectedTitle.equals(actualTitle)){
            System.out.println("facebook title testi PASSED");
        }else {
            System.out.println("facebook title testi FAILED"+
                   " \nGerceklesen title : " +actualTitle);
        }

        //Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin,
        // icermiyorsa “actual” URL’i yazdirin.
        String expectedurl="faccebook";
        String actualurl=driver.getCurrentUrl();

        if (actualurl.equals(actualurl)){
            System.out.println("facebook URL testi PASSED");
        }else {
            System.out.println("facebook URL testi FAILED" +
                    "\ngerceklesen URL : "+actualurl);
        }
        // https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.walmart.com");
        // Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String walmartexpextedicerik="Walmart.com";
        String walmartactualurl=driver.getTitle();
        if (walmartactualurl.contains(walmartexpextedicerik)){
            System.out.println("icerik dogrulandi");
        }else {
            System.out.println("icerik dogrulanmadi");
        }
        // Tekrar “facebook” sayfasina donun
          driver.navigate().back();
        // Sayfayi yenileyin
        driver.navigate().refresh();
        //Browser’i  kapatin
        driver.close();
    }
}
