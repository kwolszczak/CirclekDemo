package dev.kwolszczak.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private By usernameInput = By.id("email");
    private By passwordInput = By.xpath("//input[@type='password']");
    private By signinBtn = By.id("login_btn");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public HomePage login(String username, String password) {
        fill(usernameInput, username);
        fill(passwordInput,password);
        click(signinBtn);

        return new HomePage(driver);
    }
}
