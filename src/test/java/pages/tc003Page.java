package pages;

import org.openqa.selenium.WebDriver;

public class tc003Page {

    WebDriver driver;

    public tc003Page(WebDriver driver) {
        this.driver = driver;
    }

    public void openHomePage() {
        // Implementación para abrir la página inicial
        driver.get("http://example.com");
    }

    public void performAction3() {
        // Implementación para ejecutar la acción 3
        // Por ejemplo, clic en un botón
    }

    public boolean verifyResult3() {
        // Implementación para verificar el resultado 3
        // Retornar true si el resultado es el esperado
        return true;
    }
}