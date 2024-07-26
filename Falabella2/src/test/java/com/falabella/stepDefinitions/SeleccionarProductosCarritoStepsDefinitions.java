package com.falabella.stepDefinitions;

import com.falabella.questions.ValidarProductoQuestion;
import io.cucumber.java.es.*;
import org.hamcrest.Matchers;

import static com.falabella.tasks.BuscarProductoTask.buscarProducto;
import static com.falabella.tasks.IrACarritoTask.irACarrito;
import static com.falabella.tasks.SeleccionarProductosTask.seleccionarVariosProductosCarrito;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

import static com.falabella.tasks.AbrirFalabellaTask.abrirElNavegador;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class SeleccionarProductosCarritoStepsDefinitions {
    @Dado("que el usuario esta en la pagina de Falabella")
    public void queElUsuarioEstaEnLaPaginaDeFalabella() {
        theActorCalled("Usuario").wasAbleTo(
                abrirElNavegador()
        );
    }
    @Cuando("el usuario ingresa sus productos y selecciona la cantidad de cada uno")
    public void elUsuarioIngresaSusProductosYSeleccionaLaCantidadDeCadaUno() {
        theActorInTheSpotlight().attemptsTo(
                buscarProducto(),
                seleccionarVariosProductosCarrito(),
                irACarrito()
        );
    }
    @Entonces("el usuario puede ver en el carrito de compras sus productos")
    public void elUsuarioPuedeVerEnElCarritoDeComprasSusProductos() {
        theActorInTheSpotlight().should(
                seeThat(ValidarProductoQuestion.from(), Matchers.equalTo(true))
        );
    }
}
