package Pages;

import Utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GoogleElement extends TestBase {

    public GoogleElement(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@title='Search']")
    public WebElement searchbox;

    @FindBy(partialLinkText = "See how small changes can")
    public WebElement hover;

//    <a class="NKcBbd"
//    href="https://www.google.com/url?q=https://yourplanyourplanet.sustainability.google/%3Futm_source%3Dgoogle%26utm_medium%3Dhpp%26utm_campaign%3Dhpp_042219&amp;source=hpp&amp;id=19011813&amp;ct=3&amp;usg=AFQjCNHGQyNDpOVgl5yP25UIgOtSWBtJmA&amp;sa=X&amp;ved=0ahUKEwiEv7yIjOThAhVH7VQKHQbKBwgQ8IcBCAo"
//    rel="nofollow">See how small changes can have a big impact</a>


}
