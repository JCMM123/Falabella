package com.falabella.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.io.IOException;

import static com.falabella.ui.DeatalleProductoUI.H1_PRODUCTO;
import static com.falabella.utils.AlmacenDinamico.getIterableRowExcel;
import static com.falabella.utils.AlmacenDinamico.setIterableRowExcel;
import static com.falabella.utils.ExcelCode.escribirEnExcel;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GuardarTituloProductoInteraction implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            escribirEnExcel(
                    "src/main/resources/Datos/Datos.xlsx","Datos de productos",
                    getIterableRowExcel(),"Item",H1_PRODUCTO.resolveFor(actor).getText()
            );
            setIterableRowExcel((getIterableRowExcel()+1));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static GuardarTituloProductoInteraction guardarTitulo(){
        return instrumented(GuardarTituloProductoInteraction.class);
    }
}
