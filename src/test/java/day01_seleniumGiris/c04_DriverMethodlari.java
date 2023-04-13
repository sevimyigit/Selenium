package day01_seleniumGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c04_DriverMethodlari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://wisequarter.com");

        System.out.println(driver.getWindowHandle());
        //CDwindow-70522644F5F10FC4D3FF1DFFC28606CA
        //CDwindow-7312B32A41C9A40F3632E681759CAB7D


        // getWindowHandle selenium tarafindan her driver sayfasi icin uretilen
        // unique handle degerini döndürür
        // getWindowHandels() ise test sirasinda birden fazla sayfa acilmissa
        // bir set olarak, tum sayfalarin window handle degerlerini döndürür
        System.out.println(driver.getPageSource());
        // sayfa kodlari "2 hours weekly meeting with the team" iceriyor mu test edin
        String expectedIcerik = "2 hours weekly meeting with the team";
        String actualSayfaKodlari = driver.getPageSource();
        if (actualSayfaKodlari.contains(expectedIcerik)){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }
        driver.quit();
        // close() ve quit() ikisi de sayfa kapatmak icin kullanilir
        // close() sadece bir sayfa kapatirken
        // quit() test sirasinda acilan tum sayfalari kapatir
    }
}
