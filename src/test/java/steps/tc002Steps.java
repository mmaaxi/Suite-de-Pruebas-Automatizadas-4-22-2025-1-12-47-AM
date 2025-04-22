package steps;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc002Page;

import static org.junit.Assert.assertTrue;

public class tc002Steps {
    WebDriver driver;
    tc002Page page;

    public tc002Steps() {
        this.driver = Hooks.getDriver();
        this.page = new tc002Page(driver);
    }

    @Given("que la aplicación está inicializada")
    public void que_la_aplicacion_esta_inicializada() {
        // Aquí puedes inicializar o verificar el estado de la aplicación
    }

    @When("se ejecuta la acción 2")
    public void se_ejecuta_la_accion_2() {
        page.ejecutarAccion2();
    }

    @Then("se verifica el resultado 2")
    public void se_verifica_el_resultado_2() {
        assertTrue(page.verificarResultado2());
    }
}