package tasks;

import model.StarSharpData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import static userinterface.Meetings.*;
import static userinterface.StarSharpMainPage.*;


public class Schedule implements Task {
    StarSharpData starSharpData;

    public Schedule(StarSharpData starSharpData) {
        this.starSharpData = starSharpData;
    }

    public static Schedule newMeeting(StarSharpData starSharpData) {
        return Tasks.instrumented(Schedule.class,starSharpData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MEETING_OPTIONS),
                Click.on(MEETINGS_BUTTON),
                Click.on(NEW_MEETING_BUTTON),
                Enter.theValue(starSharpData.getMeetingName()).into(MEETING_NAME_INPUT),
                Click.on(EDIT_MEETING_TYPE_BUTTON),
                Enter.theValue(starSharpData.getMeetingType()).into(MEETING_TYPE_INPUT),
                Click.on(UPDATE_MEETING_TYPE_BUTTON),
                Enter.theValue(starSharpData.getStartDate()).into(START_DATE_INPUT),
                SelectFromOptions.byVisibleText(starSharpData.getStartHour()).from(START_HOUR_SELECT),
                Click.on(NEW_LOCATION_BUTTON),
                Enter.theValue(starSharpData.getLocationName()).into(MEETING_LOCATION_INPUT),
                Enter.theValue(starSharpData.getLocationAddress()).into(MEETING_ADDRESS_INPUT),
                Click.on(SAVE_MEETING_ADDRESS_BUTTON),
                Click.on(DEFINE_ORGANIZER_BUTTON),
                Enter.theValue(starSharpData.getOrganizerFirstName()).into(ORGANIZER_FIRST_NAME_INPUT),
                Enter.theValue(starSharpData.getOrganizerLastName()).into(ORGANIZER_LAST_NAME_INPUT),
                Enter.theValue(starSharpData.getOrganizerUser()).into(ORGANIZER_EMAIL_INPUT),
                Enter.theValue(starSharpData.getOrganizerDomain()).into(ORGANIZER_DOMAIN_INPUT),
                Click.on(SAVE_ORGANIZER_BUTTON),
                Enter.theValue(starSharpData.getMeetingNumber()).into(MEETING_NUMBER_INPUT),
                Enter.theValue(starSharpData.getEndDate()).into(END_DATE_INPUT),
                SelectFromOptions.byVisibleText(starSharpData.getEndHour()).from(END_HOUR_SELECT),
                Click.on(UNIT_DIV),
                Enter.theValue(starSharpData.getUnit()).into(UNIT_INPUT).thenHit(Keys.ENTER),
                Click.on(SAVE_MEETING_BUTTON)
        );
    }
}
