package com.falabella.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static com.falabella.interactions.SeleccionarProductoCorrectoInteraction.seleccionarProductoCorrecto;
import static com.falabella.tasks.AgregarAlCarritoTask.agregarProducto;
import static com.falabella.interactions.IrAtrasInteraction.irAtras;
import static com.falabella.utils.AlmacenDinamico.getIterador;
import static com.falabella.utils.AlmacenDinamico.setIterador;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.falabella.utils.CallData;

public class SeleccionarProductosTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        while (getIterador()<2) {
            setIterador(getIterador()+1);
            actor.attemptsTo(
                    seleccionarProductoCorrecto(),
                    agregarProducto(
                            Integer.parseInt(CallData.extractTo().get(getIterador()-1).get("Cantidad"))
                    ),
                    irAtras()
            );
        }
    }

    public static SeleccionarProductosTask seleccionarVariosProductosCarrito(){
        return instrumented(SeleccionarProductosTask.class);
    }
}
