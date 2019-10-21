package WebDriverTasks.BringItOn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
    public enum BrowsersType {
        CHROME,
        FIREFOX,
        IE,
        SAFARI
    }

    public static WebDriver getDriver(BrowsersType type) {
        WebDriver driver = null;
        switch (type) {
            case CHROME:
                System.setProperty("webdriver.chrome.driver", "B:\\Selenium\\Новая папка (3)\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case FIREFOX:
                // indicate your path as required
                break;
            case IE:
                // indicate your path as required
                break;
            case SAFARI:
                // indicate your path as required
                break;
            default:
                System.setProperty("webdriver.chrome.driver", "B:\\Selenium\\Новая папка (3)\\chromedriver.exe");
                driver = new ChromeDriver();
        }
        return driver;
    }
}