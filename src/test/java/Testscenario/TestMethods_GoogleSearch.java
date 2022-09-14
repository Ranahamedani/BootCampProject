package Testscenario;

import io.github.bonigarcia.wdm.WebDriverManager;
import objects.FaceBookPage;
import objects.GoogleSearchPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestMethods_GoogleSearch {
    WebDriver driver;
    GoogleSearchPage objectrepo;


    @BeforeTest
    public void beforetest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        GoogleSearchPage page = new GoogleSearchPage(driver);
        page.searchgoogle("facebook");
        objectrepo = new GoogleSearchPage(driver);
        objectrepo.ClickFacebook();


    }

    @Test
    public void SearchOperation() throws InterruptedException {
        GoogleSearchPage page = new GoogleSearchPage(driver);
        page.searchgoogle("facebook");
        objectrepo = new GoogleSearchPage(driver);
        objectrepo.ClickFacebook();



    }





    @Test
    public void verifyLogin(){

        FaceBookPage page = new FaceBookPage(driver);
        page.EnterUserName();
        page.EnterPassword();
        page.verifyLogin();
    }

   // @AfterTest
    //public void aftertest() {
      //  driver.close();
        //driver.quit();

    }


