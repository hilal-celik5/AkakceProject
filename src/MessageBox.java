import Utility.BaseDriver;
import junit.framework.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MessageBox extends BaseDriver {

    @Test
    public void MessageBoxCheck() throws InterruptedException {

        driver.get("https://www.akakce.com/");

        WebElement butonLogin = driver.findElement(By.cssSelector("[id='H_rl_v8']>a+a"));
        butonLogin.click();

        WebElement textEmail = driver.findElement(By.cssSelector("[id='life']"));
        textEmail.sendKeys("vokiwec222@dmener.com");

        WebElement textPassword = driver.findElement(By.cssSelector("[id='lifp']"));
        textPassword.sendKeys("Password123");

        WebElement buttonSubmit = driver.findElement(By.cssSelector("[id='lfb']"));
        buttonSubmit.click();

        WebElement buttonAccount = driver.findElement(By.cssSelector("[id='HM_v8']>i>a"));
        buttonAccount.click();

        WebElement buttonMessage = driver.findElement(By.cssSelector("a[href='/akakcem/mesajlarim/']"));
        buttonMessage.click();

        WebElement txtMessage = driver.findElement(By.cssSelector("[class='wbb_v8']>p"));

        Assert.assertTrue(txtMessage.getText().contains("Listelenecek mesaj bulunamadı."));

        tearDown();
    }
}
