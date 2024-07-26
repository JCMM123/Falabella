package com.falabella.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ListaProductosUI {
    public static Target LISTA_PRODUCTOS = Target.the("Lista de productos")
            .locatedBy("//b[contains(@id,\"testId-pod-displaySubTitle\")]");
    public static Target BTN_CARRITO = Target.the("Boton de carrito")
            .located(By.id("testId-UserAction-basket"));

}
