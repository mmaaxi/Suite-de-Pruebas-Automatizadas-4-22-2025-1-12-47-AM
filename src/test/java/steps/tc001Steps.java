package steps;

import pages.tc001Page;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class tc001Steps {
    private WebDriver driver;
    private tc001Page page;

    public tc001Steps() {
        this.driver = Hooks.getDriver();
        this.page = new tc001Page(driver);
    }

    @Given("que el usuario está en la página inicial")
    public void usuarioEnPaginaInicial() {
        page.navegarPaginaInicial();
    }

    @When("el usuario ejecuta acción 1")
    public void usuarioEjecutaAccion1() {
        page.ejecutarAccion1();
    }

    @Then("el sistema debería verificar resultado 1")
    public void sistemaVerificaResultado1() {
        Assert.assertTrue(page.verificarResultado1());
    }
}