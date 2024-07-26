package com.falabella.questions;

import com.falabella.utils.CallData;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.falabella.ui.CarritoUI.INT_CANTIDAD;
import static com.falabella.ui.CarritoUI.LBL_NOMBREPRODUCTO;

public class ValidarProductoQuestion implements Question<Boolean> {
    int contador = 0;
    private ArrayList<Map<String, String>> datos = CallData.extractTo();

    //Mejorar la extraccion de datos del excel para que sea robusta y
    // ta vez cambiar el contador para que detecte el numero de productos a comprar en el excel para que sea mas robusto
    @Override
    public Boolean answeredBy(Actor actor) {
        List<WebElementFacade> producto = LBL_NOMBREPRODUCTO.resolveAllFor(actor);
        List<WebElementFacade> cantidad = INT_CANTIDAD.resolveAllFor(actor);

        String nombreProducto;
        String cantidadProducto;

        for (int i = 0; i < producto.size() ; i++) {
            nombreProducto = producto.get(i).getText();
            cantidadProducto = cantidad.get(i).getAttribute("value");
            if (nombreProducto.equals(datos.get(0).get("Item")) && cantidadProducto.equals(datos.get(0).get("Cantidad"))
                    || nombreProducto.equals(datos.get(1).get("Item")) && cantidadProducto.equals(datos.get(1).get("Cantidad"))){
                contador=contador+1;
                if(contador==2){
                    return true;
                }
            }
        }
        return false;
    }

    public static ValidarProductoQuestion from() {
        return new ValidarProductoQuestion();
    }
}
