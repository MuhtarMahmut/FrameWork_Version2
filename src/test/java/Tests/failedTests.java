package Tests;

import Utilities.TestBase;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class failedTests extends TestBase {

    @Test
    public void zz1(){
        tests=reports.createTest("zz11111");
        WebElement e=null;
        e.click();
    }


}
