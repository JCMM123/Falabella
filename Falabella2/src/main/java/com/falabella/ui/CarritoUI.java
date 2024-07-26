package com.falabella.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CarritoUI {
    public static Target LBL_NOMBREPRODUCTO =Target.the("Nombre producto")
            .locatedBy("//a[@data-testid=\"name\"]");
    public static Target INT_CANTIDAD =Target.the("Cantidad del producto")
            .locatedBy("//input[contains(@id,\"qty\")]");

}
