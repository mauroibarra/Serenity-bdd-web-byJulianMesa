package starter.ui.dashboard;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

// 1er metodo para hacer Questions (con implements)
public class CreditAvailable implements Question<String> {

    public static Question<String> value(){
        return new CreditAvailable();
    }

    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(FinancialOverView.CREDIT_AVAILABLE).getText();
    }
}
