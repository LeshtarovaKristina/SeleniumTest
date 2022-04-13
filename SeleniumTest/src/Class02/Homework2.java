package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
navigate to fb.com
click on create new account
fill up all the textboxes
click on sign up button
close the pop up
close the browser
 */
public class Homework2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://fb.com/");
        driver.findElement(By.partialLinkText("Create new account")).click();

        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Kristina");
        driver.findElement(By.name("lastname")).sendKeys("Ploverti");
        driver.findElement(By.name("reg_email__")).sendKeys("kristina124466@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("kristina124466@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("Ploverti34334$");
        driver.findElement(By.name("birthday_month")).sendKeys("Jun");
        driver.findElement(By.name("birthday_day")).sendKeys("23");
        driver.findElement(By.name("birthday_year")).sendKeys("1991");
        driver.findElement(By.name("sex")).click();
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(8000);
        driver.quit();
    }
}
