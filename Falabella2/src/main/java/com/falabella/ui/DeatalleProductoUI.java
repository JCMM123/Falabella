package com.falabella.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DeatalleProductoUI {

    public static Target H1_PRODUCTO = Target.the("Titulo del producto")
            .locatedBy("//h1[@class=\"jsx-1680787435 product-name fa--product-name false\"]");

    public static Target LBL_CANTIDAD = Target.the("texto de la cantidad del producto disponilble para comprar")
            .locatedBy("//div[@class=\"jsx-890112272 max-units-text\"]/p");

    public static Target BTN_CANTIDADPOSITIVA = Target.the("Boton para aumentar la cantidad a comprar de producto")
            .located(By.id("quantity-selector-increment-btn"));
    
    public static Target INPUT_CANTIDADPRODUCTOS = Target.the("input para aumentar la cantidad a comprar de producto")
            .located(By.id("quantity-selector-increment-input"));

    public static Target BTN_AGREGARALCARRITO = Target.the("Boton añadir al carrito dentro de la pagina del producto seleccionado")
            .located(By.id("add-to-cart-button"));

    public static Target BTN_SEGUIRCOMPRANDO = Target.the("Boton de seguir comprando que esta en el pop")
            .locatedBy("//button[@class=\"jsx-4105506317 button button-secondary-link-mkp\"]");

    public static Target BTN_IRALCARRITO = Target.the("Boton secundario para ir al carrito en el pop")
            .located(By.id("linkButton"));

    public static Target BTN_CERRARNOTIFICACION = Target.the("Boton para cerrar la ventana de los envios")
            .located(By.id("testId-modal-close"));

    public static Target BTN_ATRAS = Target.the("Boton para de ir atras")
            .locatedBy("//ol[@class=\"Breadcrumbs-module_breadcrumb__3lLwJ\"]/li[2]");

}
