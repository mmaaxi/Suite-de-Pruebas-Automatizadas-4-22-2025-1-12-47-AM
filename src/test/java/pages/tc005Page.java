package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class tc005Page {

    private WebDriver driver;
    private By result5Locator = By.id("result5");

    public tc005Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void performAction5() {
        // Code to perform action 5
    }

    public boolean isResult5AsExpected() {
        WebElement resultElement = driver.findElement(result5Locator);
        // Logic to check result 5; return true if result is as expected
        return resultElement.getText().equals("Expected Result 5");
    }
}