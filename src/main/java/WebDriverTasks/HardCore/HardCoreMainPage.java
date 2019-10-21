package WebDriverTasks.HardCore;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

/**
 * @author Nikolai
 */
public class HardCoreMainPage {
    public static final String PAGE_URL = "https://cloud.google.com/";

    @FindBy(xpath = "//*[@id=\"top_of_page\"]/div[1]/div[1]/header/div[1]/div/div/div[2]/nav/ul/li[4]/a")
    WebElement seePricing;

    @FindBy(xpath = "//*[@id=\"top_of_page\"]/div[1]/div[1]/header/div[1]/div/div/div[2]/nav/ul/li[4]/div/div/div[2]/ul/li[4]/a")
    WebElement calculator;

    @FindBy(xpath = "//*[@id=\"idIframe\"]")
    WebElement idIframe;

    @FindBy(xpath = "//input[@name = 'quantity' and @id='input_53']")
    WebElement numberOfInstances;

    @FindBy(xpath = "//*[@id=\"select_value_label_48\"]")
    WebElement machineTypeDropDown;

    @FindBy(xpath = "//div[contains (text(), 'n1-standard-8')]")
    WebElement machineTypeStandard;

    @FindBy(xpath = ".//div[contains(text(),'Add GPUs.')]/../div")
    WebElement addJPUs;

    @FindBy(css = "#md-select[placeholder='Number of GPUs']")
    WebElement numberOfJPUs;

    @FindBy(xpath = "//*[@id=\"select_option_346\"]")
    WebElement numberOfJPUsOne;

    @FindBy(xpath = "//*[@id=\"select_value_label_340\"]/span[1]/div")
    WebElement JPUtype;

    @FindBy(xpath = "//*[@id=\"select_value_label_340\"]/span[1]/div")
    WebElement JPUtypeTesla100;

    @FindBy(xpath = "#select_value_label_50 > span:nth-child(1)")
    WebElement localSSD;

    @FindBy(css = "#select_option_171 > div")
    WebElement localSSDSelect;

    @FindBy(css = "#select_value_label_88 > span:nth-child(1) > div")
    WebElement dataCenter;

    @FindBy(css = "#select_option_243 > div)")
    WebElement dataCenterSelect;

    @FindBy (xpath = "//*[contains (text(), \"None\")][1]")
    WebElement committedUsage;

    @FindBy(css = "#select_value_label_52 > span:nth-child(1) > div")
    WebElement committedUsageSelect;

    @FindBy(xpath = "//*[@id=\"mainForm\"]/div[1]/div/md-card/md-card-content/div/div[1]/form/div[14]/button")
    WebElement addToEstimate;

    @FindBy(xpath = "//*[@id=\"resultBlock\"]/md-card/md-card-content/div/div/div/h2/b")
    WebElement estimateResult;

    @FindBy(xpath = "//button[@id=\"email_quote\"]")
    WebElement emailEstimateButton;

    @FindBy(xpath = "//input[@id=\"input_383\"]")
    WebElement userEmailInput;

    WebDriver driver;

    public HardCoreMainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillingNumberOfInstances(String number) {
        driver.manage().window().maximize();
        seePricing.click();
        calculator.click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.switchTo().frame(idIframe);
        numberOfInstances.click();
        numberOfInstances.sendKeys(number);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 800)");
        Assert.assertEquals(numberOfInstances.getAttribute("value"), number);
    }


    public void fillingMachineType(String text) {
        machineTypeDropDown.click();
        machineTypeStandard.click();
        Assert.assertEquals(machineTypeStandard.getText(), text);
    }

    public void clickAddJPUs() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");
        addJPUs.click();
    }

    public void clickAddJPUsOne(String text) {
        numberOfJPUs.click();
        numberOfJPUsOne.click();
        Assert.assertEquals(numberOfJPUsOne.getText(), text);
    }

    public void selectGPUType(String text) {
        JPUtype.click();
        JPUtypeTesla100.click();
        Assert.assertEquals(JPUtypeTesla100.getText(), text);
    }

    public void localSSDSelect(String text) {
        localSSD.click();
        localSSDSelect.click();
        Assert.assertEquals(localSSDSelect.getText(), text);
    }

    public void dataCenterLocatorSelect(String text) {
        dataCenter.click();
        dataCenterSelect.click();
        Assert.assertEquals(dataCenterSelect.getText(), text);
    }

    public void committedUsageSelect(String text) {
        committedUsage.click();
        committedUsageSelect.click();
        Assert.assertEquals(committedUsageSelect.getText(), text);
    }

    public void addToEstimateClick(String text) {
        addToEstimate.click();
        emailEstimateButton.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)");
        userEmailInput.sendKeys("talai-2005@yandex.ru");
        Assert.assertEquals(estimateResult.getText(), text);
    }
}


