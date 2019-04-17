package Tests;

import Pages.GoogleElement;
import Utilities.Mylibraray;
import Utilities.TestBase;
import org.testng.annotations.Test;

public class GoogleSearch extends TestBase {

    @Test
    public void SearchTest(){
    FaceBook.searchbox.sendKeys("Apple");
        Mylibraray.sleepForNow(5);


    }


}
