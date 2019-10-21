package WebDriverTasks.ICanWin;

import WebDriverTasks.BringItOn.DriverFactory;
import WebDriverTasks.CanIWin;
import WebDriverTasks.HurtMePlenty.HurtMePlentyMainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ICanWinTestFile {
    public WebDriver driver;
    CanIWin canIWin;
    ICanWinDriverFactory iCanWinDriverFactory;

    @BeforeClass(alwaysRun = true)
    public void setup() {
        DriverFactory.BrowsersType type = DriverFactory.BrowsersType.CHROME;
        driver =  DriverFactory.getDriver(type);
        canIWin = PageFactory.initElements(driver, CanIWin.class);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown () {
        driver.quit();
    }

    @Test(priority = 1)
    public void loadPage() {
        driver.get(canIWin.PAGE_URL);
        Assert.assertEquals(driver.getCurrentUrl(),canIWin.PAGE_URL);
    }
    @Test (priority = 2)
    public void pasteTextArea() {
        canIWin.pasteTextArea("Hello from WebDriver");
    }

    @Test (priority = 3)
    public void pasteExperation() {
        canIWin.pasteExperation("10 minutes");
    }

    @Test (priority = 4)
    public void pasteName() {
        canIWin.pasteName("helloweb");
    }
}
