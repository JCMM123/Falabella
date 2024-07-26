package com.falabella.interactions;

import com.falabella.utils.CallData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static com.falabella.interactions.SeleccionAleatoriaInteractions.random;
import static com.falabella.interactions.IrAtrasInteraction.irAtras;
import static com.falabella.ui.DeatalleProductoUI.*;
import static com.falabella.utils.AlmacenDinamico.setIterador;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarProductoCorrectoInteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(random());
        if (LBL_CANTIDAD.resolveFor(actor).getText().equals("Máximo 1 unidades.") ||
                LBL_CANTIDAD.resolveFor(actor).getText().equals("Máximo 2 unidades.") ||
                LBL_CANTIDAD.resolveFor(actor).getText()==null ||
                H1_PRODUCTO.resolveFor(actor).getText().equals(CallData.extractTo().get(0).get("Item"))){
            setIterador(0);
            actor.attemptsTo(
                    irAtras(),
                    random()
            );
        }
    }

    public static SeleccionarProductoCorrectoInteraction seleccionarProductoCorrecto(){
        return instrumented(SeleccionarProductoCorrectoInteraction.class);
    }
}
