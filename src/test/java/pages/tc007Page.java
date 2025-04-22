package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc007Page {
    WebDriver driver;

    By action7Element = By.id("action7");
    By outcome7Element = By.id("outcome7");

    public tc007Page(WebDriver driver) {
        this.driver = driver;
    }

    public void performAction7() {
        driver.findElement(action7Element).click();
    }

    public boolean verifyOutcome7() {
        return driver.findElement(outcome7Element).isDisplayed();
    }
}