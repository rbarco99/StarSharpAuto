package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import static userinterface.StarSharpHomePage.*;

public class LogIn implements Task {
    public static LogIn withAdminCredentials() {
        return Tasks.instrumented(LogIn.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("admin").into(USERNAME_INPUT),
                Enter.theValue("serenity").into(PASSWORD_INPUT),
                Click.on(SignIn_BUTTON)
        );
    }
}
