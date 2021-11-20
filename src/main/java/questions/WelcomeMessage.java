package questions;

import model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static userinterface.WelcomePage.WELCOME_MESSAGE;

public class WelcomeMessage implements Question<Boolean> {
    private UtestData data;

    public WelcomeMessage(UtestData data) {
        this.data = data;
    }

    public static WelcomeMessage isDisplayed(UtestData data){
        return new WelcomeMessage(data);
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        String welcomeText = Text.of(WELCOME_MESSAGE).viewedBy(actor).asString();
        String expectedText = data.getStrWelcomeText();
        System.out.println(welcomeText);
        System.out.println(expectedText);
        return welcomeText.equals(expectedText);
    }
}
