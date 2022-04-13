package Class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
handle each and every alert on the page
 */

public class HandleAlerts {
    public static String url = "http://uitestpractice.com/Students/Switchto";


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

       WebElement simpleAlertbutton =driver.findElement(By.id("alert"));
       simpleAlertbutton.click();

       Alert simpleAlert=driver.switchTo().alert();//switch the focus to alert
        Thread.sleep(2000);
       simpleAlert.accept();//handling simple alert

       WebElement confirmAlertButton= driver.findElement(By.id("confirm")) ;
       confirmAlertButton.click();
        Thread.sleep(3000);
       Alert alert=driver.switchTo().alert();//switch the focus to alert
       String alertText=alert.getText();
       System.out.println(alertText);
       alert.dismiss();//handling confirmation alert

        WebElement promptAlertButton= driver.findElement(By.cssSelector("button#prompt"));
        promptAlertButton.click();
         Thread.sleep(3000);
        Alert promptAlert=driver.switchTo().alert();//switching the focus to prompt alert
        promptAlert.sendKeys("Batch 12 is the best!!!");
        promptAlert.accept();//handling prompt alert






    }
}