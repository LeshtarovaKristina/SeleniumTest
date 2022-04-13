package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/*
navigate to http://www.uitestpractice.com/Students/Contact
click on the link
get text
print out in the console
 */
public class Task2 {
    public static String url = "http://www.uitestpractice.com/Students/Contact";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        WebElement ajaxLink = driver.findElement(By.partialLinkText("This is a Ajax link"));
        ajaxLink.click();

        WebElement contact = driver.findElement(By.cssSelector("div.ContactUs"));
        String contactText = contact.getText();
        System.out.println(contactText);

    }
}