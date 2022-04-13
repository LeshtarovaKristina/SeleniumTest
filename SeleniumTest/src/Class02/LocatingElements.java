package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://fb.com");//1st we have to locate the element we want to interact with. Pay attention if there is ID
        driver.findElement(By.id("email")).sendKeys("syntax@adfadf.com");
        //Line 13 go find element which has an element id with "email" value and
//after you find it type this specific text in there --> using method .sendKeys()
        driver.findElement(By.id("passContainer")).sendKeys("whatever");
        driver.findElement(By.name("login")).click();//method to click on a button
        driver.findElement(By.partialLinkText("Forgot password?")).click();
    }
}
