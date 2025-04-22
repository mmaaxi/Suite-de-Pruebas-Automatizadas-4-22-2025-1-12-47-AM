package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.tc003Page;
import static org.junit.Assert.assertTrue;

public class tc003Steps {

    WebDriver driver;
    tc003Page page = new tc003Page(driver);

    @Given("^el usuario está en la página inicial$")
    public void el_usuario_esta_en_la_pagina_inicial() {
        page.openHomePage();
    }

    @When("^el usuario ejecuta la acción 3$")
    public void el_usuario_ejecuta_la_accion_3() {
        page.performAction3();
    }

    @Then("^el resultado 3 es verificado correctamente$")
    public void el_resultado_3_es_verificado_correctamente() {
        assertTrue(page.verifyResult3());
    }
}