package WebDriverTasks.BringItOn;

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

public class BringItOnPageTest {

    public WebDriver driver;
    BringItOnPage pastebinPage;

    @BeforeClass (alwaysRun = true)
    public void setup() {
        DriverFactory.BrowsersType type = DriverFactory.BrowsersType.CHROME;
        driver =  DriverFactory.getDriver(type);
        pastebinPage = PageFactory.initElements(driver, BringItOnPage.class);
    }

    @AfterClass (alwaysRun = true)
    public void tearDown () {
        driver.quit();
    }

    @Test(priority = 1)
    public void loadPage() {
        driver.get(pastebinPage.PAGE_URL);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(driver.getCurrentUrl(),pastebinPage.PAGE_URL);
    }

    @Test(priority = 2)
    public void FillOutNewPasteField() {
        pastebinPage.setText_FillOutNewPasteField("git config --global user.name  \"New Sheriff in Town\"\n" +
                "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
                "git push origin master --force");
    }

    @Test(priority = 3)
    public void BashElement () {
       pastebinPage.setText_BashElement("Bash");
    }

    @Test(priority = 4)
    public void PasteExperationTime () {
        pastebinPage.setText_PasteExperationTime("10 Minutes");
    }

    @Test(priority = 5)
    public void NewPasteName () {
        pastebinPage.setText_NewPasteName("how to gain dominance among developers");
    }
}
