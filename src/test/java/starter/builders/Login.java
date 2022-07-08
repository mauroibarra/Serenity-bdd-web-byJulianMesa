//MANERA DE HACER LOGIN, PERO CON EL PATTERN BUILDER

package starter.builders;


import net.bytebuddy.asm.Advice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.ui.login.LoginForm;

public class Login implements Task {

    private String username;
    private String password;
    private boolean rememberMe;

    //CONSTRUCTOR DE LA CLASE LOGIN
    public Login(String username, String password, boolean rememberMe) {
        this.username = username;
        this.password = password;
        this.rememberMe = rememberMe;
    }

    //SE CREA UNA INSTANCIA 'with' PARA RETORNAR UN OBJETO DE NUESTRO BUILDER "LoginWith"
    public static LoginWith with(){
        return new LoginWith();
    }

    //LA TAREA SE EJECUTA CON LOS VALORES QUE YA SE LLENARON MEDIANTE EL BUILDER
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(username).into(LoginForm.USERNAME_FIELD),
                Enter.theValue(password).into(LoginForm.PASSWORD_FIELD)
        );
        if(rememberMe)
            actor.attemptsTo(
                    Click.on(LoginForm.REMEMBERME_CHECKBOX)
            );
        actor.attemptsTo(
                Click.on(LoginForm.LOGIN_BUTTON)
        );
    }

    //  CREAR CLASE BUILDER, ENCARGARDA DE CONSTRUIR EL OBJETO COMO TAL (el builder es como un constructor que retorna la construccion de la tarea, la tarea Login, se construye con el LoginWit para indicar con que se construye)
    public static class LoginWith{
        private String username;
        private String password;

        public LoginWith username (String username){
            this.username = username;
            return this;
        }
        public LoginWith andPassword (String password){
            this.password = password;
            return this;
        }
        public LoginWith EmptyPassword (){
            this.password = "";
            return this;
        }
        public Performable rememberMe(boolean rememberMe){  //siempre es obligatorio tener el metodo performable ya que se retorna un tipo Taks
            return new Login(username, password, rememberMe);
        }
    }
}
