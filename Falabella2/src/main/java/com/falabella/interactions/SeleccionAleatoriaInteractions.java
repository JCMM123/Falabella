package com.falabella.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.util.List;
import java.util.Random;

import static com.falabella.ui.ListaProductosUI.LISTA_PRODUCTOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionAleatoriaInteractions implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> listProducts = LISTA_PRODUCTOS.resolveAllFor(actor);
        int index= (new Random()).nextInt(listProducts.size());
        WebElementFacade producto = listProducts.get(index);
        producto.click();
    }
    
    public static SeleccionAleatoriaInteractions random(){
        return instrumented(SeleccionAleatoriaInteractions.class);
    }
}
