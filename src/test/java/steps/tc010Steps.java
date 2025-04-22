package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc010Page;

public class tc010Steps {
    WebDriver driver;
    tc010Page page;

    public tc010Steps() {
        this.driver = Hooks.driver;
        page = PageFactory.initElements(driver, tc010Page.class);
    }

    @Given("que me encuentro en la página principal")
    public void queMeEncuentroEnLaPaginaPrincipal() {
        page.navigateToHomePage();
    }

    @When("realizo la acción 10")
    public void realizoLaAccion10() {
        page.executeAction10();
    }

    @Then("verifico el resultado 10")
    public void verificoElResultado10() {
        page.verifyResult10();
    }
}