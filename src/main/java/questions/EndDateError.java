package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static userinterface.Meetings.CREATED_MEETING_NAME_DIV;
import static userinterface.Meetings.ERROR_MESSAGE;

public class EndDateError implements Question<Boolean> {
    public static EndDateError displays() {
        return new EndDateError();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String errorMessage = Text.of(ERROR_MESSAGE).viewedBy(actor).asString();
        String expectedErrorMessage = "End Date can't be earlier than Start Date";
        System.out.println(errorMessage);
        System.out.println(expectedErrorMessage);
        return errorMessage.equals(expectedErrorMessage);
    }
}
