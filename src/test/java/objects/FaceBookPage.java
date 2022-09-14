package objects;

import dev.failsafe.internal.util.Assert;
import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FaceBookPage {

WebDriver driver;
    public FaceBookPage(WebDriver driver) {
        this.driver = driver;

}
By Username = By.id("email");
    By password = By.id("pass");
    By login_btn = By.name("login");

    public void EnterUseName(){
    driver.findElement(Username).sendKeys("raana.hamedani92@gmail.com");
    }
    public void EnterPassword(){
        driver.findElement(password).sendKeys("Pnt1234");
    }
    public void verifyLogin(){
        driver.findElement(login_btn).click();
        String title = driver.getTitle();

    }
}

