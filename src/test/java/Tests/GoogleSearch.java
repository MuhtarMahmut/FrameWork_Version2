package Tests;

import Pages.GoogleElement;
import Utilities.Mylibraray;
import Utilities.TestBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class GoogleSearch extends TestBase {

    @Test
    public void SearchTest(){
       tests=reports.createTest("Google search test");

       tests.info("Enter data in the search box");
    google.searchbox.sendKeys(Mylibraray.getPropertiesData("Data1"));
        Mylibraray.sleepForNow(5);



    }
    @Test
    public void Test2(){
        tests=reports.createTest("Google search test 2");

        tests.info("Enter data2 in the search box");
        google.searchbox.sendKeys(Mylibraray.getExcelData(3,2));
        Mylibraray.sleepForNow(5);

    }

    @Test
    public void Test3(){
        wait.until(ExpectedConditions.visibilityOf(google.searchbox));
        tests=reports.createTest("search key words in google");

        act.moveToElement(google.searchbox).click().sendKeys("A").pause(2000).sendKeys("B").pause(2000).sendKeys("C").pause(2000).sendKeys("2000").pause(2000).sendKeys(Keys.CONTROL+"A"+Keys.BACK_SPACE).perform();



    }


}
