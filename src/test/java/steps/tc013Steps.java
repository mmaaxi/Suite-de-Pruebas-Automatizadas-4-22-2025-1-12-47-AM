import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc013Page;

public class tc013Steps {

    WebDriver driver;
    tc013Page page;

    public tc013Steps() {
        this.driver = Hooks.getDriver();
        page = PageFactory.initElements(driver, tc013Page.class);
    }

    @Given("I open the application")
    public void i_open_the_application() {
        driver.get("http://example.com"); // replace with the actual URL
    }

    @When("I perform action 13")
    public void i_perform_action_13() {
        page.executeAction13();
    }

    @Then("I should verify result 13")
    public void i_should_verify_result_13() {
        page.verifyResult13();
    }
}