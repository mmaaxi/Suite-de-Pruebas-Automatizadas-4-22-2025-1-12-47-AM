package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc006Page {
    WebDriver driver;

    By accion6Button = By.id("accion6");
    By resultado6Element = By.id("resultado6");

    public tc006Page(WebDriver driver) {
        this.driver = driver;
    }

    public void ejecutarAccion6() {
        driver.findElement(accion6Button).click();
    }

    public boolean verificarResultado6() {
        return driver.findElement(resultado6Element).isDisplayed();
    }
}