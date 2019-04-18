package Tests;

import Utilities.Mylibraray;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FaceBookTestAndReports {

       static WebDriver driver;
    public static ExtentReports reports=new ExtentReports();
    public static  ExtentHtmlReporter html= new ExtentHtmlReporter("Reports/MyProject.html");
    public static ExtentTest tests;


    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

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


        reports.attachReporter(html);

        reports.setSystemInfo("Website","https://www.facebook.com");
        reports.setSystemInfo("Username","Muhtar");
        reports.setSystemInfo("PassWord","123456");
        reports.setSystemInfo("Browser", "Chrome");

        html.config().setReportName("Reported by tester:  Muhtar Mahmut");     // this step sets the reporeter name
        html.config().setDocumentTitle("FaceBookReports");

        reports.flush();
    }

    @Test
    public void TestFaceBook1(){
       tests=reports.createTest("FaceBook test 1");   // reporting the test case name.

        tests.info("Open the browser");    // reporting the test step
        driver.navigate().to("https://www.facebook.com");
        Mylibraray.sleepForNow(3);

        tests.info("Close browser");
        driver.close();

    }

    @Test
    public void TestFacebook2(){
        tests=reports.createTest("FaceBook test 2");   // reporting the test case name.

        tests.info("Open the browser 2");    // reporting the test step
        driver.navigate().to("://www.facebook.com");
        Mylibraray.sleepForNow(3);



        tests.info("Close browser 2");
        driver.close();

    }




}
