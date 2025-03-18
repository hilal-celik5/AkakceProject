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

    private Assertions Assert;

    @Test
    public void Test1() {

        driver.get("https://www.akakce.com/akakcem/giris/");

        WebElement eMail = driver.findElement(By.id("life"));
        eMail.sendKeys("vokiwec222@dmener.com");

        WebElement password = driver.findElement(By.id("lifp"));
        password.sendKeys("Password123");

        WebElement submit = driver.findElement(By.id("lfb"));
        submit.click();

        tearDown();


    }
}