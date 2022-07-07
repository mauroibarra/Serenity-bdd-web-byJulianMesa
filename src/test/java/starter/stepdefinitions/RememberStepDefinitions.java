package starter.stepdefinitions;

import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import starter.conf.SessionVariables;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class RememberStepDefinitions {

//    Crear recuerdo
    @When("^He tries to remember (.*)$")
    public void he_tries_to_remember_foo(String value) {
        theActorInTheSpotlight().remember(SessionVariables.FOO.toString(),value);

    }

}
