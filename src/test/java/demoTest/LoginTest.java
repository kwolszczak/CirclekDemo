package demoTest;

import dev.kwolszczak.pages.LoginPage;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@Slf4j
class LoginTest extends BaseTest {

    @Test
    public void verifyLoginWithCorrectUsernameAndPassword() {
        var expectedTitle = "Login System";
        String password = "pass123";
        String username = "test01@example.com";

        driver.get(" https://circlek-public.github.io/cki-service-recruitment-task/");
        String actualTitle = driver.getTitle();
        log.info("'Opened login page, Title: '{}'", actualTitle);

        Assertions.assertEquals(expectedTitle, actualTitle);

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(username, password);
    }
}
