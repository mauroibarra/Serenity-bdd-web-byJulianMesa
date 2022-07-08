package starter.ui.login;

import org.openqa.selenium.By;

public class LoginForm {
    public static By USERNAME_FIELD = By.id("username");
    public static By PASSWORD_FIELD = By.id("password");
    public static By LOGIN_BUTTON = By.id("log-in");
    public static By REMEMBERME_CHECKBOX = By.xpath("//body/div[1]/div[1]/form[1]/div[3]/div[1]/label[1]/input[1]");
}
