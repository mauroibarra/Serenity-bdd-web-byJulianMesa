package starter.dashboard;
//2do metodo para hacer questions por factory

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class OverViewFactory {

    public static Question<String> creditAvailable(){
        return actor -> TextContent.of(FinancialOverView.CREDIT_AVAILABLE).viewedBy(actor).asString().trim(); //el trim limpia la respuesta de espacios en blanco tabulaciones, etc
    }

    public static Question<String> totalBalance(){
        return actor -> TextContent.of(FinancialOverView.TOTAL_BALANCE).viewedBy(actor).asString();
    }
}
