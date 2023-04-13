package day07_actionsClass_fileTestleri;

import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C04_FilePath {

    @Test
    public void test01(){
        // bilgisayarimizin temel dosya yolu user.home

        // icinde bulundugumuz projenin temel dosya yolu user.dir


        String dosyaYolu="C:\\Users\\sevim\\OneDrive\\Desktop";
        boolean sonuc = Files.exists(Paths.get(dosyaYolu));
        System.out.println(sonuc);
        /*
            Bilgisayarimizda bir dosyanin var oldugunu test etmek icin
            dosya yoluna ihtiyacimiz var
            Ancak herkesin bilgisayarindaki dosya yollari
            farkliliklar gosterir
            herkesin bilgisayarina gore farkli olan kismi
            java'dan bir komut ile elde edebiliriz
         */
        System.out.println(System.getProperty("user.home"));
        dosyaYolu="C:\\Users\\sevim\\OneDrive\\Desktop\\emeklilik";

        dosyaYolu= System.getProperty("user.home") + "\\Desktop\\emeklilik";
         System.out.println(System.getProperty("user.dir"));
    }
}
