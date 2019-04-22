package Tests;

import Pages.GoogleElement;
import Utilities.Mylibraray;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMethods {


    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        Actions act = new Actions(driver);
// Actions: combinations of your keybord and mouse.

//        Mylibraray.sleepForNow(5);
//        WebElement hover=driver.findElement(By.partialLinkText("See how small changes can"));
//        // mouse-hover:

//        act.moveToElement(hover).perform();

        Mylibraray.sleepForNow(5);

        WebElement seacrhbox=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
   //     act.moveToElement(seacrhbox).click().sendKeys("A").pause(2000).sendKeys("B").sendKeys("C"+ Keys.ENTER).perform();

    act.moveToElement(seacrhbox).click().sendKeys("A").pause(2000).sendKeys("B").pause(2000).sendKeys("C").pause(2000).sendKeys("2000").pause(2000).sendKeys(Keys.CONTROL+"A"+Keys.BACK_SPACE).perform();




//        <input class="gLFyf gsfi" maxlength="2048" name="q" type="text" jsaction="paste:puy29d"
//    aria-autocomplete="both" aria-haspopup="false" autocapitalize="off"
//    autocomplete="off" autocorrect="off" role="combobox"
//    spellcheck="false" title="Search" value="" aria-label="Search" xpath="1">



            //input[@class='gLFyf gsfi']

    }

}
