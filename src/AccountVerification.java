import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utility.MyFunc.Wait;

public class AccountVerification extends BaseDriver {
    @Test//main yerine
    public void Test1() {
        driver.get("https://www.akakce.com/akakcem/giris/");

        WebElement email = driver.findElement(By.cssSelector("input[id='life']"));
        email.sendKeys("vokiwec222@dmener.com");

        WebElement password = driver.findElement(By.cssSelector("input[type='password']"));
        password.sendKeys("Password123");

        WebElement submit = driver.findElement(By.cssSelector("input[id='lfb'][type='submit'][class='s'][value='Giriş yap']"));
        submit.click();

        WebElement shoppingCartMesaj = driver.findElement(By.cssSelector("[id='HM_v8']>[rel='nofollow'][href='/akakcem/'][title='Hesabım']"));
        shoppingCartMesaj.click();

        WebElement profilismi = driver.findElement(By.cssSelector("[rel='nofollow'][href='/akakcem/']"));
        Assert.assertTrue("Profil ", profilismi.getText().contains("TestUser"));

        tearDown();
        }
    }

