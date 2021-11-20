package tasks;

import model.StarSharpData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static userinterface.BusinessUnits.*;
import static userinterface.StarSharpHomePage.USERNAME_INPUT;
import static userinterface.StarSharpMainPage.BUSINESS_UNITS_OPTION;
import static userinterface.StarSharpMainPage.ORGANIZATION_OPTION;

public class Create implements Task {
    StarSharpData starSharpData;

    public Create(StarSharpData starSharpData) {
        this.starSharpData = starSharpData;
    }

    public static Create businessUnit(StarSharpData starSharpData) {
        return Tasks.instrumented(Create.class,starSharpData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ORGANIZATION_OPTION),
                Click.on(BUSINESS_UNITS_OPTION),
                Click.on(NEW_BUSINESS_UNIT_BUTTON),
                Enter.theValue(starSharpData.getBusinessUnitName()).into(BUSINESS_UNIT_NAME_INPUT),
                Click.on(SAVE_BUSINESS_UNIT_BUTTON)
                );
    }
}
