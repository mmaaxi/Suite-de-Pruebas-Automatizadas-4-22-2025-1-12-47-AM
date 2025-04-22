package steps;

import org.openqa.selenium.WebDriver;
import pages.tc007Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;

public class tc007Steps {
    WebDriver driver;
    tc007Page page;

    @Given("the user is on the initial page")
    public void the_user_is_on_the_initial_page() {
        // Assuming 'driver' is initialized elsewhere
        page = new tc007Page(driver);
        driver.get("http://example.com/initial");
    }

    @When("the user performs action 7")
    public void the_user_performs_action_7() {
        page.performAction7();
    }

    @Then("the outcome 7 should be verified")
    public void the_outcome_7_should_be_verified() {
        assertTrue(page.verifyOutcome7());
    }
}