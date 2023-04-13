package day02_WebElements_Locators;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_driverManagementMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        System.out.println("ilk size" +driver.manage().window().getSize());
        System.out.println("ilk position" +driver.manage().window().getPosition());

        //olculeri ve konumu degistirelim
        driver.manage().window().setSize(new Dimension(800,800));
        driver.manage().window().setPosition(new Point(40,100));

        System.out.println("ilk size" +driver.manage().window().getSize());
        System.out.println("ilk position" +driver.manage().window().getPosition());


        Thread.sleep(2000);
        driver.close();
    }
}
