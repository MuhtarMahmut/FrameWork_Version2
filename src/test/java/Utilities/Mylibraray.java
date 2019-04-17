package Utilities;

import org.apache.poi.xssf.usermodel.*;
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

}
