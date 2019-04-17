package Utilities;

import Pages.FaceBookElement;
import Pages.GoogleElement;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {

    public static WebDriver driver;
    public static GoogleElement google;
    public static FaceBookElement FaceBook;

    @BeforeMethod()   // controls how the @Test method will be executed.
    public void setup01(){
        // this before method is to setup browsers.
        driver = Mylibraray.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to(Mylibraray.getPropertiesData("WebSite"));

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
