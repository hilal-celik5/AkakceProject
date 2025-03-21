import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Deletion extends BaseDriver {

    @Test
    public void test() {

        driver.get("https://www.akakce.com/");
        MyFunc.Wait(2);

        WebElement giris = driver.findElement(By.cssSelector("[id='H_rl_v8']>:nth-child(2)"));
        giris.click();
        MyFunc.Wait(2);

        WebElement email = driver.findElement(By.cssSelector("[id='life']"));
        email.sendKeys(" vokiwec222@dmener.com");
        MyFunc.Wait(2);

        WebElement sifre = driver.findElement(By.cssSelector("input[type='password'][id='lifp']"));
        sifre.sendKeys("Password123");
        MyFunc.Wait(2);

        WebElement girişbutonu = driver.findElement(By.cssSelector("input[type='submit'][id='lfb']"));
        girişbutonu.click();
        MyFunc.Wait(2);

        WebElement hesap = driver.findElement(By.cssSelector("[id='HM_v8'] >i>a"));
        hesap.click();
        MyFunc.Wait(2);

        WebElement hesabimiSil = driver.findElement(By.cssSelector("[href='/akakcem/kullanici-bilgilerim/uyelik-iptali/']"));

        hesabimiSil.click();
        MyFunc.Wait(2);


        WebElement sifreGirdisi = driver.findElement(By.cssSelector("[id='p']"));
        sifreGirdisi.sendKeys("Password12");                            //Hesap silinmemesi için gecersiz bir sifre kullanildi.
        MyFunc.Wait(2);

        WebElement hesapsil = driver.findElement(By.cssSelector("[id='u']"));
        hesapsil.click();
        MyFunc.Wait(2);

        tearDown();
    }
}