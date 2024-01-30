package demoTest;

import dev.kwolszczak.pages.HomePage;
import dev.kwolszczak.pages.LoginPage;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Slf4j
class LoginTest extends BaseTest {

    @Test
    @DisplayName("Login successful")
    public void verifyLoginWithCorrectUsernameAndPassword()  {

        String password = properties.getProperty("password");
        String username = properties.getProperty("user");
        String url = properties.getProperty("url");
        String loginSuccessful = "Login successful";

        driver.get(url);
        String actualTitle = driver.getTitle();
        log.info("'Opened login page, Title: '{}'", actualTitle);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(username, password);
        HomePage homePage = new HomePage(driver);

        var actualLoginMessage = homePage.getLoginMessage();
        log.info("After login message: '{}'", actualLoginMessage);

        Assertions.assertEquals(loginSuccessful, actualLoginMessage);
    }
}
