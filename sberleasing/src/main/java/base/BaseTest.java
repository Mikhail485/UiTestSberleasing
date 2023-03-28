package base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static com.codeborne.selenide.WebDriverRunner.hasWebDriverStarted;

public class BaseTest extends AbstractTest{
    @BeforeEach
    public void start() {
        String key = "webdriver.chrome.driver";
        if (System.getProperty(key) == null)
            System.setProperty(key, "C:\\Users\\Domod\\Downloads\\chromedriver_win32\\chromedriver.exe");
    }

    @AfterEach
    public void close() {
        if(hasWebDriverStarted()) getWebDriver().quit();
    }
}
