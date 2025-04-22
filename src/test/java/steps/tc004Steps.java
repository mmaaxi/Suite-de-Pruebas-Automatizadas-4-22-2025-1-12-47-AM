package steps;

import pages.tc004Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertTrue;

public class tc004Steps {

    private WebDriver driver;
    private tc004Page page;

    @Given("I open the application")
    public void i_open_the_application() {
        driver = new ChromeDriver();
        page = new tc004Page(driver);
        driver.get("http://your-application-url.com");
    }

    @When("I execute action 4")
    public void i_execute_action_4() {
        page.performAction4();
    }

    @Then("I verify result 4")
    public void i_verify_result_4() {
        assertTrue(page.isResult4Verified());
        driver.quit();
    }
}