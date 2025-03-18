import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OrderList extends BaseDriver {

    @Test
    public void Test1() {

        driver.get("https://www.akakce.com/");

        WebElement login = driver.findElement(By.cssSelector("[id='H_rl_v8']>a+a"));
        login.click();

        WebElement email = driver.findElement(By.cssSelector("[id='life']"));
        email.sendKeys("vokiwec222@dmener.com");

        WebElement password = driver.findElement(By.cssSelector("[id='lifp']"));
        password.sendKeys("Password123");

        WebElement loginButton = driver.findElement(By.cssSelector("[id='lfb']"));
        loginButton.click();

        WebElement account = driver.findElement(By.cssSelector("[id='H_a_v8']"));
        account.click();

        WebElement myAccount = driver.findElement(By.cssSelector("[id='HM_p_v8']+li+li+li+li"));
        myAccount.click();

        WebElement myOrders = driver.findElement(By.cssSelector("[href='/akakcem/siparislerim/']"));
        myOrders.click();

        WebElement message = driver.findElement(By.cssSelector("[class='no-record']"));

        Assert.assertTrue("Kayıtlı siparişiniz bulunmuyor.", message.getText().contains("Kayıtlı siparişiniz bulunmuyor."));

        tearDown();
    }
}
