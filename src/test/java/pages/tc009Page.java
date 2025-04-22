package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class tc009Page {
    private WebDriver driver;

    private By action9Button = By.id("action9");
    private By result9Element = By.id("result9");

    public tc009Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigateToMainPage() {
        driver.get("http://example.com/main");
    }
    
    public void performAction9() {
        WebElement actionButton = driver.findElement(action9Button);
        actionButton.click();
    }

    public void verifyResult9() {
        WebElement resultElement = driver.findElement(result9Element);
        assert resultElement.isDisplayed() : "Result 9 is not displayed";
    }
}