package WebDriverTasks.BringItOn;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

/**
 * @author Nikolai
 */

public class BringItOnPage {
    public static final String PAGE_URL = "https://pastebin.com/";

    @FindBy(className = "paste_textarea")
    WebElement newPasteField;

    @FindBy(xpath = "//*[@class='form_frame_left']//*[@title = 'Never']")
    WebElement pasteExpirationNever;

    @FindBy(xpath = "//li[text()='10 Minutes']")
    WebElement pasteExpiration10Minutes;

    @FindBy(className = "post_input")
    WebElement pasteName;

    @FindBy(css = "#select2-paste_format-kb-container")
    WebElement syntaxHighlighting;

    @FindBy(xpath = "//*[@id=\"myform\"]/div[3]/div[1]/div[2]")
    WebElement syntaxHighNeverElement;

    @FindBy(xpath = "//li[text()='Bash']")
    WebElement bashElement;

    @FindBy(xpath = "//*[@id=\"myform\"]/div[3]/div[5]/div[2]/input")
    WebElement titleName;

    WebDriver driver;

    public BringItOnPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setText_FillOutNewPasteField(String text) {
        newPasteField.sendKeys(text);
        Assert.assertEquals(newPasteField.getAttribute("value"), text);
    }

    public void setText_BashElement(String text) {
        syntaxHighNeverElement.click();
        String bashElementText = bashElement.getText();
        bashElement.click();
        Assert.assertEquals(bashElementText, text);
    }

    public void setText_PasteExperationTime(String text) {
        pasteExpirationNever.click();
        String pasteExperation10MinutesText = pasteExpiration10Minutes.getText();
        pasteExpiration10Minutes.click();
        Assert.assertEquals(pasteExperation10MinutesText, text);
    }

    public void setText_NewPasteName(String text) {
        titleName.sendKeys(text);
        Assert.assertEquals(titleName.getAttribute("value"), text);
    }
}
