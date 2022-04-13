package Class02;
/*
HW
navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
click on register
close the browser
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("Kristina");
        driver.findElement(By.id("customer.lastName")).sendKeys("Leshtarova");
        driver.findElement(By.id("customer.address.street")).sendKeys("600 S Dixy Hwy");
        driver.findElement(By.id("customer.address.city")).sendKeys("WPB");
        driver.findElement(By.id("customer.address.state")).sendKeys("FL");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("33401");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("7773548686");
        driver.findElement(By.id("customer.ssn")).sendKeys("435277128");

        driver.findElement(By.id("customer.username")).sendKeys("1234Kristina");
        driver.findElement(By.id("customer.password")).sendKeys("1234Kristina");
        driver.findElement(By.id("repeatedPassword")).sendKeys("1234Kristina");
        driver.findElement(By.className("button")).click();
        driver.quit();
    }
}
