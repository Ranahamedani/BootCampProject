package objects;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class FaceBookPage {

WebDriver driver;
    public FaceBookPage(WebDriver driver) {
        this.driver = driver;

}
By Username = By.id("email");
    By password = By.id("pass");
    By login_btn = By.name("login");

    public void EnterUserName(){
    driver.findElement(Username).sendKeys("Testuser");
    }
    public void EnterPassword(){
        driver.findElement(password).sendKeys("Tester123");
    }
    public void verifyLogin(){
        driver.findElement(login_btn).click();
        String title = driver.getTitle();
       Assert.assertEquals(title,"login page");

    }
}

