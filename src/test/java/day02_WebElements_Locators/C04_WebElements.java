package day02_WebElements_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_WebElements {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //amazon ana sayfaya gidin

        driver.get("https://www.amazon.com");
        //sonra arama kutusunu locate edip bir webelement olarak kaydedin
        //Id 'si "twotabsearchtextbox" olam webelement seklinde locate edecegiz

        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        /*
          driver'a web elemnti tarif etme islemine "Locate" ,
          bu tarifi yapabilmek icin kullanabilecegim degiskenlere de "locator" denir.

          8 tane Locator vardir.
          Locator'larin 6 tanesi web elementin ozelliklerine baglidir
          -id
          -classname
          -name
          -tagname
          -linkText
          -partialLinkText

          Geriye kalan 2 Locator ise her turlu web elementi locate etmek icin kullanilabilir
          -xpath
          -cssSelector
         */

        //arama kutusuna "Nutella" yazip aratin

        aramaKutusu.sendKeys("Nutella");
        aramaKutusu.submit();

        Thread.sleep(3000);
        driver.close();


    }
}
