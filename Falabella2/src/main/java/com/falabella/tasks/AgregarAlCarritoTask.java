package com.falabella.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import static com.falabella.interactions.GuardarTituloProductoInteraction.guardarTitulo;
import static com.falabella.ui.DeatalleProductoUI.*;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AgregarAlCarritoTask implements Task {
    private int item;
    public AgregarAlCarritoTask(int item) {
        this.item = item;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        INPUT_CANTIDADPRODUCTOS.resolveFor(actor).clear();
        actor.attemptsTo(
                Enter.theValue(String.valueOf(item)).into(INPUT_CANTIDADPRODUCTOS),
                guardarTitulo(),
                Click.on(BTN_AGREGARALCARRITO)
        );
    }

    public static AgregarAlCarritoTask agregarProducto(int item){
        return instrumented(AgregarAlCarritoTask.class,item);
    }
}
