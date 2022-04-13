package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.facebook.com/");
        driver.navigate().to("http://www.google.com");
        driver.navigate().back();
        driver.navigate().forward();
        Thread.sleep(2000);/*in real life we won't be using that,it is just
        to slow the program so we can see what is happening */

        driver.navigate().refresh();
        //driver.close();//will close the current tab
        driver.quit();//will close the whole browser
    }
}
