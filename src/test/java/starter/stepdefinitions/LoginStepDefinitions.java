package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.dashboard.CreditAvailable;
import starter.dashboard.OverViewFactory;
import starter.login.DoLogin;
import starter.navigation.NavigateTo;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;

public class LoginStepDefinitions {
    String actor;
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^(.*) has an active account")
    public void sergey_has_an_active_account(String actor) {
        // Write code here that turns the phrase above into concrete actions
        this.actor=actor;
    }

    @When("He send their valid credentials")
    public void he_send_their_valid_credentials() {
        // Write code here that turns the phrase above into concrete actions
        theActorCalled(actor).attemptsTo(
                NavigateTo.theDemoAppliTools(),
                DoLogin.withCredentials("mauro","algo")
        );

    }

    @Then("He should have access to manage his account")
    public void he_should_have_access_to_manage_his_account() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("1er metodo opcion 1 - credito:"+ CreditAvailable.value().answeredBy(theActorInTheSpotlight()));
        System.out.println("1er metodo opcion 2 - credito:"+ new CreditAvailable().answeredBy(theActorInTheSpotlight()));
        System.out.println("2do metodo - credito:"+ OverViewFactory.creditAvailable().answeredBy(theActorInTheSpotlight()));

        theActorInTheSpotlight().should(
                seeThat("the displayed credit available", OverViewFactory.creditAvailable(),equalTo("$17,600"))
                ,seeThat("the displayed total balance", OverViewFactory.totalBalance(),equalTo("$400"))
                ,seeThat("the displayed credit available", OverViewFactory.creditAvailable(),equalTo("$17,800"))
        );
    }

}
