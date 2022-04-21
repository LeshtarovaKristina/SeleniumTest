package test;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import pages.DashboardPage;
import pages.LoginPageWithpageFactory;
import testbase.BaseClass;

import java.io.File;
import java.io.IOException;

public class LoginTestWithPageFactory {

    public static void main(String[] args) throws IOException {
        BaseClass.openWithSpecificUrl("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        LoginPageWithpageFactory loginPageWithpageFactory=new LoginPageWithpageFactory();
        DashboardPage dashboardPage = new DashboardPage();
        loginPageWithpageFactory.username.sendKeys("Admin");
        loginPageWithpageFactory.password.sendKeys("Hum@nhrm123");
        loginPageWithpageFactory.loginButton.click();

        TakesScreenshot ts = (TakesScreenshot) BaseClass.driver;
        File sourceFile = ts.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(sourceFile,new File("screenshots/HRMS/dashboard.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String welcomeText=dashboardPage.welcomeAdmin.getText();
        System.out.println(welcomeText);

        BaseClass.tearDown();
    }
}
