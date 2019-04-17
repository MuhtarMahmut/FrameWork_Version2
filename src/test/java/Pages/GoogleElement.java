package Pages;

import Utilities.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleElement extends TestBase {

    public GoogleElement(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@title='Search']")
    public WebElement searchbox;


}