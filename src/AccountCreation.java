import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class AccountCreation extends BaseDriver {
    @Test
    public void Test1Pozitif() {
        driver.get("https://www.akakce.com/");

        WebElement account = driver.findElement(By.cssSelector("[href='/akakcem/giris/?m=1&s=1'][rel='nofollow']"));
        account.click();

        WebElement name = driver.findElement(By.cssSelector("[id=rnufn]"));
        name.sendKeys("TestUser");

        WebElement surname = driver.findElement(By.cssSelector("[id=rnufs]"));
        surname.sendKeys("Tester");

        WebElement email = driver.findElement(By.cssSelector("[id=rnufe1]"));
        email.sendKeys("vokiwec222@dmener.com");

        WebElement email2 = driver.findElement(By.cssSelector("[id='rnufe2']"));
        email2.sendKeys("vokiwec222@dmener.com");

        WebElement password = driver.findElement(By.cssSelector("[id='rnufp1']"));
        password.sendKeys("Password123");

        WebElement password2 = driver.findElement(By.cssSelector("[id='rnufp2']"));
        password2.sendKeys("Password123");

        WebElement submitwomen = driver.findElement(By.cssSelector("input[id='rngf']"));
        submitwomen.click();

        WebElement county = driver.findElement(By.cssSelector("[id='locpr']>[value='33']"));
        county.click();

        WebElement district = driver.findElement(By.cssSelector("[id='locds']>[value='415']"));
        district.click();

        WebElement day = driver.findElement(By.cssSelector("[id='bd']>[value='1']"));
        day.click();

        WebElement month = driver.findElement(By.cssSelector("[id='bm']>[value='1']"));
        month.click();

        WebElement year = driver.findElement(By.cssSelector("[id='by']>[value='1990']"));
        year.click();

        WebElement contract = driver.findElement(By.cssSelector("[id='rnufpca']"));
        contract.click();

        WebElement submit = driver.findElement(By.cssSelector("[id='rfb']"));
        submit.click();

        WebElement verify = driver.findElement(By.cssSelector("div[id='HM_v8']>i>a"));
        Assert.assertTrue("Aranan hesap bulunamadı", verify.getText().contains("TestUser"));

        tearDown();
    }
    @Test
    public void Test2Negative() {
        driver.get("https://www.akakce.com/");

        WebElement account = driver.findElement(By.cssSelector("[href='/akakcem/giris/?m=1&s=1'][rel='nofollow']"));
        account.click();

        WebElement name = driver.findElement(By.cssSelector("[id=rnufn]"));
        name.sendKeys("TestUser123");

        WebElement surname = driver.findElement(By.cssSelector("[id=rnufs]"));
        surname.sendKeys("Tester3");

        WebElement email = driver.findElement(By.cssSelector("[id=rnufe1]"));
        email.sendKeys("vokiwec222@dmener.com");

        WebElement email2 = driver.findElement(By.cssSelector("[id='rnufe2']"));
        email2.sendKeys("vokiwec222@dmener.com");

        WebElement password = driver.findElement(By.cssSelector("[id='rnufp1']"));
        password.sendKeys("Password123");

        WebElement password2 = driver.findElement(By.cssSelector("[id='rnufp2']"));
        password2.sendKeys("Password123");

        WebElement submitwomen = driver.findElement(By.cssSelector("input[id='rngf']"));
        submitwomen.click();

        WebElement county = driver.findElement(By.cssSelector("[id='locpr']>[value='33']"));
        county.click();

        WebElement district = driver.findElement(By.cssSelector("[id='locds']>[value='415']"));
        district.click();

        WebElement day = driver.findElement(By.cssSelector("[id='bd']>[value='1']"));
        day.click();

        WebElement month = driver.findElement(By.cssSelector("[id='bm']>[value='1']"));
        month.click();

        WebElement year = driver.findElement(By.cssSelector("[id='by']>[value='1990']"));
        year.click();

        WebElement contract = driver.findElement(By.cssSelector("[id='rnufpca']"));
        contract.click();

        WebElement submit = driver.findElement(By.cssSelector("[id='rfb']"));
        submit.click();

        tearDown();
    }
}
