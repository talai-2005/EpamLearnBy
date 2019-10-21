package WebDriverTasks.HardCore;

import WebDriverTasks.BringItOn.DriverFactory;
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

public class HardCoreTestPage {
    public WebDriver driver;
    HardCoreMainPage hardCoreMainPage;

    @BeforeClass(alwaysRun = true)
    public void setup() {
        DriverFactory.BrowsersType type = DriverFactory.BrowsersType.CHROME;
        driver =  DriverFactory.getDriver(type);
        hardCoreMainPage = PageFactory.initElements(driver, HardCoreMainPage.class);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown () {
        driver.quit();
    }

    @Test(priority = 1)
    public void loadPage() {
        driver.get(hardCoreMainPage.PAGE_URL);
        Assert.assertEquals(driver.getCurrentUrl(),hardCoreMainPage.PAGE_URL);
    }

    @Test (priority = 2)
    public void fillingNumberOfInstances() {
        hardCoreMainPage.fillingNumberOfInstances("4");
    }

    @Test (priority = 3)
    public void fillingMachineType() {
        hardCoreMainPage.fillingMachineType("n1-standard-8 (vCPUs: 8, RAM: 30GB)");
    }

    @Test (priority = 4)
    public void clickAddJPUs() {
        hardCoreMainPage.clickAddJPUs();
    }
    @Test (priority = 5)
    public void clickAddJPUsOne() {
        hardCoreMainPage.clickAddJPUsOne("1");
    }
    @Test (priority = 6)
    public void selectGPUType() {
        hardCoreMainPage.selectGPUType("NVIDIA Tesla V100");
    }
    @Test (priority = 7)
    public void localSSDCSelect() {
        hardCoreMainPage.localSSDSelect("2x375 Gb");
    }
    @Test (priority = 8)
    public void dataCenterLocator() {
        hardCoreMainPage.dataCenterLocatorSelect("Frankfurt (europe-west3)");
    }

    @Test (priority = 9)
    public void committedUsage() {
        hardCoreMainPage.committedUsageSelect("1 Year");
    }
    @Test (priority = 10)
    public void estimateCheck() {
        hardCoreMainPage.addToEstimateClick("\n" +
                "        Total Estimated Cost:\n" +
                "        USD 3,760.96\n" +
                "        per 1 month\n" +
                "      ");

    }
}
