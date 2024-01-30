package demoTest;

import dev.kwolszczak.pages.BasePage;
import lombok.SneakyThrows;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.DataUtil;

import java.io.IOException;
import java.util.Properties;

public class BaseTest {
    private final String path = "testdata.properties";
    protected WebDriver driver;
    protected Properties properties;

    @BeforeEach
    public void setUp() throws IOException {
        driver = new ChromeDriver();
        properties = DataUtil.getProperties(path);
    }

    @AfterEach

    public void tearDown() {
        driver.quit();
    }

    @SneakyThrows
    protected <T extends BasePage> T at(Class<T> clazz) {
        return clazz.getDeclaredConstructor(WebDriver.class).newInstance(driver);
    }
}
