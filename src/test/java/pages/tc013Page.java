package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.assertTrue;

public class tc013Page {

    WebDriver driver;

    @FindBy(id = "action13Button") // replace with the actual element locator
    private WebElement action13Button;

    @FindBy(id = "result13Indicator") // replace with the actual element locator
    private WebElement result13Indicator;

    public tc013Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void executeAction13() {
        action13Button.click();
    }

    public void verifyResult13() {
        assertTrue("Result 13 was not as expected.", result13Indicator.isDisplayed());
    }
}