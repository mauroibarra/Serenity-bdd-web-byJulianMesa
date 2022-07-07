package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import starter.conf.SessionVariables;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RecallStepDefinitions {

//    Llamar un recuerdo
    @Then("^He should get Foo$")
    public void he_should_get_foo() {
        String valueRecall = theActorInTheSpotlight().recall(SessionVariables.FOO.toString());
    }
}
