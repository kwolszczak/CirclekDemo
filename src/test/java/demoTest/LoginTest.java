package demoTest;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


@Slf4j
class LoginTest extends BaseTest{


    @Test
    public void verifyLoginWithCorrectUsernamAndPassword() {
        var expectedTitle = "Login System";

        driver.get(" https://circlek-public.github.io/cki-service-recruitment-task/");
        String actualTitle = driver.getTitle();
        log.info("'Opened login page, Title: '{}'", actualTitle);

        Assertions.assertEquals(expectedTitle,actualTitle);
    }
}
