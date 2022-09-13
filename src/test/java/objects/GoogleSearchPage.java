package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
    WebDriver driver;

    public GoogleSearchPage(WebDriver driver) {
        this.driver = driver;



    }
    By searchbox = By.xpath("//input[@name='q']");
    By search_btn = By.xpath("(//input[@name='btnK'])[1]");
    By Facebook_Link = By.xpath("//a//h3[text()='Facebook - log in or sign up']");




    public void searchgoogle(String searchinput)
    { try {
        driver.findElement(searchbox).sendKeys(searchinput);
        Thread.sleep(1000);
        driver.findElement(search_btn).click();
        Thread.sleep(2000);
    }catch (Exception e) {
        System.out.println("Exception caught" + e.getMessage());
    }

    }

    public void ClickFacebook(){
        try{
            driver.findElement(Facebook_Link).click();
            Thread.sleep(2000);
        }catch(Exception e) {
            System.out.println("Exception caught" + e.getMessage());

        }
    }
}