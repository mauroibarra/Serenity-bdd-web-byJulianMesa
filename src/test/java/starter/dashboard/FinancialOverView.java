package starter.dashboard;

import org.openqa.selenium.By;

public class FinancialOverView {

    public static By CREDIT_AVAILABLE = By.xpath("//div[contains(text(),'Credit Available')]/following-sibling::div[@class='balance-value']");
}
