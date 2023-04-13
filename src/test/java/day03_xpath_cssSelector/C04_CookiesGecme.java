package day03_xpath_cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_CookiesGecme {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.google.com");
           //cookies kabul etme
        driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();

        //arama cubuguna java yazip bulunan sonuc sayisinin 100binden cok oldugunu test edin
        WebElement aramacubugu= driver.findElement(By.xpath("//input[@name='q']"));

        aramacubugu.sendKeys("Java" + Keys.ENTER);

        WebElement sonucsayielementi=driver.findElement(By.xpath("//div[@id='result-stats']"));

       //About 1,590,000,000 results (0.36 seconds)

        String sonucYazisi= sonucsayielementi.getText();
        String[] sonucYaziArr=sonucYazisi.split(" ");
        String sonucSayisiStr= sonucYaziArr[1]; // 1.350.000.000
        sonucSayisiStr = sonucSayisiStr.replaceAll("\\D","");

        int actualSonucSayisi= Integer.parseInt(sonucSayisiStr);
        int expectedSonucSayisi=100000;
        if (actualSonucSayisi>expectedSonucSayisi){
            System.out.println("Arama sonuc sayisi testi PASSED");
        }else {
            System.out.println("Arama sonuc sayisi testi FAILED");
        }

        driver.close();




    }
}
