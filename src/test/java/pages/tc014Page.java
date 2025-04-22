package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc014Page {
    WebDriver driver;

    By action14Button = By.id("action14Button");
    By result14Text = By.id("result14Text");

    public tc014Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToPage() {
        driver.get("https://example.com/page");
    }

    public void performAction14() {
        WebElement button = driver.findElement(action14Button);
        button.click();
    }

    public void verifyResult14() {
        WebElement resultText = driver.findElement(result14Text);
        // Add assertion to verify result text
    }
}