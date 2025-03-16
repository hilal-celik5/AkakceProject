import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class Login extends BaseDriver {
    public static void main(String[] args) {

        WebDriver tarayici=new ChromeDriver();
        tarayici.get("https://www.akakce.com/akakcem/giris/");

        WebElement eMail= tarayici.findElement(By.id("life"));
        eMail.sendKeys(":vokiwec222@dmener.com");

        WebElement password= tarayici.findElement(By.id("lifp"));
        password.sendKeys("Password123");

        MyFunc.Wait(2);
        tarayici.quit();

    }

}
