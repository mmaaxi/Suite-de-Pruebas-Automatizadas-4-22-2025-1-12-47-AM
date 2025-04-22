package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc004Page {

    private WebDriver driver;
    private By action4Button = By.id("action4Button");
    private By result4Text = By.id("result4Text");

    public tc004Page(WebDriver driver) {
        this.driver = driver;
    }

    public void performAction4() {
        driver.findElement(action4Button).click();
    }

    public boolean isResult4Verified() {
        return driver.findElement(result4Text).isDisplayed();
    }
}