package Tests;

import Utilities.Mylibraray;
import Utilities.TestBase;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FailedTests extends TestBase {


    @Test
    public void method1(){
        tests=reports.createTest("Testing facebook");
        WebElement xx=null;
        xx.click();



    }


}
