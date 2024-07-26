package com.falabella.tasks;

import com.falabella.utils.CallData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.util.ArrayList;
import java.util.Map;

import static com.falabella.ui.PaginaPricipalUI.barraDeBusqueda;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuscarProductoTask implements Task {
    private ArrayList<Map<String, String>> datos = CallData.extractTo();

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        WaitUntil.the(barraDeBusqueda, WebElementStateMatchers.isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(datos.get(0).get("Productos a buscar")).into(barraDeBusqueda).thenHit(Keys.ENTER)
        );
    }
    public  static BuscarProductoTask buscarProducto(){
        return instrumented(BuscarProductoTask.class);
    }
}
