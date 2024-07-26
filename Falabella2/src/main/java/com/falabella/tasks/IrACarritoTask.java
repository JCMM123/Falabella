package com.falabella.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;


import static com.falabella.ui.ListaProductosUI.BTN_CARRITO;
import static net.serenitybdd.screenplay.Tasks.instrumented;



public class IrACarritoTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(BTN_CARRITO),
                Click.on(BTN_CARRITO)
        );
    }

    public static IrACarritoTask irACarrito(){
        return instrumented(IrACarritoTask.class);
    }
}
