import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Logout extends BaseDriver {

    @Test
    public void Testexit() {
        driver.get("https://www.akakce.com/");

        WebElement login = driver.findElement(By.cssSelector("[rel='nofollow'][href='/akakcem/giris/']"));
        login.click();

        WebElement email = driver.findElement(By.cssSelector("[id='life']"));
        email.sendKeys("vokiwec222@dmener.com");

        WebElement password = driver.findElement(By.cssSelector("[id='lifp']"));
        password.sendKeys("Password123");

        WebElement submit = driver.findElement(By.cssSelector("[id='lfb']"));
        submit.click();

        WebElement account = driver.findElement(By.cssSelector("[id='HM_v8']>i>a"));
        account.click();

        WebElement exit = driver.findElement(By.cssSelector("[href='#Çık']"));
        exit.click();

        tearDown();
        tearDown();
    }
}
