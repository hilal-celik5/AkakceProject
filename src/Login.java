import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends BaseDriver {
    @Test
    public void Test1() {

        driver.get("https://www.akakce.com/");

        WebElement loginLink= driver.findElement(By.cssSelector("[id='H_rl_v8']>a+a"));
        loginLink.click();

        WebElement eMail = driver.findElement(By.cssSelector("[id='life']"));
        eMail.sendKeys("vokiwec222@dmener.com");

        WebElement password = driver.findElement(By.cssSelector("[id='lifp']"));
        password.sendKeys("Password123");

        WebElement loginButton = driver.findElement(By.cssSelector("[id='lfb']"));
        loginButton.click();

        WebElement element= driver.findElement(By.cssSelector("[id='HM_v8']>i>a"));

        Assert.assertTrue(element.getText().equals("TestUser"));

        tearDown();
    }
}
