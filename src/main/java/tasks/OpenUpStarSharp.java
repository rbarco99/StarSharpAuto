package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.StarSharpHomePage;

public class OpenUpStarSharp implements Task {
    
    private StarSharpHomePage starSharpHomePage;

    public static OpenUpStarSharp LoginPage() {
        return Tasks.instrumented(OpenUpStarSharp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(starSharpHomePage));
    }
}
