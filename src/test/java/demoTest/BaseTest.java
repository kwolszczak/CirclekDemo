package demoTest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.DataUtil;

import java.io.IOException;
import java.util.Properties;

public class BaseTest {
    protected WebDriver driver;
    protected Properties properties;

    @BeforeEach
    public void setUp() throws IOException {
        driver = new ChromeDriver();
        properties = DataUtil.getProperties("testdata.properties");

    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
