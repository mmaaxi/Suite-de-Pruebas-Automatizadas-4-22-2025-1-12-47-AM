package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc012Page;
import static org.junit.Assert.assertTrue;

public class tc012Steps {
    private WebDriver driver;
    private tc012Page page;

    public tc012Steps() {
        this.driver = Hooks.getDriver();
        this.page = PageFactory.initElements(driver, tc012Page.class);
    }

    @Given("^I am on the initial page$")
    public void i_am_on_the_initial_page() {
        page.navigateToInitialPage();
    }

    @When("^I execute action 12$")
    public void i_execute_action_12() {
        page.performAction12();
    }

    @Then("^I should see result 12$")
    public void i_should_see_result_12() {
        assertTrue(page.verifyResult12());
    }
}