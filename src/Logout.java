import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Logout extends BaseDriver {

    @Test

    public void Test1(){

        driver.get("https://www.akakce.com/akakcem/giris/");

        WebElement email = driver.findElement(By.cssSelector("input[id='life']"));
        email.sendKeys(("vokiwec222@dmener.com"));


    }

}
