package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc009Page;

public class tc009Steps {
    private WebDriver driver;
    private WebDriverWait wait;
    private tc009Page page;

    public tc009Steps() {
        driver = Hooks.getDriver();
        wait = new WebDriverWait(driver, 10);
        page = new tc009Page(driver);
    }
    
    @Given("I am on the main page")
    public void i_am_on_the_main_page() {
        page.navigateToMainPage();
    }
    
    @When("I execute action 9")
    public void i_execute_action_9() {
        page.performAction9();
    }

    @Then("I should see result 9")
    public void i_should_see_result_9() {
        page.verifyResult9();
    }
}