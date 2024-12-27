package reporting;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;

public class Setup implements ITestListener {

    private static ExtentReports extentReports;
    public static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();

    public void onStart(ITestContext context) {
        String reportName = "Test API Automation Report";
        String reportTitle = "Test Execution Report";
        String fileName = ExtentReportManager.getReportNameWithTimeStamp();
        String reportFilePath = System.getProperty("user.dir") + File.separator + "reports" + File.separator + fileName;

        //Check if reports directory exists
        File reportDir = new File(System.getProperty("user.dir") + File.separator + "reports");
        if (!reportDir.exists()) {
            boolean dirCreated = reportDir.mkdirs();
            if (dirCreated) {
                System.out.println("Report Directory Created at path:" + reportDir.getAbsolutePath());
            } else {
                System.out.println("Failed to create report directory");
            }
        }
        extentReports = ExtentReportManager.createInstance(reportFilePath, reportName, reportTitle);
    }

    public void onFinish(ITestContext context) {
        if (extentReports != null) {
            extentReports.flush();
        }
    }

    public void onTestStart(ITestResult result) {
        ExtentTest test = extentReports.createTest(" Test Name: "+result.getTestClass().getName() + " " +result.getMethod().getMethodName());
        extentTest.set(test);
    }
}
