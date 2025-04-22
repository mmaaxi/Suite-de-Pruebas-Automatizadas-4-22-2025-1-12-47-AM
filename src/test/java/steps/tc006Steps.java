package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc006Page;

public class tc006Steps {
    WebDriver driver;
    tc006Page page;

    @Given("el usuario navega a la página principal")
    public void el_usuario_navega_a_la_página_principal() {
        driver = new ChromeDriver();
        page = new tc006Page(driver);
        driver.get("http://example.com");
    }

    @When("el usuario ejecuta acción 6")
    public void el_usuario_ejecuta_accion_6() {
        page.ejecutarAccion6();
    }

    @Then("el sistema debería verificar resultado 6")
    public void el_sistema_deberia_verificar_resultado_6() {
        Assert.assertTrue(page.verificarResultado6());
        driver.quit();
    }
}