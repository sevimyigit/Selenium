package day02_WebElements_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C05_FindElements {
    public static void main(String[] args) throws InterruptedException {

        //amazon ana sayfaya gidin

        System.setProperty("Webdriver.chrome.drive","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");


        //arama kutusuna java yazip aratin

        WebElement aramakutusu= driver.findElement(By.id("twotabsearchtextbox"));
        aramakutusu.sendKeys("java");
        aramakutusu.submit();

        //arama sonuclarinda cikan resimlerdeki yazilari yazdirin

        List<WebElement> aramasonuclariElementlistesi =driver.findElements(By.className("sg-col-inner"));
        System.out.println(aramasonuclariElementlistesi.size()); //85

        //85 elementi yazdiralim
        int elementNo=1;
        for (WebElement eachElement:aramasonuclariElementlistesi
             ) {
            System.out.println(elementNo+"---"+eachElement.getText());
            elementNo++;
        }
        Thread.sleep(3000);
        driver.close();
    }
}
