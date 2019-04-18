package Utilities;

import Pages.*;
import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;

public abstract class TestBase {

    public static WebDriver driver;
    public static ExtentReports reports=new ExtentReports();
    public static ExtentHtmlReporter html= new ExtentHtmlReporter("Reports/MyGoogleReport.html");
    public static ExtentTest tests;

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
    public void end(ITestResult result){
        if(result.getStatus() == ITestResult.FAILURE ){
            tests.log(Status.FAIL, result.getName());
            tests.info(result.getThrowable());

        } else if(result.getStatus() == ITestResult.SKIP ){
            tests.log(Status.SKIP,result.getName());
            tests.info(result.getThrowable());
        }

        driver.quit();
        driver = null;
    }

    @AfterTest
    public void EndTest(){
        reports.attachReporter(html);

        reports.setSystemInfo("Website","https://www.facebook.com");
        reports.setSystemInfo("Username","Muhtar");
        reports.setSystemInfo("PassWord","123456");
        reports.setSystemInfo("Browser", "Chrome");

        html.config().setReportName("Reported by tester:  Muhtar Mahmut");     // this step sets the reporeter name
        html.config().setDocumentTitle("FaceBookReports");

        reports.flush();
    }




}
