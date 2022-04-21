package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class LoginPageWithpageFactory extends CommonMethods {

    @FindBy(id = "txtUsername")
    public WebElement username;

    @FindBy(xpath = "//input[@id = 'txtPassword']")
    public WebElement password;

    @FindBy(css = "input#btnLogin")
    public WebElement loginButton;

    public LoginPageWithpageFactory(){
        PageFactory.initElements(driver,this);
    }
}
