package Pages;

import Utilities.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookElement extends TestBase {

    public FaceBookElement(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@title='Search']")
    public WebElement searchbox;



}
