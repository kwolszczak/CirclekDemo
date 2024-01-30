package dev.kwolszczak.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By message = By.xpath("//div[@id='message']");
    private By spinner = By.xpath("//div[@id='loading_spinner']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public String getLoginMessage() throws InterruptedException {
        wait.until(ExpectedConditions.invisibilityOfAllElements(driver.findElements(spinner)));
        String message = driver.findElement(this.message).getText();
        return message;
    }
}
