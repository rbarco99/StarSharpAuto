package questions;

import lombok.SneakyThrows;
import model.StarSharpData;
import model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.concurrent.TimeUnit;

import static userinterface.Meetings.*;
import static userinterface.WelcomePage.WELCOME_MESSAGE;

public class TheMeeting implements Question<Boolean> {
    private StarSharpData starSharpData;

    public TheMeeting(StarSharpData starSharpData) {
        this.starSharpData = starSharpData;
    }

    public static TheMeeting isCreated(StarSharpData starSharpData) {
        return new TheMeeting(starSharpData);
    }

    @SneakyThrows
    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                Click.on(ORDER_BY_ID_BUTTON)
        );
        Thread.sleep(1000);
        String meetingName = Text.of(CREATED_MEETING_NAME_DIV).viewedBy(actor).asString();
        String expectedMeetingName = starSharpData.getMeetingName();
        System.out.println(meetingName);
        System.out.println(expectedMeetingName);
        return meetingName.equals(expectedMeetingName);
    }
}
