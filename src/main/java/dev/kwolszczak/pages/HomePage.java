package dev.kwolszczak.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    private By message = By.xpath("//div[@id='message']");
    private By spinner = By.xpath("//div[@id='loading_spinner']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public String getLoginMessage() {
        wait.until(ExpectedConditions.invisibilityOfAllElements(driver.findElements(spinner)));
        return getText(message);
    }
}
