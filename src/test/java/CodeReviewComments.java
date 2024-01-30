import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CodeReviewComments {


        //CODE REVIEW
 /*   1. avoid duplicate code
            - consider creating a setup method annotated with @Before to run before each test.
*/
        @Test

        //2. Use More Descriptive Test Method Names: eg. shouldAssertTextOnLoginPage
        public void assertTextOnPage(){
            //3. use selenium 4 WebDriver manager- it can manage downloading appropriate version
            // 4. quit driver after each test

            System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
            WebDriver driver = new ChromeDriver();

/*        5. don't hardcode url, variable and so on
        use yaml, properties, csv files for storing data*/
            driver.get("https://circlek-public.github.io/cki-service-recruitment-task/");

            //assert Remember Me Button
            //5.+ use soft assertions when you are using two or more assertions in your test
            WebElement rememeberMeLabel = driver.findElement(By.id("remember_me_label"));
            assertEquals("Remember Me", rememeberMeLabel.getText());

            //assert Sign In text
            //6. try to avoid using selector for classes, use id's
            WebElement signInButton = driver.findElement(By.className("login"));
            assertEquals("Sign In", signInButton.getText());
        }

        @Test
        public void checkRememberMeCheckBox(){
            System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://circlek-public.github.io/cki-service-recruitment-task/");

            //click Remember Me checkbox
            //7. avoid using selectors based on field text,eg. input[id='remember_me']
            WebElement rememberMeCheckBox = driver.findElement(By.xpath("//*[contains(text(), \"Remember Me\")]/../input"));
            rememberMeCheckBox.click();

            //check if clicked
            //8. check if input was selected before your click
            //9. try to avoid unnecessary comments, use meaningfully names for fields, variables and so on...
            assertEquals(rememberMeCheckBox.isSelected(), true);
        }
    }

