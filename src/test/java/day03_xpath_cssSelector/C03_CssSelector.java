package day03_xpath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_CssSelector {
    public static void main(String[] args) {
        //1-  bir class olusturun
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2-  https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");
        //3-  Browseri tam sayfa yapin
        //4-  Sayfayi “refresh” yapin
        //5-  Sayfa basliginin “Spend less” ifadesi icerdigini test edin
              String expectedicerik="spend less";
              String actualtitle=driver.getTitle();

              if (actualtitle.contains(expectedicerik)){
                  System.out.println("title testi PASSED");
              }else {
                  System.out.println("title testi FAILED");
              }

        //6-  Gift Cards sekmesine basin
         driver.findElement(By.cssSelector("a[data-csa-c-content-id='nav_cs_gc']")).click();

        //7-  Birthday butonuna basin

        driver.findElement(By.cssSelector("a[aria-label='Birthday']")).click();
        //8-  Best Seller bolumunden ilk urunu tiklayin
        driver.findElement(By.xpath("//*[@id=\"acs-product-block-0\"]/div[1]/a/img")).click();
        //9-  Gift card details’den 25 $’i  secin
        driver.findElement(By.cssSelector("#gc-mini-picker-amount-1")).click();

        //10- Urun ucretinin 25$ oldugunu test edin
        WebElement ucretelementi= driver.findElement(By.cssSelector("#gc-live-preview-amount"));
        String expecteducret="25$";
        String actualucret=ucretelementi.getText();

        if (expecteducret.equals(actualucret)){
            System.out.println("test passed");
        }else {
            System.out.println("test failed");
        }


        //11-sayfayi kapatin
        driver.close();

    }
}
