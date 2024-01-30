package demoTest;

import dev.kwolszczak.pages.HomePage;
import dev.kwolszczak.pages.LoginPage;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@Slf4j
class LoginTest extends BaseTest {

    @Test
    public void verifyLoginWithCorrectUsernameAndPassword() throws InterruptedException {
        var expectedTitle = "Login System";
        String password = "pass123";
        String username = "test01@example.com";
        String loginSuccessful = "Login successful";

        driver.get(" https://circlek-public.github.io/cki-service-recruitment-task/");
        String actualTitle = driver.getTitle();
        log.info("'Opened login page, Title: '{}'", actualTitle);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(username, password);

        HomePage homePage = new HomePage(driver);
        var actualLoginMessage = homePage.getLoginMessage();

        Assertions.assertEquals(loginSuccessful, actualLoginMessage);
    }
}
