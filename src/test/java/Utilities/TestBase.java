package Utilities;


import Pages.FaceBookElement;
import Pages.GoogleElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;
    public static GoogleElement google;
    public static FaceBookElement FaceBook;

    @BeforeMethod()   // controls how the @Test method will be executed.
    public void setup01(){
        // this before method is to setup browsers.
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to(Mylibraray.getPropertiesData("GGWebSite"));

    }

    @BeforeMethod
    public void setup02(){
        // this before method is to run each weblemnt page' constructor. (PageFactory).
    google=new GoogleElement();
    FaceBook=new FaceBookElement();

    }

    @AfterMethod
    public void end(){
        driver.quit();
        driver = null;
    }





}
