package com.falabella.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.falabella.ui.PaginaPricipalUI.BTN_POLITICAS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirFalabellaTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url("https://www.falabella.com.co"),
                WaitUntil.the(BTN_POLITICAS, WebElementStateMatchers.isVisible())
                        .forNoMoreThan(20).seconds(),
                Click.on(BTN_POLITICAS)
        );
    }

    public  static AbrirFalabellaTask abrirElNavegador(){
        return instrumented(AbrirFalabellaTask.class);
    }
}
