import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class Login extends BaseDriver {
    @Test
    public void Test1() {

        driver.get("https://www.akakce.com/akakcem/giris/");

        WebElement eMail = driver.findElement(By.id("life"));
        eMail.sendKeys("vokiwec222@dmener.com");

        WebElement password = driver.findElement(By.id("lifp"));
        password.sendKeys("Password123");

        WebElement submit = driver.findElement(By.id("lfb"));
        submit.click();

        WebElement element= driver.findElement(By.cssSelector("[id='HM_v8']>i>a"));

        Assertions.assertTrue(element.getText().equals("TestUser"));
        System.out.println("merhaba");

        tearDown();
    }
}