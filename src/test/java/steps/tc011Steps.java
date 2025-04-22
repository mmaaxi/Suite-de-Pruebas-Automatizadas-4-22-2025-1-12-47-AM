package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc011Page;

import static org.junit.Assert.assertTrue;

public class tc011Steps {

    WebDriver driver;
    tc011Page page;

    public tc011Steps() {
        this.driver = Hooks.getDriver();
        this.page = PageFactory.initElements(driver, tc011Page.class);
    }

    @Given("I am on the main page")
    public void i_am_on_the_main_page() {
        driver.get("http://example.com");
    }

    @When("I execute action 11")
    public void i_execute_action_11() {
        page.performAction11();
    }

    @Then("I should verify result 11")
    public void i_should_verify_result_11() {
        assertTrue(page.isResult11Verified());
    }
}