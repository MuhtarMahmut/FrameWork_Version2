package Tests;

import Pages.GoogleElement;
import Utilities.Mylibraray;
import Utilities.TestBase;
import org.testng.annotations.Test;

public class GoogleSearch extends TestBase {

    @Test
    public void SearchTest(){
    google.searchbox.sendKeys(Mylibraray.getPropertiesData("Data1"));
        Mylibraray.sleepForNow(5);
    }
    @Test
    public void Test2(){

        google.searchbox.sendKeys(Mylibraray.getExcelData(3,2));
        Mylibraray.sleepForNow(5);

    }


}
