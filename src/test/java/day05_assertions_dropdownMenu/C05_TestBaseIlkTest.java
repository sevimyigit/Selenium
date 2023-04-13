package day05_assertions_dropdownMenu;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import day08_ecplicitlyWait_cookies_webTables.utilities.TestBase;

public class C05_TestBaseIlkTest extends TestBase {

    //amazona gidelim
    //nutella aratalim
    //sonuclarin nutella icerdigini test edelim

    @Test
    public void amazonTest(){
        driver.get("https://www.amazon.com");

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("nutella"+ Keys.ENTER);

        WebElement actualSonucYaziElementi= driver.findElement(By.xpath("//h1[@class='a-size-base s-desktop-toolbar a-text-normal']"));
        String expectedicerik="nutella";
        String actualSonucYazisi= actualSonucYaziElementi.getText();

        Assert.assertTrue(actualSonucYazisi.contains(expectedicerik));
    }

}
