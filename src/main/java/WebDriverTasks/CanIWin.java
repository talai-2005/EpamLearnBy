package WebDriverTasks;
import WebDriverTasks.BringItOn.DriverFactory;
import WebDriverTasks.HurtMePlenty.HurtMePlentyMainPage;
import WebDriverTasks.ICanWin.ICanWinDriverFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static WebDriverTasks.BringItOn.DriverFactory.BrowsersType.CHROME;

/**
 * @author Nikolai
 */

public class CanIWin {
    public static final String PAGE_URL = "https://pastebin.com/";

    @FindBy(xpath = "//textarea[@id=\"paste_code\"]")
    WebElement paste_textarea;

    @FindBy(xpath = "//*[@id=\"myform\"]/div[3]/div[2]/div[2]/span/span[1]/span")
    WebElement paste_expiration;

    @FindBy(xpath = "//li[text()='10 Minutes']")
    WebElement tenMinutesExperation;

    @FindBy(className = "post_input")
    WebElement pasteName;


    WebDriver driver;

    public CanIWin(WebDriver driver) {
        this.driver = driver;
    }

    public void pasteTextArea (String text) {
        paste_textarea.click();
        paste_textarea.sendKeys(text);
        Assert.assertEquals(paste_textarea.getAttribute("value"), text);
    }

    public void pasteExperation (String text) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        paste_expiration.click();
        tenMinutesExperation.click();
        Assert.assertEquals(tenMinutesExperation.getText(), text);
    }

    public void pasteName (String text) {
        pasteName.click();
        pasteName.sendKeys(text);
        Assert.assertEquals(pasteName.getAttribute("value"), text);
    }
}



