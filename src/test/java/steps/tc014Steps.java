package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc014Page;

public class tc014Steps {
    WebDriver driver;
    tc014Page page;

    @Given("the user navigates to the required page")
    public void userNavigatesToRequiredPage() {
        driver = new ChromeDriver();
        page = new tc014Page(driver);
        page.navigateToPage();
    }

    @When("the user executes action 14")
    public void userExecutesAction14() {
        page.performAction14();
    }

    @Then("the user should verify result 14")
    public void userVerifiesResult14() {
        page.verifyResult14();
        driver.quit();
    }
}