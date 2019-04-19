package Tests;

import Pages.GoogleElement;
import Utilities.Mylibraray;
import Utilities.TestBase;
import org.testng.annotations.Test;

public class GoogleSearch extends TestBase {

    @Test
    public void SearchTest(){
       tests=reports.createTest("Google search test");

       tests.info("Enter data in the search box");
    google.searchbox.sendKeys(Mylibraray.getPropertiesData("Data1"));
        Mylibraray.sleepForNow(5);

        Mylibraray.TakeScreenShots("Testing1");

    }
    @Test
    public void Test2(){
        tests=reports.createTest("Google search test 2");

        tests.info("Enter data2 in the search box");
        google.searchbox.sendKeys(Mylibraray.getExcelData(3,2));
        Mylibraray.sleepForNow(5);

    }


}
