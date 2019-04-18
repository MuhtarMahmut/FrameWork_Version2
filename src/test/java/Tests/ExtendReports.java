package Tests;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.*;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendReports {

    public static void main(String[] args) {
        // this is the step we only do once for entire projects
        ExtentReports reports=new ExtentReports();
        ExtentHtmlReporter html= new ExtentHtmlReporter("Reports/MyReport.html");
            reports.attachReporter(html);


        // this is the step we do for eversingle test cases.
        ExtentTest test1=reports.createTest("Testing the log in"); // name of test case

        test1.log(Status.INFO," open website");    // test steps report.
        System.out.println("Go to the website");

        test1.log(Status.INFO, "username and password are entered");    // test steps report
        System.out.println("User name and password is entered");

        test1.log(Status.INFO,"logout and close");
        System.out.println("Logout and quite the browser");


        // pre - environment set up in extent report:
        reports.setSystemInfo("Website","https://www.facebook.com");
        reports.setSystemInfo("Username","Muhtar");
        reports.setSystemInfo("PassWord","123456");
        reports.setSystemInfo("Browser", "Chrome");


        // decurate html:
        html.config().setReportName("Reported by tester:  Muhtar Mahmut");     // this step sets the reporeter name
        html.config().setDocumentTitle("FaceBookReports");            // this step sets the html document title
        html.config().setTheme(Theme.STANDARD);     // this step sets the theme




        // this is step we only do once for entire project
        reports.flush();      // this step is a MUST and we do it at End of All Reports


    }



}
