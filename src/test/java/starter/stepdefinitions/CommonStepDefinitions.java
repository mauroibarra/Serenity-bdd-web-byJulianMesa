package starter.stepdefinitions;

import io.cucumber.java.en.Given;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class CommonStepDefinitions {
    @Given("^(.*) wants to remember something$")
    public void setActorNamed(String name){
        theActorCalled(name);
    }
}
