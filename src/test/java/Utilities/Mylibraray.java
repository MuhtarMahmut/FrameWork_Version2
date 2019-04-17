package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.util.Properties;

public class Mylibraray {

    public static String getPropertiesData(String name) {
        String xx="";
        try {
            FileInputStream file = new FileInputStream("src/test/java/utilities/ConfigurationReader.properties");
            Properties config = new Properties();
            config.load(file);
            xx = config.getProperty(name);
        }catch(Exception e){  }

        return  xx;
    }

    public static void sleepForNow(int a){
        try {
            Thread.sleep(a * 1000);
        } catch (Exception e){}
    }


    public static String getExcelData(int row, int cell) {
        String result="";
        try {
            FileInputStream file = new FileInputStream("src/test/java/utilities/Excel.xlsx");
            XSSFWorkbook xcelDoc = new XSSFWorkbook(file);
            XSSFSheet Sheet1 = xcelDoc.getSheet("Sheet1");
            result = Sheet1.getRow(row - 1).getCell(cell - 1).getStringCellValue();
        } catch (Exception e){  }
        return result;
    }

    public static WebDriver getDriver(){
        WebDriver driver=null;
        String Browser = Mylibraray.getPropertiesData("Browser").toLowerCase();       // from propertiesfile
        //  String Browser=Mylibraray.getExcelData(2,2).toLowerCase();                 // from excel
      //  String Browser = Encapsulate.getBrowser().toLowerCase();                      // from Encapsulate

        if(Browser.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
        }else if(Browser.equals("chrome")){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        } else if(Browser.equals("ie")){
            WebDriverManager.iedriver().setup();
            driver=new InternetExplorerDriver();
        }
        return driver;

    }

}
