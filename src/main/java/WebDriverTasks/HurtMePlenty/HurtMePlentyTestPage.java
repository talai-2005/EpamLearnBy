package WebDriverTasks.HurtMePlenty;

import WebDriverTasks.BringItOn.BringItOnPage;
import WebDriverTasks.BringItOn.DriverFactory;
import javafx.scene.layout.Priority;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * @author Nikolai
 */

public class HurtMePlentyTestPage {
    public WebDriver driver;
    HurtMePlentyMainPage hurtMePlentyMainPage;

    @BeforeClass(alwaysRun = true)
    public void setup() {
        DriverFactory.BrowsersType type = DriverFactory.BrowsersType.CHROME;
        driver =  DriverFactory.getDriver(type);
        hurtMePlentyMainPage = PageFactory.initElements(driver, HurtMePlentyMainPage.class);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown () {
        driver.quit();
    }

    @Test(priority = 1)
    public void loadPage() {
        driver.get(hurtMePlentyMainPage.PAGE_URL);
        Assert.assertEquals(driver.getCurrentUrl(),hurtMePlentyMainPage.PAGE_URL);
    }
    @Test (priority = 2)
    public void fillingNumberOfInstances() {
        hurtMePlentyMainPage.fillingNumberOfInstances("4");
    }
    @Test (priority = 3)
    public void fillingMachineType() {
        hurtMePlentyMainPage.fillingMachineType("n1-standard-8 (vCPUs: 8, RAM: 30GB)");
    }
    @Test (priority = 4)
    public void clickAddJPUs() {
        hurtMePlentyMainPage.clickAddJPUs();
    }
    @Test (priority = 5)
    public void clickAddJPUsOne() {
        hurtMePlentyMainPage.clickAddJPUsOne("1");
    }
    @Test (priority = 6)
    public void selectGPUType() {
        hurtMePlentyMainPage.selectGPUType("NVIDIA Tesla V100");
    }
    @Test (priority = 7)
    public void localSSDCSelect() {
        hurtMePlentyMainPage.localSSDSelect("2x375 Gb");
    }
    @Test (priority = 8)
    public void dataCenterLocator() {
        hurtMePlentyMainPage.dataCenterLocatorSelect("Frankfurt (europe-west3)");
    }
    @Test (priority = 9)
    public void committedUsage() {
        hurtMePlentyMainPage.committedUsageSelect("1 Year");
    }
    @Test (priority = 10)
    public void estimateCheck() {
        hurtMePlentyMainPage.addToEstimateClick("\n" +
                "        Total Estimated Cost:\n" +
                "        USD 3,760.96\n" +
                "        per 1 month\n" +
                "      ");
    }
}

