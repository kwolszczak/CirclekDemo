package dev.kwolszczak.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private By usernameInput = By.id("email");
    private By passwordInput = By.xpath("//input[@type='password']");
    private By signinBtn = By.id("login_btn");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage login(String username, String password) {
        driver.findElement(usernameInput).sendKeys(username);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(signinBtn).click();
        return new HomePage(driver);
    }
}
