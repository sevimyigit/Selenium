package day01_seleniumGiris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_DriverMethodlari {
    public static void main(String[] args) {




        System.setProperty("Webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");

        System.out.println("URL :" + driver.getCurrentUrl());
        System.out.println("title : "+driver.getTitle());


        String expectedIcerik="amazon";
        String actualurl=driver.getCurrentUrl();

        if (actualurl.contains(expectedIcerik)){
            System.out.println("test passed");
        }else {
            System.out.println("test failed");
        }

        driver.close();

    }
}
