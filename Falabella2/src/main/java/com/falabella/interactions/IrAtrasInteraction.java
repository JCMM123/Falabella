package com.falabella.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static com.falabella.ui.DeatalleProductoUI.BTN_ATRAS;
import static com.falabella.ui.DeatalleProductoUI.BTN_SEGUIRCOMPRANDO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IrAtrasInteraction implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_SEGUIRCOMPRANDO),
                Click.on(BTN_ATRAS)
        );
    }

    public static IrAtrasInteraction irAtras(){
        return instrumented(IrAtrasInteraction.class);
    }
}
