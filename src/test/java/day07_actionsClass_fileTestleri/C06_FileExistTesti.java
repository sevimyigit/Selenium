package day07_actionsClass_fileTestleri;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import day08_ecplicitlyWait_cookies_webTables.utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C06_FileExistTesti extends TestBase {

    @Test
    public void test01(){
        //2. https://the-internet.herokuapp.com/download adresine gidelim.
        driver.get("https://the-internet.herokuapp.com/download");
        //3. sample.png dosyasını indirelim
        driver.findElement(By.linkText("sample.png")).click();
        //4. Dosyanın başarıyla indirilip indirilmediğini test edelim
        bekle(5);
        // dosya downloads'a inecegi icin dinamik dosya yolu olusturalim
        String dinamikDosyaYolu= System.getProperty("user.home")+"\\Downloads\\sample.png";
        Assert.assertTrue(Files.exists(Paths.get(dinamikDosyaYolu)));
    }
}
