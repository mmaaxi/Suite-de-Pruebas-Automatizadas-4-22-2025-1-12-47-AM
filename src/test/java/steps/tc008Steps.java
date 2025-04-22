import org.openqa.selenium.WebDriver;
import pages.tc008Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

public class tc008Steps {
    private WebDriver driver;
    private tc008Page page;

    public tc008Steps() {
        driver = Hooks.getDriver();
        page = new tc008Page(driver);
    }

    @Given("I am on the initial page")
    public void iAmOnTheInitialPage() {
        page.navigateToInitialPage();
    }

    @When("I execute action 8")
    public void iExecuteAction8() {
        page.performAction8();
    }

    @Then("I verify result 8")
    public void iVerifyResult8() {
        assertTrue(page.isResult8Displayed());
    }
}