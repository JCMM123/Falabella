package com.falabella.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaPricipalUI {

    public static Target BTN_POLITICAS =Target.the("Boton de politicas")
            .located(By.id("testId-accept-cookies-btn"));
    public static Target barraDeBusqueda =Target.the("Barra de busqueda")
            .locatedBy("//input[@id=\"testId-SearchBar-Input\"]");
}
