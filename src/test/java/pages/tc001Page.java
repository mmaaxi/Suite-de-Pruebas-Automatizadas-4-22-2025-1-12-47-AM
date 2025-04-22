package pages;

import org.openqa.selenium.WebDriver;

public class tc001Page {
    private WebDriver driver;

    public tc001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navegarPaginaInicial() {
        // Navegar a la página inicial
        driver.get("URL_DE_LA_PAGINA_INICIAL");
    }

    public void ejecutarAccion1() {
        // Código para ejecutar acción 1
    }

    public boolean verificarResultado1() {
        // Código para verificar resultado 1
        return true; // Replace with actual verification logic
    }
}