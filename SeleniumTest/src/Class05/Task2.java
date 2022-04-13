package Class05;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
/*
HW1
Go to facebook sign up page
Fill out the whole form
Click signup
 */
public class Task2 {
    public static String url = "https://www.facebook.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement createNewButton = driver.findElement(By.partialLinkText("Create new"));
        createNewButton.click();
        Thread.sleep(2000);

        driver.findElement(By.name("firstname")).sendKeys("Kristina");
        driver.findElement(By.name("lastname")).sendKeys("UserLast");
        driver.findElement(By.name("reg_email__")).sendKeys("emailkristinafb@test.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("emailkristinafb@test.com");
        driver.findElement(By.id("password_step_input")).sendKeys("123456!@#qwe");
        WebElement monthsDD = driver.findElement(By.id("month"));
        Select selectMonth = new Select(monthsDD);
        WebElement daysDD = driver.findElement(By.id("day"));
        Select selectDay = new Select(daysDD);
        WebElement yearDD = driver.findElement(By.id("year"));
        Select selectYear = new Select(yearDD);
        selectMonth.selectByVisibleText("Jun");
        Thread.sleep(1000);
        selectDay.selectByValue("8");
        Thread.sleep(1000);
        selectYear.selectByValue("1993");
        Thread.sleep(1000);
        List<WebElement> radioButtons = driver.findElements(By.cssSelector("label[class = '_58mt']"));
        for (WebElement radioButton : radioButtons) {
            String radioButtonText = radioButton.getText();
            //System.out.println(radioButtonText);
            if (radioButtonText.equals("Female")) {
                radioButton.click();
                break;
            }
        }
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(1000);

        driver.quit();
    }
}












