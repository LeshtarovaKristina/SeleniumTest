package utils;

import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebElement;
import testbase.BaseClass;

public class CommonMethods extends BaseClass {

    /**
     * this method will send text to a given element
     *
     * @param element
     * @param text
     */
    public void sendText(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);

    }

    /**
     * this method will switch to a frame by index
     *
     * @param index
     */

    public void switchToFrame(int index) {
        try {
            driver.switchTo().frame(index);
        } catch (NoSuchFrameException e) {
            e.printStackTrace();
        }
    }

}
