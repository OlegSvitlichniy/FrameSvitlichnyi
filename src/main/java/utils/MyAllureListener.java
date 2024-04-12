package utils;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyAllureListener implements ITestListener {


    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test " + result.getMethod().getMethodName() + " started!!!");
    }
    @Override
    public void onTestSuccess(org.testng.ITestResult result) {
        System.out.println("Test "+result.getMethod().getMethodName() + " PASSED!");
    }
    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test "+result.getMethod().getMethodName()+ "FAILED!");
    }
}


