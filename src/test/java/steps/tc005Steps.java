package steps;

import pages.tc005Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

public class tc005Steps {

    tc005Page page = new tc005Page();

    @Given("^I execute action 5$")
    public void executeAction5() {
        page.performAction5();
    }

    @Then("^I verify result 5 is as expected$")
    public void verifyResult5() {
        assertTrue(page.isResult5AsExpected());
    }
}